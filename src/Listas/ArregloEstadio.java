/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

import Entidades.Equipo;
import Entidades.Estadio;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author ACER
 */
public class ArregloEstadio implements Serializable {
    
    ArrayList<Estadio> estadios;

    public ArregloEstadio() {

        estadios = new ArrayList<>();

    }

    public boolean agregarEstadio(Estadio e) {
        return this.estadios.add(e);
    }

    public boolean eliminar(Estadio p) {
        return this.estadios.remove(p);
    }

    public ArrayList<Estadio> getEstadios() {
        return estadios;
    }

    public void setEstadios(ArrayList<Estadio> estadios) {
        this.estadios = estadios;
    }

   

    public int cantidadDeEstadios() {
        int result = 0;

        for (Estadio e : this.estadios) {
            if (e != null) {
                result++;
            }
        }

        return result;
    }

    public String[][] getMatrizEstadios() {
        String[][] result = new String[this.cantidadDeEstadios()][3];
        int i = 0;
        for (Estadio e : this.estadios) {

            result[i][0] = this.estadios.get(i).getNombre();
            result[i][1] = String.valueOf(this.estadios.get(i).getCapacidad());
            if(this.estadios.get(i).getEquipo()!=null){
               result[i][2] = this.estadios.get(i).getEquipo().getNombre(); 
            }else{
                result[i][2] = "No asignado";
            }
            

            i++;

        }
        return result;
    }

    
    public String[] titulosEstadios(){
        String[] result = new String[3];
        result[0] = "ESTADIO";
        result[1] = "CAPACIDAD";
        result[2] = "EQUIPO";
        
        return result;
    }

    //Metodos de busqueda
    public Estadio buscarEstadioPorEquipo(Equipo equipo) {
        Estadio e = null;

        for (Estadio p : this.estadios) {
            if (p.getEquipo().equals(equipo)) {
                e = p;

            }

        }
        return e;
    }

   public Estadio buscarEstadioPorNombre(String nombre) {
        Estadio e = null;

        for (Estadio p : this.estadios) {
            if (p.getNombre().equals(nombre)) {
                e=p;

            }

        }
        return e;
    }

    

    // Metodos de posicion
    public int posicionDeEstadio(Estadio e) {
        int result = 0;
        int i = 0;
        for (Estadio p : this.estadios) {
            
                if (p.equals(e)) {
                    result = i;
                    break;
                }
            
            i++;
        }
        return result;
    }

   

    
}
