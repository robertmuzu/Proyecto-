/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

/**
 *
 * @author Alexa
 */
public class CalificacionPelis extends javax.swing.JFrame {

    /**
     * Creates new form CalificacionPelis
     */
    public CalificacionPelis() {
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
        cmb_puntuacion = new javax.swing.JComboBox<>();
        txt_subtituloPuntuacion = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtarea_comentario = new javax.swing.JTextArea();
        txt_subtituloComentario = new javax.swing.JLabel();
        txt_tituloCalificacion = new javax.swing.JLabel();
        btn_guardarCalificacion = new javax.swing.JButton();
        btn_cancelarCalificacion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(57, 62, 70));

        cmb_puntuacion.setBackground(new java.awt.Color(255, 255, 255));
        cmb_puntuacion.setForeground(new java.awt.Color(255, 255, 51));
        cmb_puntuacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "★★★★★", "★★★★☆", "★★★☆☆", "★★☆☆☆", "★☆☆☆☆" }));

        txt_subtituloPuntuacion.setBackground(new java.awt.Color(255, 255, 255));
        txt_subtituloPuntuacion.setForeground(new java.awt.Color(255, 255, 255));
        txt_subtituloPuntuacion.setText("Puntuación:");

        txtarea_comentario.setBackground(new java.awt.Color(255, 255, 255));
        txtarea_comentario.setColumns(20);
        txtarea_comentario.setRows(5);
        jScrollPane1.setViewportView(txtarea_comentario);

        txt_subtituloComentario.setBackground(new java.awt.Color(255, 255, 255));
        txt_subtituloComentario.setForeground(new java.awt.Color(255, 255, 255));
        txt_subtituloComentario.setText("Comentarios");

        txt_tituloCalificacion.setBackground(new java.awt.Color(255, 255, 255));
        txt_tituloCalificacion.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        txt_tituloCalificacion.setForeground(new java.awt.Color(255, 255, 255));
        txt_tituloCalificacion.setText("Califica la película");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_puntuacion, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_subtituloComentario, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_tituloCalificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_subtituloPuntuacion, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(62, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_guardarCalificacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_cancelarCalificacion)
                .addGap(80, 80, 80))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(txt_tituloCalificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_subtituloPuntuacion)
                .addGap(18, 18, 18)
                .addComponent(cmb_puntuacion, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_subtituloComentario)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_guardarCalificacion)
                    .addComponent(btn_cancelarCalificacion))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(CalificacionPelis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalificacionPelis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalificacionPelis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalificacionPelis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalificacionPelis().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelarCalificacion;
    private javax.swing.JButton btn_guardarCalificacion;
    private javax.swing.JComboBox<String> cmb_puntuacion;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel txt_subtituloComentario;
    private javax.swing.JLabel txt_subtituloPuntuacion;
    private javax.swing.JLabel txt_tituloCalificacion;
    private javax.swing.JTextArea txtarea_comentario;
    // End of variables declaration//GEN-END:variables
}
