/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class Encuentro implements Serializable{
   
    
    
   Plantel plantel1;
   Plantel plantel2;
   String codigo;
   Date fechaEncuentro;
   Estadio estadio;
   Terna terna;
   ArrayList<Plantel> planteles;
   int jornada;
   int gol1,gol2;
   Fecha fecha;
   String id;
   
   Arbitro arbitro;
   
   public Encuentro(Plantel e1 , Plantel e2,Estadio e,Date fechaEncuentro,int jornada,Arbitro arbitro){
       
       planteles = new ArrayList<Plantel>();
       e1.bEncuentro=true;
       e2.bEncuentro=true;
       e1.setEncuentro(this);
       e2.setEncuentro(this);
       e1.setCondicion("LOCAL");
       e2.setCondicion("VISITANTE");
       planteles.add(e1);
       planteles.add(e2);
       
       this.plantel1=e1;
       this.plantel2=e2;
       this.estadio=e;
       this.fechaEncuentro=fechaEncuentro;
       e1.getEquipo().pj++;
       e2.getEquipo().pj++;
       this.jornada=jornada;
       this.id=generarId(e1,e2,fechaEncuentro);
       
       this.arbitro=arbitro;
   }
   
   public void asignarResultado(int a,int b){
       this.gol1=a;
       this.gol2=b;
       
       if(this.gol1>this.gol2){
           
           this.plantel1.equipo.pg++;
           this.plantel2.equipo.pp++;
       }else if(this.gol2>this.gol1){
         
           this.plantel2.equipo.pg++;
           this.plantel1.equipo.pp++;
       }else{
           
           this.plantel1.equipo.pe++;
           this.plantel2.equipo.pe++;
       }
       
   }
   
   public boolean AsignarGolLocal(Gol g,Convocado c){
      Boolean result=false;
      
      
       if(this.plantel1.equipo.golesPorEncuentro[jornada-1]<gol1){
        //   JOptionPane.showMessageDialog(null, "ASIGNADO");
          g.setEquipoMarcado(plantel2.equipo.getNombre()); 
          g.setJornada(jornada);//OJO 
         
          this.plantel1.ingresarGol(c, g,this.jornada); 
       
          result=true;
          this.plantel1.equipo.incGolesaFavor();
          
          this.plantel2.equipo.incGolesEnContra();
          
       }
           
       return result;
   }
   
    public boolean AsignarGolVisitante(Gol g,Convocado c){
      boolean result=false;
      if(this.plantel2.equipo.golesPorEncuentro[jornada-1]<gol2){
          g.setEquipoMarcado(plantel1.equipo.getNombre());
          g.setJornada(jornada);//ojo
          this.plantel2.ingresarGol(c, g,this.jornada);  
          result =true;
          this.plantel2.equipo.incGolesaFavor();
          this.plantel1.equipo.incGolesEnContra();
          
      }
          
       return result;
   }
  
   
   public boolean asignarTarjeta(Plantel p,Convocado c ,Tarjeta t){
       boolean result = false;
       
       Convocado c1 = p.obtenerConvocado(c.getJugador().dni);
       if(c1.asignarTarjeta(t)){
          result=true; 
       }
       
       
       return result;
   }
   
   public String mostrarTarjetas(){
       String result = "";
       
       result+=this.plantel1.getEquipo().getNombre()+"\n"+
       this.plantel1.obtenerTarjetasDeConvocados();
       result+=this.plantel2.getEquipo().getNombre()+"\n"+
       this.plantel2.obtenerTarjetasDeConvocados();
       return result;
   }
   
   
   public Plantel getPlantel(String nombre){
       Plantel e=null;
       
       for(Plantel p:this.planteles){
           if(nombre.equalsIgnoreCase(p.getEquipo().getNombre())){
               e=p;
           }
           
       }
      return e;
   }
   
   public String[][] getMatrizPlanteles(){  
        String[][] result = new String[this.planteles.size()][5];
        int i = 0;
        for(Plantel p : this.planteles){
            if(p != null){
                
                    result[i][0] = "Nombre del equipo: "+p.equipo.getNombre();
                     
                    result[i][1] = "# Convocados: "+p.cantidadConvocados();
                    
                    result[i][2] = "------------------------";
            }
            i++;
        }
        return result;
    }
   
  
   
   public String mostrarResultado(){
       String result="";
       String mensaje="";
       Plantel p = this.obtenerGanador();
       if(p!=null){
           mensaje = "Ganador: "+p.equipo.getNombre();
       }else{
           mensaje = "Empate";
       }
       result = "ESTADIO: ®"+this.estadio.nombre+"\n"+"Fecha: "+this.getFechaEncuentro()+"®\n"+
               "Arbitro Principal: "+this.arbitro.getNombre()+"\n"+
               "Equipos : "+this.plantel1.equipo.nombre+"("+String.valueOf(this.plantel1.equipo.golesPorEncuentro[jornada-1])+")"+"   VS   "+this.plantel2.equipo.nombre+"("+String.valueOf(this.plantel2.equipo.golesPorEncuentro[jornada-1])+")"+"\n\n"+
                  "►GOLES DE LOCAL: \n\n"+this.plantel1.mostrarGoleadoresAreaDetallado()+"►GOLES DE VISITANTE: \n\n"+this.plantel2.mostrarGoleadoresAreaDetallado()+"\n"+
               "TARJETAS: \n"+mostrarTarjetas()+"\n\n"+
                  "RESULTADO--->\t"+mensaje+"\n"+
                "Codigo: "+this.getId();
       
       return result;
   }
   //ALT+16 = ►
   public void incrementarPuntos(){
       
       
       Plantel plantel = this.obtenerGanador();
      if(plantel!=null){
        if(plantel.equals(this.plantel1)){
           this.plantel1.equipo.pg++;
           this.plantel2.equipo.pp++;
       }else if(plantel.equals(this.plantel2)){
           this.plantel2.equipo.pg++;
           this.plantel1.equipo.pp++;
       }else{
           this.plantel2.equipo.pe++;
           this.plantel1.equipo.pe++;
       }  
          
          
      } 
       
       
   }
   
   public Plantel obtenerGanador(){
       Plantel plantel=null;
       
       /*if(this.plantel1.golesPorEncuentro[this.jornada-1]>this.plantel2.golesPorEncuentro[this.jornada-1]){
           plantel = this.plantel1;
         
          
           
           
       }else if(this.plantel1.golesPorEncuentro[this.jornada-1]<this.plantel2.golesPorEncuentro[this.jornada-1]) {
           plantel = this.plantel2;
           
            
       }else{
           plantel=null;
           
           
       }*/
       
       if(this.gol1>this.gol2){
           plantel = this.plantel1;
           
       }else if(this.gol2>this.gol1){
           plantel = this.plantel2;
          
       }else{
           plantel=null;
          
       }
       
       
       return plantel;
   }
   
   public String generarId(Plantel e1,Plantel e2,Date fecha){
       String result="";
       
       result = e1.equipo.getNombre()+fecha+e2.equipo.getNombre();
       
      return result; 
   }

    public String getId() {
        return id;
    }

   
   
    public String getFechaEncuentro() {
        DateFormat df;
        String dateString = "";
        
        df = new SimpleDateFormat("dd/MM/yyyy");
        
        dateString = df.format(this.fechaEncuentro);
        
        return dateString;
        
       
    }

    public Plantel getPlantel1() {
        return plantel1;
    }

    public Plantel getPlantel2() {
        return plantel2;
    }
   
   
   


   
   
}
