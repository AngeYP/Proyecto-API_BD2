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
    CRUDEmpleadoMenu crudEpmMenu = new CRUDEmpleadoMenu(conexion.conectar());

    String cedulaE;

    public VEmpleadoMenu() {
        initComponents();
        this.JTF_identificacionE_B.setText(cedulaE);
        datosEmp();
    }

    public VEmpleadoMenu(String cedulaEmp) {
        initComponents();
        cedulaE = cedulaEmp;
        this.JTF_identificacionE_B.setText(cedulaE);
        datosEmp();
    }

    public void datosEmp() {
        if (!(this.JTF_identificacionE_B.getText().equals(""))) {

            String[] datosEmp = crudEpmMenu.buscarEmpleado(this.JTF_identificacionE_B.getText());
            this.JTF_identificacionE.setText(datosEmp[0]);
            this.JTF_nombreE.setText(datosEmp[1]);
            this.JTF_apellidoE.setText(datosEmp[2]);
            this.JTF_emailE.setText(datosEmp[3]);
            this.JTF_telefono1E.setText(datosEmp[4]);
            this.JTF_telefono2E.setText(datosEmp[5]);
            this.JTF_cod_nucleos.setText(datosEmp[6]);
            
        } else {
            JOptionPane.showMessageDialog(null, "Por favor rellene los campos faltantes", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
        //this.JTF_identificacionE_B.setEditable(false);
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
        JTF_indentificacionE = new javax.swing.JLabel();
        JLB_nombreE = new javax.swing.JLabel();
        JLB_cod_nucleos = new javax.swing.JLabel();
        JTF_identificacionE = new javax.swing.JTextField();
        JTF_nombreE = new javax.swing.JTextField();
        JTF_cod_nucleos = new javax.swing.JTextField();
        JLB_apellidoE = new javax.swing.JLabel();
        JLB_emailE = new javax.swing.JLabel();
        JLB_telefono1E = new javax.swing.JLabel();
        JLB_telefono2 = new javax.swing.JLabel();
        JTF_apellidoE = new javax.swing.JTextField();
        JTF_emailE = new javax.swing.JTextField();
        JTF_telefono1E = new javax.swing.JTextField();
        JTF_telefono2E = new javax.swing.JTextField();
        JTF_identificacionE_B = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btn_eliminar = new javax.swing.JButton();
        btn_aceptar = new javax.swing.JButton();
        btn_actualizar = new javax.swing.JButton();

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

        JTF_indentificacionE.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        JTF_indentificacionE.setForeground(new java.awt.Color(238, 238, 238));
        JTF_indentificacionE.setText("Cédula :");
        jPanel4.add(JTF_indentificacionE, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 290, 40));

        JLB_nombreE.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        JLB_nombreE.setForeground(new java.awt.Color(238, 238, 238));
        JLB_nombreE.setText("Nombre :");
        jPanel4.add(JLB_nombreE, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 290, 40));

        JLB_cod_nucleos.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        JLB_cod_nucleos.setForeground(new java.awt.Color(238, 238, 238));
        JLB_cod_nucleos.setText("Nucleos :");
        jPanel4.add(JLB_cod_nucleos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 290, 40));

        JTF_identificacionE.setBackground(new java.awt.Color(238, 238, 238));
        JTF_identificacionE.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        JTF_identificacionE.setForeground(new java.awt.Color(34, 40, 49));
        jPanel4.add(JTF_identificacionE, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 320, 40));

        JTF_nombreE.setBackground(new java.awt.Color(238, 238, 238));
        JTF_nombreE.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        JTF_nombreE.setForeground(new java.awt.Color(34, 40, 49));
        jPanel4.add(JTF_nombreE, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, 320, 40));

        JTF_cod_nucleos.setBackground(new java.awt.Color(238, 238, 238));
        JTF_cod_nucleos.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        JTF_cod_nucleos.setForeground(new java.awt.Color(34, 40, 49));
        jPanel4.add(JTF_cod_nucleos, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 380, 320, 40));

        JLB_apellidoE.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        JLB_apellidoE.setForeground(new java.awt.Color(238, 238, 238));
        JLB_apellidoE.setText("Apellido :");
        jPanel4.add(JLB_apellidoE, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 290, 40));

        JLB_emailE.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        JLB_emailE.setForeground(new java.awt.Color(238, 238, 238));
        JLB_emailE.setText("Email :");
        jPanel4.add(JLB_emailE, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 290, 40));

        JLB_telefono1E.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        JLB_telefono1E.setForeground(new java.awt.Color(238, 238, 238));
        JLB_telefono1E.setText("Teléfono 1 :");
        jPanel4.add(JLB_telefono1E, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 290, 40));

        JLB_telefono2.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        JLB_telefono2.setForeground(new java.awt.Color(238, 238, 238));
        JLB_telefono2.setText("Teléfono 2 :");
        jPanel4.add(JLB_telefono2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 290, 40));

        JTF_apellidoE.setBackground(new java.awt.Color(238, 238, 238));
        JTF_apellidoE.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        JTF_apellidoE.setForeground(new java.awt.Color(34, 40, 49));
        jPanel4.add(JTF_apellidoE, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 320, 40));

        JTF_emailE.setBackground(new java.awt.Color(238, 238, 238));
        JTF_emailE.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        JTF_emailE.setForeground(new java.awt.Color(34, 40, 49));
        jPanel4.add(JTF_emailE, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 320, 40));

        JTF_telefono1E.setBackground(new java.awt.Color(238, 238, 238));
        JTF_telefono1E.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        JTF_telefono1E.setForeground(new java.awt.Color(34, 40, 49));
        jPanel4.add(JTF_telefono1E, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 320, 40));

        JTF_telefono2E.setBackground(new java.awt.Color(238, 238, 238));
        JTF_telefono2E.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        JTF_telefono2E.setForeground(new java.awt.Color(34, 40, 49));
        jPanel4.add(JTF_telefono2E, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 320, 320, 40));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 740, 490));

        JTF_identificacionE_B.setBackground(new java.awt.Color(57, 62, 70));
        JTF_identificacionE_B.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        JTF_identificacionE_B.setForeground(new java.awt.Color(238, 238, 238));
        JTF_identificacionE_B.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JTF_identificacionE_B.setText("Cedula de Empleado");
        JTF_identificacionE_B.setBorder(null);
        jPanel1.add(JTF_identificacionE_B, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, 310, 40));

        btn_buscar.setBackground(new java.awt.Color(57, 62, 70));
        btn_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/lupa1.png"))); // NOI18N
        btn_buscar.setBorderPainted(false);
        btn_buscar.setFocusPainted(false);
        btn_buscar.setFocusable(false);
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 20, 40, 40));

        jPanel3.setBackground(new java.awt.Color(57, 62, 70));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_eliminar.setBackground(new java.awt.Color(253, 112, 20));
        btn_eliminar.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        btn_eliminar.setForeground(new java.awt.Color(238, 238, 238));
        btn_eliminar.setText("Eliminar");
        btn_eliminar.setEnabled(false);
        btn_eliminar.setFocusPainted(false);
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });
        jPanel3.add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 130, 40));

        btn_aceptar.setBackground(new java.awt.Color(253, 112, 20));
        btn_aceptar.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        btn_aceptar.setForeground(new java.awt.Color(238, 238, 238));
        btn_aceptar.setText("Aceptar");
        btn_aceptar.setFocusPainted(false);
        btn_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aceptarActionPerformed(evt);
            }
        });
        jPanel3.add(btn_aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 130, 40));

        btn_actualizar.setBackground(new java.awt.Color(253, 112, 20));
        btn_actualizar.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        btn_actualizar.setForeground(new java.awt.Color(238, 238, 238));
        btn_actualizar.setText("Actualizar");
        btn_actualizar.setEnabled(false);
        btn_actualizar.setFocusPainted(false);
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });
        jPanel3.add(btn_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 130, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 620, 490, 80));

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

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        String[] datosEmpleado = new String[7];
        datosEmpleado = this.crudEpmMenu.buscarEmpleado(this.JTF_identificacionE_B.getText());
        if (!datosEmpleado[0].equals(null)) {
            this.JTF_identificacionE.setText(datosEmpleado[0]);
            this.JTF_nombreE.setText(datosEmpleado[1]);
            this.JTF_apellidoE.setText(datosEmpleado[2]);
            this.JTF_emailE.setText(datosEmpleado[3]);
            this.JTF_telefono1E.setText(datosEmpleado[4]);
            this.JTF_telefono2E.setText(datosEmpleado[5]);
            this.JTF_cod_nucleos.setText(datosEmpleado[6]);
            this.btn_actualizar.setEnabled(true);
            this.btn_eliminar.setEnabled(true);
            this.btn_aceptar.setEnabled(false);
            this.JTF_identificacionE_B.setEnabled(false);
        } else {
            JOptionPane.showMessageDialog(null, "Empleado no encontrado");
        }
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        this.crudEpmMenu.eliminarRegistro(this.JTF_identificacionE_B.getText());
        this.JTF_identificacionE_B.setText("Cedula de Empleado");
        this.JTF_identificacionE.setText("");
        this.JTF_identificacionE.setEnabled(true);
        this.JTF_nombreE.setText("");
        this.JTF_apellidoE.setText("");
        this.JTF_emailE.setText("");
        this.JTF_telefono1E.setText("");
        this.JTF_telefono2E.setText("");
        this.JTF_cod_nucleos.setText("");
        this.btn_actualizar.setEnabled(false);
        this.btn_eliminar.setEnabled(false);
        this.btn_aceptar.setEnabled(true);
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aceptarActionPerformed

        if (this.JTF_identificacionE.getText().equals("") && this.JTF_nombreE.getText().equals("") && this.JTF_apellidoE.getText().equals("") && this.JTF_emailE.getText().equals("") && this.JTF_telefono1E.getText().equals("") && this.JTF_telefono2E.getText().equals("") && this.JTF_cod_nucleos.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Llene todos los campos");
        }
        this.crudEpmMenu.insertarDatos(this.JTF_identificacionE.getText(), this.JTF_nombreE.getText(), this.JTF_apellidoE.getText(), this.JTF_emailE.getText(), this.JTF_telefono1E.getText(),
                this.JTF_telefono2E.getText(), this.JTF_cod_nucleos.getText());
    }//GEN-LAST:event_btn_aceptarActionPerformed

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed

        if (this.JTF_identificacionE.getText().equals("") && this.JTF_nombreE.getText().equals("") && this.JTF_apellidoE.getText().equals("") && this.JTF_emailE.getText().equals("") && this.JTF_telefono1E.getText().equals("") && this.JTF_telefono2E.getText().equals("") && this.JTF_cod_nucleos.getText().equals("") ) {
            JOptionPane.showMessageDialog(null, "Llene todos los campos");
        }
        this.crudEpmMenu.actualizarDatos(this.JTF_identificacionE.getText(), this.JTF_nombreE.getText(), this.JTF_apellidoE.getText(), this.JTF_emailE.getText(), this.JTF_telefono1E.getText(),
                this.JTF_telefono2E.getText(), JTF_cod_nucleos.getText());
    }//GEN-LAST:event_btn_actualizarActionPerformed

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
    private javax.swing.JLabel JLB_apellidoE;
    private javax.swing.JLabel JLB_cod_nucleos;
    private javax.swing.JLabel JLB_emailE;
    private javax.swing.JLabel JLB_nombreE;
    private javax.swing.JLabel JLB_telefono1E;
    private javax.swing.JLabel JLB_telefono2;
    private javax.swing.JTextField JTF_apellidoE;
    private javax.swing.JTextField JTF_cod_nucleos;
    private javax.swing.JTextField JTF_emailE;
    private javax.swing.JTextField JTF_identificacionE;
    private javax.swing.JTextField JTF_identificacionE_B;
    private javax.swing.JLabel JTF_indentificacionE;
    private javax.swing.JTextField JTF_nombreE;
    private javax.swing.JTextField JTF_telefono1E;
    private javax.swing.JTextField JTF_telefono2E;
    private javax.swing.JButton btn_aceptar;
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_clientes;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_encomiendas;
    private javax.swing.JButton btn_transportista;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
