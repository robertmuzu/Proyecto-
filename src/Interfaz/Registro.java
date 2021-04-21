/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.awt.Graphics;
import java.awt.Image;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import paquete.Persona;
import java.util.TreeSet;
import paquete.Pelicula;
import paquete.Usuario;

/**
 *
 * @author Roberto
 */
public class Registro extends javax.swing.JFrame {

    public Registro() {
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

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        LblRegistro = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        LblCorreo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        TxtNombre = new javax.swing.JTextField();
        TxtApellidos = new javax.swing.JTextField();
        TxtCorreo = new javax.swing.JTextField();
        TxtTelfono = new javax.swing.JTextField();
        TxtSexo = new javax.swing.JTextField();
        TxtEdad = new javax.swing.JTextField();
        BtnAvanzar = new javax.swing.JButton();
        LblNombre = new javax.swing.JLabel();
        LblApellido = new javax.swing.JLabel();
        LbCorreo = new javax.swing.JLabel();
        TxtNombreUsuario = new javax.swing.JTextField();
        LblNombreUsuario = new javax.swing.JLabel();
        LblContraseña = new javax.swing.JLabel();
        TxtContraseña = new javax.swing.JPasswordField();
        TxtContraseña2 = new javax.swing.JPasswordField();
        LblContraseña2 = new javax.swing.JLabel();
        jCheckBoxAdmin = new javax.swing.JCheckBox();
        LblAdmin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(57, 62, 70));

        jPanel1.setBackground(java.awt.Color.darkGray);

        LblRegistro.setBackground(java.awt.Color.darkGray);
        LblRegistro.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        LblRegistro.setForeground(new java.awt.Color(255, 255, 255));
        LblRegistro.setText("REGISTRO");

        jLabel1.setBackground(java.awt.Color.darkGray);
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre:");

        LblCorreo.setBackground(java.awt.Color.darkGray);
        LblCorreo.setForeground(new java.awt.Color(255, 255, 255));
        LblCorreo.setText("Correo electrónico:");

        jLabel4.setBackground(java.awt.Color.darkGray);
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Teléfono:");

        jLabel5.setBackground(java.awt.Color.darkGray);
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Apellidos:");

        jLabel6.setBackground(java.awt.Color.darkGray);
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Sexo:");

        jLabel7.setBackground(java.awt.Color.darkGray);
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Edad:");

        TxtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNombreActionPerformed(evt);
            }
        });

        TxtApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtApellidosActionPerformed(evt);
            }
        });

        TxtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCorreoActionPerformed(evt);
            }
        });

        TxtTelfono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtTelfonoActionPerformed(evt);
            }
        });

        TxtSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtSexoActionPerformed(evt);
            }
        });

        TxtEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtEdadActionPerformed(evt);
            }
        });

        BtnAvanzar.setBackground(new java.awt.Color(144, 55, 73));
        BtnAvanzar.setForeground(new java.awt.Color(255, 255, 255));
        BtnAvanzar.setText("Guardar");
        BtnAvanzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAvanzarActionPerformed(evt);
            }
        });

        LblNombre.setForeground(new java.awt.Color(255, 0, 0));

        LblApellido.setForeground(new java.awt.Color(255, 0, 0));

        LbCorreo.setForeground(new java.awt.Color(255, 0, 0));

        TxtNombreUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNombreUsuarioActionPerformed(evt);
            }
        });

        LblNombreUsuario.setBackground(java.awt.Color.darkGray);
        LblNombreUsuario.setForeground(new java.awt.Color(255, 255, 255));
        LblNombreUsuario.setText("Nombre de Usuario:");

        LblContraseña.setBackground(java.awt.Color.darkGray);
        LblContraseña.setForeground(new java.awt.Color(255, 255, 255));
        LblContraseña.setText("Contraseña:");

        LblContraseña2.setBackground(java.awt.Color.darkGray);
        LblContraseña2.setForeground(new java.awt.Color(255, 255, 255));
        LblContraseña2.setText("Repetir Contraseña:");

        jCheckBoxAdmin.setBackground(java.awt.Color.darkGray);

        LblAdmin.setBackground(java.awt.Color.darkGray);
        LblAdmin.setForeground(new java.awt.Color(255, 255, 255));
        LblAdmin.setText("Admin");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(LblRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7)
                                .addComponent(jLabel4)
                                .addComponent(LblCorreo)
                                .addComponent(jLabel5)
                                .addComponent(jLabel1)
                                .addComponent(LblNombreUsuario, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(LblContraseña)
                            .addComponent(LblContraseña2)
                            .addComponent(LblAdmin))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBoxAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(TxtSexo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                                .addComponent(TxtEdad))
                            .addComponent(LblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(TxtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LblApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(TxtTelfono, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LbCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(TxtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(BtnAvanzar)
                                .addComponent(TxtContraseña2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 69, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LblRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(TxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LblNombre)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(10, 10, 10)
                        .addComponent(LblApellido))
                    .addComponent(TxtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblCorreo))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LbCorreo)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TxtTelfono, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(TxtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LblNombreUsuario))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LblContraseña))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtContraseña2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LblContraseña2)))
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblAdmin)
                    .addComponent(jCheckBoxAdmin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(BtnAvanzar)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtNombreUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNombreUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNombreUsuarioActionPerformed

    private void BtnAvanzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAvanzarActionPerformed

        if (!TxtNombre.getText().isEmpty()) {
            if (!TxtApellidos.getText().isEmpty()) {
                if (!TxtCorreo.getText().isEmpty()) {
                    Usuario user = new Usuario(
                            TxtNombre.getText(),
                            TxtApellidos.getText(),
                            TxtCorreo.getText(),
                            TxtSexo.getText(),
                            TxtEdad.getText(),
                            TxtTelfono.getText(),
                            TxtNombreUsuario.getText(),
                            TxtContraseña.getText(),
                            jCheckBoxAdmin.isSelected()
                    );

                    insertUser(user);
                    this.dispose();
                } else {
                    LbCorreo.setText("* Campo Requerido");
                }
            } else {
                LblApellido.setText("* Campo Requerido");
            }
        } else {
            LblNombre.setText("* Campo Requerido");
        }
    }//GEN-LAST:event_BtnAvanzarActionPerformed

    private void insertUser(Usuario user) {
        ArrayList<Usuario> usuarios = null;

        try {
            try (FileInputStream archivoPeliculaInput = new FileInputStream("Usuarios.proyecto")) {
                ObjectInputStream input = new ObjectInputStream(archivoPeliculaInput);

                usuarios = (ArrayList<Usuario>) input.readObject();

                input.close();
            }
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }

        if (usuarios == null) {
            usuarios = new ArrayList<>();
        }
        usuarios.add(user);

        try {
            try (FileOutputStream archivoPelicula = new FileOutputStream("Usuarios.proyecto")) {
                ObjectOutputStream output = new ObjectOutputStream(archivoPelicula);

                output.writeObject(usuarios);

                output.close();
            }
            JOptionPane.showMessageDialog(null, "El usuario ha sido insertado satisfactoriamente.");
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
    }

    private void TxtEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtEdadActionPerformed

    private void TxtSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtSexoActionPerformed

    private void TxtTelfonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtTelfonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtTelfonoActionPerformed

    private void TxtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCorreoActionPerformed

    private void TxtApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtApellidosActionPerformed

    private void TxtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNombreActionPerformed

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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAvanzar;
    private javax.swing.JLabel LbCorreo;
    private javax.swing.JLabel LblAdmin;
    private javax.swing.JLabel LblApellido;
    private javax.swing.JLabel LblContraseña;
    private javax.swing.JLabel LblContraseña2;
    private javax.swing.JLabel LblCorreo;
    private javax.swing.JLabel LblNombre;
    private javax.swing.JLabel LblNombreUsuario;
    private javax.swing.JLabel LblRegistro;
    private javax.swing.JTextField TxtApellidos;
    private javax.swing.JPasswordField TxtContraseña;
    private javax.swing.JPasswordField TxtContraseña2;
    private javax.swing.JTextField TxtCorreo;
    private javax.swing.JTextField TxtEdad;
    private javax.swing.JTextField TxtNombre;
    private javax.swing.JTextField TxtNombreUsuario;
    private javax.swing.JTextField TxtSexo;
    private javax.swing.JTextField TxtTelfono;
    private javax.swing.JCheckBox jCheckBoxAdmin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
