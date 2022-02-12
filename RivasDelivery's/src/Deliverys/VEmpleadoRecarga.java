/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deliverys;

import CRUD.CRUDEmpleadoRecarga;
import Conexion.Conexion;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import static Deliverys.VIniciarSesion.cedula;

/**
 *
 * @author angel
 */
public class VEmpleadoRecarga extends javax.swing.JFrame {

  /**
   * Creates new form VEmpleadoRecarga
   */
  Conexion conexion = new Conexion();
  CRUDEmpleadoRecarga recargacliente = new CRUDEmpleadoRecarga(conexion.conectar());
  String textoerror = null;
  String cedulaCliente;
  
  public VEmpleadoRecarga() {
    initComponents();
  }
  
  public VEmpleadoRecarga(String cedulaC) {
    initComponents();
    cedulaCliente = cedulaC;
    this.tf_cedulaC.setText(cedulaCliente);
    Date date=new Date();
    SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
    this.tf_fecha.setText(sdf.format(date));
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
    tf_cedulaC = new javax.swing.JTextField();
    btn_aceptar = new javax.swing.JButton();
    btn_cancelar = new javax.swing.JButton();
    jPanel2 = new javax.swing.JPanel();
    tf_monto = new javax.swing.JTextField();
    tf_fecha = new javax.swing.JTextField();
    jLabel2 = new javax.swing.JLabel();
    jLabel1 = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

    jPanel1.setBackground(new java.awt.Color(34, 40, 49));
    jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jLabel4.setBackground(new java.awt.Color(253, 112, 20));
    jLabel4.setFont(new java.awt.Font("Helvetica", 1, 36)); // NOI18N
    jLabel4.setForeground(new java.awt.Color(255, 255, 255));
    jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel4.setText("Recarga");
    jLabel4.setOpaque(true);
    jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 80));

    tf_cedulaC.setEditable(false);
    tf_cedulaC.setBackground(new java.awt.Color(57, 62, 70));
    tf_cedulaC.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
    tf_cedulaC.setForeground(new java.awt.Color(238, 238, 238));
    tf_cedulaC.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    tf_cedulaC.setBorder(null);
    jPanel1.add(tf_cedulaC, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 200, 40));

    btn_aceptar.setBackground(new java.awt.Color(253, 112, 20));
    btn_aceptar.setFont(new java.awt.Font("Helvetica", 1, 17)); // NOI18N
    btn_aceptar.setForeground(new java.awt.Color(238, 238, 238));
    btn_aceptar.setText("Aceptar");
    btn_aceptar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(253, 112, 20)));
    btn_aceptar.setBorderPainted(false);
    btn_aceptar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btn_aceptarActionPerformed(evt);
      }
    });
    jPanel1.add(btn_aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 140, 40));

    btn_cancelar.setBackground(new java.awt.Color(253, 112, 20));
    btn_cancelar.setFont(new java.awt.Font("Helvetica", 1, 17)); // NOI18N
    btn_cancelar.setForeground(new java.awt.Color(238, 238, 238));
    btn_cancelar.setText("Cancelar");
    btn_cancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(253, 112, 20)));
    btn_cancelar.setBorderPainted(false);
    btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btn_cancelarActionPerformed(evt);
      }
    });
    jPanel1.add(btn_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, 140, 40));

    jPanel2.setBackground(new java.awt.Color(57, 62, 70));
    jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    tf_monto.setBackground(new java.awt.Color(238, 238, 238));
    tf_monto.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
    tf_monto.setForeground(new java.awt.Color(34, 40, 49));
    jPanel2.add(tf_monto, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 220, 40));

    tf_fecha.setEditable(false);
    tf_fecha.setBackground(new java.awt.Color(238, 238, 238));
    tf_fecha.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
    tf_fecha.setForeground(new java.awt.Color(34, 40, 49));
    jPanel2.add(tf_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 220, 40));

    jLabel2.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
    jLabel2.setForeground(new java.awt.Color(238, 238, 238));
    jLabel2.setText("Monto");
    jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 150, 40));

    jLabel1.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
    jLabel1.setForeground(new java.awt.Color(238, 238, 238));
    jLabel1.setText("Fecha");
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

  private void btn_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aceptarActionPerformed
    if(!this.tf_monto.getText().equals("")){
      this.recargacliente.insertarDatos(cedulaCliente, cedula, Float.parseFloat(this.tf_monto.getText()));
    } else {
      JOptionPane.showMessageDialog(null,"Llene todos los campos");
    }
  }//GEN-LAST:event_btn_aceptarActionPerformed

  private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
    this.dispose();
  }//GEN-LAST:event_btn_cancelarActionPerformed

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
  private javax.swing.JButton btn_aceptar;
  private javax.swing.JButton btn_cancelar;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JTextField tf_cedulaC;
  private javax.swing.JTextField tf_fecha;
  private javax.swing.JTextField tf_monto;
  // End of variables declaration//GEN-END:variables
}