/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import Enumerados.TipoTarjeta;
import Sistema.Configuracion;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class Plantel implements Serializable{
    
    
    
    Equipo equipo;
    String condicion;
    Encuentro encuentro;
    boolean bEncuentro;
    ArrayList<Convocado> convocados;
   /*  int golesaFavor;
    int golesEnContra;
     int pg,pp,pe;
   int[] golesPorEncuentro;*/
    String estado;
    int jornada;
    
    
    public Plantel(Equipo e,int jornada){
        
        this.equipo=e;
       // e.asignarPlantel(this);
        this.bEncuentro=false;
        convocados = new ArrayList<>();
       /* 
        this.golesaFavor=0;
        this.golesPorEncuentro= new int[100];
        this.golesEnContra=0;
        pg=0 ; pp =0; pe=0;*/
        this.estado = "loser";
        this.jornada=jornada;
    }

    public String getEstado() {
        return estado;
    }

    /*public int getPuntos(){
        return this.pg*3;
    }*/
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
   
    
    public void ingresarGol(Convocado c, Gol g,int jornada){
        
        for(Convocado p: this.convocados){
            if(p.getJugador().getNombre().equals(c.getJugador().getNombre())){
                
               // c.goles.add(g);
               if( p.agregarGol(g)){
                   JOptionPane.showMessageDialog(null, "GOL AGREGADO");
               }else{
                   JOptionPane.showMessageDialog(null, "GOL NO AGREGADO");
               }
               
                
                this.equipo.golesPorEncuentro[jornada-1]=this.equipo.golesPorEncuentro[jornada-1]+1;
                
            }
            
        }
        
    }
    
    
    
    public String[][] getMatrizResultado(){  
        String[][] result = new String[this.convocados.size()][2];
        int i = 0;
        for(Convocado c : this.convocados){
            if(c != null && c.cantidadDeGoles()>0){
                
                    result[i][0] = c.mostrarGoles();
                    result[i][1] = "-------------------";
                    
                    
                    
            }
            i++;
        }
        return result;
    }
    
    public int cantidadConvocados(){
        return this.convocados.size();
    }
    
    public boolean agregarConvocado(Convocado c){
        boolean result=false;
        
        if(!this.findConvocado(c.getJugador().getNombre())){
            this.convocados.add(c);
            c.setPlantel(this);
            result=true;
        }
        
        return result;
    }
    
    public boolean liberarConvocadoPorNombre(String nombre){
        boolean result=false;
        
        for(Convocado c:this.convocados){
            if(c.jugador.getNombre().equals(nombre)){
                this.convocados.remove(c);   
            c.setPlantel(null);
            result=true;break;  
            }
            
        }
       
        
        
        return result;
    }
    
    public void asignarTarjeta(Tarjeta t, Convocado c){
        
                  
        for(Convocado e : this.convocados){
          if(e.equals(c)){
            
            c.asignarTarjeta(t);
          }
         
        }
    }
/*
    public void incGolesaFavor() {
        this.golesaFavor++;
    }

    public void incGolesEnContra() {
        this.golesEnContra++;
    }

    

    public int getGolesTotales() {
        return golesaFavor;
    }

    */
    
    
    
    public Encuentro getEncuentro() {
        return encuentro;
    }

    public void setEncuentro(Encuentro encuentro) {
        this.encuentro = encuentro;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
        
    }

    public String getCondicion() {
        return condicion;
    }
    
    
    
    public ArrayList<Tarjeta> buscarTarjetaPorDni(int dni){
        ArrayList<Tarjeta> t=null;
        for(Convocado c : this.convocados){
            if(c.getJugador().getDni()==dni){
                t=c.tarjetas;
            }
            
        }
        
        return t;
    }
    
    public Convocado obtenerConvocado(int dni){
        Convocado x = null;
        
        for(Convocado c : this.convocados){
            if(c.getJugador().getDni()==dni && c!=null)
               x=c; 
        }
        
        return x;
    }
      
     public Convocado obtenerConvocadoPorNombre(String nombre){
        Convocado x = null;
        
        for(Convocado c : this.convocados){
            if(c.getJugador().getNombre().equalsIgnoreCase(nombre) && c!=null)
               x=c; 
        }
        
        return x;
    }
    
    public boolean findConvocado(String nombre){
        boolean result=false;
        
        for(Convocado c:this.convocados){
           if(c.getJugador().getNombre().equalsIgnoreCase(nombre)){
               result=true;
               break;
           } 
            
        }
        
        
        return result;
    }
    
     public String[][] getMatrizTarjetas(){  
        String[][] result = new String[this.convocados.size()][4];
        int i = 0;
        for(Convocado c : this.convocados){
            if(c != null){
                                    
                    result[i][0] =  c.informacionDeTarjetas();
                    
                    
            }
            i++;
        }
        return result;
    }
    
     public String obtenerTarjetasDeConvocados(){
         String result = "";
         
         for(Convocado c:this.convocados){
             
             result+=c.informacionDeTarjetas()+"\n";
         }
         
         return result;
     }
              
       
    public String[][] getMatrizConvocados(){  
        String[][] result = new String[this.convocados.size()][4];
        int i = 0;
        for(Convocado c : this.convocados){
            if(c != null && c.getPlantel()!=null && c.getJugador().getEquipo()!=null &&
                    Configuracion.personas.buscarJugadorPorNombre(c.jugador.getNombre())!=null){
                
                    result[i][0] = c.getJugador().getEquipo().getNombre();
                    result[i][1] = c.getJugador().nombre;
                    result[i][2] = c.getDemarcacion().name();
                    result[i][3] = String.valueOf(c.getJugador().getNumero());
                    
                   
            }
            i++;
        }
        return result;
    }
    
    public String[] cabeceraConvocados(){
        
        String[] result = new String[4];
        
        result[0]="Equipo";
        result[1]="Nombre";
        result[2]="Posicion";
        result[3]="Dorsal";
        
        
        return result;
    }

    public boolean isbEncuentro() {
        return bEncuentro;
    }

    public void setBencuentro(boolean encuentro) {
        this.bEncuentro = encuentro;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public int getJornada() {
        return jornada;
    }

    public void setJornada(int jornada) {
        this.jornada = jornada;
    }
    
    
    
    
    
    public ArrayList<Convocado> getConvocados() {
        return convocados;
    }
    
    
    
    public ArrayList<Convocado> mostrarConvocados(){
        return this.convocados;
    }
    
    public String[] mostrarGoleadores(){
        String[] result = new String[this.cantidadConvocados()];
        int i=0;
        for(Convocado c:this.convocados){
            if(c.cantidadDeGoles()>0){
                result[i]=c.mostrarGoles();
                i++;
            }
            
        }
        
        
        return result;
    }
    
    public String mostrarGoleadoresArea(){
        String result= "";
        
       // JOptionPane.showMessageDialog(null, convocados.size());
        
        
        for(Convocado c:this.convocados){
            if(c.cantidadDeGoles()>0){
             //JOptionPane.showMessageDialog(null,"goless: "+ c.cantidadDeGoles());   
                result+=c.getJugador().getNombre()+"("+c.cantidadDeGoles()+")"+"\n Minuto:";
                for(int i=0;i<c.cantidadDeGoles();i++){
                    result += c.getGoles().get(i).tipo.tiempo+"|";
                }
                result+="\n";
            }
            
        }
        
        return result;
    }
    
     public String mostrarGoleadoresAreaDetallado(){
        String result= "";
        
        for(Convocado c:this.convocados){
            if(c.cantidadDeGoles()>0){
                
                result+=c.getJugador().getNombre()+"("+c.cantidadDeGoles()+") / ";
                        for(int i=0;i<c.cantidadDeGoles();i++){
                            if(c.getGoles().get(i)!=null){
                              result+= "Minuto: "+c.getGoles().get(i).getTipo().tiempo+" / "+
                                   "De: "+c.getGoles().get(i).getTipo().getDefinicion()+" / \n\n"; 
                            }
                           
                        }
                
            }
            
        }
        
        
            
        
        return result;
    }
    
}