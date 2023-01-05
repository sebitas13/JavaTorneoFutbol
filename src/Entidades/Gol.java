/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;

/**
 *
 * @author ACER
 */
public class Gol implements Serializable{
    
    TipoDeGol tipo;
     String equipoMarcado;
     int jornada;
   

    public Gol(TipoDeGol tipo) {
        this.tipo = tipo;
        equipoMarcado="";
    }

    
    public TipoDeGol getTipo() {
        return tipo;
    }

    public void setTipo(TipoDeGol tipo) {
        this.tipo = tipo;
    }

    public void setEquipoMarcado(String equipoMarcado) {
        this.equipoMarcado = equipoMarcado;
    }

    public void setJornada(int jornada) {
        this.jornada = jornada;
    }

    
    

   

    @Override
    public String toString() {
        return "Gol{" + "tipo=" + tipo + ", tiempo=" + this.tipo.tiempo  + '}';
    }
    
}
