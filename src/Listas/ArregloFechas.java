/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

import Entidades.Fecha;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author ACER
 */
public class ArregloFechas implements Serializable{
    
    ArrayList<Fecha> fechas;
    
    public ArregloFechas(){
        
        fechas = new ArrayList<>();
    }

    public ArrayList<Fecha> getFechas() {
        return fechas;
    }

    public void setFechas(ArrayList<Fecha> fechas) {
        this.fechas = fechas;
    }
    
    
    public boolean findFecha(int jornada){
        boolean result=false;
        
        for(Fecha f:this.fechas){
            if(f.getJornada()==jornada){
                result=true;break;
            }
        }
        
        return result;
    }
    
    
    public boolean agregarFecha(Fecha fecha){
        boolean result=false;
       // for(Fecha f: this.fechas){
          if(!findFecha(fecha.getJornada())){
           this.fechas.add(fecha);
           result =true; 
          }
           
           //break;
       
            
            
       // }
        return result;
    }
    
    
    
    public Fecha obtenerFechaPorJornada(int jornada){
        Fecha result=null;
        for(Fecha f  : this.fechas){
            if(f.getJornada()==jornada){
                result=f;
                break;
            }
            
            
        }
        
        
        return result;
    }
    
    
}
