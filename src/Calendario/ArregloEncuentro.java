/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calendario;

//import java.util.ArrayList;

/**
 *
 * @author ACER
 */
public class ArregloEncuentro {
    
    Encuentro[][] encuentros ;
    
    public ArregloEncuentro(int tam1,int tam2){
        
        this.encuentros= new Encuentro[tam1][tam2];
        
        for(int i=0;i<tam1;i++){
            
            for(int j=0;j<tam2;j++){
                
                encuentros[i][j]= new Encuentro();
            }
            
        }
    }
    
 
    
    public Encuentro[][] getEncuentros(){
        return encuentros;
    }
    
}
