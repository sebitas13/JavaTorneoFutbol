/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;
import Enumerados.Demarcacion;
import Enumerados.TipoTarjeta;
import Sistema.Configuracion;
import java.io.Serializable;


/**
 *
 * @author ACER
 */
public class Convocado implements Serializable{
    
      Jugador  jugador;
      
      Plantel plantel;
      
      Demarcacion demarcacion;  

      Boolean suplente;
      
    
      
     
      
      ArrayList<Gol> goles;
      
      ArrayList<Tarjeta> tarjetas ;
     
      Tarjeta ta1,ta2,tr1;
      
      
      String condicion;
      
      
      
      
      public Convocado(Jugador jugador,Demarcacion posicion){
          this.jugador=jugador;
          jugador.setConvocado(this);
          demarcacion=posicion;
          goles = new ArrayList<>();
          tarjetas = new ArrayList<>();
          this.plantel=null;
          this.condicion="";
          this.suplente=false;
          
          
          
      }
      
      public boolean asignarTarjetaAmarilla(Tarjeta t){
          boolean result=false;
          
          if(ta1==null && tr1==null && ta2==null){
              
              ta1=t;
            result=true;
          }else if(ta2==null && tr1==null){
              ta2=t;
              
              convertirAROJA(t);
               result=true;       
          }
          
          if(result==true){
              this.jugador.incrementarTarjetasAmarillas();
              Jugador x = Configuracion.personas.buscarJugadorPorNombre(this.jugador.getNombre());
              x.incrementarTarjetasAmarillas();
          }
          
          return result;
          
      }
      
      public boolean convertirAROJA(Tarjeta t){
          boolean result=false;
          Tarjeta aux = new Tarjeta(t.getTipo(),t.getMinuto());
          aux.setTipo(TipoTarjeta.ROJO);
          tr1=aux;
          
          return result;
      }
      
      
      public boolean asignarTarjetaRoja(Tarjeta t){
          boolean result=false;
          
          if(tr1==null){
              
            tr1=t;
            result =true;
            this.jugador.incrementarTarjetasRojas();
            Jugador x = Configuracion.personas.buscarJugadorPorNombre(this.jugador.getNombre());
              x.incrementarTarjetasRojas();
          }
          
          
          return result;
      }
      
      public boolean asignarTarjeta(Tarjeta t){
          boolean result=false;
          if(t.getTipo().equals(TipoTarjeta.AMARILLO)){
              
              if(this.asignarTarjetaAmarilla(t)){
              result=true;   
              }
              
              
          }else if(t.getTipo().equals(TipoTarjeta.ROJO)){
              
              if(this.asignarTarjetaRoja(t)){
               result=true;   
              }
              
          }
          return result;
          
      }
      
  
      
      

      public String informacionDeTarjetas(){
         String result = "";
          
         
    
        if(ta1!=null || tr1!=null){
          
         result+="Nombre: "+getJugador().getNombre()+"\n";
        
        
        
         if(ta1!=null){
             result+="Minuto: "+ta1.minuto+" / color: "+ta1.tipo.name()+"\n";
         }
         if(ta2!=null){
             result+="Minuto: "+ta2.minuto+" / color: "+ta2.tipo.name()+"\n";
         }
         if(tr1!=null){
             result+="Minuto: "+tr1.minuto+" / color: "+tr1.tipo.name()+"\n";
         } 
            
            
        }
                          
       
         
      
        return result;  
    }  
    
      
      
    public String getCondicion(){
        return this.condicion;
    }
            
    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }

    public ArrayList<Gol> getGoles() {
        return goles;
    }

    public void setGoles(ArrayList<Gol> goles) {
        this.goles = goles;
    }
    
    public int cantidadDeGoles(){
        return goles.size();
    }
    
    public String mostrarGoles(){
        String result="";
        int i =0;
        result+=  "Equipo: "+this.getJugador().getEquipo().getNombre()+"\n"+
                       "Jugador: "+this.getJugador().getNombre()+"\n";
        for(Gol g: this.goles){
           if(g!=null){
               result +=
                        "Minuto: "+g.getTipo().tiempo+"\n"+
                         "De: "+g.getTipo().getDefinicion();    
           }
            
        }
        return result;
    }
      
    public Plantel getPlantel() {
        return plantel;
    }

    public void setPlantel(Plantel plantel) {
        this.plantel = plantel;
        
    }
      
      

      
    public Jugador getJugador() {
        return jugador;
    }

    public Demarcacion getDemarcacion() {
        return demarcacion;
    }


    
        
      
      public boolean agregarGol(Gol gol){
          boolean result=false;
          
         if(goles.add(gol)){
          this.jugador.acumularGoles();
          this.jugador.goles.add(gol);  
          result=true;   
         }
           
          
          //PRUEBA
          
          Jugador j = Configuracion.personas.buscarJugadorPorNombre(this.jugador.getNombre());
          j.acumularGoles();
          j.goles.add(gol);
          
          
          return result;
      }

      
     
    

    @Override
    public String toString() {
        return "Convocado{" + "jugador=" + jugador + ", demarcacion=" + demarcacion + ", suplente=" + suplente + ", condicion=" + condicion + '}';
    }
    

 
   
   
      
      
   }

