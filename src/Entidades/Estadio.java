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
public class Estadio implements Serializable{
    
    String nombre;
    int capacidad;
    Equipo equipo;

    public Estadio(String nombre, int capacidad) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        
    }

    
    
    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
        equipo.setEstadio(this);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    
    public String getNombre() {
        return nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
}
