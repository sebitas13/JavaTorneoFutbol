/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calendario;

import java.util.ArrayList;
import Entidades.Equipo;
import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class ArregloEquipos {
    
    
    Equipo[][] equipos ;
    
    public ArregloEquipos(int tam1,int tam2){
        
        try {
            this.equipos= new Equipo[tam1][tam2];
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null , "ERROR: "+e);
        }
        
        
    }
    
    
    public Equipo[][] getEquipo(){
        return equipos;
    }
    
    
}
