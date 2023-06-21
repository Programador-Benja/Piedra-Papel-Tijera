/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package PiedraPapelTijera;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Benja-PC
 */
public class InterfazJuego extends javax.swing.JFrame {
    //Se crea los objetos de MAQUINA Y JUGADOR global
    Maquina m1 = new Maquina();
    Jugador j1 = new Jugador();
    
    ImageIcon piedra = new ImageIcon(getClass().getResource("piedra.jpg"));
    ImageIcon papel = new ImageIcon(getClass().getResource("papel.jpg"));
    ImageIcon tijera = new ImageIcon(getClass().getResource("tijera.jpg"));
    /**
     * Creates new form InterfazJuego
     */
    public InterfazJuego() {
        initComponents();
        ImageIcon img1 = new ImageIcon(getClass().getResource("jugador1.jpg"));
        ImageIcon img2 = new ImageIcon(getClass().getResource("jugador2.jpg"));
        txtJ1.setText(String.valueOf(j1.getContador()));
        txtJ2.setText(String.valueOf(m1.getContador()));
        imgJugador.setIcon(img1);
        imgMaquina.setIcon(img2);
    }

    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        rbPiedra = new javax.swing.JRadioButton();
        rbPapel = new javax.swing.JRadioButton();
        rbTijera = new javax.swing.JRadioButton();
        btnJugar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtJ1 = new javax.swing.JTextField();
        txtJ2 = new javax.swing.JTextField();
        imgJugador = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        imgMaquina = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        buttonGroup1.add(rbPiedra);
        rbPiedra.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        rbPiedra.setText("Piedra");

        buttonGroup1.add(rbPapel);
        rbPapel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        rbPapel.setText("Papel");

        buttonGroup1.add(rbTijera);
        rbTijera.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        rbTijera.setText("Tijera");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(rbPiedra)
                .addGap(32, 32, 32)
                .addComponent(rbPapel)
                .addGap(44, 44, 44)
                .addComponent(rbTijera)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbPiedra)
                    .addComponent(rbPapel)
                    .addComponent(rbTijera))
                .addGap(44, 44, 44))
        );

        btnJugar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnJugar.setText("Jugar");
        btnJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugarActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Marcador", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 18))); // NOI18N
        jPanel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("Jugador 1:");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Jugador 2:");

        txtJ1.setEditable(false);
        txtJ1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJ1ActionPerformed(evt);
            }
        });

        txtJ2.setEditable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtJ1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(txtJ2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(txtJ1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtJ2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        imgJugador.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setText("Jugador 1:");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setText("Jugador 2:");

        btnSalir.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        imgMaquina.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(247, 247, 247))
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnJugar)
                        .addGap(103, 103, 103)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(180, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(imgJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(imgMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(btnJugar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel7)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imgJugador, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imgMaquina, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addComponent(btnSalir)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtJ1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJ1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJ1ActionPerformed

    private void btnJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugarActionPerformed
        int numMaquina;
        boolean select, select2, select3;
        select = rbPiedra.isSelected();
        select2 = rbPapel.isSelected();
        select3 = rbTijera.isSelected();
        
        if(select || select2 || select3){
        numMaquina = m1.MaquinaJuega();
        if(rbPiedra.isSelected()){
            imgJugador.setIcon(piedra);
            switch (numMaquina) {
                case 0 -> {
                    imgMaquina.setIcon(piedra);
                    JOptionPane.showMessageDialog(null, "Empate");
                }
                case 1 -> {
                    imgMaquina.setIcon(papel);
                    m1.ctualizarContador();
                    txtJ2.setText(String.valueOf(m1.getContador()));
                    JOptionPane.showMessageDialog(null, "Gano Maquina");
                }
                case 2 -> {
                    imgMaquina.setIcon(tijera);
                    j1.actualizarContador();
                    txtJ1.setText(String.valueOf(j1.getContador()));
                    JOptionPane.showMessageDialog(null, "Gano Jugador");
                }             
            }
        } else if(rbPapel.isSelected()){
            imgJugador.setIcon(papel);
            switch (numMaquina) {
                case 0 -> {
                    imgMaquina.setIcon(piedra);
                    j1.actualizarContador();
                    txtJ1.setText(String.valueOf(j1.getContador()));
                    JOptionPane.showMessageDialog(null, "Gano Jugador");
                }
                case 1 -> {
                    imgMaquina.setIcon(papel);
                    JOptionPane.showMessageDialog(null, "Empate");
                }
                case 2 -> {
                    imgMaquina.setIcon(tijera);
                    m1.ctualizarContador();
                    txtJ2.setText(String.valueOf(m1.getContador()));
                    JOptionPane.showMessageDialog(null, "Gano Maquina");
                }
            }
        } else{
            imgJugador.setIcon(tijera);
            switch (numMaquina) {
                case 0 -> {
                    imgMaquina.setIcon(piedra);
                    m1.ctualizarContador();
                    txtJ2.setText(String.valueOf(m1.getContador()));
                    JOptionPane.showMessageDialog(null, "Gano Maquina");
                }
                case 1 -> {
                    imgMaquina.setIcon(papel);
                    j1.actualizarContador();
                    txtJ1.setText(String.valueOf(j1.getContador()));
                    JOptionPane.showMessageDialog(null, "Gano Jugador");
                }
                case 2 -> {
                    imgMaquina.setIcon(tijera);
                    JOptionPane.showMessageDialog(null, "Empate");
                }
                
            }
        }
        } else{
            JOptionPane.showMessageDialog(null,"¡Seleccione su jugada antes de darle al boton jugar!");
        }
    }//GEN-LAST:event_btnJugarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        int salir;
        salir = JOptionPane.showConfirmDialog(this, "¿Desea salir del juego?", "Salir", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(salir == JOptionPane.YES_OPTION){
            System.exit(0);
        }
        
    }//GEN-LAST:event_btnSalirActionPerformed

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
            java.util.logging.Logger.getLogger(InterfazJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazJuego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnJugar;
    private javax.swing.JButton btnSalir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel imgJugador;
    private javax.swing.JLabel imgMaquina;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton rbPapel;
    private javax.swing.JRadioButton rbPiedra;
    private javax.swing.JRadioButton rbTijera;
    private javax.swing.JTextField txtJ1;
    private javax.swing.JTextField txtJ2;
    // End of variables declaration//GEN-END:variables
}
