/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

import Entidades.Equipo;
import Entidades.Jugador;
import Entidades.Persona;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import javax.swing.ImageIcon;

/**
 *
 * @author ACER
 */
public class ArregloEquipo implements Serializable{

    ArrayList<Equipo> equipos;

    public ArregloEquipo() {

        equipos = new ArrayList<>();
    
    }

    
    public boolean agregarEquipo(Equipo e) {
        boolean result=false;
        if(!this.existeEquipo(e)){
          this.equipos.add(e); 
          result=true;
        }
        return result;
    }

    public boolean existeEquipo(Equipo e){
        boolean result=false;
        for(Equipo p: this.equipos){
            if(p.equals(e)){
                result=true;
                break;
            }
            
        }
        return result;
    }
    
    public boolean eliminar(Equipo p) {
        return this.equipos.remove(p);
    }

    public ArrayList<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(ArrayList<Equipo> equipos) {
        this.equipos = equipos;
    }

    public int cantidadDeEquipos() {
        int result = 0;

        for (Equipo e : this.equipos) {
            if (e != null) {
                result++;
            }
        }

        return result;
    }

    public int getPosicion(Equipo p){
        int i=0;
        int result = 0;
        for(Equipo e: this.equipos){
            if(e.equals(p)){
                result=i;
               
            }
            i++;   
        }
        return result;
    }
    
    public String[][] getMatrizEquipos() {
        String[][] result = new String[this.cantidadDeEquipos()][9];
        int i = 0;
        for (Equipo e : this.equipos) {
            
            result[i][0]=  String.valueOf(Sistema.Configuracion.equipos.getPosicion(e)+1);
            result[i][1] = this.equipos.get(i).getNombre();
            if(this.equipos.get(i).getEstadio()!=null){
              result[i][2] = this.equipos.get(i).getEstadio().getNombre();  
            }else{
                result[i][2] = "No Asignado";
            }
            
            if(this.equipos.get(i).getEntrenador()!=null){
            result[i][3] = this.equipos.get(i).getEntrenador().getNombre();
            }else{
                result[i][3] = "No Asignado";
            }
            result[i][4] = String.valueOf(this.equipos.get(i).obtenerEdadMedia());
            result[i][5] = String.valueOf(this.equipos.get(i).numeroDeJugadoresMaximo());
            result[i][6] = String.valueOf(this.equipos.get(i).calcularSueldoDeEquipo());
            result[i][7] = this.equipos.get(i).getCiudad();
            result[i][8] = getFundacion(this.equipos.get(i).getFundacion());
            
            
            i++;

        }
        return result;
    }
     public String[] getTitulos(){
        String result[] = new String[9];
        result[0] = "POS";
        result[1] = "EQUIPO";
        result[2] = "ESTADIO";
        result[3] = "ENTRENADOR";
        result[4] = "EDAD PROMEDIO";
        result[5] = "JUGADORES";
        result[6] = "VALOR DE MERCADO";
        result[7] = "CIUDAD";
        result[8] = "FUNDACION";
        
        return result;
    }  
     
       public String getFundacion(Date fundacion) {
        DateFormat df;
        String dateString = "";
        
        df = new SimpleDateFormat("dd/MM/yyyy");
        
        dateString = df.format(fundacion);
        
        return dateString;
        
       
    }
     
     
   /*  public String[][] getMatrizOrdenadaEquiposPorPuntos(){
        String[][] result = new String[this.cantidadDeEquipos()][7];
         int i=0;
         ArrayList<Equipo> equipos = this.getListaEquipo();
         Collections.sort(equipos,Collections.reverseOrder());
         
         for(Equipo e : equipos){
            result[i][0] = String.valueOf(i+1);
            result[i][1] = e.getNombre();
            result[i][2] = e.getEstadio().getNombre();
            if(e.getEntrenador()!=null){
            result[i][3] = e.getEntrenador().getNombre();
            }else{
                result[i][3] = "No Asignado";
            }
            result[i][4] = String.valueOf(e.obtenerEdadMedia());
            result[i][5] = String.valueOf(e.numeroDeJugadoresMaximo());
            result[i][6] = String.valueOf(e.calcularSueldoDeEquipo());
            
            
            
            i++;
         }
         return result;
     }
     
     public String[] cabeceraGoleadores(){
         String[] result = new String[3];
         result[0] = "POSICION";
         result[1] = "NOMBRE";
         result[2] = "GOLES";
         
         return result;
     }*/
     
     
     
    //metodos publicos
    // get y Set de ArrayList
    public ArrayList<Equipo> getListaEquipo() {
        ArrayList<Equipo> result = new ArrayList<>();

        for (Equipo e : this.equipos) {

            result.add(e);

        }
        return result;
    }

    //Metodos de busqueda
    public Equipo buscarEquipoPorEstadio(String nombre) {
        Equipo e = null;

        for (Equipo p : this.equipos) {
            if (p.getEstadio().getNombre().equals(nombre)) {
                e = p;

            }

        }
        return e;
    }

   public Equipo buscarEquipoPorNombre(String nombre) {
        Equipo e = null;

        for (Equipo p : this.equipos) {
            if (p.getNombre().equals(nombre)) {
                e = p;

            }

        }
        return e;
    }

    

    // Metodos de posicion
    public int posicionDeEquipo(Equipo e) {
        int result = 0;
        int i = 0;
        for (Equipo p : this.equipos) {
            
                if (p.equals(e)) {
                    result = i;
                    break;
                }
            
            i++;
        }
        return result;
    }

   
    public ImageIcon obtenerImagen(String nombre){
        ImageIcon img = null;
        
        for(Equipo e:this.equipos){
            
            if(e.getNombre().equals(nombre)){
                img=e.getImagen();
                break;
            }
            
        }
        
        
        return img;
    }
    
    public double getSueldoEquipo(String equipo){
        double result =0;
        
        for(Equipo e : this.equipos){
            if(e.getNombre().equals(equipo)){
                result = e.calcularSueldoDeEquipo();
                break;
            }
            
        }
        
        
        return result;
    }

}
