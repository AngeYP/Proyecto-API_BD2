/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deliverys;

import CRUD.CRUDEmpleadoAsignarEncom;
import Conexion.Conexion;

/**
 *
 * @author angel
 */
public class VEmpleadosDatosTransp extends javax.swing.JFrame {

  Conexion conexion = new Conexion();
  CRUDEmpleadoAsignarEncom CRUDAsignar = new CRUDEmpleadoAsignarEncom(conexion.conectar());
  String ciTransportista;
  public VEmpleadosDatosTransp() {
    initComponents();
  }
  
  public VEmpleadosDatosTransp(String CITransp) {
    initComponents();
    ciTransportista = CITransp;
    String[] datosTransp = this.CRUDAsignar.buscarDatosTrasportista(CITransp);
    this.cedula.setText(CITransp);
    this.nombre.setText(datosTransp[0]+" "+datosTransp[1]);
    this.telefono.setText(datosTransp[2]);
    this.email.setText(datosTransp[3]);
    this.antecedentes.setText(datosTransp[4]);
    this.pedidos.setText(datosTransp[5]);
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
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    cedula = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    nombre = new javax.swing.JLabel();
    jLabel6 = new javax.swing.JLabel();
    telefono = new javax.swing.JLabel();
    jLabel8 = new javax.swing.JLabel();
    pedidos = new javax.swing.JLabel();
    jLabel10 = new javax.swing.JLabel();
    jLabel11 = new javax.swing.JLabel();
    email = new javax.swing.JLabel();
    antecedentes = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

    jPanel1.setBackground(new java.awt.Color(34, 40, 49));
    jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jLabel1.setBackground(new java.awt.Color(253, 112, 20));
    jLabel1.setFont(new java.awt.Font("Helvetica", 1, 24)); // NOI18N
    jLabel1.setForeground(new java.awt.Color(238, 238, 238));
    jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel1.setText("Datos del transportista");
    jLabel1.setOpaque(true);
    jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 60));

    jLabel2.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
    jLabel2.setForeground(new java.awt.Color(238, 238, 238));
    jLabel2.setText("Cedula:");
    jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
    jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 140, 40));

    cedula.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
    cedula.setForeground(new java.awt.Color(238, 238, 238));
    cedula.setVerticalAlignment(javax.swing.SwingConstants.TOP);
    jPanel1.add(cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 230, 40));

    jLabel4.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
    jLabel4.setForeground(new java.awt.Color(238, 238, 238));
    jLabel4.setText("Nombre y Apellido:");
    jLabel4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
    jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 140, 40));

    nombre.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
    nombre.setForeground(new java.awt.Color(238, 238, 238));
    nombre.setVerticalAlignment(javax.swing.SwingConstants.TOP);
    jPanel1.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 230, 40));

    jLabel6.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
    jLabel6.setForeground(new java.awt.Color(238, 238, 238));
    jLabel6.setText("Telefono:");
    jLabel6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
    jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 140, 40));

    telefono.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
    telefono.setForeground(new java.awt.Color(238, 238, 238));
    telefono.setVerticalAlignment(javax.swing.SwingConstants.TOP);
    jPanel1.add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 230, 40));

    jLabel8.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
    jLabel8.setForeground(new java.awt.Color(238, 238, 238));
    jLabel8.setText("Pedidos realizados:");
    jLabel8.setVerticalAlignment(javax.swing.SwingConstants.TOP);
    jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 140, 40));

    pedidos.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
    pedidos.setForeground(new java.awt.Color(238, 238, 238));
    pedidos.setVerticalAlignment(javax.swing.SwingConstants.TOP);
    jPanel1.add(pedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, 230, 40));

    jLabel10.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
    jLabel10.setForeground(new java.awt.Color(238, 238, 238));
    jLabel10.setText("Antecedentes:");
    jLabel10.setVerticalAlignment(javax.swing.SwingConstants.TOP);
    jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 140, 40));

    jLabel11.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
    jLabel11.setForeground(new java.awt.Color(238, 238, 238));
    jLabel11.setText("Email:");
    jLabel11.setVerticalAlignment(javax.swing.SwingConstants.TOP);
    jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 140, 40));

    email.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
    email.setForeground(new java.awt.Color(238, 238, 238));
    email.setVerticalAlignment(javax.swing.SwingConstants.TOP);
    jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 230, 40));

    antecedentes.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
    antecedentes.setForeground(new java.awt.Color(238, 238, 238));
    antecedentes.setVerticalAlignment(javax.swing.SwingConstants.TOP);
    jPanel1.add(antecedentes, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 230, 80));

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, Short.MAX_VALUE))
    );

    pack();
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

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
      java.util.logging.Logger.getLogger(VEmpleadosDatosTransp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(VEmpleadosDatosTransp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(VEmpleadosDatosTransp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(VEmpleadosDatosTransp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new VEmpleadosDatosTransp().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel antecedentes;
  private javax.swing.JLabel cedula;
  private javax.swing.JLabel email;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel10;
  private javax.swing.JLabel jLabel11;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel8;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JLabel nombre;
  private javax.swing.JLabel pedidos;
  private javax.swing.JLabel telefono;
  // End of variables declaration//GEN-END:variables
}
