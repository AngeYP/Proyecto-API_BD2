package Deliverys;

import CRUD.CRUDEmpleadoPaq;
import Conexion.Conexion;

public class VEmpleadoPaq extends javax.swing.JFrame {

  Conexion conexion = new Conexion();
  CRUDEmpleadoPaq CRUDPaq = new CRUDEmpleadoPaq(conexion.conectar());
  String codEncomienda;
  String ciTransportista;
  public VEmpleadoPaq() {
    initComponents();
  }
  
  public VEmpleadoPaq(String CodEncom, String CITrans) {
    initComponents();
    codEncomienda = CodEncom;
    ciTransportista = CITrans;
    this.tf_encomienda.setText(codEncomienda);
    this.CRUDPaq.comboboxCodPaquetes(cb_codigo, codEncomienda);
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
        btn_eliminar = new javax.swing.JButton();
        tf_encomienda = new javax.swing.JTextField();
        btn_aceptar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tf_peso = new javax.swing.JTextField();
        tf_ancho = new javax.swing.JTextField();
        tf_alto = new javax.swing.JTextField();
        tf_profundidad = new javax.swing.JTextField();
        cb_codigo = new javax.swing.JComboBox<>();
        btn_articulos = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(34, 40, 49));
        jPanel1.setMaximumSize(new java.awt.Dimension(1080, 720));
        jPanel1.setMinimumSize(new java.awt.Dimension(1080, 720));
        jPanel1.setPreferredSize(new java.awt.Dimension(1080, 720));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(253, 112, 20));
        jLabel1.setFont(new java.awt.Font("Helvetica", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(238, 238, 238));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Agregar paquete");
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 80));

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
        jPanel1.add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 660, 140, 40));

        tf_encomienda.setBackground(new java.awt.Color(57, 62, 70));
        tf_encomienda.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        tf_encomienda.setForeground(new java.awt.Color(238, 238, 238));
        tf_encomienda.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_encomienda.setEnabled(false);
        jPanel1.add(tf_encomienda, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 290, 40));

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
        jPanel1.add(btn_aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 660, 140, 40));

        jPanel2.setBackground(new java.awt.Color(57, 62, 70));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(238, 238, 238));
        jLabel2.setText("Codigo:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 250, 40));

        jLabel3.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(238, 238, 238));
        jLabel3.setText("Peso:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 250, 40));

        jLabel4.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(238, 238, 238));
        jLabel4.setText("Ancho:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 250, 40));

        jLabel5.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(238, 238, 238));
        jLabel5.setText("Alto:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 250, 40));

        jLabel6.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(238, 238, 238));
        jLabel6.setText("Profundidad");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 250, 40));

        tf_peso.setBackground(new java.awt.Color(238, 238, 238));
        tf_peso.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        tf_peso.setForeground(new java.awt.Color(34, 40, 49));
        jPanel2.add(tf_peso, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, 300, 40));

        tf_ancho.setBackground(new java.awt.Color(238, 238, 238));
        tf_ancho.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        tf_ancho.setForeground(new java.awt.Color(34, 40, 49));
        jPanel2.add(tf_ancho, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, 300, 40));

        tf_alto.setBackground(new java.awt.Color(238, 238, 238));
        tf_alto.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        tf_alto.setForeground(new java.awt.Color(34, 40, 49));
        jPanel2.add(tf_alto, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, 300, 40));

        tf_profundidad.setBackground(new java.awt.Color(238, 238, 238));
        tf_profundidad.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        tf_profundidad.setForeground(new java.awt.Color(34, 40, 49));
        jPanel2.add(tf_profundidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, 300, 40));

        cb_codigo.setBackground(new java.awt.Color(238, 238, 238));
        cb_codigo.setEditable(true);
        cb_codigo.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        cb_codigo.setForeground(new java.awt.Color(34, 40, 49));
        cb_codigo.setRequestFocusEnabled(true);
        cb_codigo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_codigoItemStateChanged(evt);
            }
        });
        cb_codigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cb_codigoMouseClicked(evt);
            }
        });
        jPanel2.add(cb_codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, 300, 40));

        btn_articulos.setBackground(new java.awt.Color(253, 112, 20));
        btn_articulos.setFont(new java.awt.Font("Helvetica", 1, 17)); // NOI18N
        btn_articulos.setForeground(new java.awt.Color(238, 238, 238));
        btn_articulos.setText("Artículos");
        btn_articulos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(253, 112, 20)));
        btn_articulos.setBorderPainted(false);
        btn_articulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_articulosActionPerformed(evt);
            }
        });
        jPanel2.add(btn_articulos, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 330, 140, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 780, 390));

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
        jPanel1.add(btn_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 660, 140, 40));

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

  private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
    if(this.cb_codigo.getSelectedIndex()>0){
      this.CRUDPaq.eliminarDatos(codEncomienda, this.cb_codigo.getSelectedItem().toString());
    }
  }//GEN-LAST:event_btn_eliminarActionPerformed

  private void btn_articulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_articulosActionPerformed
    new VEmpleadoArt(ciTransportista,codEncomienda,this.cb_codigo.getSelectedItem().toString()).setVisible(true);
  }//GEN-LAST:event_btn_articulosActionPerformed

  private void btn_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aceptarActionPerformed
    if(!this.cb_codigo.getSelectedItem().toString().equals("Seleccione una opcion")){
      
      this.CRUDPaq.insertarDatos(codEncomienda, this.cb_codigo.getSelectedItem().toString(), this.tf_peso.getText(), this.tf_alto.getText(), this.tf_ancho.getText(), this.tf_profundidad.getText());
    }
  }//GEN-LAST:event_btn_aceptarActionPerformed

  private void cb_codigoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_codigoItemStateChanged
    if(this.cb_codigo.getSelectedIndex()>0){
      Float[] datosPaq = new Float[4];
      datosPaq=this.CRUDPaq.buscarPaq(this.cb_codigo.getSelectedItem().toString(), codEncomienda);
      this.tf_peso.setText(datosPaq[0].toString());
      this.tf_alto.setText(datosPaq[1].toString());
      this.tf_ancho.setText(datosPaq[2].toString());
      this.tf_profundidad.setText(datosPaq[3].toString());
    }
  }//GEN-LAST:event_cb_codigoItemStateChanged

  private void cb_codigoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cb_codigoMouseClicked
    if(!this.cb_codigo.getSelectedItem().toString().equals("Seleccione una opcion")){
        this.cb_codigo.setSelectedItem("");
    }
  }//GEN-LAST:event_cb_codigoMouseClicked

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
      java.util.logging.Logger.getLogger(VEmpleadoPaq.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(VEmpleadoPaq.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(VEmpleadoPaq.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(VEmpleadoPaq.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new VEmpleadoPaq().setVisible(true);
      }
    });
  }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_aceptar;
    private javax.swing.JButton btn_articulos;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JComboBox<String> cb_codigo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField tf_alto;
    private javax.swing.JTextField tf_ancho;
    private javax.swing.JTextField tf_encomienda;
    private javax.swing.JTextField tf_peso;
    private javax.swing.JTextField tf_profundidad;
    // End of variables declaration//GEN-END:variables
}
