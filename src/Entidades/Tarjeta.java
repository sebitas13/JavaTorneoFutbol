/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;
import Enumerados.TipoTarjeta;
import java.io.Serializable;

/**
 *
 * @author ACER
 */
public class Tarjeta implements Serializable{
    
    Convocado convocado;
    
    
    TipoTarjeta tipo;
    String detalle;
    int minuto;
    //ACA VA MINUTO

    public Tarjeta(TipoTarjeta tipo,String detalle,int minuto) {
        this.tipo = tipo;
        convocado =null;
        this.detalle=detalle;
        this.minuto=minuto;
      
        
        
    }
    
    public Tarjeta(TipoTarjeta tipo,int minuto) {
        this.tipo = tipo;
        convocado =null;
       
        this.minuto=minuto;
      
        
        
    }
    

    public String getDetalle() {
        return detalle;
    }

    
    
    public void setConvocado(Convocado convocado) {
        this.convocado = convocado;
    }

    public int getMinuto() {
        return minuto;
    }

    
    
    
    public TipoTarjeta getTipo() {
        return tipo;
    }

    public void setTipo(TipoTarjeta tipo) {
        this.tipo = tipo;
    }

    
   
    
    
}
