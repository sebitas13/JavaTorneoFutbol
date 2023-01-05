/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calendario;
import Entidades.Equipo;
/**
 *
 * @author ACER
 */
public class Encuentro {
    
    Equipo equipo1;
    Equipo equipo2;
    
    int jornada;
    
    public Encuentro(Equipo e1,Equipo e2){
        this.equipo1=e1;
        this.equipo2=e2;
    }

    public Encuentro(){
        
    }
    
    public int getJornada() {
        return jornada;
    }

    public void setJornada(int jornada) {
        this.jornada = jornada;
    }

    public void setEquipo1(Equipo equipo1) {
        this.equipo1 = equipo1;
    }

    public void setEquipo2(Equipo equipo2) {
        this.equipo2 = equipo2;
    }
    
    
    
}
