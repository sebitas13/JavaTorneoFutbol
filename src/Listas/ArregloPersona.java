/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

import Entidades.Arbitro;
import Entidades.Entrenador;
import Entidades.Jugador;
import Entidades.Persona;
import Sistema.Configuracion;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class ArregloPersona implements Serializable {

    ArrayList<Persona> personas;

    //constructor
    public ArregloPersona() {
        this.personas = new ArrayList<>();
    }

    //metodo agrregar y eliminar del ArrayList
    public boolean agregar(Persona p) {
        boolean retorno = false;
        if (!this.findPersona(p.getDni())) {
            this.personas.add(p);
            retorno = true;
        }

        return retorno;
    }

    public boolean findPersona(int codigo) {

        boolean retorno = false;

        for (Persona p : this.personas) {
            if (codigo == p.getDni()) {
                retorno = true;
                break;
            }

        }
        return retorno;
    }

    public boolean eliminar(Persona p) {
        boolean result = false;

        if (p instanceof Jugador) {
            if (((Jugador) p).getEquipo() != null) {
                if(((Jugador) p).getEquipo().liberarJugadorPorNombre((Jugador)p)){
                    JOptionPane.showMessageDialog(null,"Liberado y eliminado");
                }
                
                this.personas.remove(p);
            } else {
                this.personas.remove(p);
            }

        } else {
            this.personas.remove(p);
        }
        return result;

    }

    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<Persona> personas) {
        this.personas = personas;
    }

    public int cantidadDeJugadores() {
        int result = 0;

        for (Persona p : this.personas) {
            if (p instanceof Jugador) {
                result++;
            }
        }

        return result;
    }

    public int cantidadDeArbitros() {
        int result = 0;

        for (Persona p : this.personas) {
            if (p instanceof Arbitro) {
                result++;
            }

        }
        return result;
    }

    public int cantidadDeEntrenadores() {
        int result = 0;

        for (Persona p : this.personas) {
            if (p instanceof Entrenador) {
                result++;
            }

        }
        return result;
    }

    public String[][] getMatrizPersonas(int e) {
        String[][] retorno = null;
        if (e == 1) {

            String[][] result = new String[this.cantidadDeJugadores()][6];
            int i = 0;
            for (Persona p : this.personas) {
                if (p instanceof Jugador) {

                    result[i][0] = String.valueOf(Configuracion.personas.posicionDeJugador((Jugador) p) + 1);
                    result[i][1] = ((Jugador) p).getNombre();
                    result[i][2] = ((Jugador) p).getCondicion();
                    result[i][3] = ((Jugador) p).getPais();
                    if (((Jugador) p).getEquipo() != null) {
                        result[i][4] = ((Jugador) p).getEquipo().getNombre();
                    } else {
                        result[i][4] = "No asignado";
                    }

                    if (((Jugador) p).getUbigeo() != null) {
                        result[i][5]
                                = Configuracion.peru.getUbigeo(((Jugador) p).getUbigeo().getCodUbigueo());
                    } else {
                        result[i][5] = "No asignado";

                    }
                    i++;
                }

            }

            retorno = result;

        } else if (e == 2) {

            String[][] result = new String[this.cantidadDeArbitros()][6];
            int i = 0;
            for (Persona p : this.personas) {
                if (p instanceof Arbitro) {
                    result[i][0] = String.valueOf(Configuracion.personas.posicionDeArbitro((Arbitro) p) + 1);
                    result[i][1] = ((Arbitro) p).getNombre();
                    result[i][2] = String.valueOf(((Arbitro) p).getDni());
                    result[i][3] = String.valueOf(((Arbitro) p).getSueldo());
                    result[i][4] = ((Arbitro) p).getTipoArbitro().name();
                    result[i][5] = ((Arbitro) p).getPais();
                    i++;

                }

            }

            retorno = result;
        } else if (e == 3) {

            String[][] result = new String[this.cantidadDeEntrenadores()][6];
            int i = 0;
            for (Persona p : this.personas) {
                if (p instanceof Entrenador) {
                    result[i][0] = String.valueOf(Configuracion.personas.posicionDeEntrenador((Entrenador) p) + 1);
                    result[i][1] = ((Entrenador) p).getNombre();
                    result[i][2] = String.valueOf(((Entrenador) p).getDni());
                    result[i][3] = String.valueOf(((Entrenador) p).getSueldo());
                    if (((Entrenador) p).getEquipo() != null) {
                        result[i][4] = ((Entrenador) p).getEquipo().getNombre();
                    } else {
                        result[i][4] = "No asignado";
                    }

                    i++;

                }

            }

            retorno = result;
        }
        return retorno;
    }

    public String[] getTituloPersonas(int i) {
        String[] retorno = null;
        if (i == 1) {
            String[] result = new String[6];

            result[0] = "Pos:";
            result[1] = "Nombre";
            result[2] = "Condicion";
            result[3] = "Pais";
            result[4] = "Equipo";
            result[5] = "Ubigeo";

            retorno = result;

        } else if (i == 2) {

            String[] result = new String[6];

            result[0] = "Pos:";
            result[1] = "Nombre";
            result[2] = "DNI";
            result[3] = "Sueldo";
            result[4] = "Tipo";
            result[5] = "Pais";

            retorno = result;

        } else if (i == 3) {

            String[] result = new String[5];

            result[0] = "Pos:";
            result[1] = "Nombre";
            result[2] = "DNI";
            result[3] = "Sueldo";
            result[4] = "Equipo";

            retorno = result;

        }

        return retorno;
    }

    public String[][] getMatrizJugadoresDisponibles() {
        String[][] result = new String[this.cantidadDeJugadores()][6];
        int i = 0;

        for (Persona p : this.personas) {
            if (p instanceof Jugador && ((Jugador) p).getEquipo() == null) {

                result[i][0] = String.valueOf(Configuracion.personas.posicionDeJugador((Jugador) p) + 1);
                result[i][1] = ((Jugador) p).getNombre();
                result[i][2] = ((Jugador) p).getCondicion();
                result[i][3] = ((Jugador) p).getPais();
                if (((Jugador) p).getEquipo() != null) {
                    result[i][4] = ((Jugador) p).getEquipo().getNombre();
                } else {
                    result[i][4] = "No asignado";
                }

                if (((Jugador) p).getUbigeo() != null) {
                    result[i][5]
                            = Configuracion.peru.getUbigeo(((Jugador) p).getUbigeo().getCodUbigueo());
                } else {
                    result[i][5] = "No asignado";

                }
                i++;
            }

        }

        return result;

    }

    /* public String[] getTituloArbitros() {
        String[] result = new String[5];

        result[0] = "Pos:";
        result[1] = "Nombre";
        result[2] = "DNI";
        result[3] = "Sueldo";
        result[4] = "Tipo";
        

        return result;
    }*/

 /*  public String[][] getMatrizArbitros() {
        String[][] result = new String[this.cantidadDeArbitros()][4];
        int i = 0;
        for (Persona p : this.personas) {
            if (p instanceof Arbitro) {
                result[i][0] = ((Arbitro) p).getNombre();
                result[i][1] = String.valueOf(((Arbitro) p).getDni());
                result[i][2] = String.valueOf(((Arbitro) p).getSueldo());
                result[i][3] = ((Arbitro) p).getTipoArbitro().getTipo();
                i++;

            }

        }
        return result;
    }*/
    //metodos publicos
    // get y Set de ArrayList
    public ArrayList<Jugador> getListaJugador() {
        ArrayList<Jugador> result = new ArrayList<>();

        for (Persona p : this.personas) {
            if (p instanceof Jugador) {
                result.add((Jugador) p);
            }

        }
        return result;
    }

    public Jugador[] getJugadores() {
        Jugador j[] = new Jugador[this.personas.size()];
        int i = 0;
        for (Persona p : this.personas) {
            if (p instanceof Jugador) {
                j[i] = (Jugador) p;
                i++;
            }
        }
        return j;
    }

    public ArrayList<Arbitro> getListaArbitro() {
        ArrayList<Arbitro> result = new ArrayList<>();

        for (Persona p : this.personas) {
            if (p instanceof Arbitro) {
                result.add((Arbitro) p);
            }

        }
        return result;
    }

    public ArrayList<Entrenador> getListaEntrenador() {
        ArrayList<Entrenador> result = new ArrayList<>();

        for (Persona p : this.personas) {
            if (p instanceof Entrenador) {
                result.add((Entrenador) p);
            }

        }
        return result;
    }
    //Metodos de busqueda

    public Jugador buscarJugadorPorDni(int dni) {
        Jugador j = null;

        for (Persona p : this.personas) {
            if (p instanceof Jugador && p.getDni() == dni) {
                j = (Jugador) p;
            }
        }
        return j;
    }

    public Arbitro buscarArbitroPorDni(int dni) {

        Arbitro a = null;

        for (Persona p : this.personas) {

            if (p instanceof Arbitro && p.getDni() == dni) {
                a = (Arbitro) p;
            }

        }
        return a;
    }

    public Jugador buscarJugadorPorNombre(String nombre) {
        Jugador j = null;

        for (Persona p : this.personas) {
            if (p instanceof Jugador && p.getNombre().equalsIgnoreCase(nombre)) {
                j = (Jugador) p;
            }
        }
        return j;
    }

    public Arbitro buscarArbitroPorNombre(String nombre) {
        Arbitro a = null;
        int i = 0;
        for (Persona p : this.personas) {
            if (p instanceof Arbitro && p.getNombre().equalsIgnoreCase(nombre)) {
                a = (Arbitro) p;
            }
        }
        return a;
    }

    public Entrenador buscarEntrenadorPorNombre(String nombre) {
        Entrenador a = null;
        int i = 0;
        for (Persona p : this.personas) {
            if (p instanceof Entrenador && p.getNombre().equalsIgnoreCase(nombre)) {
                a = (Entrenador) p;
            }
        }
        return a;
    }

    // Metodos de posicion
    public int posicionDeJugador(Jugador j) {
        int result = 0;
        int i = 0;
        for (Persona p : this.personas) {
            if (p instanceof Jugador) {
                if (p.equals(j)) {
                    result = i;
                    break;
                }
            }
            i++;
        }
        return result;
    }

    public int posicionDeArbitro(Arbitro a) {
        int result = 0;
        int i = 0;
        for (Persona p : this.personas) {
            if (p instanceof Arbitro) {
                if (p.equals(a)) {
                    result = i;
                    break;
                }
            }
            i++;
        }
        return result;
    }

    public int posicionDeEntrenador(Entrenador a) {
        int result = 0;
        int i = 0;
        for (Persona p : this.personas) {
            if (p instanceof Entrenador) {
                if (p.equals(a)) {
                    result = i;
                    break;
                }
            }
            i++;
        }
        return result;
    }

    //METODO PARA ORDENAR POR GOLES A JUGADORES 
    public String[][] ordenarGoleadores() {
        String[][] result = new String[this.cantidadDeJugadores()][4];
        int i = 0;
        ArrayList<Jugador> jugadores = this.getListaJugador();
        Collections.sort(jugadores, Collections.reverseOrder());

        for (Jugador j : jugadores) {
            if(j.getEquipo() != null){
                
            result[i][0] = String.valueOf(i + 1);
            result[i][1] = j.getNombre();
            result[i][2] = j.getEquipo().getNombre();
            result[i][3] = String.valueOf(j.getGolesTotalesMarcados());
            i++;
                 
            }
            
        }
        return result;
    }

    public String[] cabeceraGoleadores() {
        String[] result = new String[4];
        result[0] = "POSICION";
        result[1] = "NOMBRE";
        result[2] = "EQUIPO";
        result[3] = "GOLES";

        return result;
    }

    public String[][] getMatrizTarjetasAmarillas() {

        String[][] result = new String[this.cantidadDeJugadores()][4];
        int i = 0;

        for (Persona p : this.personas) {
            if (p instanceof Jugador && ((Jugador) p).getEquipo() != null && ((Jugador) p).getTarjetasAmarillas() > 0) {

                result[i][0] = String.valueOf(Configuracion.personas.posicionDeJugador((Jugador) p) + 1);
                result[i][1] = ((Jugador) p).getNombre();
                result[i][2] = String.valueOf(((Jugador) p).getTarjetasAmarillas());

                if (((Jugador) p).getEquipo() != null) {
                    result[i][3] = ((Jugador) p).getEquipo().getNombre();
                } else {
                    result[i][3] = "No asignado";
                }

                i++;
            }

        }

        return result;
    }

    public String[][] getMatrizTarjetasRojas() {

        String[][] result = new String[this.cantidadDeJugadores()][4];
        int i = 0;

        for (Persona p : this.personas) {
            if (p instanceof Jugador && ((Jugador) p).getEquipo() != null && ((Jugador) p).getTarjetasRojas() > 0) {

                result[i][0] = String.valueOf(Configuracion.personas.posicionDeJugador((Jugador) p) + 1);
                result[i][1] = ((Jugador) p).getNombre();
                result[i][2] = String.valueOf(((Jugador) p).getTarjetasRojas());

                if (((Jugador) p).getEquipo() != null) {
                    result[i][3] = ((Jugador) p).getEquipo().getNombre();
                } else {
                    result[i][3] = "No asignado";
                }

                i++;
            }

        }

        return result;
    }

    public String[] cabeceraTarjetas() {
        String[] result = new String[4];
        result[0] = "POSICION";
        result[1] = "NOMBRE";
        result[2] = "TARJETAS";
        result[3] = "EQUIPO";

        return result;
    }

}
