/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;

import Entidades.Torneo;
import Entidades.Usuario;
import Calendario.Calendario;
import Entidades.Equipo;
import Enumerados.Demarcacion;

import Listas.ArregloEquipo;
import Listas.ArregloEstadio;
import Listas.ArregloFechas;
import Listas.ArregloPersona;
import Listas.ArregloUbigeos;
import Listas.ArregloUsuario;
import java.util.ArrayList;


/**
 *
 * @author ACER
 */
public class Configuracion {
    
    public static Torneo torneo=new Torneo();
    public static Usuario usuario ;
    public static ArregloUsuario usuarios = new ArregloUsuario();
    public static ArregloEquipo equipos = new ArregloEquipo();
    public static ArregloPersona personas = new ArregloPersona();
    public static ArregloEstadio estadios = new ArregloEstadio();
    public static final ArregloUbigeos peru = new ArregloUbigeos();
    public static ArregloFechas fechas = new ArregloFechas();
    
   // public static ArregloEquipo equiposFinalistas = new ArregloEquipo();
    
    
}
