/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deliverys;

/**
 *
 * @author angel
 */
public class VEmpleadoRecarga extends javax.swing.JFrame {

  /**
   * Creates new form VEmpleadoRecarga
   */
  public VEmpleadoRecarga() {
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
    jLabel4 = new javax.swing.JLabel();
    jTextField2 = new javax.swing.JTextField();
    Btn_Ingresar1 = new javax.swing.JButton();
    Btn_Ingresar2 = new javax.swing.JButton();
    jPanel2 = new javax.swing.JPanel();
    jTextField3 = new javax.swing.JTextField();
    jTextField1 = new javax.swing.JTextField();
    jLabel2 = new javax.swing.JLabel();
    jLabel1 = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jPanel1.setBackground(new java.awt.Color(34, 40, 49));
    jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jLabel4.setBackground(new java.awt.Color(253, 112, 20));
    jLabel4.setFont(new java.awt.Font("Helvetica", 1, 36)); // NOI18N
    jLabel4.setForeground(new java.awt.Color(255, 255, 255));
    jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel4.setText("Recarga");
    jLabel4.setOpaque(true);
    jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 80));

    jTextField2.setEditable(false);
    jTextField2.setBackground(new java.awt.Color(57, 62, 70));
    jTextField2.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
    jTextField2.setForeground(new java.awt.Color(238, 238, 238));
    jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    jTextField2.setText("jTextField1");
    jTextField2.setBorder(null);
    jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 200, 40));

    Btn_Ingresar1.setBackground(new java.awt.Color(253, 112, 20));
    Btn_Ingresar1.setFont(new java.awt.Font("Helvetica", 1, 17)); // NOI18N
    Btn_Ingresar1.setForeground(new java.awt.Color(238, 238, 238));
    Btn_Ingresar1.setText("Aceptar");
    Btn_Ingresar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(253, 112, 20)));
    Btn_Ingresar1.setBorderPainted(false);
    Btn_Ingresar1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        Btn_Ingresar1ActionPerformed(evt);
      }
    });
    jPanel1.add(Btn_Ingresar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 140, 40));

    Btn_Ingresar2.setBackground(new java.awt.Color(253, 112, 20));
    Btn_Ingresar2.setFont(new java.awt.Font("Helvetica", 1, 17)); // NOI18N
    Btn_Ingresar2.setForeground(new java.awt.Color(238, 238, 238));
    Btn_Ingresar2.setText("Cancelar");
    Btn_Ingresar2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(253, 112, 20)));
    Btn_Ingresar2.setBorderPainted(false);
    Btn_Ingresar2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        Btn_Ingresar2ActionPerformed(evt);
      }
    });
    jPanel1.add(Btn_Ingresar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, 140, 40));

    jPanel2.setBackground(new java.awt.Color(57, 62, 70));
    jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jTextField3.setBackground(new java.awt.Color(238, 238, 238));
    jTextField3.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
    jTextField3.setForeground(new java.awt.Color(34, 40, 49));
    jTextField3.setText("jTextField1");
    jPanel2.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 220, 40));

    jTextField1.setBackground(new java.awt.Color(238, 238, 238));
    jTextField1.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
    jTextField1.setForeground(new java.awt.Color(34, 40, 49));
    jTextField1.setText("jTextField1");
    jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 220, 40));

    jLabel2.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
    jLabel2.setForeground(new java.awt.Color(238, 238, 238));
    jLabel2.setText("jLabel1");
    jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 150, 40));

    jLabel1.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
    jLabel1.setForeground(new java.awt.Color(238, 238, 238));
    jLabel1.setText("jLabel1");
    jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 150, 40));

    jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 440, 140));

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
    );

    pack();
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

  private void Btn_Ingresar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Ingresar1ActionPerformed

  }//GEN-LAST:event_Btn_Ingresar1ActionPerformed

  private void Btn_Ingresar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Ingresar2ActionPerformed

  }//GEN-LAST:event_Btn_Ingresar2ActionPerformed

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
      java.util.logging.Logger.getLogger(VEmpleadoRecarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(VEmpleadoRecarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(VEmpleadoRecarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(VEmpleadoRecarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new VEmpleadoRecarga().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton Btn_Ingresar1;
  private javax.swing.JButton Btn_Ingresar2;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JTextField jTextField1;
  private javax.swing.JTextField jTextField2;
  private javax.swing.JTextField jTextField3;
  // End of variables declaration//GEN-END:variables
}
