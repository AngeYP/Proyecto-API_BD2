/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deliverys;

import javax.swing.JOptionPane;

/**
 *
 * @author angel
 */
public class VIniciarSesion extends javax.swing.JFrame {

    public static String cedula;
  /**
   * Creates new form VIniciarSesion
   */
  public VIniciarSesion() {
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
        jPanel2 = new javax.swing.JPanel();
        JLB_contrasena = new javax.swing.JLabel();
        JLB_usuario = new javax.swing.JLabel();
        Btn_Ingresar1 = new javax.swing.JButton();
        JTF_usuario = new javax.swing.JTextField();
        JTF_contrasena = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(34, 40, 49));
        jPanel1.setMaximumSize(new java.awt.Dimension(1080, 720));
        jPanel1.setMinimumSize(new java.awt.Dimension(1080, 720));
        jPanel1.setPreferredSize(new java.awt.Dimension(1080, 720));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(57, 62, 70));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JLB_contrasena.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        JLB_contrasena.setForeground(new java.awt.Color(238, 238, 238));
        JLB_contrasena.setText("Contraseña");
        jPanel2.add(JLB_contrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 300, 35));

        JLB_usuario.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        JLB_usuario.setForeground(new java.awt.Color(238, 238, 238));
        JLB_usuario.setText("Usuario");
        jPanel2.add(JLB_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 300, 35));

        Btn_Ingresar1.setBackground(new java.awt.Color(253, 112, 20));
        Btn_Ingresar1.setFont(new java.awt.Font("Helvetica", 1, 17)); // NOI18N
        Btn_Ingresar1.setForeground(new java.awt.Color(238, 238, 238));
        Btn_Ingresar1.setText("Aceptar");
        Btn_Ingresar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(253, 112, 20)));
        Btn_Ingresar1.setBorderPainted(false);
        Btn_Ingresar1.setFocusPainted(false);
        Btn_Ingresar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Ingresar1ActionPerformed(evt);
            }
        });
        jPanel2.add(Btn_Ingresar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 140, 40));

        JTF_usuario.setBackground(new java.awt.Color(238, 238, 238));
        JTF_usuario.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        JTF_usuario.setForeground(new java.awt.Color(34, 40, 49));
        jPanel2.add(JTF_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 333, 40));

        JTF_contrasena.setBackground(new java.awt.Color(238, 238, 238));
        JTF_contrasena.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        JTF_contrasena.setForeground(new java.awt.Color(34, 40, 49));
        JTF_contrasena.setToolTipText("");
        jPanel2.add(JTF_contrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 333, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(339, 196, 389, 340));

        jLabel4.setBackground(new java.awt.Color(253, 112, 20));
        jLabel4.setFont(new java.awt.Font("Helvetica", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Iniciar Sesión");
        jLabel4.setOpaque(true);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 80));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

  private void Btn_Ingresar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Ingresar1ActionPerformed
      if(!(JTF_usuario.getText().equals("") && JTF_contrasena.getText().equals(""))){
        new VUsuarios().setVisible(true);     
        this.setVisible(false);
      }else{
          JOptionPane.showMessageDialog(null, "Llene todos los campos porfavor");
      }
      
  }//GEN-LAST:event_Btn_Ingresar1ActionPerformed

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
      java.util.logging.Logger.getLogger(VIniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(VIniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(VIniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(VIniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new VIniciarSesion().setVisible(true);
      }
    });
  }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Ingresar1;
    private javax.swing.JLabel JLB_contrasena;
    private javax.swing.JLabel JLB_usuario;
    private javax.swing.JPasswordField JTF_contrasena;
    private javax.swing.JTextField JTF_usuario;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
