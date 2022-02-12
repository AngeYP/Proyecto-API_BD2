/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deliverys;

import CRUD.CRUDEmpleadoTransVeh;
import Conexion.Conexion;
import javax.swing.JOptionPane;
import static Deliverys.VIniciarSesion.cedula;

/**
 *
 * @author angel
 */
public class VEmpleadoTransVeh extends javax.swing.JFrame {

  /**
   * Creates new form VEmpleadoTransVeh
   */
  Conexion conexion = new Conexion();
  CRUDEmpleadoTransVeh CRUDVehiculo = new CRUDEmpleadoTransVeh(conexion.conectar());
  String CedulaTrans;
  
  public VEmpleadoTransVeh() {
    initComponents();
  }
  
  public VEmpleadoTransVeh(String CITransportista) {
    initComponents();
    CedulaTrans = CITransportista;
    this.tf_cedulaT.setText(CedulaTrans);
    this.CRUDVehiculo.comboboxPlacas(this.cb_placas,CedulaTrans);
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
        tf_cedulaT = new javax.swing.JTextField();
        btn_cancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        tf_codigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tf_modelo = new javax.swing.JTextField();
        tf_marca = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btn_aceptar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        tf_color = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tf_tipo = new javax.swing.JTextField();
        btn_eliminar = new javax.swing.JButton();
        cb_placas = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(34, 40, 49));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(253, 112, 20));
        jLabel4.setFont(new java.awt.Font("Helvetica", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Vehiculos");
        jLabel4.setOpaque(true);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 80));

        tf_cedulaT.setBackground(new java.awt.Color(57, 62, 70));
        tf_cedulaT.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        tf_cedulaT.setForeground(new java.awt.Color(238, 238, 238));
        tf_cedulaT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_cedulaT.setBorder(null);
        tf_cedulaT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_cedulaTActionPerformed(evt);
            }
        });
        jPanel1.add(tf_cedulaT, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 200, 40));

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
        jPanel1.add(btn_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 420, 140, 40));

        jPanel2.setBackground(new java.awt.Color(57, 62, 70));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tf_codigo.setBackground(new java.awt.Color(238, 238, 238));
        tf_codigo.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        tf_codigo.setForeground(new java.awt.Color(34, 40, 49));
        jPanel2.add(tf_codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 270, 40));

        jLabel2.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(238, 238, 238));
        jLabel2.setText("Codigo:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 150, 40));

        jLabel1.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(238, 238, 238));
        jLabel1.setText("Placa:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 150, 40));

        jLabel3.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(238, 238, 238));
        jLabel3.setText("Modelo:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 150, 40));

        tf_modelo.setBackground(new java.awt.Color(238, 238, 238));
        tf_modelo.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        tf_modelo.setForeground(new java.awt.Color(34, 40, 49));
        jPanel2.add(tf_modelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 270, 40));

        tf_marca.setBackground(new java.awt.Color(238, 238, 238));
        tf_marca.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        tf_marca.setForeground(new java.awt.Color(34, 40, 49));
        jPanel2.add(tf_marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 270, 40));

        jLabel5.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(238, 238, 238));
        jLabel5.setText("Marca:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 150, 40));

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
        jPanel2.add(btn_aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, 140, 40));

        jLabel6.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(238, 238, 238));
        jLabel6.setText("Color:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 150, 40));

        tf_color.setBackground(new java.awt.Color(238, 238, 238));
        tf_color.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        tf_color.setForeground(new java.awt.Color(34, 40, 49));
        jPanel2.add(tf_color, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, 270, 40));

        jLabel7.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(238, 238, 238));
        jLabel7.setText("Tipo:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 150, 40));

        tf_tipo.setBackground(new java.awt.Color(238, 238, 238));
        tf_tipo.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        tf_tipo.setForeground(new java.awt.Color(34, 40, 49));
        jPanel2.add(tf_tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 270, 40));

        btn_eliminar.setBackground(new java.awt.Color(253, 112, 20));
        btn_eliminar.setFont(new java.awt.Font("Helvetica", 1, 17)); // NOI18N
        btn_eliminar.setForeground(new java.awt.Color(238, 238, 238));
        btn_eliminar.setText("Eliminar");
        btn_eliminar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(253, 112, 20)));
        btn_eliminar.setBorderPainted(false);
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });
        jPanel2.add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 380, 140, 40));

        cb_placas.setBackground(new java.awt.Color(238, 238, 238));
        cb_placas.setEditable(true);
        cb_placas.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        cb_placas.setForeground(new java.awt.Color(34, 40, 49));
        cb_placas.setRequestFocusEnabled(true);
        cb_placas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_placasItemStateChanged(evt);
            }
        });
        cb_placas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_placasActionPerformed(evt);
            }
        });
        jPanel2.add(cb_placas, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 270, 40));

        jScrollPane1.setViewportView(jPanel2);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 620, 240));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

  private void btn_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aceptarActionPerformed
    if(this.tf_tipo.getText().equals("") || this.tf_marca.getText().equals("") || this.tf_codigo.getText().equals("") || this.tf_modelo.getText().equals("") || this.tf_color.getText().equals("")) {
      JOptionPane.showMessageDialog(null,"Llene todos los campos");
    } else {
      this.CRUDVehiculo.insertarDatos(this.tf_cedulaT.getText(), this.tf_codigo.getText(), this.cb_placas.getSelectedItem().toString(), this.tf_modelo.getText(), this.tf_marca.getText(), this.tf_color.getText(), this.tf_tipo.getText());
      this.CRUDVehiculo.comboboxPlacas(this.cb_placas,CedulaTrans);
      this.tf_codigo.setText("");
      this.tf_modelo.setText("");
      this.tf_marca.setText("");
      this.tf_color.setText("");
      this.tf_tipo.setText("");
    }
  }//GEN-LAST:event_btn_aceptarActionPerformed

  private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
    this.dispose();
  }//GEN-LAST:event_btn_cancelarActionPerformed

  private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
    if(this.tf_codigo.getText().equals("")) {
      JOptionPane.showMessageDialog(null,"Seleccione un vehiculo");
    } else {
      this.CRUDVehiculo.eliminarDatos(this.tf_cedulaT.getText(), this.tf_codigo.getText());
      this.CRUDVehiculo.comboboxPlacas(this.cb_placas,CedulaTrans);
      this.tf_codigo.setText("");
      this.tf_modelo.setText("");
      this.tf_marca.setText("");
      this.tf_color.setText("");
      this.tf_tipo.setText("");
    }
  }//GEN-LAST:event_btn_eliminarActionPerformed

  private void cb_placasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_placasItemStateChanged
    if(!(this.cb_placas.getSelectedItem().toString().equals("Seleccione una opcion") &&this.cb_placas.getSelectedItem().toString().equals(""))){
      String[] datosVehiculos = new String[5];
      datosVehiculos = CRUDVehiculo.buscarVehiculos(cb_placas.getSelectedItem().toString());
      
      this.tf_codigo.setText(datosVehiculos[0]);
      this.tf_modelo.setText(datosVehiculos[1]);
      this.tf_marca.setText(datosVehiculos[2]);
      this.tf_color.setText(datosVehiculos[3]);
      this.tf_tipo.setText(datosVehiculos[4]);
    }
    
  }//GEN-LAST:event_cb_placasItemStateChanged

    private void cb_placasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_placasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_placasActionPerformed

    private void tf_cedulaTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_cedulaTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_cedulaTActionPerformed

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
      java.util.logging.Logger.getLogger(VEmpleadoTransVeh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(VEmpleadoTransVeh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(VEmpleadoTransVeh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(VEmpleadoTransVeh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new VEmpleadoTransVeh().setVisible(true);
      }
    });
  }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_aceptar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JComboBox<String> cb_placas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tf_cedulaT;
    private javax.swing.JTextField tf_codigo;
    private javax.swing.JTextField tf_color;
    private javax.swing.JTextField tf_marca;
    private javax.swing.JTextField tf_modelo;
    private javax.swing.JTextField tf_tipo;
    // End of variables declaration//GEN-END:variables
}
