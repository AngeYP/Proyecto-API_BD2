/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deliverys;

import CRUD.CRUDEmpleadoTransVeh;
import CRUD.CRUDTransVuelos;
import Conexion.Conexion;
import javax.swing.JOptionPane;
import static Deliverys.VIniciarSesion.cedula;

/**
 *
 * @author angel
 */
public class VTransVuelos extends javax.swing.JFrame {

  /**
   * Creates new form VEmpleadoTransVeh
   */
  Conexion conexion = new Conexion();
  CRUDTransVuelos crudTransVuelos = new CRUDTransVuelos(conexion.conectar());
  String identificacionT;
  
  public VTransVuelos() {
    initComponents();
    this.JTF_identificacionT.setText(cedula);
  }
  
  public VTransVuelos(String identificacionT) {
    initComponents();
    this.identificacionT = identificacionT;
    this.JTF_identificacionT.setText(this.identificacionT);
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
        JTF_identificacionT = new javax.swing.JTextField();
        btn_cancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        JTF_cod_vuelos = new javax.swing.JTextField();
        JLB_cod_vuelos = new javax.swing.JLabel();
        JLB_hora_salida = new javax.swing.JLabel();
        JLB_hora_estimada_S = new javax.swing.JLabel();
        JTF_hora_estimada_S = new javax.swing.JTextField();
        JTF_hora_estimada_LL = new javax.swing.JTextField();
        JLB_hora_estimada_LL = new javax.swing.JLabel();
        btn_aceptar = new javax.swing.JButton();
        JLB_hora_retraso = new javax.swing.JLabel();
        JTF_hora_retraso = new javax.swing.JTextField();
        JLB_hora_llegada = new javax.swing.JLabel();
        JTF_hora_llegada = new javax.swing.JTextField();
        btn_eliminar = new javax.swing.JButton();
        JLB_fecha_llegada = new javax.swing.JLabel();
        JLB_fecha_salida = new javax.swing.JLabel();
        JLB_descipcion_retraso = new javax.swing.JLabel();
        JTF_descripcion_retraso = new javax.swing.JTextField();
        JTF_fecha_llegada = new javax.swing.JTextField();
        JTF_fecha_salida = new javax.swing.JTextField();
        JTF_hora_salida = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(34, 40, 49));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(253, 112, 20));
        jLabel4.setFont(new java.awt.Font("Helvetica", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Vuelos");
        jLabel4.setOpaque(true);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 80));

        JTF_identificacionT.setEditable(false);
        JTF_identificacionT.setBackground(new java.awt.Color(57, 62, 70));
        JTF_identificacionT.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        JTF_identificacionT.setForeground(new java.awt.Color(238, 238, 238));
        JTF_identificacionT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JTF_identificacionT.setBorder(null);
        JTF_identificacionT.setEnabled(false);
        JTF_identificacionT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTF_identificacionTActionPerformed(evt);
            }
        });
        jPanel1.add(JTF_identificacionT, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 200, 40));

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
        jPanel1.add(btn_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 430, 140, 40));

        jPanel2.setBackground(new java.awt.Color(57, 62, 70));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JTF_cod_vuelos.setBackground(new java.awt.Color(238, 238, 238));
        JTF_cod_vuelos.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        JTF_cod_vuelos.setForeground(new java.awt.Color(34, 40, 49));
        jPanel2.add(JTF_cod_vuelos, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 270, 40));

        JLB_cod_vuelos.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        JLB_cod_vuelos.setForeground(new java.awt.Color(238, 238, 238));
        JLB_cod_vuelos.setText("Codigo:");
        jPanel2.add(JLB_cod_vuelos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 150, 40));

        JLB_hora_salida.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        JLB_hora_salida.setForeground(new java.awt.Color(238, 238, 238));
        JLB_hora_salida.setText("Hora de salida :");
        jPanel2.add(JLB_hora_salida, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 150, 40));

        JLB_hora_estimada_S.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        JLB_hora_estimada_S.setForeground(new java.awt.Color(238, 238, 238));
        JLB_hora_estimada_S.setText("Hora estimada de salida :");
        jPanel2.add(JLB_hora_estimada_S, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 190, 40));

        JTF_hora_estimada_S.setBackground(new java.awt.Color(238, 238, 238));
        JTF_hora_estimada_S.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        JTF_hora_estimada_S.setForeground(new java.awt.Color(34, 40, 49));
        jPanel2.add(JTF_hora_estimada_S, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 270, 40));

        JTF_hora_estimada_LL.setBackground(new java.awt.Color(238, 238, 238));
        JTF_hora_estimada_LL.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        JTF_hora_estimada_LL.setForeground(new java.awt.Color(34, 40, 49));
        jPanel2.add(JTF_hora_estimada_LL, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 270, 40));

        JLB_hora_estimada_LL.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        JLB_hora_estimada_LL.setForeground(new java.awt.Color(238, 238, 238));
        JLB_hora_estimada_LL.setText("Hora estimada de llegada :");
        jPanel2.add(JLB_hora_estimada_LL, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 200, 40));

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
        jPanel2.add(btn_aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 580, 140, 40));

        JLB_hora_retraso.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        JLB_hora_retraso.setForeground(new java.awt.Color(238, 238, 238));
        JLB_hora_retraso.setText("Hora de retraso :");
        jPanel2.add(JLB_hora_retraso, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 150, 40));

        JTF_hora_retraso.setBackground(new java.awt.Color(238, 238, 238));
        JTF_hora_retraso.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        JTF_hora_retraso.setForeground(new java.awt.Color(34, 40, 49));
        jPanel2.add(JTF_hora_retraso, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, 270, 40));

        JLB_hora_llegada.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        JLB_hora_llegada.setForeground(new java.awt.Color(238, 238, 238));
        JLB_hora_llegada.setText("Hora de llegada :");
        jPanel2.add(JLB_hora_llegada, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 150, 40));

        JTF_hora_llegada.setBackground(new java.awt.Color(238, 238, 238));
        JTF_hora_llegada.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        JTF_hora_llegada.setForeground(new java.awt.Color(34, 40, 49));
        jPanel2.add(JTF_hora_llegada, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 270, 40));

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
        jPanel2.add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 580, 140, 40));

        JLB_fecha_llegada.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        JLB_fecha_llegada.setForeground(new java.awt.Color(238, 238, 238));
        JLB_fecha_llegada.setText("Fecha  de llegada :");
        jPanel2.add(JLB_fecha_llegada, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 150, 40));

        JLB_fecha_salida.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        JLB_fecha_salida.setForeground(new java.awt.Color(238, 238, 238));
        JLB_fecha_salida.setText("Fecha  de salida :");
        jPanel2.add(JLB_fecha_salida, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 500, 150, 40));

        JLB_descipcion_retraso.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        JLB_descipcion_retraso.setForeground(new java.awt.Color(238, 238, 238));
        JLB_descipcion_retraso.setText("Descripcion  del retraso :");
        jPanel2.add(JLB_descipcion_retraso, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 200, 40));

        JTF_descripcion_retraso.setBackground(new java.awt.Color(238, 238, 238));
        JTF_descripcion_retraso.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        JTF_descripcion_retraso.setForeground(new java.awt.Color(34, 40, 49));
        jPanel2.add(JTF_descripcion_retraso, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 380, 270, 40));

        JTF_fecha_llegada.setBackground(new java.awt.Color(238, 238, 238));
        JTF_fecha_llegada.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        JTF_fecha_llegada.setForeground(new java.awt.Color(34, 40, 49));
        jPanel2.add(JTF_fecha_llegada, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 440, 270, 40));

        JTF_fecha_salida.setBackground(new java.awt.Color(238, 238, 238));
        JTF_fecha_salida.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        JTF_fecha_salida.setForeground(new java.awt.Color(34, 40, 49));
        jPanel2.add(JTF_fecha_salida, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 500, 270, 40));

        JTF_hora_salida.setBackground(new java.awt.Color(238, 238, 238));
        JTF_hora_salida.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        JTF_hora_salida.setForeground(new java.awt.Color(34, 40, 49));
        jPanel2.add(JTF_hora_salida, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 270, 40));

        jScrollPane1.setViewportView(jPanel2);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 620, 250));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

  private void btn_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aceptarActionPerformed
    if(this.JTF_cod_vuelos.getText().equals("") || this.JTF_hora_salida.getText().equals("") || this.JTF_hora_llegada.getText().equals("") 
            || this.JTF_hora_estimada_S.getText().equals("") || this.JTF_hora_estimada_LL.getText().equals("") 
            || this.JTF_fecha_llegada.getText().equals("") || this.JTF_fecha_salida.getText().equals("")) {
      JOptionPane.showMessageDialog(null,"Llene todos los campos");
    } else {
      this.crudTransVuelos.insertarDatos(this.JTF_cod_vuelos.getText(), this.JTF_hora_salida.getText(), this.JTF_hora_llegada.getText()
              , this.JTF_hora_estimada_S.getText(), this.JTF_hora_estimada_LL.getText(), this.JTF_hora_retraso.getText()
              ,this.JTF_descripcion_retraso.getText(), this.JTF_fecha_llegada.getText(), this.JTF_fecha_salida.getText(),
              this.JTF_identificacionT.getText());
      /*this.JTF_cod_vuelos.setText("");
      this.JTF_hora_salida.setText("");
      this.JTF_hora_llegada.setText("");
      this.JTF_hora_estimada_S.setText("");
      this.JTF_hora_estimada_LL.setText("");
      this.JTF_hora_retraso.setText("");
      this.JTF_descripcion_retraso.setText("");
      this.JTF_fecha_llegada.setText("");
      this.JTF_fecha_salida.setText("");
      this.JTF_identificacionT.setText("");*/
    }
  }//GEN-LAST:event_btn_aceptarActionPerformed

  private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
    this.dispose();
  }//GEN-LAST:event_btn_cancelarActionPerformed

  private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
    if(this.JTF_cod_vuelos.getText().equals("")) {
      JOptionPane.showMessageDialog(null,"Seleccione un vuelo");
    } else {
      this.crudTransVuelos.eliminarDatos(this.JTF_cod_vuelos.getText(), this.JTF_identificacionT.getText());
      this.JTF_cod_vuelos.setText("");
      this.JTF_hora_salida.setText("");
      this.JTF_hora_llegada.setText("");
      this.JTF_hora_estimada_S.setText("");
      this.JTF_hora_estimada_LL.setText("");
      this.JTF_hora_retraso.setText("");
      this.JTF_descripcion_retraso.setText("");
      this.JTF_fecha_llegada.setText("");
      this.JTF_fecha_salida.setText("");
      this.JTF_identificacionT.setText("");
    }
  }//GEN-LAST:event_btn_eliminarActionPerformed

    private void JTF_identificacionTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTF_identificacionTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTF_identificacionTActionPerformed

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
      java.util.logging.Logger.getLogger(VTransVuelos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(VTransVuelos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(VTransVuelos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(VTransVuelos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new VTransVuelos().setVisible(true);
      }
    });
  }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLB_cod_vuelos;
    private javax.swing.JLabel JLB_descipcion_retraso;
    private javax.swing.JLabel JLB_fecha_llegada;
    private javax.swing.JLabel JLB_fecha_salida;
    private javax.swing.JLabel JLB_hora_estimada_LL;
    private javax.swing.JLabel JLB_hora_estimada_S;
    private javax.swing.JLabel JLB_hora_llegada;
    private javax.swing.JLabel JLB_hora_retraso;
    private javax.swing.JLabel JLB_hora_salida;
    private javax.swing.JTextField JTF_cod_vuelos;
    private javax.swing.JTextField JTF_descripcion_retraso;
    private javax.swing.JTextField JTF_fecha_llegada;
    private javax.swing.JTextField JTF_fecha_salida;
    private javax.swing.JTextField JTF_hora_estimada_LL;
    private javax.swing.JTextField JTF_hora_estimada_S;
    private javax.swing.JTextField JTF_hora_llegada;
    private javax.swing.JTextField JTF_hora_retraso;
    private javax.swing.JTextField JTF_hora_salida;
    private javax.swing.JTextField JTF_identificacionT;
    private javax.swing.JButton btn_aceptar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
