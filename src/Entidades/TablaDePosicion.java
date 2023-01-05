/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;
import Sistema.Configuracion;

/**
 *
 * @author ACER
 */
import Listas.ArregloEquipo;
import java.io.Serializable;
import java.util.Collections;

public class TablaDePosicion implements Serializable {

    
    
    

    public TablaDePosicion() {
            
        
        
        }
    
   
    
  /*  public String[][] mostrarTablita(){
        
        
        String[][] result= new String[Configuracion.equipos.getEquipos().size()][7];
        
        int t=0;
        for(Equipo e:Configuracion.equipos.getEquipos() ){
            
            result[t][0] = "Nombre: "+e.getNombre();
            result[t][1] =  "GF: "+e.getPlantel().golesaFavor;
            result[t][2] = "GC: "+e.getPlantel().golesEnContra;
            result[t][3] = "PG: "+e.getPlantel().pg;
            result[t][4] = "PE: "+e.getPlantel().pe;
            result[t][5] = "PP: "+e.getPlantel().pp;
            result[t][6] = "Puntos: "+e.getPlantel().getPuntos();
            
           t++;  
        }
       
        return result;
    }*/
    
    public void ordenarPorCodigo(){
        
        for(int i=0;i<(Configuracion.equipos.cantidadDeEquipos()-1);i++){
            
            for(int j=i+1;j<Configuracion.equipos.cantidadDeEquipos();j++){
                if(Configuracion.equipos.getEquipos().get(i).getPuntos()> Configuracion.equipos.getEquipos().get(j).getPuntos()){
                    Equipo variableAuxiliar = Configuracion.equipos.getEquipos().get(i);
                    Configuracion.equipos.getEquipos().add(i, Configuracion.equipos.getEquipos().get(j));
                    Configuracion.equipos.getEquipos().add(j, variableAuxiliar);
                }
                
            }
            
        }
        
        
    }
    
    
     public String[][] mostrarTablita(){
        
      //  this.ordenarPorCodigo();
        String[][] result= new String[Configuracion.equipos.getEquipos().size()][10];
        
        ArrayList<Equipo> equipos = Configuracion.equipos.getEquipos();
        
        ArrayList<Equipo> equiposCopia = new ArrayList<Equipo>(equipos);
        Collections.sort(equiposCopia,Collections.reverseOrder());
        
        int t=0;
        for(Equipo e: equiposCopia ){
            
            
            result[t][0] = ""+(t+1);
            result[t][1] = e.getNombre();
            result[t][2] = ""+e.pj;
            result[t][3] =  ""+e.golesaFavor;
            result[t][4] =  ""+e.golesEnContra;
            result[t][5] =  ""+(e.golesaFavor-e.golesEnContra);
            result[t][6] =  ""+e.pg;
            result[t][7] =  ""+e.pe;
            result[t][8] =  ""+e.pp;
            result[t][9] =  ""+e.getPuntos();
          //  result[t][8] =  ""+e.imagen.getImage();
            
            
           /* 
            result[t][0] = e.getNombre();
            result[t][2] =  ""+e.planteles.get(0).golesaFavor;
            result[t][3] =  ""+e.planteles.get(0).pg;
            result[t][4] =  ""+e.planteles.get(0).pe;
            result[t][5] =  ""+e.planteles.get(0).pp;
            result[t][6] =  ""+e.planteles.get(0).getPuntos();*/
            
           /* result[t][2] = ""+e.getPlantel().golesEnContra;
            result[t][3] = ""+e.getPlantel().pg;
            result[t][4] = ""+e.getPlantel().pe;
            result[t][5] = ""+e.getPlantel().pp;
            result[t][6] = ""+e.getPlantel().getPuntos();*/
            
           t++;  
        }
       
        return result;
    }
    
    
     public String[] getTituloTabla(){
        String[] result= new String[10];
        
        result[0] = "Pos";
        result[1] = "Equipo";
        result[2] = "PJ";
        result[3] = "GF";
        result[4] = "GC";
        result[5] = "DG";
        result[6] = "PG";
        result[7] = "PE";
        result[8] = "PP";
        result[9] = "Puntos";
        
        return result;
    }
    
    
    
    }
    
    

  /*  public Fecha obtenerFecha(int jornada){
        Fecha f=null;
        
        for(Fecha e:this.fechas){
            if(e.getJornada()==jornada){
                f=e;
                break;
            }
            
        }
        
        return f;
    }*/
   
    
    


