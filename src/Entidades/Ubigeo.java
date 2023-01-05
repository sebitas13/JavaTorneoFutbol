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
public class Ubigeo implements Serializable{
    
    private String codUbigeo;
    private String nombre;
    
      public Ubigeo(String codUbigueo,  String nombre ) {
        this.codUbigeo = codUbigueo;
        this.nombre = nombre;
    }
    public Ubigeo(String cad ) {
        String [] parts = cad.split(";");
        this.codUbigeo = parts[0];
        this.nombre = parts[1];
    }
    

    public String getCodUbigueo() {
        return codUbigeo;
    }

    @Override
    public String toString( ) {
        return  this.nombre;
    }
    
    
}
