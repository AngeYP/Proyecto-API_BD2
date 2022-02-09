/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deliverys;

import CRUD.CRUDBase;
import CRUD.CRUDEmpleadoEncom;
import Conexion.Conexion;
import javax.swing.JOptionPane;

/**
 *
 * @author angel
 */
public class VEmpleadoEncom extends javax.swing.JFrame {

  Conexion conexion = new Conexion();
  CRUDBase datosBase = new CRUDBase(conexion.conectar());
  CRUDEmpleadoEncom datosEncomienda = new CRUDEmpleadoEncom(conexion.conectar());
  String cedulaE;
  public VEmpleadoEncom() {
    initComponents();
  }
  
  public VEmpleadoEncom(String cedulaEmp) {
    initComponents();
    cedulaE = cedulaEmp;
    this.datosBase.comboboxPaises(cb_pais);
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    BG_Estatus = new javax.swing.ButtonGroup();
    jPanel1 = new javax.swing.JPanel();
    jPanel2 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    btn_salir = new javax.swing.JButton();
    btn_clientes = new javax.swing.JButton();
    btn_transportistas = new javax.swing.JButton();
    btn_encomiendas = new javax.swing.JButton();
    tf_CodEncomienda = new javax.swing.JTextField();
    jPanel4 = new javax.swing.JPanel();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    jLabel6 = new javax.swing.JLabel();
    tf_CrearEncomienda = new javax.swing.JTextField();
    tf_CostoTotal = new javax.swing.JTextField();
    tf_ClientNombre = new javax.swing.JTextField();
    tf_destinatario = new javax.swing.JTextField();
    jLabel10 = new javax.swing.JLabel();
    cb_pais = new javax.swing.JComboBox<>();
    cb_estado = new javax.swing.JComboBox<>();
    cb_ciudad = new javax.swing.JComboBox<>();
    btn_BuscarCliente = new javax.swing.JButton();
    btn_paquetes = new javax.swing.JButton();
    rb_transito = new javax.swing.JRadioButton();
    rb_deudor = new javax.swing.JRadioButton();
    rb_porasignar = new javax.swing.JRadioButton();
    rb_arribo = new javax.swing.JRadioButton();
    rb_recibido = new javax.swing.JRadioButton();
    tf_ClientCedula = new javax.swing.JTextField();
    tf_ClientApellido = new javax.swing.JTextField();
    jLabel7 = new javax.swing.JLabel();
    tf_distancia = new javax.swing.JTextField();
    jPanel3 = new javax.swing.JPanel();
    btn_eliminar = new javax.swing.JButton();
    btn_aceptar = new javax.swing.JButton();
    btn_actualizar = new javax.swing.JButton();
    btn_BuscarEncomienda = new javax.swing.JButton();

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
    btn_encomiendas.setForeground(new java.awt.Color(34, 40, 49));
    btn_encomiendas.setText("Encomiendas");
    btn_encomiendas.setBorderPainted(false);
    btn_encomiendas.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btn_encomiendasActionPerformed(evt);
      }
    });
    jPanel2.add(btn_encomiendas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 180, 60));

    jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 720));

    tf_CodEncomienda.setBackground(new java.awt.Color(57, 62, 70));
    tf_CodEncomienda.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
    tf_CodEncomienda.setForeground(new java.awt.Color(238, 238, 238));
    tf_CodEncomienda.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    tf_CodEncomienda.setText("Codigo encomienda");
    tf_CodEncomienda.setBorder(null);
    tf_CodEncomienda.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        tf_CodEncomiendaMouseClicked(evt);
      }
    });
    jPanel1.add(tf_CodEncomienda, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 310, 40));

    jPanel4.setBackground(new java.awt.Color(57, 62, 70));
    jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jLabel2.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
    jLabel2.setForeground(new java.awt.Color(238, 238, 238));
    jLabel2.setText("Codigo encomienda");
    jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 290, 40));

    jLabel3.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
    jLabel3.setForeground(new java.awt.Color(238, 238, 238));
    jLabel3.setText("Estatus");
    jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 290, 40));

    jLabel4.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
    jLabel4.setForeground(new java.awt.Color(238, 238, 238));
    jLabel4.setText("Costo total");
    jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 290, 40));

    jLabel5.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
    jLabel5.setForeground(new java.awt.Color(238, 238, 238));
    jLabel5.setText("Cliente");
    jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 290, 40));

    jLabel6.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
    jLabel6.setForeground(new java.awt.Color(238, 238, 238));
    jLabel6.setText("Destinatario");
    jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 290, 40));

    tf_CrearEncomienda.setBackground(new java.awt.Color(238, 238, 238));
    tf_CrearEncomienda.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
    tf_CrearEncomienda.setForeground(new java.awt.Color(34, 40, 49));
    tf_CrearEncomienda.setEnabled(false);
    jPanel4.add(tf_CrearEncomienda, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 320, 40));

    tf_CostoTotal.setBackground(new java.awt.Color(238, 238, 238));
    tf_CostoTotal.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
    tf_CostoTotal.setForeground(new java.awt.Color(34, 40, 49));
    tf_CostoTotal.setText("0");
    tf_CostoTotal.setEnabled(false);
    jPanel4.add(tf_CostoTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 320, 320, 40));

    tf_ClientNombre.setEditable(false);
    tf_ClientNombre.setBackground(new java.awt.Color(238, 238, 238));
    tf_ClientNombre.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
    tf_ClientNombre.setForeground(new java.awt.Color(34, 40, 49));
    jPanel4.add(tf_ClientNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 320, 40));

    tf_destinatario.setBackground(new java.awt.Color(238, 238, 238));
    tf_destinatario.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
    tf_destinatario.setForeground(new java.awt.Color(34, 40, 49));
    tf_destinatario.setEnabled(false);
    jPanel4.add(tf_destinatario, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 380, 320, 40));

    jLabel10.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
    jLabel10.setForeground(new java.awt.Color(238, 238, 238));
    jLabel10.setText("Destino");
    jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 290, 40));

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
    jPanel4.add(cb_pais, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 440, 320, 40));

    cb_estado.setBackground(new java.awt.Color(238, 238, 238));
    cb_estado.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
    cb_estado.setForeground(new java.awt.Color(34, 40, 49));
    cb_estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Primero seleccione un Pais..." }));
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
    jPanel4.add(cb_estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 320, 40));

    cb_ciudad.setBackground(new java.awt.Color(238, 238, 238));
    cb_ciudad.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
    cb_ciudad.setForeground(new java.awt.Color(34, 40, 49));
    cb_ciudad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Primero seleccione un Estado..." }));
    cb_ciudad.setEnabled(false);
    cb_ciudad.addItemListener(new java.awt.event.ItemListener() {
      public void itemStateChanged(java.awt.event.ItemEvent evt) {
        cb_ciudadItemStateChanged(evt);
      }
    });
    jPanel4.add(cb_ciudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 500, 320, 40));

    btn_BuscarCliente.setBackground(new java.awt.Color(57, 62, 70));
    btn_BuscarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/lupa1.png"))); // NOI18N
    btn_BuscarCliente.setBorderPainted(false);
    btn_BuscarCliente.setFocusPainted(false);
    btn_BuscarCliente.setFocusable(false);
    btn_BuscarCliente.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btn_BuscarClienteActionPerformed(evt);
      }
    });
    jPanel4.add(btn_BuscarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 20, 40, 40));

    btn_paquetes.setBackground(new java.awt.Color(253, 112, 20));
    btn_paquetes.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
    btn_paquetes.setForeground(new java.awt.Color(238, 238, 238));
    btn_paquetes.setText("Paquetes");
    btn_paquetes.setEnabled(false);
    btn_paquetes.setFocusPainted(false);
    btn_paquetes.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btn_paquetesActionPerformed(evt);
      }
    });
    jPanel4.add(btn_paquetes, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 620, 170, 40));

    BG_Estatus.add(rb_transito);
    rb_transito.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
    rb_transito.setForeground(new java.awt.Color(238, 238, 238));
    rb_transito.setText("En transito");
    rb_transito.setBorder(null);
    rb_transito.setContentAreaFilled(false);
    rb_transito.setEnabled(false);
    rb_transito.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        rb_transitoActionPerformed(evt);
      }
    });
    jPanel4.add(rb_transito, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 200, -1, 40));

    BG_Estatus.add(rb_deudor);
    rb_deudor.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
    rb_deudor.setForeground(new java.awt.Color(238, 238, 238));
    rb_deudor.setSelected(true);
    rb_deudor.setText("Por pagar");
    rb_deudor.setBorder(null);
    rb_deudor.setContentAreaFilled(false);
    rb_deudor.setEnabled(false);
    rb_deudor.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        rb_deudorActionPerformed(evt);
      }
    });
    jPanel4.add(rb_deudor, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, -1, 40));

    BG_Estatus.add(rb_porasignar);
    rb_porasignar.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
    rb_porasignar.setForeground(new java.awt.Color(238, 238, 238));
    rb_porasignar.setText("Pagado");
    rb_porasignar.setBorder(null);
    rb_porasignar.setContentAreaFilled(false);
    rb_porasignar.setEnabled(false);
    rb_porasignar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        rb_porasignarActionPerformed(evt);
      }
    });
    jPanel4.add(rb_porasignar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 200, -1, 40));

    BG_Estatus.add(rb_arribo);
    rb_arribo.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
    rb_arribo.setForeground(new java.awt.Color(238, 238, 238));
    rb_arribo.setText("En destino");
    rb_arribo.setBorder(null);
    rb_arribo.setContentAreaFilled(false);
    rb_arribo.setEnabled(false);
    rb_arribo.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        rb_arriboActionPerformed(evt);
      }
    });
    jPanel4.add(rb_arribo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, -1, 40));

    BG_Estatus.add(rb_recibido);
    rb_recibido.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
    rb_recibido.setForeground(new java.awt.Color(238, 238, 238));
    rb_recibido.setText("Retirado");
    rb_recibido.setBorder(null);
    rb_recibido.setContentAreaFilled(false);
    rb_recibido.setEnabled(false);
    rb_recibido.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        rb_recibidoActionPerformed(evt);
      }
    });
    jPanel4.add(rb_recibido, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 260, -1, 40));

    tf_ClientCedula.setBackground(new java.awt.Color(238, 238, 238));
    tf_ClientCedula.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
    tf_ClientCedula.setForeground(new java.awt.Color(34, 40, 49));
    tf_ClientCedula.setText("Cedula");
    tf_ClientCedula.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        tf_ClientCedulaMouseClicked(evt);
      }
    });
    jPanel4.add(tf_ClientCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 270, 40));

    tf_ClientApellido.setEditable(false);
    tf_ClientApellido.setBackground(new java.awt.Color(238, 238, 238));
    tf_ClientApellido.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
    tf_ClientApellido.setForeground(new java.awt.Color(34, 40, 49));
    jPanel4.add(tf_ClientApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, 320, 40));

    jLabel7.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
    jLabel7.setForeground(new java.awt.Color(238, 238, 238));
    jLabel7.setText("Distancia");
    jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, 290, 40));

    tf_distancia.setBackground(new java.awt.Color(238, 238, 238));
    tf_distancia.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
    tf_distancia.setForeground(new java.awt.Color(34, 40, 49));
    tf_distancia.setEnabled(false);
    jPanel4.add(tf_distancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 560, 320, 40));

    jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 740, 680));

    jPanel3.setBackground(new java.awt.Color(57, 62, 70));
    jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    btn_eliminar.setBackground(new java.awt.Color(253, 112, 20));
    btn_eliminar.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
    btn_eliminar.setForeground(new java.awt.Color(238, 238, 238));
    btn_eliminar.setText("Eliminar");
    btn_eliminar.setEnabled(false);
    btn_eliminar.setFocusPainted(false);
    jPanel3.add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 130, 40));

    btn_aceptar.setBackground(new java.awt.Color(253, 112, 20));
    btn_aceptar.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
    btn_aceptar.setForeground(new java.awt.Color(238, 238, 238));
    btn_aceptar.setText("Aceptar");
    btn_aceptar.setEnabled(false);
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
    jPanel3.add(btn_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 130, 40));

    jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 620, 490, 80));

    btn_BuscarEncomienda.setBackground(new java.awt.Color(57, 62, 70));
    btn_BuscarEncomienda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/lupa1.png"))); // NOI18N
    btn_BuscarEncomienda.setBorderPainted(false);
    btn_BuscarEncomienda.setFocusPainted(false);
    btn_BuscarEncomienda.setFocusable(false);
    btn_BuscarEncomienda.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btn_BuscarEncomiendaActionPerformed(evt);
      }
    });
    jPanel1.add(btn_BuscarEncomienda, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 20, 40, 40));

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 901, Short.MAX_VALUE)
    );

    pack();
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

  private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_btn_salirActionPerformed

  private void btn_transportistasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_transportistasActionPerformed
//    new VEmpleadoTranspo(cedulaE).setVisible(true);
//    this.dispose();
  }//GEN-LAST:event_btn_transportistasActionPerformed

  private void btn_encomiendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_encomiendasActionPerformed
    this.btn_aceptar.setEnabled(false);
    this.btn_actualizar.setEnabled(false);
    this.btn_eliminar.setEnabled(false);
    this.tf_CodEncomienda.setText("Codigo encomienda");
    this.tf_ClientCedula.setText("Cedula");
    this.tf_ClientNombre.setText("");
    this.tf_ClientApellido.setText("");
    this.tf_CrearEncomienda.setText("");
    this.tf_CostoTotal.setText("0");
    this.tf_destinatario.setText("");
    this.tf_distancia.setText("");
    this.tf_ClientCedula.setEnabled(true);
    this.tf_CrearEncomienda.setEnabled(false);
    this.tf_CostoTotal.setEnabled(false);
    this.tf_distancia.setEnabled(false);
    this.cb_pais.removeAllItems();
    this.cb_estado.removeAllItems();
    this.cb_ciudad.removeAllItems();
    this.cb_pais.setEnabled(false);
    this.cb_estado.setEnabled(false);
    this.cb_ciudad.setEnabled(false);
    this.btn_paquetes.setEnabled(false);
  }//GEN-LAST:event_btn_encomiendasActionPerformed

  private void btn_clientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clientesActionPerformed
    new VEmpleadoCliente(cedulaE).setVisible(true);
    this.dispose();
  }//GEN-LAST:event_btn_clientesActionPerformed

  private void cb_paisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_paisActionPerformed

  }//GEN-LAST:event_cb_paisActionPerformed

  private void cb_estadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_estadoActionPerformed

  }//GEN-LAST:event_cb_estadoActionPerformed

  private void btn_paquetesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_paquetesActionPerformed

  }//GEN-LAST:event_btn_paquetesActionPerformed

  private void btn_BuscarEncomiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BuscarEncomiendaActionPerformed
    if(!this.tf_CodEncomienda.getText().equals("")) {
      String[] auxEncomienda = new String[8];
      String[] datosCliente = new String[2];
      auxEncomienda = this.datosEncomienda.buscarEncomienda(this.tf_CrearEncomienda.getText());
      this.tf_ClientCedula.setText(auxEncomienda[0]);
      datosCliente = this.datosEncomienda.buscarCliente(this.tf_ClientCedula.getText());
      this.tf_ClientNombre.setText(datosCliente[0]);
      this.tf_ClientApellido.setText(datosCliente[1]);
      this.tf_CrearEncomienda.setText(auxEncomienda[1]);
      if(auxEncomienda[2] != null)
        switch (auxEncomienda[2]) {
        case "D" -> this.rb_deudor.setSelected(true);
        case "P" -> this.rb_porasignar.setSelected(true);
        case "T" -> this.rb_transito.setSelected(true);
        case "A" -> this.rb_arribo.setSelected(true);
        case "R" -> this.rb_recibido.setSelected(true);
        default -> {
        }
      }
      this.tf_distancia.setText(auxEncomienda[3]);
      this.tf_CostoTotal.setText(auxEncomienda[4]);
      this.tf_destinatario.setText(auxEncomienda[5]);
      this.cb_pais.setSelectedItem(auxEncomienda[6]);
      this.cb_estado.setSelectedItem(auxEncomienda[7]);
      this.cb_ciudad.setSelectedItem(auxEncomienda[8]);
      
      if(!this.tf_ClientCedula.getText().equals("")) {
        this.tf_ClientCedula.setEnabled(false);
        this.tf_destinatario.setEnabled(true);
        this.cb_pais.setEnabled(true);
        this.cb_estado.setEnabled(true);
        this.cb_ciudad.setEnabled(true);
        this.btn_paquetes.setEnabled(true);

        if(this.rb_deudor.isSelected()) {
          this.rb_porasignar.setEnabled(true);
          this.rb_transito.setEnabled(false);
          this.rb_recibido.setEnabled(false);
          this.rb_arribo.setEnabled(false);
        }
  //      if(this.rb_porasignar.isSelected()) 
  //        this.rb_transito.setEnabled(true);
        if(this.rb_transito.isSelected()) {
          this.rb_arribo.setEnabled(true);
          this.rb_porasignar.setEnabled(false);
          this.rb_transito.setEnabled(false);
          this.rb_recibido.setEnabled(false);
        }
        if(this.rb_arribo.isSelected()) {
          this.rb_recibido.setEnabled(true);
          this.rb_arribo.setEnabled(true);
          this.rb_porasignar.setEnabled(false);
          this.rb_transito.setEnabled(false);
        }
        if(this.rb_recibido.isSelected()) {
          this.tf_destinatario.setEnabled(false);
          this.cb_pais.setEnabled(false);
        }
      } else {
        JOptionPane.showMessageDialog(null, "No se consiguio encomienda");
      }
    }
  }//GEN-LAST:event_btn_BuscarEncomiendaActionPerformed

  private void btn_BuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BuscarClienteActionPerformed
    if(!this.tf_ClientCedula.getText().equals("")) {
      String[] datosCliente = new String[2];
      datosCliente = this.datosEncomienda.buscarCliente(this.tf_ClientCedula.getText());
      this.tf_ClientNombre.setText(datosCliente[0]);
      this.tf_ClientApellido.setText(datosCliente[1]);
      if(!this.tf_ClientNombre.getText().equals("") && !this.tf_ClientApellido.getText().equals("")){
        this.tf_CrearEncomienda.setEnabled(true);
        this.tf_destinatario.setEnabled(true);
        this.cb_pais.setEnabled(true);
        this.rb_deudor.setEnabled(true);
        this.tf_distancia.setEnabled(true);
        this.btn_aceptar.setEnabled(true);
        this.tf_ClientCedula.setEnabled(false);
      } else {
        JOptionPane.showMessageDialog(null, "No se consiguio cliente");
      }
    } else {
      JOptionPane.showMessageDialog(null, "Introduzca una cedula");
    }
  }//GEN-LAST:event_btn_BuscarClienteActionPerformed

  private void btn_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aceptarActionPerformed
    String CodPais = this.datosBase.buscarCodPais(this.cb_pais.getSelectedItem().toString());
    String CodEstado = this.datosBase.buscarCodEstado(this.cb_estado.getSelectedItem().toString(),CodPais);
    String CodCiudad = this.datosBase.buscarCodCiudad(CodPais,CodEstado,this.cb_ciudad.getSelectedItem().toString());
    char Estatus = ' ';
    if (this.rb_deudor.isSelected())
      Estatus = 'D';
    
    if (this.tf_CrearEncomienda.getText().equals("") && Estatus==' ' && this.tf_ClientCedula.getText().equals("") && this.tf_destinatario.getText().equals("") && this.tf_distancia.getText().equals("") && CodPais.equals("") && CodEstado.equals("") && CodCiudad.equals("")) {
      JOptionPane.showMessageDialog(null, "Llene todos los campos");
    }
    this.datosEncomienda.insertarDatos(this.tf_CrearEncomienda.getText(), Estatus, Float.parseFloat(this.tf_distancia.getText()), this.tf_destinatario.getText(), this.tf_ClientCedula.getText(), cedulaE, CodPais, CodEstado, CodCiudad);
  }//GEN-LAST:event_btn_aceptarActionPerformed

  private void rb_transitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_transitoActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_rb_transitoActionPerformed

  private void rb_deudorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_deudorActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_rb_deudorActionPerformed

  private void rb_porasignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_porasignarActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_rb_porasignarActionPerformed

  private void rb_arriboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_arriboActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_rb_arriboActionPerformed

  private void rb_recibidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_recibidoActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_rb_recibidoActionPerformed

  private void tf_ClientCedulaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_ClientCedulaMouseClicked
    if(this.tf_ClientCedula.getText().equals("Cedula"))
      this.tf_ClientCedula.setText("");
  }//GEN-LAST:event_tf_ClientCedulaMouseClicked

  private void tf_CodEncomiendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_CodEncomiendaMouseClicked
    if(this.tf_CodEncomienda.getText().equals("Codigo encomienda"))
      this.tf_CodEncomienda.setText("");
  }//GEN-LAST:event_tf_CodEncomiendaMouseClicked

  private void cb_paisItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_paisItemStateChanged
    String paisito = this.datosBase.buscarCodPais(cb_pais.getSelectedItem().toString());
    if (this.cb_pais.getSelectedIndex() > 0) {
      this.cb_estado.removeAllItems();
      this.cb_estado.setEnabled(true);
      this.datosBase.comboboxEstados(this.cb_estado, paisito);
    }
    else {
      this.cb_estado.removeAllItems();
    }
  }//GEN-LAST:event_cb_paisItemStateChanged

  private void cb_ciudadItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_ciudadItemStateChanged
  }//GEN-LAST:event_cb_ciudadItemStateChanged

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
      java.util.logging.Logger.getLogger(VEmpleadoEncom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(VEmpleadoEncom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(VEmpleadoEncom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(VEmpleadoEncom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new VEmpleadoEncom().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.ButtonGroup BG_Estatus;
  private javax.swing.JButton btn_BuscarCliente;
  private javax.swing.JButton btn_BuscarEncomienda;
  private javax.swing.JButton btn_aceptar;
  private javax.swing.JButton btn_actualizar;
  private javax.swing.JButton btn_clientes;
  private javax.swing.JButton btn_eliminar;
  private javax.swing.JButton btn_encomiendas;
  private javax.swing.JButton btn_paquetes;
  private javax.swing.JButton btn_salir;
  private javax.swing.JButton btn_transportistas;
  private javax.swing.JComboBox<String> cb_ciudad;
  private javax.swing.JComboBox<String> cb_estado;
  private javax.swing.JComboBox<String> cb_pais;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel10;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JPanel jPanel3;
  private javax.swing.JPanel jPanel4;
  private javax.swing.JRadioButton rb_arribo;
  private javax.swing.JRadioButton rb_deudor;
  private javax.swing.JRadioButton rb_porasignar;
  private javax.swing.JRadioButton rb_recibido;
  private javax.swing.JRadioButton rb_transito;
  private javax.swing.JTextField tf_ClientApellido;
  private javax.swing.JTextField tf_ClientCedula;
  private javax.swing.JTextField tf_ClientNombre;
  private javax.swing.JTextField tf_CodEncomienda;
  private javax.swing.JTextField tf_CostoTotal;
  private javax.swing.JTextField tf_CrearEncomienda;
  private javax.swing.JTextField tf_destinatario;
  private javax.swing.JTextField tf_distancia;
  // End of variables declaration//GEN-END:variables
}
