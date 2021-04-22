package Interfaz;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.JOptionPane;

/**
 *
 * @author GABRIEL CHAVES G
 */
public class Catalogo extends javax.swing.JFrame {

    /**
     * Creates new form Catalogo
     */
    public Catalogo() {
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
        btnPelis = new javax.swing.JButton();
        btnSeries = new javax.swing.JButton();
        btnInfantil = new javax.swing.JButton();
        btnDocs = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        btnEstrenos = new javax.swing.JButton();
        btnNovels = new javax.swing.JButton();
        btnBuscador = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        BottonAjustes = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        btnPelis.setBackground(new java.awt.Color(144, 55, 73));
        btnPelis.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        btnPelis.setForeground(new java.awt.Color(255, 255, 255));
        btnPelis.setText("PELICULAS");
        btnPelis.setPreferredSize(new java.awt.Dimension(130, 100));
        btnPelis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPelisActionPerformed(evt);
            }
        });

        btnSeries.setBackground(new java.awt.Color(144, 55, 73));
        btnSeries.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        btnSeries.setForeground(new java.awt.Color(255, 255, 255));
        btnSeries.setText("SERIES");
        btnSeries.setPreferredSize(new java.awt.Dimension(130, 100));
        btnSeries.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeriesActionPerformed(evt);
            }
        });

        btnInfantil.setBackground(new java.awt.Color(144, 55, 73));
        btnInfantil.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        btnInfantil.setForeground(new java.awt.Color(255, 255, 255));
        btnInfantil.setText("INFANTILES");
        btnInfantil.setPreferredSize(new java.awt.Dimension(130, 100));
        btnInfantil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfantilActionPerformed(evt);
            }
        });

        btnDocs.setBackground(new java.awt.Color(144, 55, 73));
        btnDocs.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        btnDocs.setForeground(new java.awt.Color(255, 255, 255));
        btnDocs.setText("DOCUMENTALES");
        btnDocs.setPreferredSize(new java.awt.Dimension(130, 100));
        btnDocs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDocsActionPerformed(evt);
            }
        });

        btnCerrar.setBackground(new java.awt.Color(144, 55, 73));
        btnCerrar.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        btnCerrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrar.setText("Cerrar Sesión");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        btnEstrenos.setBackground(new java.awt.Color(144, 55, 73));
        btnEstrenos.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        btnEstrenos.setForeground(new java.awt.Color(255, 255, 255));
        btnEstrenos.setText("ESTRENOS");
        btnEstrenos.setPreferredSize(new java.awt.Dimension(130, 100));
        btnEstrenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstrenosActionPerformed(evt);
            }
        });

        btnNovels.setBackground(new java.awt.Color(144, 55, 73));
        btnNovels.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        btnNovels.setForeground(new java.awt.Color(255, 255, 255));
        btnNovels.setText("NOVELAS");
        btnNovels.setPreferredSize(new java.awt.Dimension(130, 100));
        btnNovels.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovelsActionPerformed(evt);
            }
        });

        btnBuscador.setBackground(java.awt.Color.darkGray);
        btnBuscador.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        btnBuscador.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscador.setText("Buscador");
        btnBuscador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscadorActionPerformed(evt);
            }
        });

        btnAtras.setBackground(new java.awt.Color(144, 55, 73));
        btnAtras.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        btnAtras.setForeground(new java.awt.Color(255, 255, 255));
        btnAtras.setText("ATRAS");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        BottonAjustes.setBackground(new java.awt.Color(51, 51, 51));
        BottonAjustes.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        BottonAjustes.setForeground(new java.awt.Color(255, 255, 255));
        BottonAjustes.setText("Ajustes");
        BottonAjustes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BottonAjustesActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cartelera/007_1.jpg"))); // NOI18N

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CATALOGO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btnAtras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(BottonAjustes)
                .addGap(13, 13, 13))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnPelis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnInfantil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(btnNovels, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnEstrenos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(btnDocs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnSeries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(16, 16, 16))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAtras)
                    .addComponent(BottonAjustes)
                    .addComponent(btnBuscador))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnPelis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDocs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSeries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnInfantil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNovels, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEstrenos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addComponent(btnCerrar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.getAccessibleContext().setAccessibleParent(this);

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

    private void btnBuscadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscadorActionPerformed
        //this.setVisible(false);
        Buscador buscador = new Buscador();
        buscador.setVisible(true);
    }//GEN-LAST:event_btnBuscadorActionPerformed

    private void btnNovelsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovelsActionPerformed
        this.setVisible(false);
        CatNovelas peliculas = new CatNovelas();
        peliculas.setVisible(true);
    }//GEN-LAST:event_btnNovelsActionPerformed

    private void btnEstrenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstrenosActionPerformed
        this.setVisible(false);
        CatEstrenos peliculas = new CatEstrenos();
        peliculas.setVisible(true);
    }//GEN-LAST:event_btnEstrenosActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        String[] options = new String[2];
        options[0] = "Si";
        options[1] = "No";
        int result = JOptionPane.showOptionDialog(rootPane, "¿Está seguro de cerrar sesión?", "Cerrar Sesión", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, null);
        if (result == JOptionPane.YES_OPTION) {
            this.setVisible(false);
            InicioLogIn iniLog = new InicioLogIn();
            iniLog.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnDocsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDocsActionPerformed
        this.setVisible(false);
        CatDocumentales peliculas = new CatDocumentales();
        peliculas.setVisible(true);
    }//GEN-LAST:event_btnDocsActionPerformed

    private void btnInfantilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfantilActionPerformed
        this.setVisible(false);
        CatInfantiles peliculas = new CatInfantiles();
        peliculas.setVisible(true);
    }//GEN-LAST:event_btnInfantilActionPerformed

    private void btnSeriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeriesActionPerformed
        this.setVisible(false);
        CatSeries peliculas = new CatSeries();
        peliculas.setVisible(true);
    }//GEN-LAST:event_btnSeriesActionPerformed

    private void btnPelisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPelisActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        CatPeliculas peliculas = new CatPeliculas();
        peliculas.setVisible(true);
    }//GEN-LAST:event_btnPelisActionPerformed

    private void BottonAjustesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BottonAjustesActionPerformed
        this.setVisible(false);
        Ajustes inter = new Ajustes();
        inter.setVisible(true);
    }//GEN-LAST:event_BottonAjustesActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        this.setVisible(false);
        SeleccionPerfil atras = new SeleccionPerfil();
        atras.setVisible(true);
    }//GEN-LAST:event_btnAtrasActionPerformed

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
            java.util.logging.Logger.getLogger(Catalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Catalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Catalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Catalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Catalogo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BottonAjustes;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnBuscador;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnDocs;
    private javax.swing.JButton btnEstrenos;
    private javax.swing.JButton btnInfantil;
    private javax.swing.JButton btnNovels;
    private javax.swing.JButton btnPelis;
    private javax.swing.JButton btnSeries;
    public javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
