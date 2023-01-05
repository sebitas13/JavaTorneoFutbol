/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enumerados;

/**
 *
 * @author ACER
 */
public enum TipoArbitro {
    
    PRINCIPAL(10000),ASISTENTE(5000),CUARTO_ARBITRO(3000),VAR(2000);
    
    private Double sueldo;
    
    private TipoArbitro(double sueldo){
        this.sueldo = sueldo;

    }
    
    public double getSueldo(){
        return sueldo;
    }
    
}
