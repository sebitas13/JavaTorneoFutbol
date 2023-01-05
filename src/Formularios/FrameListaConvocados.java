/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Entidades.Plantel;
import Sistema.Configuracion;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ACER
 */
public class FrameListaConvocados extends javax.swing.JFrame {

    /**
     * Creates new form FrameListaConvocados
     */
    public FrameListaConvocados() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaConvocados = new javax.swing.JTable();
        cbFechas = new javax.swing.JComboBox<>();
        cbEquipos = new javax.swing.JComboBox<>();
        bntRegresar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Jugadores Convocados");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaConvocados.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaConvocados);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, -1, -1));

        cbFechas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFechasActionPerformed(evt);
            }
        });
        getContentPane().add(cbFechas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 130, -1));

        cbEquipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEquiposActionPerformed(evt);
            }
        });
        getContentPane().add(cbEquipos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 130, -1));

        bntRegresar.setText("Regresar");
        bntRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(bntRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SELECCIONE FECHA");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 140, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("SELECCIONE EQUIPO");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 140, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/peruvian primera division.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        cargarCombo();
        cargarTablas(0, 0);

    }//GEN-LAST:event_formWindowOpened

    private void cbEquiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEquiposActionPerformed
        // TODO add your handling code here:
        cargarTablas(this.cbEquipos.getSelectedIndex(), cbFechas.getSelectedIndex());

        cbFechasActionPerformed(evt);
    }//GEN-LAST:event_cbEquiposActionPerformed

    private void cbFechasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFechasActionPerformed
        // TODO add your handling code here:
        cargarTablas(this.cbEquipos.getSelectedIndex(), cbFechas.getSelectedIndex());
    }//GEN-LAST:event_cbFechasActionPerformed

    private void bntRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntRegresarActionPerformed
        // TODO add your handling code here:

        this.dispose();

    }//GEN-LAST:event_bntRegresarActionPerformed

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
            java.util.logging.Logger.getLogger(FrameListaConvocados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameListaConvocados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameListaConvocados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameListaConvocados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameListaConvocados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntRegresar;
    private javax.swing.JComboBox<String> cbEquipos;
    private javax.swing.JComboBox<String> cbFechas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaConvocados;
    // End of variables declaration//GEN-END:variables

    private void cargarCombo() {

        DefaultComboBoxModel combo = new DefaultComboBoxModel();

        for (int i = 0; i < Configuracion.equipos.cantidadDeEquipos(); i++) {

            combo.addElement(Configuracion.equipos.getEquipos().get(i));

        }

        this.cbEquipos.setModel(combo);

        for (int i = 0; i < (Configuracion.equipos.cantidadDeEquipos() - 1) * 2; i++) {

            this.cbFechas.addItem("Fecha " + (1 + i));
        }

    }

    private void cargarTablas(int indexE, int indexJ) {

        try {

            if (Configuracion.equipos.getEquipos().get(indexE).obtenerPlantel(indexJ + 1) != null) {

                DefaultTableModel tabla2 = new DefaultTableModel(Configuracion.equipos.getEquipos().get(indexE).obtenerPlantel(indexJ + 1).getMatrizConvocados(),
                        Configuracion.equipos.getEquipos().get(indexE).obtenerPlantel(indexJ + 1).cabeceraConvocados());
                this.tablaConvocados.setModel(tabla2);
                this.tablaConvocados.setRowHeight(30);
                
            } else {
                JOptionPane.showMessageDialog(this, "Faltan Convocar");
                String[] cabeza = {"Equipo", "Nombre", "Posicion", "Dorsal"};
                DefaultTableModel tabla1 = new DefaultTableModel(null, cabeza);
                this.tablaConvocados.setModel(tabla1);
                this.tablaConvocados.setRowHeight(30);

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "ERROR CONVOCADOS: " + e);
        }

    }

}
