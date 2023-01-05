package Entidades;

import Formularios.FrameLogin;

import Sistema.Configuracion;

import Formularios.FramePrincipal;

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
public class app {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
   
       
   
  /*
      Configuracion.usuarios.add(new Usuario("administrador", "admin", "123"));
        Configuracion.usuarios.add(new Usuario("jesus Sebastian", "sebas", "123"));
        Configuracion.usuarios.add(new Usuario("Jesus Sebastian", "jesus.huamanculi1", "47701709"));
      
      
        
   */
      
      

   Configuracion.personas.setPersonas(SerializadoraGen.deserializar("personas"));
    Configuracion.estadios.setEstadios(SerializadoraGen.deserializar("estadios"));
     Configuracion.equipos.setEquipos(SerializadoraGen.deserializar("equipos"));
    
    Configuracion.fechas.setFechas( SerializadoraGen.deserializar("fechas"));
    Configuracion.usuarios.setUsuarios(SerializadoraGen.deserializar("usuarios"));
       
    
    
    
        FrameLogin frmL = new FrameLogin("","");
        frmL.setVisible(true);
        frmL.setLocationRelativeTo(null);
              
      
     
      
        
       
   } 
}
