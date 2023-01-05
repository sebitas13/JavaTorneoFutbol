package Entidades;

import Listas.ArregloPersona;
import java.util.ArrayList;
import Enumerados.Demarcacion;
import Sistema.Configuracion;
import java.io.Serializable;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import librerias.SerializadoraGen;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 */
public class Equipo implements Comparable<Equipo>, Serializable {

    String nombre;
    double edadMedia;
    int numExtranjeros;
    int numJugadores;
    //String entrenador;
    Estadio estadio;

    double balanceDeFichajes;
    Entrenador entrenador;

    ImageIcon imagen;

    String ciudad;
    Date fundacion;

    //Plantel plantel;//tienee que tener un array
    int edadTotal;
    ArrayList<Plantel> planteles;
    ArrayList<Jugador> jugadores;
    //ultimo agregado
    int golesaFavor;
    int golesEnContra;
    int pj, pg, pp, pe, dg;
    int[] golesPorEncuentro;

    Integer puntos;

    int cod;

    public ArrayList<Plantel> getPlanteles() {
        return planteles;
    }

    public Equipo(Integer puntos) {
        
        this.puntos=puntos;
    }

    

    public ImageIcon getImagen() {
        return imagen;
    }

    public Equipo(String nombre, int numJugadores, Entrenador entrenador, Estadio estadio, String ciudad, Date fundacion) {
        this.nombre = nombre;
        this.numJugadores = numJugadores;
        this.entrenador = entrenador;
        entrenador.setEquipo(this);
        this.estadio = estadio;
        estadio.setEquipo(this);
        this.edadTotal = 0;

        jugadores = new ArrayList<>();
        planteles = new ArrayList<>();
        //plantel = new Plantel(this);

        //new
        this.golesaFavor = 0;
        this.golesPorEncuentro = new int[100];
        this.golesEnContra = 0;
        pj = 0;
        pg = 0;
        pp = 0;
        pe = 0;

        this.puntos = 0;

        this.ciudad = ciudad;
        this.fundacion = fundacion;
    }

    //new
    public void incGolesaFavor() {
        this.golesaFavor++;
    }

    public void incGolesEnContra() {
        this.golesEnContra++;
    }

    public int getGolesTotales() {
        return golesaFavor;
    }

    public Integer getPuntos() {
        this.puntos = pg * 3 + this.pe;
        return puntos;
    }
    
    public int getPuntosIniciales(){
        return this.puntos;
    }

    //fin
    public Estadio getEstadio() {
        return estadio;
    }

    public void setEstadio(Estadio estadio) {
        this.estadio = estadio;

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumJugadores(int numJugadores) {
        this.numJugadores = numJugadores;
    }

    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

    public int numeroDeJugadoresMaximo() {

        return this.numJugadores;
    }

    public int numeroDeJugadoresActual() {
        return this.jugadores.size();
    }

    public Jugador getJugador(String nombre) {
        Jugador result = null;

        for (Jugador j : this.jugadores) {

            if (j.getNombre().equalsIgnoreCase(nombre)) {
                result = j;
                break;
            }

        }

        return result;
    }

    public Plantel obtenerPlantel(int jornada) {
        Plantel result = null;

        for (Plantel p : this.planteles) {

            if (p.getJornada() == jornada) {
                result = p;
                break;
            }

        }

        return result;
    }

    public void crearPlantel(Plantel plantel) {

        this.planteles.add(plantel);

    }

    public boolean convocarJugador(Jugador j, Demarcacion p, int jornada) {
        boolean result = false;
        
//JOptionPane.showMessageDialog(null, planteles.size());
        if (this.obtenerPlantel(jornada) == null) {
            this.crearPlantel(new Plantel(this, jornada));
               JOptionPane.showMessageDialog(null, "plantel creado");
            if (j.getEquipo().equals(this) ) {   //&& !j.bConvocado
                Plantel plantel = this.obtenerPlantel(jornada);
                plantel.agregarConvocado(new Convocado(j, p));
                // this.plantel.agregarConvocado(new Convocado(j, p));

                //j.setCondicion("convocado");
               // j.bConvocado = true;
                result = true;
            }
        } else {
           
            
                if (j.getEquipo().equals(this) ) {
                    Plantel plantel = this.obtenerPlantel(jornada);
                    plantel.agregarConvocado(new Convocado(j, p));
                    // this.plantel.agregarConvocado(new Convocado(j, p));

                   // j.setCondicion("convocado");
                   // j.bConvocado = true;
                    result = true;

                }

            

        }

        return result;
    }

    public boolean liberarConvocatoria(Jugador j, int jorn) {
        boolean result = false;
    
          this.obtenerPlantel(jorn).liberarConvocadoPorNombre(j.getNombre());
            result = true;
     

        return result;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarEdad(int edad) {

        this.edadTotal = this.edadTotal + edad;
    }

    public int getNumJugadores() {
        return numJugadores;
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }

    public void setPuntos(Integer puntos) {
        this.puntos = puntos;
    }
    
    

    public double obtenerEdadMedia() {

        this.edadMedia = (double) this.edadTotal / this.jugadores.size();

        return this.edadMedia;
    }

    public boolean contratarJugador(Jugador j, double sueldo, String fechaContrato) {
        boolean result = false;
        if (j.isDisponible()) {
            j.contratar(sueldo, this, fechaContrato);

            jugadores.add(j);

            if (!j.getPais().equalsIgnoreCase("Peru")) {
                this.numExtranjeros++;
            }

            this.agregarEdad(j.getEdad());
            result = true;

        }

        return result;
    }

    public boolean liberarJugador(Jugador j) {
        boolean result = false;
        if (!j.isDisponible()) {
            
            j.liberar();
            j.setEquipo(null);
          
            
           if( jugadores.remove(j)){
               JOptionPane.showMessageDialog(null, "REMOVIDO");
                result = true;
                
           }
        
           
        }

        return result;
    }
    
     public boolean liberarJugador2(Jugador j) {
        boolean result = false;
        if (!j.isDisponible()) {
            
            j.liberar();
            j.setEquipo(null);
          
            int i =0;
           for(Jugador e : this.jugadores){
               
               if(jugadores.get(i).equals(j)){
                   jugadores.remove(i);
                   JOptionPane.showMessageDialog(null, "LIBERADO");
                   result=true;break;
               }
               i++;
           }
        
           
        }

        return result;
    }
    
    
    
    public boolean liberarJugadorPorNombre(Jugador j) {
        boolean result = false;
        if (j!=null && !j.isDisponible()) {
            
            j.liberar();
            j.setEquipo(null);
            
          int i=0;
            for(Jugador e:this.jugadores){
                if(jugadores.get(i).getNombre().equals(j.getNombre())){
                   if( jugadores.remove(i)!=null){
                           // JOptionPane.showMessageDialog(null, "REMOVIDO");
                            result = true;break;
                }
                i++;
            }
            
           
                
           }
        
           
        }

        return result;
    }

    public String informacionDelEquipo() {
        return "Informacion del Equipo: " + nombre + "\n"
                + " edadMedia: " + edadMedia + "\n"
                + " numExtranjeros: " + numExtranjeros + "\n"
                + " numJugadores: " + numJugadores + "\n"
                + " entrenador: " + entrenador + "\n"
                + " estadio: " + estadio.nombre;
    }

    public String[][] getMatrizJugadores() {
        String[][] result = new String[this.jugadores.size()][9];
        int i = 0;
      // JOptionPane.showMessageDialog(null,jugadores.size() ); TTTTTTTTTTTTTTTTTTT
      for (Jugador j : this.jugadores) {
            if ( j != null && j.getEquipo() != null && Configuracion.personas.buscarJugadorPorNombre(j.getNombre()) != null) {

                result[i][0] = j.getNombre();
                result[i][1] = j.nacionalidad;
                result[i][2] = j.posicionJ;
                result[i][3] = j.getFechaContrato();
                result[i][4] = String.valueOf(j.altura);
                result[i][5] = j.pais;
                result[i][6] = String.valueOf(j.edad);
                result[i][7] = j.getCondicion();
                result[i][8] = j.estadoConvocado();

            }
            i++;
        }
        return result;
    }

    public String[] getTitulosJugadores() {
        String result[] = new String[9];
        result[0] = "Nombre";
        result[1] = "Nacionalidad";
        result[2] = "Posicion";
        result[3] = "ContratoHasta";
        result[4] = "Altura";
        result[5] = "Pais";
        result[6] = "Edad";
        result[7] = "Estado";
        result[8] = "Convocado";

        return result;
    }

    public String[][] getMatrizJugadoresDisponibles() {
        String[][] result = new String[this.jugadores.size()][8];
        int i = 0;
        for (Jugador j : this.jugadores) {
            if (j != null && j.estadoConvocado().equalsIgnoreCase("Disponible")) {

                result[i][0] = j.getNombre();
                result[i][1] = j.nacionalidad;
                result[i][2] = j.posicionJ;
                result[i][3] = j.getFechaContrato();
                result[i][4] = String.valueOf(j.altura);
                result[i][5] = j.pais;
                result[i][6] = String.valueOf(j.edad);
                result[i][7] = j.estadoConvocado();

            }
            i++;
        }
        return result;
    }

    public double calcularSueldoDeEquipo() {
        double result = 0;
        int i = 0;
        for (Jugador j : this.jugadores) {

            result = result + this.jugadores.get(i).getSueldo();

            i++;
        }

        return result;
    }

    public String getCiudad() {
        return ciudad;
    }

    public Date getFundacion() {
        return fundacion;
    }

    @Override
    public String toString() {
        return nombre;
    }
//  ORDENAR LOS EQUIPOS SEGUN SUS PUNTOS.
    @Override
    public int compareTo(Equipo e) {
        return this.puntos.compareTo(e.getPuntos());
    }

}
