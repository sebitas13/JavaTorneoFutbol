package Entidades;

import java.io.Serializable;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 */                                                 //OJO
public class Jugador extends Persona implements Comparable<Jugador> ,Serializable{
    
    
    int numero;
    
    String nacionalidad;
    double valorMercado;
    String posicionJ;
    String pais;
    String fechaContrato;
    Equipo equipo;
    double altura;
    String condicion;
    boolean bConvocado;
    boolean disponible;
   Convocado convocado;  
   Ubigeo ubigeo;
   Integer golesTotalesMarcados;
   
   ArrayList<Gol> goles;
   
   int numTarjetasAmariilas;
   int numTarjetasRojas;
   
   public Jugador(int numero, String pais ,String nombre, int edad, int dni,String posicion,double altura) {
        super(nombre, edad,0, dni);
        this.numero = numero;
        this.nacionalidad = this.calcularNacionalidad(pais);
        this.posicionJ=posicion;
        this.disponible = true;
        this.equipo=null;
        this.altura=altura;
        this.pais=pais;
        this.condicion="Disponible";
        this.bConvocado=false;
        this.golesTotalesMarcados=0;
        goles = new ArrayList<>(); //ojo no se usara este constructor
        
        
    }
   
   
   

    public Jugador(int numero, String pais ,String nombre, int edad, int dni,String posicion,double altura,Ubigeo ubigeo) {
        super(nombre, edad,0, dni);
        this.numero = numero;
        this.nacionalidad = this.calcularNacionalidad(pais);
        this.posicionJ=posicion;
        this.disponible = true;
        this.equipo=null;
        this.altura=altura;
        this.pais=pais;
        this.condicion="Disponible";
        this.ubigeo=ubigeo;
        this.bConvocado=false;
        this.golesTotalesMarcados=0;
        
        goles = new ArrayList<>();
        
        
        this.numTarjetasAmariilas=0;
        this.numTarjetasRojas=0;
    }

    public Convocado getConvocado() {
        return convocado;
    }

    
    public double getValorMercado() {    
        return valorMercado;
    }

    public String getPosicionJ() {
        return posicionJ;
    }

    //metodos get y set
    public double getAltura() {
        return altura;
    }

    public String getFechaContrato() {
        return fechaContrato;
    }

    public void setFechaContrato(String fechaContrato) {
        this.fechaContrato = fechaContrato;
    }

    
    
    public int getNumero() {
        return numero;
    }

    public void setUbigeo(Ubigeo ubigeo) {
        this.ubigeo = ubigeo;
    }

    public Ubigeo getUbigeo(){
        return this.ubigeo;
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getCondicion() {
        return condicion;
    }

    public boolean isbConvocado() {
        return bConvocado;
    }

    
    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public void setbConvocado(boolean bConvocado) {
        this.bConvocado = bConvocado;
    }
    

    public String getPais() {
        return pais;
    }

    public void setValorMercado(double valorMercado) {
        this.valorMercado = valorMercado;
    }

    public void setPosicionJ(String posicionJ) {
        this.posicionJ = posicionJ;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setConvocado(Convocado convocado) {
        this.convocado = convocado;
    }
    
    
    public void acumularGoles(){
        
   
        
           this.golesTotalesMarcados++;  
             
    }

    public Equipo getEquipo() {
        
        return equipo;
    }

    public Integer getGolesTotalesMarcados() {
        return golesTotalesMarcados;
    }

    
    
    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public String calcularNacionalidad(String pais){
        String cadena="";
        if(pais.equalsIgnoreCase("Peru")){
            cadena = "Peruano";
        }else{
            cadena = "Extranjero";
        }
        return cadena;
    }
    
    public boolean contratar(double Sueldo,Equipo equipo,String fechaContrato){  //Solo contrato no agrego al arreglo
      boolean result = false;
      if(this.disponible){
          this.setEquipo(equipo);
          this.setSueldo(Sueldo);
          this.setFechaContrato(fechaContrato);
          this.disponible=false;
          this.condicion="Contratado";
          result =true;
      }  
      return result;  
    }
    
    public boolean liberar(){
        boolean result = false;
        if(!this.disponible){
            this.disponible=true;
            result = true;
            this.setEquipo(null);
            this.condicion = "No Contratado";
        }
        return result;
        
    }
    
    public void asignarEquipo(Equipo e){
        
        this.equipo=e;
        
    }
    

     public String estadoConvocado(){
         String result="";
          if(this.bConvocado==true){
              result="convocado";
          }else{
              result ="disponible";
          }
          return result;
      }
      
    
    public String getDatosJudor(){
        String result = "";
        result += "Nombre: "+this.getNombre()+"\n"+
                  "Edad: "+this.getEdad()+"\n"+
                  "Nacionalidad: "+this.getNacionalidad()+"\n"+
                  
                  
                  "Sueldo: "+this.getSueldo()+"\n";
        return result;
    }
    
    public String mostrarGolesMarcados(){
        String result="";
        result += this.getNombre()+"("+this.getEquipo().getNombre()+") \n";
        
        for(Gol g:this.goles){
            
            result+=g.getTipo().getDefinicion()+"("+g.getTipo().getTiempo()+")-"+g.equipoMarcado+"-Fecha:"+g.jornada+"-\n";
        }
        
        return result;
    }
    
    
    public void incrementarTarjetasAmarillas(){
        this.numTarjetasAmariilas++;
    }
    
    public void incrementarTarjetasRojas(){
        this.numTarjetasRojas++;
    }
    
    public int getTarjetasAmarillas(){
        return numTarjetasAmariilas;
    }
    
    public int getTarjetasRojas(){
        return numTarjetasRojas;
        
    }
    
    

    @Override
    public String toString() {
        return "Jugador{" +"nombre= "+nombre+ "numero=" + numero + ", nacionalidad=" + nacionalidad + ", condicion=" + condicion + ", disponible=" + disponible + ", equipo=" + equipo + '}';
    }

    @Override
    public int compareTo(Jugador j) {
        return this.golesTotalesMarcados.compareTo(j.getGolesTotalesMarcados());
        
    }
    
  

    
    
    
    
}
