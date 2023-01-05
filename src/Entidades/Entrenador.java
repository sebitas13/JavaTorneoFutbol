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
public class Entrenador extends Persona implements Serializable {
    
    Equipo equipo;

    public Entrenador(String nombre, int edad, double sueldo, int dni) {
        super(nombre, edad, sueldo, dni);
        
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    @Override
    public String toString() {
        return super.getNombre();
    }
    
    
    
}
