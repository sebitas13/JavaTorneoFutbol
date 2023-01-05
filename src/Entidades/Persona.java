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
public  class Persona implements Serializable {
    
    String nombre;
    int edad;
    double sueldo;
    int dni;

    public Persona(String nombre, int edad, double sueldo, int dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.sueldo = sueldo;
        this.dni = dni;
    }

    
    //constructores
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    
    
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", sueldo=" + sueldo + ", dni=" + dni + '}';
    }
    
    
    
}
