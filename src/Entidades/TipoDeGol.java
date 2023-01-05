package Entidades;

import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 */
public class TipoDeGol implements Serializable {
    
    String definicion;
    String tiempo;
   
    

    public TipoDeGol( String definicion,String tiempo) {
        
        this.definicion=definicion;
        this.tiempo=tiempo;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    

    public String getDefinicion() {
        return definicion;
    }

    public void setDefinicion(String definicion) {
        this.definicion = definicion;
    }

    

    
    public void generarJugador(){
        
    }

    @Override
    public String toString() {
        return "TipoDeGol{" + "definicion=" + definicion + '}';
    }
    
    
}
