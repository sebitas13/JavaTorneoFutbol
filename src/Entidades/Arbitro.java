package Entidades;

import Enumerados.EnumPaises;
import Enumerados.TipoArbitro;
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
public class Arbitro extends Persona implements Serializable{
    
    
    TipoArbitro tipoArbitro;
    String pais;
    

    
    public Arbitro(String nombre, int edad, double sueldo, int dni,TipoArbitro tipoArbitro,String pais) {
        super(nombre, edad, sueldo, dni);
        this.tipoArbitro=tipoArbitro;
        this.pais=pais;
    }

    public String getPais() {
        return pais;
    }


    

    public TipoArbitro getTipoArbitro() {
        return tipoArbitro;
    }

    public void setTipoArbitro(TipoArbitro tipoArbitro) {
        this.tipoArbitro = tipoArbitro;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
