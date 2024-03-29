package Formularios;

import Sistema.Configuracion;
import java.awt.event.KeyEvent;
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
public class FrameLogin extends javax.swing.JFrame {

    /**
     * Creates new form frmLogin
     */
    public FrameLogin(String usuario, String clave) {
        initComponents();

        if (usuario.length() > 0
                && clave.length() > 0) {
            this.txtNombre.setText(usuario);
            this.txtContraseña.setText(clave);
        } else {
            this.txtNombre.setText("");
            this.txtContraseña.setText("");
        }

        this.inicializar();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNombre = new javax.swing.JLabel();
        lblNombre1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JPasswordField();
        btnIngresar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        check = new java.awt.Checkbox();
        btnRegistrarse = new javax.swing.JButton();
        escritorioLogin = new javax.swing.JDesktopPane();
        lblFondo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SISTEMA TORNEO LIGA 1");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblNombre.setText("Usuario:");
        getContentPane().add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, 79, -1));

        lblNombre1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblNombre1.setText("Contraseña");
        getContentPane().add(lblNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, 79, -1));

        txtNombre.setBackground(new java.awt.Color(255, 0, 0));
        txtNombre.setForeground(new java.awt.Color(255, 255, 255));
        txtNombre.setText("ADMIN");
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 100, 127, 29));

        txtContraseña.setForeground(new java.awt.Color(255, 0, 0));
        txtContraseña.setText("1234");
        txtContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraseñaActionPerformed(evt);
            }
        });
        txtContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtContraseñaKeyPressed(evt);
            }
        });
        getContentPane().add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 140, 130, 28));

        btnIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnLogin.jpg"))); // NOI18N
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 100, 100, 30));

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botones/logout.png"))); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 0, 60, 50));

        check.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        check.setLabel("remember me\n");
        getContentPane().add(check, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 180, -1, -1));

        btnRegistrarse.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnRegistrarse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnRegistrar.jpg"))); // NOI18N
        btnRegistrarse.setToolTipText("");
        btnRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarseActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 10, 110, 30));

        escritorioLogin.setPreferredSize(new java.awt.Dimension(441, 297));
        escritorioLogin.setRequestFocusEnabled(false);

        lblFondo.setBackground(new java.awt.Color(255, 153, 0));
        lblFondo.setForeground(new java.awt.Color(255, 255, 255));
        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cuenta.jpg"))); // NOI18N
        lblFondo.setText("jLabel1");
        escritorioLogin.add(lblFondo);
        lblFondo.setBounds(-590, 0, 980, 543);

        getContentPane().add(escritorioLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 210, 390, 330));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("¿Aun no eres hincha de la LIGA1 Movistar?");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 50, 240, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
      SerializadoraGen.serializar("personas",Configuracion.personas.getPersonas());
      SerializadoraGen.serializar("equipos",Configuracion.equipos.getEquipos());
      SerializadoraGen.serializar("estadios",Configuracion.estadios.getEstadios());
      SerializadoraGen.serializar("fechas",Configuracion.fechas.getFechas());
      SerializadoraGen.serializar("usuarios",Configuracion.usuarios.getUsuarios());

        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed

        if (this.txtNombre.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Ingrese el usuario");
        } else if (this.txtContraseña.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Ingrese la contraseña");
        } else {

            Configuracion.usuario = Configuracion.usuarios.validar(this.txtNombre.getText(), this.txtContraseña.getText());
            if(this.check.getState()){
                
                Configuracion.usuario.setRemember(true);
            }
            if (Configuracion.usuario != null) {

                FramePrincipal frm = new FramePrincipal();
                frm.setLocationRelativeTo(null);
                frm.setVisible(true);
                this.dispose();
                
            } else {
                JOptionPane.showMessageDialog(this, "Error");
            }

        }

    }//GEN-LAST:event_btnIngresarActionPerformed

    private void txtContraseñaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContraseñaKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            if (this.txtNombre.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Ingrese el usuario");
            } else if (this.txtContraseña.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Ingrese la contraseña");
            } else {

                Configuracion.usuario = Configuracion.usuarios.validar(this.txtNombre.getText(), this.txtContraseña.getText());
                if(this.check.getState()){
                
                Configuracion.usuario.setRemember(true);
            }
                if (Configuracion.usuario != null) {

                    FramePrincipal frm = new FramePrincipal();
                    frm.setLocationRelativeTo(null);
                    frm.setVisible(true);
                    this.dispose();
                    ;
                } else {
                    JOptionPane.showMessageDialog(this, "Error");
                }

            }

        }
    }//GEN-LAST:event_txtContraseñaKeyPressed

    private void txtContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContraseñaActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarseActionPerformed
        // TODO add your handling code here:
        
        FrmIntRegistro frm = new FrmIntRegistro();
        this.escritorioLogin.add(frm);
        frm.show();
        
        
    }//GEN-LAST:event_btnRegistrarseActionPerformed

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
            java.util.logging.Logger.getLogger(FrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new FrameLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnRegistrarse;
    private javax.swing.JButton btnSalir;
    private java.awt.Checkbox check;
    private javax.swing.JDesktopPane escritorioLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombre1;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

    private void inicializar(){
        if( Configuracion.usuario!=null){
            if(Configuracion.usuario.isRemember()){
            this.txtNombre.setText(Configuracion.usuario.getUsuario());
            this.txtContraseña.setText(Configuracion.usuario.getContraseña()); 
            Configuracion.usuario.setRemember(false);
            }
           
        }
        
    }
    
    
    
    
}
