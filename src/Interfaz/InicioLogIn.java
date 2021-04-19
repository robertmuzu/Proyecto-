package Interfaz;

import java.awt.Graphics;
import java.awt.Image;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import paquete.Admin;
import paquete.Persona;
import paquete.Usuario;

/**
 *
 * @author Roberto
 */
public class InicioLogIn extends javax.swing.JFrame {

    /**
     * Creates new form InicioLogIn
     */
    public InicioLogIn() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jPanel2 = new javax.swing.JPanel();
        LblLog = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        LblUsuario = new javax.swing.JLabel();
        TxtUsuario = new javax.swing.JTextField();
        LblUsuario1 = new javax.swing.JLabel();
        TxtContraseña = new javax.swing.JPasswordField();
        LblRegistro = new javax.swing.JLabel();
        BtnRegistro = new javax.swing.JButton();
        BtnSiguiente = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        LblOlvidoContrasena = new javax.swing.JLabel();
        LblTitulo = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(34, 40, 49));

        LblLog.setBackground(new java.awt.Color(255, 255, 255));
        LblLog.setFont(new java.awt.Font("Colonna MT", 2, 36)); // NOI18N
        LblLog.setForeground(new java.awt.Color(255, 255, 255));
        LblLog.setText("FiDEFeX");

        jPanel1.setBackground(new java.awt.Color(57, 62, 70));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        LblUsuario.setBackground(new java.awt.Color(255, 255, 255));
        LblUsuario.setForeground(new java.awt.Color(255, 255, 255));
        LblUsuario.setText("Usuario: ");

        TxtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtUsuarioActionPerformed(evt);
            }
        });

        LblUsuario1.setBackground(new java.awt.Color(255, 255, 255));
        LblUsuario1.setForeground(new java.awt.Color(255, 255, 255));
        LblUsuario1.setText("Contraseña:");

        TxtContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtContraseñaActionPerformed(evt);
            }
        });

        LblRegistro.setForeground(new java.awt.Color(255, 255, 255));
        LblRegistro.setText("¿No estás registrado aún?");

        BtnRegistro.setBackground(new java.awt.Color(144, 55, 73));
        BtnRegistro.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        BtnRegistro.setForeground(new java.awt.Color(255, 255, 255));
        BtnRegistro.setText("Registrarse");
        BtnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegistroActionPerformed(evt);
            }
        });

        BtnSiguiente.setBackground(new java.awt.Color(144, 55, 73));
        BtnSiguiente.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        BtnSiguiente.setForeground(new java.awt.Color(255, 255, 255));
        BtnSiguiente.setText("Ingresar");
        BtnSiguiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnSiguienteMouseClicked(evt);
            }
        });
        BtnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSiguienteActionPerformed(evt);
            }
        });

        jButton1.setText("Testing");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTesting(evt);
            }
        });

        LblOlvidoContrasena.setBackground(new java.awt.Color(51, 51, 51));
        LblOlvidoContrasena.setForeground(new java.awt.Color(255, 255, 255));
        LblOlvidoContrasena.setText("¿Olvidó su contraseña?");
        LblOlvidoContrasena.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LblOlvidoContrasenaMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LblUsuario)
                            .addComponent(LblUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TxtUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                            .addComponent(TxtContraseña)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(LblOlvidoContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BtnRegistro)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(74, 74, 74))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LblRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addComponent(BtnSiguiente)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(LblRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LblUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TxtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(BtnSiguiente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LblOlvidoContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jButton1)))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        LblTitulo.setBackground(new java.awt.Color(51, 51, 51));
        LblTitulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        LblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        LblTitulo.setText("¡¡Disfrute de nuestra gran variedad de peliculas!!");

        jPanel3.setBackground(new java.awt.Color(144, 53, 71));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(LblLog, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(52, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblLog, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtUsuarioActionPerformed

    private void TxtContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtContraseñaActionPerformed

    private void BtnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegistroActionPerformed

        this.setVisible(false);
        Registro res = new Registro();
        res.setVisible(true);
    }//GEN-LAST:event_BtnRegistroActionPerformed

    private void BtnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSiguienteActionPerformed
        Boolean mien = new Boolean(true);

        Admin adIngreso = new Admin(TxtUsuario.getText(), TxtContraseña.getText(), null);

        if (!TxtUsuario.getText().isEmpty()) {
            if (!TxtContraseña.getText().isEmpty()) {
                while (mien == true) {
                    if (adIngreso.getNombreUsuario().equals("Roberto") && adIngreso.getContrasena().equals("1234")) {
                        JOptionPane.showMessageDialog(null, "Bienvenido " + adIngreso.getNombreUsuario());
                        this.setVisible(false);
                        Administrador ad = new Administrador();
                        ad.setVisible(true);
                    }else if (adIngreso.getNombreUsuario().equals("Alee") && adIngreso.getContrasena().equals("1234")) {
                        JOptionPane.showMessageDialog(null, "Bienvenido " + adIngreso.getNombreUsuario());
                        this.setVisible(false);
                        Administrador ad = new Administrador();
                        ad.setVisible(true);
                    }else if (adIngreso.getNombreUsuario().equals("Gabriel") && adIngreso.getContrasena().equals("1234")) {
                        JOptionPane.showMessageDialog(null, "Bienvenido " + adIngreso.getNombreUsuario());
                        this.setVisible(false);
                        Administrador ad = new Administrador();
                        ad.setVisible(true);
                    }else if (adIngreso.getNombreUsuario().equals("Gabriel(Tatu)") && adIngreso.getContrasena().equals("1234")) {
                        JOptionPane.showMessageDialog(null, "Bienvenido " + adIngreso.getNombreUsuario());
                        this.setVisible(false);
                        Administrador ad = new Administrador();
                        ad.setVisible(true);
                    }else if (adIngreso.getNombreUsuario().equals("Element") && adIngreso.getContrasena().equals("1234")) {
                        JOptionPane.showMessageDialog(null, "Bienvenido " + adIngreso.getNombreUsuario());
                        this.setVisible(false);
                        Administrador ad = new Administrador();
                        ad.setVisible(true);
                    }else {
                        JOptionPane.showMessageDialog(null, "Usuario o Contraseña, Invàlida");
                    }
                    mien = false;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Favor suministre la contraseña");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Favor suministre su nombre de usuario");
        }

    }//GEN-LAST:event_BtnSiguienteActionPerformed

    private void BtnSiguienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnSiguienteMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnSiguienteMouseClicked

    private void btnTesting(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTesting
        this.setVisible(false);
        Administrador test = new Administrador();
        test.setVisible(true);
    }//GEN-LAST:event_btnTesting

    private void LblOlvidoContrasenaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblOlvidoContrasenaMousePressed
        this.setVisible(false);
        Portada por = new Portada();
        por.setVisible(true);
    }//GEN-LAST:event_LblOlvidoContrasenaMousePressed

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
            java.util.logging.Logger.getLogger(InicioLogIn.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioLogIn.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioLogIn.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioLogIn.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioLogIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnRegistro;
    private javax.swing.JButton BtnSiguiente;
    private javax.swing.JLabel LblLog;
    private javax.swing.JLabel LblOlvidoContrasena;
    private javax.swing.JLabel LblRegistro;
    private javax.swing.JLabel LblTitulo;
    private javax.swing.JLabel LblUsuario;
    private javax.swing.JLabel LblUsuario1;
    private javax.swing.JPasswordField TxtContraseña;
    private javax.swing.JTextField TxtUsuario;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
