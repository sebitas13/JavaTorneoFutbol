/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calendario;

import Sistema.Configuracion;
import javax.swing.JOptionPane;


/**
 *
 * @author ACER
 */

public class Calendario {

	
	
	//private int[] equipos;
	//private String[][] matriz1,matriz2,jornadas,jornadas2;
    
  //   ArregloEquipos e; 
     ArregloEquipos matriz1; 
     ArregloEquipos matriz2; 
     ArregloEncuentro encuentro1; 
     ArregloEncuentro encuentro2; 
     int N;
	
	//Num de jornadas = (N-1)*2, con N = num equipos. (N-1) es una vuelta.
	
	/**
	 * @param N -> numero de equipos
	 */
	public Calendario(int N){
            
           this.N=N;
           
		//equipos = new int[N];
		//Asigno posiciones del array a los equipos
            //    e = new ArregloEquipos(N,1);
                
		/*for (int i=0;i<N;i++){
                    
                    e.getEquipo()[i][0] = new Equipo(i+1);
                   
			
		}*/
		
                   /* e.getEquipo()[0][0] = new Equipo("Universitario");
                    e.getEquipo()[1][0] = new Equipo("Alianza");
                    e.getEquipo()[2][0] = new Equipo("Cristal");
                    e.getEquipo()[3][0] = new Equipo("Melgar");*/
                
		/*matriz1 = new String[N-1][N/2];
		matriz2 = new String[N-1][N/2];
		jornadas = new String[N-1][N/2]; //primera vuelta
		jornadas2 = new String[N-1][N/2]; //segunda vuelta
		*/
               
                matriz1 = new ArregloEquipos(N-1, N/2);
                matriz2 = new ArregloEquipos(N-1, N/2);
                encuentro1 = new ArregloEncuentro(N-1, N/2);
                encuentro2 = new ArregloEncuentro(N-1, N/2);
                
		//Relleno las matrices
		/*   Matriz 1    	 Matriz 2			 
			1   2   3		6   5   4
			4   5   1		6   3   2
			2   3   4		6   1   5
			5   1   2		6   4   3
			3   4   5		6   2   1
			
			Resultado:
			
			J1	6vs1	2vs5	3vs4
			J2	4vs6	5vs3	1vs2
			J3	6vs2	3vs1	4vs5
			J4	5vs6	1vs4	2vs3
			J5	6vs3	4vs2	5vs1
		 */
		

		
		//Solo para mostrarlo por consola

		
		
	}
        
      /*  public Calendario(){
            JOptionPane.showMessageDialog(null,Configuracion.equipos.cantidadDeEquipos() );
            N=Configuracion.equipos.cantidadDeEquipos();
            
                matriz1 = new ArregloEquipos(N-1, N/2);
                matriz2 = new ArregloEquipos(N-1, N/2);
                encuentro1 = new ArregloEncuentro(N-1, N/2);
                encuentro2 = new ArregloEncuentro(N-1, N/2);
            
        }*/

    public void setN(int N) {
        this.N = N;
    }
        
        
	
	/**
	 * @param args
	 */
        
        //metodos aca
        
        public void generarEncuentros(){
            
                int cont = 0;
		int cont2 = N-2;
                
             
		
		for(int i=0;i<N-1;i++){
			for(int j=0;j<N/2;j++){
				//matriz1
				matriz1.getEquipo()[i][j] = Configuracion.equipos.getEquipos().get(cont);
				cont++;
				if(cont==(N-1)) cont=0;
				
				//matriz2
				if(j==0) matriz2.getEquipo()[i][j] = Configuracion.equipos.getEquipos().get(N-1); //ojo 
				else {
					matriz2.getEquipo()[i][j] = Configuracion.equipos.getEquipos().get(cont2);
					cont2--;
					if(cont2==-1) cont2 = N-2;
				}
				
				//Elaboro la matriz final de enfrentamientos por jornada (primera vuelta)
				if(j==0){
					if(i%2==0){
                                            
                                           //encuentro1.getEncuentros()[i][j].equipo1 = matriz2.getEquipo()[i][j];
                                           encuentro1.getEncuentros()[i][j].equipo1 = matriz2.getEquipo()[i][j];
                                            
                                                    
                                            
                                            encuentro1.getEncuentros()[i][j].equipo2=matriz1.getEquipo()[i][j];
                                        } 
                                       
                                        else{
                                            encuentro1.getEncuentros()[i][j].equipo1 = matriz1.getEquipo()[i][j];
                                            encuentro1.getEncuentros()[i][j].equipo2 = matriz2.getEquipo()[i][j];
                                               
                                        
                                        }
                                        
				}
                                else{
                                    encuentro1.getEncuentros()[i][j].equipo1 = matriz1.getEquipo()[i][j] ;
                                    encuentro1.getEncuentros()[i][j].equipo2 = matriz2.getEquipo()[i][j] ;
                                            
                                }
				
				
				//segunda vuelta - al reves que la primera
                                
				if(j==0){
					if(i%2==0){
                                          encuentro2.getEncuentros()[i][j].equipo1 = matriz1.getEquipo()[i][j] ;
                                          encuentro2.getEncuentros()[i][j].equipo2 = matriz2.getEquipo()[i][j] ;
                                            
                                           
                                        }
                                        else{
                                            encuentro2.getEncuentros()[i][j].equipo1 = matriz2.getEquipo()[i][j];
                                            encuentro2.getEncuentros()[i][j].equipo2 = matriz1.getEquipo()[i][j];
                                            
                                        }
				}
                                else{
                                    encuentro2.getEncuentros()[i][j].equipo1 = matriz2.getEquipo()[i][j] ;
                                    encuentro2.getEncuentros()[i][j].equipo2 = matriz1.getEquipo()[i][j] ;
                                    
                                }
				
			}
		}
            
        }
        
        public void getMatrizEncuentros(){
            
            this.generarEncuentros();
            int jorn = 1;
		for(int i=0;i<N-1;i++){
			for(int j=0;j<N/2;j++){
				System.out.print("J"+jorn+" "+encuentro1.getEncuentros()[i][j].equipo1.getNombre()+" vs "+encuentro1.getEncuentros()[i][j].equipo2.getNombre()+" "); 
				if(j==(N/2)-1) System.out.println();
			}
			jorn++;
		}
		
		System.out.println();
		jorn = N;
		for(int i=0;i<N-1;i++){
			for(int j=0;j<N/2;j++){
				System.out.print("J"+jorn+" "+encuentro2.getEncuentros()[i][j].equipo1.getNombre()+" vs "+encuentro2.getEncuentros()[i][j].equipo2.getNombre()+" ");
				if(j==(N/2)-1) System.out.println();
			}
			jorn++;
		}     
        }
        
        public String[][] getMatrizEncuentrosIda(int jornada){
            
            String[][] result=new String[N/2][4];  //String[2][4]
            this.generarEncuentros();    
             int i=0;   
                    
                    for(int j=0;j<N/2;j++){
                    
                        result[i][0] = encuentro1.getEncuentros()[jornada-1][j].equipo1.getNombre();
                        result[i][1] = " ";
                        result[i][2] = " ";
                        result[i][3] = encuentro1.getEncuentros()[jornada-1][j].equipo2.getNombre();
                      i++;  
                    }   
                
            return result;
            
        }
        
        public String[] cabeceraEncuentrosIda(){
            
            String[] result = new String[4];
            
            result[0] = "LOCAL";
            result[1] = "g";
            result[2] = "g";
            result[3] = "VISITANTE";
            
            return result;
        }
        
        public String[][] getMatrizEncuentrosVuelta(int jornada){
            
            String[][] result=new String[N/2][4];
            this.generarEncuentros(); 
            int i=0;
               
                    
                    for(int j=0;j<N/2;j++){
                    
                        result[i][0] = encuentro2.getEncuentros()[jornada-1][j].equipo1.getNombre();
                        result[i][1] = " ";
                        result[i][2] = " ";
                        result[i][3] = encuentro2.getEncuentros()[jornada-1][j].equipo2.getNombre();
                        i++;
                    }   
                
            return result;
            
        }
        
        public String[] cabeceraEncuentrosVuelta(){
            
            String[] result = new String[4];
            
            result[0] = "LOCAL";
            result[1] = "g";
            result[2] = "g";
            result[3] = "VISITANTE";
            
            return result;
        }
        
	
}
   
