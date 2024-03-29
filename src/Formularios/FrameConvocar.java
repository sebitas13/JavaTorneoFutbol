/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Entidades.Convocado;
import Entidades.Equipo;
import Entidades.Jugador;
import Entidades.Persona;
import Entidades.Plantel;
import Enumerados.Demarcacion;
import Enumerados.TipoGoles;
import Sistema.Configuracion;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ACER
 */
public class FrameConvocar extends javax.swing.JFrame {

    /**
     * Creates new form FrameContratar
     */
    
   
    
    public FrameConvocar() {
        initComponents();
        this.cargarComboBox();
        this.cargarTablas(this.cmbEquipos.getSelectedIndex(),this.cboFechas.getSelectedIndex());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panNorte = new javax.swing.JPanel();
        a = new javax.swing.JScrollPane();
        tablaListaContratados = new javax.swing.JTable();
        panSur = new javax.swing.JPanel();
        b = new javax.swing.JScrollPane();
        tablaListaConvocados = new javax.swing.JTable();
        cboFechas = new javax.swing.JComboBox<>();
        btnConvocar = new javax.swing.JButton();
        cmbEquipos = new javax.swing.JComboBox<>();
        btnRegresar = new javax.swing.JButton();
        cboDemarcacion = new javax.swing.JComboBox<>();
        btnLiberar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnConvocar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CONVOCATORIA");

        tablaListaContratados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaListaContratados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaListaContratadosMouseClicked(evt);
            }
        });
        tablaListaContratados.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tablaListaContratadosKeyPressed(evt);
            }
        });
        a.setViewportView(tablaListaContratados);

        javax.swing.GroupLayout panNorteLayout = new javax.swing.GroupLayout(panNorte);
        panNorte.setLayout(panNorteLayout);
        panNorteLayout.setHorizontalGroup(
            panNorteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panNorteLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(a, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panNorteLayout.setVerticalGroup(
            panNorteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panNorteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(a, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                .addContainerGap())
        );

        tablaListaConvocados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaListaConvocados.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tablaListaConvocadosKeyPressed(evt);
            }
        });
        b.setViewportView(tablaListaConvocados);

        cboFechas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboFechasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panSurLayout = new javax.swing.GroupLayout(panSur);
        panSur.setLayout(panSurLayout);
        panSurLayout.setHorizontalGroup(
            panSurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panSurLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panSurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b, javax.swing.GroupLayout.PREFERRED_SIZE, 764, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboFechas, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panSurLayout.setVerticalGroup(
            panSurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panSurLayout.createSequentialGroup()
                .addComponent(cboFechas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(b, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btnConvocar.setText("convocar");
        btnConvocar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvocarActionPerformed(evt);
            }
        });
        btnConvocar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnConvocarKeyPressed(evt);
            }
        });

        cmbEquipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEquiposActionPerformed(evt);
            }
        });

        btnRegresar.setText("regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        cboDemarcacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboDemarcacionActionPerformed(evt);
            }
        });

        btnLiberar.setText("Liberar");
        btnLiberar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLiberarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Sugerencia: clickear las tablas para convocar/liberar");

        btnConvocar1.setText("convocar AOE");
        btnConvocar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvocar1ActionPerformed(evt);
            }
        });
        btnConvocar1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnConvocar1KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(panNorte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegresar)
                .addGap(50, 50, 50))
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panSur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(30, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmbEquipos, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80)
                                .addComponent(cboDemarcacion, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnConvocar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnConvocar1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)))
                        .addComponent(btnLiberar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(107, 107, 107))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(panNorte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnConvocar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLiberar))
                        .addComponent(cmbEquipos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cboDemarcacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(btnConvocar1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panSur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegresar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void cmbEquiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEquiposActionPerformed
        // TODO add your handling code here:
        this.cargarTablas(this.cmbEquipos.getSelectedIndex(),this.cboFechas.getSelectedIndex());
        
         cboFechasActionPerformed(evt);
        
    }//GEN-LAST:event_cmbEquiposActionPerformed

    private void tablaListaContratadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaListaContratadosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaListaContratadosMouseClicked

    private void cboFechasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboFechasActionPerformed
        // TODO add your handling code here:
        
     this.cargarTablas(this.cmbEquipos.getSelectedIndex(),this.cboFechas.getSelectedIndex());
     
     this.cambiarEstadoConvocado();
     
   
      this.cargarTablas(this.cmbEquipos.getSelectedIndex(), this.cboFechas.getSelectedIndex());
      
      
         
    }//GEN-LAST:event_cboFechasActionPerformed

    
     
    
    private void cboDemarcacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboDemarcacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboDemarcacionActionPerformed

    private void btnLiberarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLiberarActionPerformed
       int fila=0;
        int columna=1;
        String nombre="";
        Jugador jugador;
        Equipo equipo;
        try{

            fila=this.tablaListaConvocados.getSelectedRow();
            nombre= (String)this.tablaListaConvocados.getValueAt(fila,columna);

          
          
          equipo = Configuracion.equipos.getEquipos().get(this.cmbEquipos.getSelectedIndex());
          jugador = equipo.getJugador(nombre);
          
          equipo.liberarConvocatoria(jugador,this.cboFechas.getSelectedIndex()+1);
          
       this.cargarTablas(this.cmbEquipos.getSelectedIndex(),this.cboFechas.getSelectedIndex());
                 this.cambiarEstadoConvocado();
                 this.cambiarEstadoConvocado();
        }catch(IndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(this, "ELIGE ELEMENTO: "+nombre);
        } 
            
            
    }//GEN-LAST:event_btnLiberarActionPerformed

    private void btnConvocarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnConvocarKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnConvocarKeyPressed

    private void tablaListaContratadosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablaListaContratadosKeyPressed
        // TODO add your handling code here
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

          int fila=0;
        int columna=0;
        String nombre="";
        Jugador jugador;
        Equipo equipo;

        try{

            fila=this.tablaListaContratados.getSelectedRow();
            nombre= (String)this.tablaListaContratados.getValueAt(fila,columna);

          
          equipo = Configuracion.equipos.getEquipos().get(this.cmbEquipos.getSelectedIndex());
          jugador = equipo.getJugador(nombre);
            //jugador=Configuracion.personas.getListaJugador().get(0);
          if(!equipo.convocarJugador(jugador,((Demarcacion)this.cboDemarcacion.getSelectedItem()),this.cboFechas.getSelectedIndex()+1)){
              
              JOptionPane.showMessageDialog(this, "No disponible \n"
                      + "-Esta convocado");
                                            
          }  
          
           
          this.cargarTablas(this.cmbEquipos.getSelectedIndex(),this.cboFechas.getSelectedIndex());
           this.cambiarEstadoConvocado();
        }catch(IndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(this, "ELIGE ELEMENTO: "+nombre);
        }

        }
    }//GEN-LAST:event_tablaListaContratadosKeyPressed

    private void tablaListaConvocadosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablaListaConvocadosKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            
           int fila=0;
        int columna=1;
        String nombre="";
        Jugador jugador;
        Equipo equipo;
        try{

            fila=this.tablaListaConvocados.getSelectedRow();
            nombre= (String)this.tablaListaConvocados.getValueAt(fila,columna);

          
          
          equipo = Configuracion.equipos.getEquipos().get(this.cmbEquipos.getSelectedIndex());
          jugador = equipo.getJugador(nombre);
          
          equipo.liberarConvocatoria(jugador,this.cboFechas.getSelectedIndex()+1);
          
       this.cargarTablas(this.cmbEquipos.getSelectedIndex(),this.cboFechas.getSelectedIndex());
                 this.cambiarEstadoConvocado();
                 this.cambiarEstadoConvocado();
        }catch(IndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(this, "ELIGE ELEMENTO: "+nombre);
        } 
            
            
            
        }
        
    }//GEN-LAST:event_tablaListaConvocadosKeyPressed

    private void btnConvocarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvocarActionPerformed


              int fila=0;
        int columna=0;
        String nombre="";
        Jugador jugador;
        Equipo equipo;

        try{

            fila=this.tablaListaContratados.getSelectedRow();
            nombre= (String)this.tablaListaContratados.getValueAt(fila,columna);

          
          equipo = Configuracion.equipos.getEquipos().get(this.cmbEquipos.getSelectedIndex());
          jugador = equipo.getJugador(nombre);
            //jugador=Configuracion.personas.getListaJugador().get(0);
          if(!equipo.convocarJugador(jugador,((Demarcacion)this.cboDemarcacion.getSelectedItem()),this.cboFechas.getSelectedIndex()+1)){
              
              JOptionPane.showMessageDialog(this,jugador.getNombre()+ "No disponible \n"
                      + "-Esta convocado");
                                            
          }  
          
           
          this.cargarTablas(this.cmbEquipos.getSelectedIndex(),this.cboFechas.getSelectedIndex());
           this.cambiarEstadoConvocado();
           this.cambiarEstadoConvocado();
           
        }catch(IndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(this, "ELIGE ELEMENTO: "+nombre);
        }
                // TODO add your handling code here:
    }//GEN-LAST:event_btnConvocarActionPerformed

    private void btnConvocar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvocar1ActionPerformed
        // TODO add your handling code here:
        
         int fila=0;
        int columna=0;
        String nombre="";
        Jugador jugador;
        Equipo equipo;

        try{
            
            equipo = Configuracion.equipos.getEquipos().get(this.cmbEquipos.getSelectedIndex());

           // fila=this.tablaListaContratados.getSelectedRow();
            
            for(int i=0;i<this.tablaListaContratados.getRowCount();i++){
                
                 nombre= (String)this.tablaListaContratados.getValueAt(i,0);
                 
                 jugador = equipo.getJugador(nombre);
            //jugador=Configuracion.personas.getListaJugador().get(0);
          if(!equipo.convocarJugador(jugador,Demarcacion.valueOf(jugador.getPosicionJ()),this.cboFechas.getSelectedIndex()+1)){
              
              JOptionPane.showMessageDialog(this,jugador.getNombre()+ "No disponible \n"
                      + "-Esta convocado");
                                            
          }  
  
      }
            
          
          
           
          this.cargarTablas(this.cmbEquipos.getSelectedIndex(),this.cboFechas.getSelectedIndex());
           this.cambiarEstadoConvocado();
           this.cambiarEstadoConvocado();
           
        }catch(IndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(this, "ELIGE ELEMENTO: "+nombre);
        }
    }//GEN-LAST:event_btnConvocar1ActionPerformed

    private void btnConvocar1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnConvocar1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConvocar1KeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrameConvocar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameConvocar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameConvocar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameConvocar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameConvocar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane a;
    private javax.swing.JScrollPane b;
    private javax.swing.JButton btnConvocar;
    private javax.swing.JButton btnConvocar1;
    private javax.swing.JButton btnLiberar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> cboDemarcacion;
    private javax.swing.JComboBox<String> cboFechas;
    private javax.swing.JComboBox<String> cmbEquipos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel panNorte;
    private javax.swing.JPanel panSur;
    private javax.swing.JTable tablaListaContratados;
    private javax.swing.JTable tablaListaConvocados;
    // End of variables declaration//GEN-END:variables

    
   private void cargarTablas(int indexE, int indexJ){
        
       try {
           
            DefaultTableModel tabla = new DefaultTableModel(Configuracion.equipos.getEquipos().get(indexE).getMatrizJugadores(),
               Configuracion.equipos.getEquipos().get(indexE).getTitulosJugadores());
               this.tablaListaContratados.setModel(tabla);
            
               
               
      
    if(Configuracion.equipos.getEquipos().get(indexE).obtenerPlantel(indexJ+1)!=null){
  //  JOptionPane.showMessageDialog(this,Configuracion.equipos.getEquipos().get(indexE).obtenerPlantel(indexJ+1).getJornada());

       DefaultTableModel tabla2 = new DefaultTableModel(Configuracion.equipos.getEquipos().get(indexE).obtenerPlantel(indexJ+1).getMatrizConvocados(),
                Configuracion.equipos.getEquipos().get(indexE).obtenerPlantel(indexJ+1).cabeceraConvocados());
        this.tablaListaConvocados.setModel(tabla2); 
    }else{
        Configuracion.equipos.getEquipos().get(indexE).crearPlantel(new Plantel(Configuracion.equipos.getEquipos().get(indexE), indexJ+1));
        
       DefaultTableModel tabla3 = new DefaultTableModel(Configuracion.equipos.getEquipos().get(indexE).obtenerPlantel(indexJ+1).getMatrizConvocados(),
                Configuracion.equipos.getEquipos().get(indexE).obtenerPlantel(indexJ+1).cabeceraConvocados());
        this.tablaListaConvocados.setModel(tabla3);
    }
           
       } catch (Exception e) {
           JOptionPane.showMessageDialog(this, "ERROR: "+e);
       }
       
       
      
       
  } 
    
    
     private void cargarComboBox(){
         
        DefaultComboBoxModel combo = new DefaultComboBoxModel();
        
        for(int i=0;i<Configuracion.equipos.cantidadDeEquipos();i++){
            
           // this.cbEquipos.addItem(Configuracion.equipos.getEquipos().get(i).getNombre());
           
            
            combo.addElement(Configuracion.equipos.getEquipos().get(i));
            
        }
        
        this.cmbEquipos.setModel(combo);
        
        
        for(int i=0;i<(Configuracion.equipos.cantidadDeEquipos()-1)*2;i++){
            
            this.cboFechas.addItem("Fecha "+(1+i));
        }
        
        
          
       /*   for(int i=0;i<Demarcacion.values().length;i++){
             
             this.cboDemarcacion.addItem(Demarcacion.values()[i].name());
         }*/
          //LLENADO DE COMBOBOX 
       
         DefaultComboBoxModel comboD = new DefaultComboBoxModel(Demarcacion.values()); 
         this.cboDemarcacion.setModel(comboD); 
        
    }
    
     private void cambiarEstadoConvocado(){
         
         
         for(Jugador j : Configuracion.equipos.getEquipos().get(this.cmbEquipos.getSelectedIndex()).getJugadores()){
//         JOptionPane.showMessageDialog(null, Configuracion.equipos.getEquipos().get(this.cmbEquipos.getSelectedIndex()).obtenerPlantel(this.cboFechas.getSelectedIndex()+1).getJornada());
       this.cargarTablas(this.cmbEquipos.getSelectedIndex(), this.cboFechas.getSelectedIndex());  
         
        if(Configuracion.equipos.getEquipos().get(this.cmbEquipos.getSelectedIndex()).
                obtenerPlantel(this.cboFechas.getSelectedIndex()+1)!=null){
            
            if(Configuracion.equipos.getEquipos().get(this.cmbEquipos.getSelectedIndex()).obtenerPlantel(this.cboFechas.getSelectedIndex()+1).findConvocado(j.getNombre())){
             j.setbConvocado(true);
             }else{
             j.setbConvocado(false);
         }
            
        } 
         
         
     }
         
         
     }
     
}

