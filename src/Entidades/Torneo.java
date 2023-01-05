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
public class Torneo implements Serializable{
    
    
    
    
    
    ArrayList<Fecha> fechas;
    TablaDePosicion tabla;
    
    int jornada;
    String tipo;

    public Torneo() {

        fechas = new ArrayList<>();
        this.jornada=0;
        this.tipo="apertura";
        tabla  = new TablaDePosicion();
    }

    public void cabeceraJornada(int jornada){
        for(Fecha f:this.fechas){
            if(f.Jornada==jornada){
                f.serCabeceraFecha(this.tipoDeTorneo()+": "+this.getNumeroDeJornada()+" de 17");
            }
        }
    }

    public ArrayList<Fecha> getFechas() {
        return fechas;
    }
    
    
    
    public void agregarFecha(Fecha f){
        fechas.add(f);
        this.jornada++;
    }
    
    public int getNumeroDeJornada(){
        return this.jornada;
    }
    
    public String tipoDeTorneo(){
        if(jornada>17){
            this.tipo="clausura";
        }
        return this.tipo;
    }
    
    public Fecha obtenerFecha(int jornada) {
        Fecha f = null;
        for (Fecha p : this.fechas) {
            if (p.Jornada == jornada) {
                f = p;
                break;
            }

        }

        return f;
    }

    public String[][] getMatrizDeFechas(){
        String[][] result = new String[this.fechas.size()][2];
        int i=0;
        for(Fecha f : this.fechas){
            if(f!=null){
                
               {
                    
                  
                    result[i][0] = f.Jornada+" de "+17;
                    
                    
                    
                    result[i][1] = "---------------------";   
                    
                    
                    
                }
                
            }
            
           i++;
           
        }
        return result;
    }

    public TablaDePosicion getTabla() {
        return tabla;
    }
    
    
    
}
