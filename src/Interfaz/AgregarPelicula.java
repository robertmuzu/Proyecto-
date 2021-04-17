/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import javax.swing.JOptionPane;
import paquete.Comentario;
import paquete.Pelicula;
import paquete.SesionActiva;

/**
 *
 * @author Alexa
 */
public class AgregarPelicula extends javax.swing.JFrame {



    /**
     * Creates new form CalificacionPelis
     */
    public AgregarPelicula() {
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

        jPanel1 = new javax.swing.JPanel();
        lblNombrePelicula = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaDescripcionPelicula = new javax.swing.JTextArea();
        lblDescripcionPelicula = new javax.swing.JLabel();
        txt_tituloAgregarPelicula = new javax.swing.JLabel();
        btn_guardarCalificacion = new javax.swing.JButton();
        btn_cancelarCalificacion = new javax.swing.JButton();
        lblUrlImagenPelicula = new javax.swing.JLabel();
        lblCategoríaPelicula = new javax.swing.JLabel();
        cmbLenguajePelicula = new javax.swing.JComboBox<>();
        txtNombrePelicula = new javax.swing.JTextField();
        cmbCategoriaPelicula = new javax.swing.JComboBox<>();
        lblLenguajePelicula1 = new javax.swing.JLabel();
        txtUrlImagenPelicula = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(57, 62, 70));

        lblNombrePelicula.setBackground(new java.awt.Color(255, 255, 255));
        lblNombrePelicula.setForeground(new java.awt.Color(255, 255, 255));
        lblNombrePelicula.setText("Nombre:");

        txtAreaDescripcionPelicula.setColumns(20);
        txtAreaDescripcionPelicula.setRows(5);
        jScrollPane1.setViewportView(txtAreaDescripcionPelicula);

        lblDescripcionPelicula.setBackground(new java.awt.Color(255, 255, 255));
        lblDescripcionPelicula.setForeground(new java.awt.Color(255, 255, 255));
        lblDescripcionPelicula.setText("Descripción:");

        txt_tituloAgregarPelicula.setBackground(new java.awt.Color(255, 255, 255));
        txt_tituloAgregarPelicula.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        txt_tituloAgregarPelicula.setForeground(new java.awt.Color(255, 255, 255));
        txt_tituloAgregarPelicula.setText("Información de la película");

        btn_guardarCalificacion.setBackground(new java.awt.Color(144, 55, 73));
        btn_guardarCalificacion.setForeground(new java.awt.Color(255, 255, 255));
        btn_guardarCalificacion.setText("Guardar");
        btn_guardarCalificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarCalificacionActionPerformed(evt);
            }
        });

        btn_cancelarCalificacion.setBackground(new java.awt.Color(144, 55, 73));
        btn_cancelarCalificacion.setForeground(new java.awt.Color(255, 255, 255));
        btn_cancelarCalificacion.setText("Cancelar");
        btn_cancelarCalificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarCalificacionActionPerformed(evt);
            }
        });

        lblUrlImagenPelicula.setBackground(new java.awt.Color(255, 255, 255));
        lblUrlImagenPelicula.setForeground(new java.awt.Color(255, 255, 255));
        lblUrlImagenPelicula.setText("URL Imagen:");

        lblCategoríaPelicula.setBackground(new java.awt.Color(255, 255, 255));
        lblCategoríaPelicula.setForeground(new java.awt.Color(255, 255, 255));
        lblCategoríaPelicula.setText("Categoría:");

        cmbLenguajePelicula.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Español", "Inglés" }));

        cmbCategoriaPelicula.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Películas", "Documentales", "Series", "Infantiles", "Novelas", "Estrenos" }));

        lblLenguajePelicula1.setBackground(new java.awt.Color(255, 255, 255));
        lblLenguajePelicula1.setForeground(new java.awt.Color(255, 255, 255));
        lblLenguajePelicula1.setText("Lenguaje:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_tituloAgregarPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCategoríaPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUrlImagenPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDescripcionPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNombrePelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLenguajePelicula1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cmbLenguajePelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addComponent(txtNombrePelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(cmbCategoriaPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtUrlImagenPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_guardarCalificacion)
                                .addGap(29, 29, 29)
                                .addComponent(btn_cancelarCalificacion)))))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(txt_tituloAgregarPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombrePelicula)
                    .addComponent(txtNombrePelicula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDescripcionPelicula)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUrlImagenPelicula)
                    .addComponent(txtUrlImagenPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbLenguajePelicula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLenguajePelicula1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCategoríaPelicula)
                    .addComponent(cmbCategoriaPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cancelarCalificacion)
                    .addComponent(btn_guardarCalificacion))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_guardarCalificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarCalificacionActionPerformed
        
    }//GEN-LAST:event_btn_guardarCalificacionActionPerformed

    private void btn_cancelarCalificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarCalificacionActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_cancelarCalificacionActionPerformed

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
            java.util.logging.Logger.getLogger(AgregarPelicula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarPelicula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarPelicula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarPelicula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarPelicula().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelarCalificacion;
    private javax.swing.JButton btn_guardarCalificacion;
    private javax.swing.JComboBox<String> cmbCategoriaPelicula;
    private javax.swing.JComboBox<String> cmbLenguajePelicula;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCategoríaPelicula;
    private javax.swing.JLabel lblDescripcionPelicula;
    private javax.swing.JLabel lblLenguajePelicula1;
    private javax.swing.JLabel lblNombrePelicula;
    private javax.swing.JLabel lblUrlImagenPelicula;
    private javax.swing.JTextArea txtAreaDescripcionPelicula;
    private javax.swing.JTextField txtNombrePelicula;
    private javax.swing.JTextField txtUrlImagenPelicula;
    private javax.swing.JLabel txt_tituloAgregarPelicula;
    // End of variables declaration//GEN-END:variables
}
