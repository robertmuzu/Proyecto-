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
        jPanel2 = new FondoPanel();
        LblLog = new javax.swing.JLabel();
        LblUsuario = new javax.swing.JLabel();
        TxtUsuario = new javax.swing.JTextField();
        LblUsuario1 = new javax.swing.JLabel();
        TxtContraseña = new javax.swing.JPasswordField();
        LblRegistro = new javax.swing.JLabel();
        BtnRegistro = new javax.swing.JButton();
        Btnolvido = new javax.swing.JButton();
        BtnSiguiente = new javax.swing.JButton();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        LblLog.setBackground(new java.awt.Color(255, 255, 255));
        LblLog.setFont(new java.awt.Font("Colonna MT", 2, 36)); // NOI18N
        LblLog.setForeground(new java.awt.Color(255, 255, 255));
        LblLog.setText("FiDEFeX");

        LblUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LblUsuario.setForeground(new java.awt.Color(204, 204, 204));
        LblUsuario.setText("Usuario: ");

        TxtUsuario.setBackground(new java.awt.Color(204, 204, 204));
        TxtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtUsuarioActionPerformed(evt);
            }
        });

        LblUsuario1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LblUsuario1.setForeground(new java.awt.Color(204, 204, 204));
        LblUsuario1.setText("Contraseña:");

        TxtContraseña.setBackground(new java.awt.Color(204, 204, 204));
        TxtContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtContraseñaActionPerformed(evt);
            }
        });

        LblRegistro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LblRegistro.setForeground(new java.awt.Color(204, 204, 204));
        LblRegistro.setText("¿No estás Registrado aún?");

        BtnRegistro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtnRegistro.setText("Registrarse");
        BtnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegistroActionPerformed(evt);
            }
        });

        Btnolvido.setText("¿Olvidò su Contraseña?");

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(LblLog, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(LblUsuario)
                                .addGap(43, 43, 43))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(LblUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TxtUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)
                            .addComponent(TxtContraseña)
                            .addComponent(Btnolvido)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LblRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnRegistro))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(150, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LblLog, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addComponent(LblUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(TxtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(Btnolvido)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(LblRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                        .addComponent(BtnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(135, 135, 135))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        
        Usuario usu = new Usuario(TxtUsuario.getText(), TxtContraseña.getText());
        
        if (!TxtUsuario.getText().isEmpty()) {
            if (!TxtContraseña.getText().isEmpty()) {
                try {
                    FileInputStream archivo = new FileInputStream("Usuarios.roberto");
                    ObjectInputStream input = new ObjectInputStream(archivo);
                    Usuario usuLeido = (Usuario) input.readObject();
                    
                    if (usuLeido.getNombreUsuario().equals(input.readObject()) && usuLeido.getContrasena().equals(input.readObject())) {
                        JOptionPane.showMessageDialog(null, "Bienvenido " + usu.getNombreUsuario());
                    }else{
                        JOptionPane.showMessageDialog(null, "Usuario o contraseña invalida");
                    }
                    
                    input.close();
                    archivo.close();
                }catch (Exception ex){
                    System.out.println("Excepcion: " + ex.getMessage());
                }
                this.setVisible(false);
                SeleccionPerfil ini = new SeleccionPerfil();
                ini.setVisible(true);
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Favor suministre la contraseña");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Favor suministre su nombre de usuario");
        }

    }//GEN-LAST:event_BtnSiguienteActionPerformed

    private void BtnSiguienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnSiguienteMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnSiguienteMouseClicked

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
            java.util.logging.Logger.getLogger(InicioLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JButton Btnolvido;
    private javax.swing.JLabel LblLog;
    private javax.swing.JLabel LblRegistro;
    private javax.swing.JLabel LblUsuario;
    private javax.swing.JLabel LblUsuario1;
    private javax.swing.JPasswordField TxtContraseña;
    private javax.swing.JTextField TxtUsuario;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
    class FondoPanel extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g) {

            imagen = new ImageIcon(getClass().getResource("/Imagenes/Fondo2.jpg")).getImage();

            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);

            setOpaque(false);

            super.paint(g);
        }

    }
}