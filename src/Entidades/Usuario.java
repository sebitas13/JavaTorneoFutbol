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
public class Usuario implements Serializable{
    
    private String nombre;
    private String usuario;
    private String contraseña;
    private boolean loguin;
    private boolean remember;

    public Usuario(String nombre, String usuario, String contraseña) {
        
        
        this.nombre = nombre;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.loguin=false;
        this.remember=false;
    }
    
    public boolean validar(String usuario , String contraseña){
        boolean result=false;
        
        if(this.usuario.equalsIgnoreCase(usuario) 
                && this.contraseña.equalsIgnoreCase(contraseña) && !this.loguin ){
            this.setLoguin(true);
            result = true;
            
        }
     return result;   
    }
    
    public boolean cerrarSesion(){
        boolean result = false;
        
        if(this.isLoguin()){
            this.setLoguin(false);
            result=true;
        }
        
        return result;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public boolean isLoguin() {
        return loguin;
    }

    public void setLoguin(boolean loguin) {
        this.loguin = loguin;
    }

    public boolean isRemember() {
        return remember;
    }

    public void setRemember(boolean remember) {
        this.remember = remember;
    }

    public String getContraseña() {
        return contraseña;
    }
    
    
    
}
