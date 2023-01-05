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
public class Terna implements Serializable{
    
    
    ArrayList<Arbitro> arbitros;
    
    public Terna(){
        arbitros = new ArrayList<>();
    }
    
    public boolean agregarArbitro(Arbitro a) {
        return this.arbitros.add(a);
    }

    public boolean eliminar(Arbitro a) {
        return this.arbitros.remove(a);
    }

    public ArrayList<Arbitro> getArbitro() {
        return arbitros;
    }

    public void setArbitro(ArrayList<Arbitro> arbitros) {
        this.arbitros=arbitros;
    }

    public int cantidadDeArbitros() {
        int result = 0;

        for (Arbitro a : this.arbitros) {
            if (a != null) {
                result++;
            }
        }

        return result;
    }

    public String[][] getMatrizArbitros() {
        String[][] result = new String[this.cantidadDeArbitros()][3];
        int i = 0;
        for (Arbitro e : this.arbitros) {

            result[i][0] = this.arbitros.get(i).getNombre();
            result[i][1] = this.arbitros.get(i).tipoArbitro.name();
            result[i][2] = String.valueOf(this.arbitros.get(i).getEdad());
            
            
            i++;

        }
        return result;
    }

    //metodos publicos
    // get y Set de ArrayList
    public ArrayList<Arbitro> getListaArbitro() {
        ArrayList<Arbitro> result = new ArrayList<>();

        for (Arbitro a : this.arbitros) {

            result.add(a);

        }
        return result;
    }

    //Metodos de busqueda
    

   public Arbitro buscarArbitroPorNombre(String nombre) {
        Arbitro e = null;

        for (Arbitro a : this.arbitros) {
            if (a.getNombre().equals(nombre)) {
                e = a;

            }

        }
        return e;
    }

    

    // Metodos de posicion
    public int posicionDeArquero(Arbitro a) {
        int result = 0;
        int i = 0;
        for (Arbitro e : this.arbitros) {
            
                if (e.equals(a)) {
                    result = i;
                    break;
                }
            
            i++;
        }
        return result;
    }

    
}
