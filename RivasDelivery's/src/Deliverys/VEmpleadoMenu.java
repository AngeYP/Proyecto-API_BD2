/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deliverys;

import CRUD.CRUDEmpleadoMenu;
import Conexion.Conexion;
import javax.swing.JOptionPane;

/**
 *
 * @author angel
 */
public class VEmpleadoMenu extends javax.swing.JFrame {

  Conexion conexion = new Conexion();
  CRUDEmpleadoMenu empleado = new CRUDEmpleadoMenu(conexion.conectar());
  
  String cedulaE;
  public VEmpleadoMenu() {
    initComponents();
  }
  
  
  public VEmpleadoMenu(String cedulaEmp) {
    initComponents();
    cedulaE = cedulaEmp;
    this.tf_cedulaEmp.setText(cedulaE);
    datosEmp();
  }
  
  public void datosEmp() {
    if (!(this.tf_cedulaEmp.getText().equals(""))) {

      String[] datosEmp = empleado.buscarEmpleado(this.tf_cedulaEmp.getText());
      this.tf_nombreE.setText(datosEmp[0]);
      this.tf_apellidoE.setText(datosEmp[1]);
      this.tf_nucleoE.setText(datosEmp[2]);

    }else {
        JOptionPane.showMessageDialog(null, "Por favor rellene los campos faltantes", "Advertencia", JOptionPane.WARNING_MESSAGE);
    }
    this.tf_cedulaEmp.setEditable(false);
  }
  
//  scrollPane.getVerticalScrollBar().setUI(new BasicScrollBarUI() {
//    protected void configureScrollBarColors() {
//        this.thumbColor = Color.BLACK;
//    }
//  });

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
    jLabel1 = new javax.swing.JLabel();
    jButton1 = new javax.swing.JButton();
    btn_clientes = new javax.swing.JButton();
    btn_transportista = new javax.swing.JButton();
    btn_encomiendas = new javax.swing.JButton();
    jPanel4 = new javax.swing.JPanel();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    tf_nombreE = new javax.swing.JTextField();
    tf_apellidoE = new javax.swing.JTextField();
    tf_nucleoE = new javax.swing.JTextField();
    tf_cedulaEmp = new javax.swing.JTextField();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jPanel1.setBackground(new java.awt.Color(34, 40, 49));
    jPanel1.setMaximumSize(new java.awt.Dimension(1080, 720));
    jPanel1.setMinimumSize(new java.awt.Dimension(1080, 720));
    jPanel1.setPreferredSize(new java.awt.Dimension(1080, 720));
    jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jPanel2.setBackground(new java.awt.Color(57, 62, 70));
    jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jLabel1.setBackground(new java.awt.Color(253, 112, 20));
    jLabel1.setFont(new java.awt.Font("Helvetica", 1, 36)); // NOI18N
    jLabel1.setForeground(new java.awt.Color(238, 238, 238));
    jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel1.setText("Menu");
    jLabel1.setOpaque(true);
    jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 80));

    jButton1.setBackground(new java.awt.Color(204, 0, 0));
    jButton1.setFont(new java.awt.Font("Helvetica", 1, 18)); // NOI18N
    jButton1.setForeground(new java.awt.Color(238, 238, 238));
    jButton1.setText("Salir");
    jButton1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton1ActionPerformed(evt);
      }
    });
    jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 660, 180, 60));

    btn_clientes.setBackground(new java.awt.Color(253, 112, 20));
    btn_clientes.setFont(new java.awt.Font("Helvetica", 1, 18)); // NOI18N
    btn_clientes.setForeground(new java.awt.Color(238, 238, 238));
    btn_clientes.setText("Clientes");
    btn_clientes.setBorderPainted(false);
    btn_clientes.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btn_clientesActionPerformed(evt);
      }
    });
    jPanel2.add(btn_clientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 180, 60));

    btn_transportista.setBackground(new java.awt.Color(253, 112, 20));
    btn_transportista.setFont(new java.awt.Font("Helvetica", 1, 18)); // NOI18N
    btn_transportista.setForeground(new java.awt.Color(238, 238, 238));
    btn_transportista.setText("Transportistas");
    btn_transportista.setBorderPainted(false);
    btn_transportista.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btn_transportistaActionPerformed(evt);
      }
    });
    jPanel2.add(btn_transportista, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 180, 60));

    btn_encomiendas.setBackground(new java.awt.Color(253, 112, 20));
    btn_encomiendas.setFont(new java.awt.Font("Helvetica", 1, 18)); // NOI18N
    btn_encomiendas.setForeground(new java.awt.Color(238, 238, 238));
    btn_encomiendas.setText("Encomiendas");
    btn_encomiendas.setBorderPainted(false);
    btn_encomiendas.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btn_encomiendasActionPerformed(evt);
      }
    });
    jPanel2.add(btn_encomiendas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 180, 60));

    jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 720));

    jPanel4.setBackground(new java.awt.Color(57, 62, 70));
    jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jLabel2.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
    jLabel2.setForeground(new java.awt.Color(238, 238, 238));
    jLabel2.setText("Nombre");
    jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 290, 40));

    jLabel3.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
    jLabel3.setForeground(new java.awt.Color(238, 238, 238));
    jLabel3.setText("Apellido");
    jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 290, 40));

    jLabel4.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
    jLabel4.setForeground(new java.awt.Color(238, 238, 238));
    jLabel4.setText("Nucleo");
    jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 290, 40));

    tf_nombreE.setBackground(new java.awt.Color(238, 238, 238));
    tf_nombreE.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
    tf_nombreE.setForeground(new java.awt.Color(34, 40, 49));
    jPanel4.add(tf_nombreE, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 320, 40));

    tf_apellidoE.setBackground(new java.awt.Color(238, 238, 238));
    tf_apellidoE.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
    tf_apellidoE.setForeground(new java.awt.Color(34, 40, 49));
    jPanel4.add(tf_apellidoE, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, 320, 40));

    tf_nucleoE.setBackground(new java.awt.Color(238, 238, 238));
    tf_nucleoE.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
    tf_nucleoE.setForeground(new java.awt.Color(34, 40, 49));
    jPanel4.add(tf_nucleoE, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 320, 40));

    jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 740, 200));

    tf_cedulaEmp.setEditable(false);
    tf_cedulaEmp.setBackground(new java.awt.Color(57, 62, 70));
    tf_cedulaEmp.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
    tf_cedulaEmp.setForeground(new java.awt.Color(238, 238, 238));
    tf_cedulaEmp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    tf_cedulaEmp.setBorder(null);
    jPanel1.add(tf_cedulaEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, 310, 40));

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

  private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_jButton1ActionPerformed

  private void btn_clientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clientesActionPerformed
    new VEmpleadoCliente(cedulaE).setVisible(true);
    this.dispose();
  }//GEN-LAST:event_btn_clientesActionPerformed

  private void btn_transportistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_transportistaActionPerformed
    //new VEmpleadoCliente(cedulaE).setVisible(true);
    //this.dispose();
  }//GEN-LAST:event_btn_transportistaActionPerformed

  private void btn_encomiendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_encomiendasActionPerformed
    new VEmpleadoEncom(cedulaE).setVisible(true);
    this.dispose();
  }//GEN-LAST:event_btn_encomiendasActionPerformed

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
      java.util.logging.Logger.getLogger(VEmpleadoMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(VEmpleadoMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(VEmpleadoMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(VEmpleadoMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new VEmpleadoMenu().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btn_clientes;
  private javax.swing.JButton btn_encomiendas;
  private javax.swing.JButton btn_transportista;
  private javax.swing.JButton jButton1;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JPanel jPanel4;
  private javax.swing.JTextField tf_apellidoE;
  private javax.swing.JTextField tf_cedulaEmp;
  private javax.swing.JTextField tf_nombreE;
  private javax.swing.JTextField tf_nucleoE;
  // End of variables declaration//GEN-END:variables
}
