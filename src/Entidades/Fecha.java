/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author ACER
 */
public class Fecha implements Serializable{
    
    ArrayList<Encuentro> encuentros;
    int Jornada;
    String cabeceraJornada;
    
    public Fecha(int jornada){
        this.Jornada=jornada;
        encuentros = new ArrayList<>();
        this.cabeceraJornada="";
        
       
    }

    

    public int getJornada() {
        return Jornada;
    }
    
    
    public void serCabeceraFecha(String cabeceraJornada){
        this.cabeceraJornada=cabeceraJornada;
    }
   
    
    public boolean agregarEncuentros(Encuentro e){
        boolean result=false;
      //  for(Encuentro enc :this.encuentros){
         //   if(!enc.getFechaEncuentro().equals(e.getFechaEncuentro())){
                encuentros.add(e);
                e.fecha=this;
                result=true;
          //  }
            
      //  }
        return result;
    }
    
    public boolean eliminarEncuentros(Encuentro e){
        boolean result = false;
        
        encuentros.remove(e);
        e.fecha=null;
        result=true;
        
        return result;
    }
    
    public Encuentro obtenerEncuentro(String id){
        Encuentro e=null;
        
        for(Encuentro p : this.encuentros){
            if(p.getId().equals(id)){
                e=p;break;
            }
            
            
        }
        return e;
    }
    
    public String[][] getMatrizResultadoEncuentros(){  
        String[][] result = new String[this.encuentros.size()][7];
        int i = 0;
        
        
        for(Encuentro e : this.encuentros){
            if(e != null){
                    result[i][0] = this.encuentros.get(i).getFechaEncuentro();
                    result[i][1] = this.encuentros.get(i).plantel1.getEquipo().getNombre();
                    result[i][2] = String.valueOf(this.encuentros.get(i).plantel1.equipo.golesPorEncuentro[this.Jornada-1]);
                    result[i][3] = " VS ";
                    result[i][4] = String.valueOf(this.encuentros.get(i).plantel2.equipo.golesPorEncuentro[this.Jornada-1]);
                    result[i][5] = this.encuentros.get(i).plantel2.getEquipo().getNombre();
                    result[i][6] = this.encuentros.get(i).getId();
                                 
            }
            i++;
        }
        return result;
    }
    
    public String[] titulosEncuentros(){
        String[] result=new String[7];
        
        result[0] = "FECHA";
        result[1] = "LOCAL";
        result[2] = "";
        result[3] = "";
        result[4] = "";
        result[5] = "VISITANTE";
        result[6] = "COD";
        
        
        return result;
    }
    
        public String[] resultadoEncuentros(){  
        String[] result = new String[5];
        int i=0;
        
        
        
                    result[0] = this.encuentros.get(i).plantel1.getEquipo().getNombre();
                    result[1] = String.valueOf(this.encuentros.get(i).plantel1.equipo.golesPorEncuentro[this.Jornada-1]);
                    result[2] = " VS ";
                    result[3] = this.encuentros.get(i).plantel2.getEquipo().getNombre();
                    result[4] = String.valueOf(this.encuentros.get(i).plantel2.equipo.golesPorEncuentro[this.Jornada-1]);
                    
         
        return result;
    }
    
}
