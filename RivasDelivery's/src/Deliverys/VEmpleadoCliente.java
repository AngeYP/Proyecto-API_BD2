/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deliverys;

import CRUD.CRUDBase;
import CRUD.CRUDEmpleadoCliente;
import Conexion.Conexion;
import javax.swing.JOptionPane;
import static Deliverys.VIniciarSesion.cedula;

public class VEmpleadoCliente extends javax.swing.JFrame {

    Conexion conexion = new Conexion();
    CRUDBase datosBase = new CRUDBase(conexion.conectar());
    CRUDEmpleadoCliente CRUDCliente = new CRUDEmpleadoCliente(conexion.conectar());

    public VEmpleadoCliente() {
        initComponents();
        this.datosBase.comboboxPaises(cb_pais);
    }

    /*public VEmpleadoCliente(String cedulaEmp) {
    initComponents();
    cedulaE = cedulaEmp;
    this.datosBase.comboboxPaises(cb_pais);
  }*/
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    buttonGroup1 = new javax.swing.ButtonGroup();
    jPanel1 = new javax.swing.JPanel();
    jPanel2 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    btn_clientes = new javax.swing.JButton();
    btn_transportistas = new javax.swing.JButton();
    btn_encomiendas = new javax.swing.JButton();
    btn_salir = new javax.swing.JButton();
    tf_identificacionC = new javax.swing.JTextField();
    btn_buscar = new javax.swing.JButton();
    jPanel3 = new javax.swing.JPanel();
    btn_eliminar = new javax.swing.JButton();
    btn_aceptar = new javax.swing.JButton();
    btn_actualizar = new javax.swing.JButton();
    jScrollPane2 = new javax.swing.JScrollPane();
    jPanel4 = new javax.swing.JPanel();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    jLabel6 = new javax.swing.JLabel();
    jLabel7 = new javax.swing.JLabel();
    jLabel8 = new javax.swing.JLabel();
    tf_identificacion = new javax.swing.JTextField();
    tf_nombre = new javax.swing.JTextField();
    tf_apellido = new javax.swing.JTextField();
    tf_email = new javax.swing.JTextField();
    tf_telefono = new javax.swing.JTextField();
    tf_saldo = new javax.swing.JTextField();
    btn_recargar = new javax.swing.JButton();
    jLabel9 = new javax.swing.JLabel();
    cb_ciudad = new javax.swing.JComboBox<>();
    cb_pais = new javax.swing.JComboBox<>();
    cb_estado = new javax.swing.JComboBox();
    rbtn_nacional = new javax.swing.JRadioButton();
    rbtn_internacional = new javax.swing.JRadioButton();
    jLabel10 = new javax.swing.JLabel();
    tf_telefonosecu = new javax.swing.JTextField();

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
    jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        jLabel1MouseClicked(evt);
      }
    });
    jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 80));

    btn_clientes.setBackground(new java.awt.Color(253, 112, 20));
    btn_clientes.setFont(new java.awt.Font("Helvetica", 1, 18)); // NOI18N
    btn_clientes.setForeground(new java.awt.Color(34, 40, 49));
    btn_clientes.setText("Clientes");
    btn_clientes.setBorderPainted(false);
    btn_clientes.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btn_clientesActionPerformed(evt);
      }
    });
    jPanel2.add(btn_clientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 180, 60));

    btn_transportistas.setBackground(new java.awt.Color(253, 112, 20));
    btn_transportistas.setFont(new java.awt.Font("Helvetica", 1, 18)); // NOI18N
    btn_transportistas.setForeground(new java.awt.Color(238, 238, 238));
    btn_transportistas.setText("Transportistas");
    btn_transportistas.setBorderPainted(false);
    btn_transportistas.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btn_transportistasActionPerformed(evt);
      }
    });
    jPanel2.add(btn_transportistas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 180, 60));

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

    btn_salir.setBackground(new java.awt.Color(204, 0, 0));
    btn_salir.setFont(new java.awt.Font("Helvetica", 1, 18)); // NOI18N
    btn_salir.setForeground(new java.awt.Color(238, 238, 238));
    btn_salir.setText("Salir");
    btn_salir.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btn_salirActionPerformed(evt);
      }
    });
    jPanel2.add(btn_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 660, 180, 60));

    jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 720));

    tf_identificacionC.setBackground(new java.awt.Color(57, 62, 70));
    tf_identificacionC.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
    tf_identificacionC.setForeground(new java.awt.Color(238, 238, 238));
    tf_identificacionC.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    tf_identificacionC.setText("Cedula");
    tf_identificacionC.setBorder(null);
    tf_identificacionC.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    tf_identificacionC.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        clearText(evt);
      }
    });
    jPanel1.add(tf_identificacionC, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 310, 40));

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
    jPanel1.add(btn_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 20, 40, 40));

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

    jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 620, 490, 80));

    jPanel4.setBackground(new java.awt.Color(57, 62, 70));
    jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jLabel2.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
    jLabel2.setForeground(new java.awt.Color(238, 238, 238));
    jLabel2.setText("Identificación:");
    jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 290, 40));

    jLabel3.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
    jLabel3.setForeground(new java.awt.Color(238, 238, 238));
    jLabel3.setText("Nacionalidad:");
    jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 290, 40));

    jLabel4.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
    jLabel4.setForeground(new java.awt.Color(238, 238, 238));
    jLabel4.setText("Nombre:");
    jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 290, 40));

    jLabel5.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
    jLabel5.setForeground(new java.awt.Color(238, 238, 238));
    jLabel5.setText("Apellido:");
    jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 290, 40));

    jLabel6.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
    jLabel6.setForeground(new java.awt.Color(238, 238, 238));
    jLabel6.setText("Correo electrónico:");
    jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 290, 40));

    jLabel7.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
    jLabel7.setForeground(new java.awt.Color(238, 238, 238));
    jLabel7.setText("Teléfono:");
    jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 290, 40));

    jLabel8.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
    jLabel8.setForeground(new java.awt.Color(238, 238, 238));
    jLabel8.setText("Saldo:");
    jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 290, 40));

    tf_identificacion.setBackground(new java.awt.Color(238, 238, 238));
    tf_identificacion.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
    tf_identificacion.setForeground(new java.awt.Color(34, 40, 49));
    jPanel4.add(tf_identificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 320, 40));

    tf_nombre.setBackground(new java.awt.Color(238, 238, 238));
    tf_nombre.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
    tf_nombre.setForeground(new java.awt.Color(34, 40, 49));
    jPanel4.add(tf_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 320, 40));

    tf_apellido.setBackground(new java.awt.Color(238, 238, 238));
    tf_apellido.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
    tf_apellido.setForeground(new java.awt.Color(34, 40, 49));
    jPanel4.add(tf_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 320, 40));

    tf_email.setBackground(new java.awt.Color(238, 238, 238));
    tf_email.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
    tf_email.setForeground(new java.awt.Color(34, 40, 49));
    jPanel4.add(tf_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 320, 40));

    tf_telefono.setBackground(new java.awt.Color(238, 238, 238));
    tf_telefono.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
    tf_telefono.setForeground(new java.awt.Color(34, 40, 49));
    jPanel4.add(tf_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 320, 320, 40));

    tf_saldo.setEditable(false);
    tf_saldo.setBackground(new java.awt.Color(238, 238, 238));
    tf_saldo.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
    tf_saldo.setForeground(new java.awt.Color(34, 40, 49));
    tf_saldo.setText("0");
    tf_saldo.setEnabled(false);
    jPanel4.add(tf_saldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 440, 320, 40));

    btn_recargar.setBackground(new java.awt.Color(253, 112, 20));
    btn_recargar.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
    btn_recargar.setForeground(new java.awt.Color(238, 238, 238));
    btn_recargar.setText("Recargar");
    btn_recargar.setFocusPainted(false);
    btn_recargar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btn_recargarActionPerformed(evt);
      }
    });
    jPanel4.add(btn_recargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 620, 170, 40));

    jLabel9.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
    jLabel9.setForeground(new java.awt.Color(238, 238, 238));
    jLabel9.setText("Dirección:");
    jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 290, 40));

    cb_ciudad.setBackground(new java.awt.Color(238, 238, 238));
    cb_ciudad.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
    cb_ciudad.setForeground(new java.awt.Color(34, 40, 49));
    cb_ciudad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Primero seleccione un Estado..." }));
    cb_ciudad.setEnabled(false);
    jPanel4.add(cb_ciudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 560, 320, 40));

    cb_pais.setBackground(new java.awt.Color(238, 238, 238));
    cb_pais.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
    cb_pais.setForeground(new java.awt.Color(34, 40, 49));
    cb_pais.addItemListener(new java.awt.event.ItemListener() {
      public void itemStateChanged(java.awt.event.ItemEvent evt) {
        cb_paisItemStateChanged(evt);
      }
    });
    cb_pais.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        cb_paisActionPerformed(evt);
      }
    });
    jPanel4.add(cb_pais, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 500, 320, 40));

    cb_estado.setBackground(new java.awt.Color(238, 238, 238));
    cb_estado.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
    cb_estado.setForeground(new java.awt.Color(34, 40, 49));
    cb_estado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Primero seleccione un Pais..." }));
    cb_estado.setEnabled(false);
    cb_estado.addItemListener(new java.awt.event.ItemListener() {
      public void itemStateChanged(java.awt.event.ItemEvent evt) {
        cb_estadoItemStateChanged(evt);
      }
    });
    cb_estado.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        cb_estadoActionPerformed(evt);
      }
    });
    jPanel4.add(cb_estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, 320, 40));

    rbtn_nacional.setBackground(new java.awt.Color(57, 62, 70));
    buttonGroup1.add(rbtn_nacional);
    rbtn_nacional.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
    rbtn_nacional.setForeground(new java.awt.Color(238, 238, 238));
    rbtn_nacional.setText("Nacional");
    rbtn_nacional.setBorder(null);
    jPanel4.add(rbtn_nacional, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, -1, 40));

    rbtn_internacional.setBackground(new java.awt.Color(57, 62, 70));
    buttonGroup1.add(rbtn_internacional);
    rbtn_internacional.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
    rbtn_internacional.setForeground(new java.awt.Color(238, 238, 238));
    rbtn_internacional.setText("Extranjero");
    rbtn_internacional.setBorder(null);
    jPanel4.add(rbtn_internacional, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 80, -1, 40));

    jLabel10.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
    jLabel10.setForeground(new java.awt.Color(238, 238, 238));
    jLabel10.setText("Telefono secundario:");
    jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 290, 40));

    tf_telefonosecu.setBackground(new java.awt.Color(238, 238, 238));
    tf_telefonosecu.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
    tf_telefonosecu.setForeground(new java.awt.Color(34, 40, 49));
    tf_telefonosecu.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        tf_telefonosecuActionPerformed(evt);
      }
    });
    jPanel4.add(tf_telefonosecu, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 380, 320, 40));

    jScrollPane2.setViewportView(jPanel4);

    jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 770, 520));

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

  private void btn_clientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clientesActionPerformed
      this.tf_identificacionC.setText("Cedula");
      this.tf_identificacion.setText("");
      this.tf_identificacion.setEnabled(true);
      this.rbtn_nacional.setSelected(false);
      this.rbtn_internacional.setSelected(false);
      this.datosBase.comboboxPaises(this.cb_pais);
      this.tf_nombre.setText("");
      this.tf_apellido.setText("");
      this.tf_email.setText("");
      this.tf_saldo.setText("0");
      this.tf_telefono.setText("");
      this.tf_telefonosecu.setText("");
      this.btn_recargar.setEnabled(false);
      this.btn_actualizar.setEnabled(false);
      this.btn_eliminar.setEnabled(false);
      this.btn_aceptar.setEnabled(true);
  }//GEN-LAST:event_btn_clientesActionPerformed

  private void clearText(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearText
      if (this.tf_identificacionC.getText().equals("Cedula")) {
          this.tf_identificacionC.setText("");
      }
  }//GEN-LAST:event_clearText

  private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
      String[] datosCliente = new String[11];
      datosCliente = this.CRUDCliente.buscarCliente(this.tf_identificacionC.getText());
      if (!(datosCliente[0] == null)) {
          this.tf_identificacion.setText(datosCliente[0]);
          if (datosCliente[1].equals("N")) {
              this.rbtn_nacional.setSelected(true);
          } else if (datosCliente[1].equals("E")) {
              this.rbtn_internacional.setSelected(true);
          }
          this.tf_nombre.setText(datosCliente[2]);
          this.tf_apellido.setText(datosCliente[3]);
          this.tf_email.setText(datosCliente[4]);
          this.tf_telefono.setText(datosCliente[5]);
          this.tf_telefonosecu.setText(datosCliente[6]);
          this.tf_saldo.setText(datosCliente[7]);
          this.btn_actualizar.setEnabled(true);
          this.btn_eliminar.setEnabled(true);
          this.btn_recargar.setEnabled(true);
          this.btn_aceptar.setEnabled(false);
          this.tf_identificacion.setEnabled(false);
          this.cb_pais.setSelectedItem(this.datosBase.buscarNombPais(datosCliente[10]));
          this.cb_estado.setSelectedItem(this.datosBase.buscarNombEstado(datosCliente[10], datosCliente[9]));
          this.cb_ciudad.setSelectedItem(this.datosBase.buscarNombCiudad(datosCliente[10], datosCliente[9], datosCliente[8]));
      } else {
          JOptionPane.showMessageDialog(null, "Cliente no encontrado");
      }
  }//GEN-LAST:event_btn_buscarActionPerformed

  private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
      String CodPais = this.datosBase.buscarCodPais(this.cb_pais.getSelectedItem().toString());
      String CodEstado = this.datosBase.buscarCodEstado(this.cb_estado.getSelectedItem().toString(), CodPais);
      String CodCiudad = this.datosBase.buscarCodCiudad(CodPais, CodEstado, this.cb_ciudad.getSelectedItem().toString());
      char Naci = ' ';
      if (this.rbtn_nacional.isSelected()) {
          Naci = 'N';
      } else if (this.rbtn_nacional.isSelected()) {
          Naci = 'E';
      }

      if (this.tf_identificacion.getText().equals("") && Naci == ' ' && this.tf_nombre.getText().equals("") && this.tf_apellido.getText().equals("") && this.tf_email.getText().equals("") && this.tf_telefono.getText().equals("") && CodPais.equals("") && CodEstado.equals("") && CodCiudad.equals("")) {
          JOptionPane.showMessageDialog(null, "Llene todos los campos");
      }
      this.CRUDCliente.actualizarDatos(this.tf_identificacion.getText(), Naci, this.tf_nombre.getText(), this.tf_apellido.getText(), this.tf_email.getText(), this.tf_telefono.getText(),
              this.tf_telefonosecu.getText(), CodPais, CodEstado, CodCiudad);
  }//GEN-LAST:event_btn_actualizarActionPerformed

  private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
      this.CRUDCliente.eliminarRegistro(this.tf_identificacion.getText());
      this.tf_identificacionC.setText("Cedula");
      this.tf_identificacion.setText("");
      this.tf_identificacion.setEnabled(true);
      this.rbtn_nacional.setSelected(false);
      this.rbtn_internacional.setSelected(false);
      this.datosBase.comboboxPaises(this.cb_pais);
      this.tf_nombre.setText("");
      this.tf_apellido.setText("");
      this.tf_email.setText("");
      this.tf_saldo.setText("0");
      this.tf_telefono.setText("");
      this.tf_telefonosecu.setText("");
      this.btn_recargar.setEnabled(false);
      this.btn_actualizar.setEnabled(false);
      this.btn_eliminar.setEnabled(false);
      this.btn_aceptar.setEnabled(true);
  }//GEN-LAST:event_btn_eliminarActionPerformed

  private void cb_paisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_paisActionPerformed
  }//GEN-LAST:event_cb_paisActionPerformed

  private void cb_estadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_estadoActionPerformed

  }//GEN-LAST:event_cb_estadoActionPerformed

  private void btn_recargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_recargarActionPerformed
      if (!this.tf_identificacion.getText().equals(""))
          new VEmpleadoRecarga(this.tf_identificacion.getText()).setVisible(true);
      else {
          JOptionPane.showMessageDialog(null, "Busque al cliente antes de proseguir");
      }
  }//GEN-LAST:event_btn_recargarActionPerformed

  private void btn_encomiendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_encomiendasActionPerformed
      new VEmpleadoEncom().setVisible(true);
      this.dispose();
  }//GEN-LAST:event_btn_encomiendasActionPerformed

  private void cb_paisItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_paisItemStateChanged
      String paisito = this.datosBase.buscarCodPais(cb_pais.getSelectedItem().toString());
      if (this.cb_pais.getSelectedIndex() > 0) {
          this.cb_estado.removeAllItems();
          this.cb_estado.setEnabled(true);
          this.datosBase.comboboxEstados(this.cb_estado, paisito);
      } else {
          this.cb_estado.removeAllItems();
      }
  }//GEN-LAST:event_cb_paisItemStateChanged

  private void btn_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aceptarActionPerformed
      String CodPais = this.datosBase.buscarCodPais(this.cb_pais.getSelectedItem().toString());
      String CodEstado = this.datosBase.buscarCodEstado(this.cb_estado.getSelectedItem().toString(), CodPais);
      String CodCiudad = this.datosBase.buscarCodCiudad(CodPais, CodEstado, this.cb_ciudad.getSelectedItem().toString());
      char Naci = ' ';
      if (this.rbtn_nacional.isSelected()) {
          Naci = 'N';
      } else if (this.rbtn_nacional.isSelected()) {
          Naci = 'E';
      }

      if (this.tf_identificacion.getText().equals("") && Naci == ' ' && this.tf_nombre.getText().equals("") && this.tf_apellido.getText().equals("") && this.tf_email.getText().equals("") && this.tf_telefono.getText().equals("") && this.tf_telefonosecu.getText().equals("") && CodPais.equals("") && CodEstado.equals("") && CodCiudad.equals("")) {
          JOptionPane.showMessageDialog(null, "Llene todos los campos");
      }
      this.CRUDCliente.insertarDatos(this.tf_identificacion.getText(), Naci, this.tf_nombre.getText(), this.tf_apellido.getText(), this.tf_email.getText(), this.tf_telefono.getText(),
              this.tf_telefonosecu.getText(), Float.parseFloat(this.tf_saldo.getText()), CodPais, CodEstado, CodCiudad);
  }//GEN-LAST:event_btn_aceptarActionPerformed

  private void tf_telefonosecuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_telefonosecuActionPerformed
      // TODO add your handling code here:
  }//GEN-LAST:event_tf_telefonosecuActionPerformed

  private void cb_estadoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_estadoItemStateChanged
      if (this.cb_estado.getSelectedIndex() > 0) {
          String paisito = this.datosBase.buscarCodPais(this.cb_pais.getSelectedItem().toString());
          String estadito = this.datosBase.buscarCodEstado(this.cb_estado.getSelectedItem().toString(), paisito);
          this.cb_ciudad.removeAllItems();
          this.cb_ciudad.setEnabled(true);
          this.datosBase.comboboxCiudad(this.cb_ciudad, paisito, estadito);
      } else {
          this.cb_ciudad.removeAllItems();
      }
  }//GEN-LAST:event_cb_estadoItemStateChanged

  private void btn_transportistasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_transportistasActionPerformed
      new VEmpleadoTransportista().setVisible(true);
      this.dispose();
  }//GEN-LAST:event_btn_transportistasActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        new VEmpleadoMenu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

  private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
    new VIniciarSesion().setVisible(true);
    this.dispose();
  }//GEN-LAST:event_btn_salirActionPerformed

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
            java.util.logging.Logger.getLogger(VEmpleadoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VEmpleadoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VEmpleadoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VEmpleadoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VEmpleadoCliente().setVisible(true);
            }
        });
    }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btn_aceptar;
  private javax.swing.JButton btn_actualizar;
  private javax.swing.JButton btn_buscar;
  private javax.swing.JButton btn_clientes;
  private javax.swing.JButton btn_eliminar;
  private javax.swing.JButton btn_encomiendas;
  private javax.swing.JButton btn_recargar;
  private javax.swing.JButton btn_salir;
  private javax.swing.JButton btn_transportistas;
  private javax.swing.ButtonGroup buttonGroup1;
  private javax.swing.JComboBox<String> cb_ciudad;
  private javax.swing.JComboBox cb_estado;
  private javax.swing.JComboBox<String> cb_pais;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel10;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JLabel jLabel8;
  private javax.swing.JLabel jLabel9;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JPanel jPanel3;
  private javax.swing.JPanel jPanel4;
  private javax.swing.JScrollPane jScrollPane2;
  private javax.swing.JRadioButton rbtn_internacional;
  private javax.swing.JRadioButton rbtn_nacional;
  private javax.swing.JTextField tf_apellido;
  private javax.swing.JTextField tf_email;
  private javax.swing.JTextField tf_identificacion;
  private javax.swing.JTextField tf_identificacionC;
  private javax.swing.JTextField tf_nombre;
  private javax.swing.JTextField tf_saldo;
  private javax.swing.JTextField tf_telefono;
  private javax.swing.JTextField tf_telefonosecu;
  // End of variables declaration//GEN-END:variables
}
