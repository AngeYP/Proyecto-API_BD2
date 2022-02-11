/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deliverys;

import CRUD.CRUDBase;
import CRUD.CRUDEmpleadoTransportista;
import Conexion.Conexion;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import static Deliverys.VIniciarSesion.cedula;

/**
 *
 * @author angel
 */
public class VEmpleadoTransportista extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    Conexion conexion = new Conexion();
    CRUDBase datosBase = new CRUDBase(conexion.conectar());
    CRUDEmpleadoTransportista CRUDTransportista = new CRUDEmpleadoTransportista(conexion.conectar());
    Date date = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

    public VEmpleadoTransportista() {
        initComponents();
        this.tf_TransIngreso.setText(sdf.format(date));
        this.tf_TransNucleo.setText(this.datosBase.buscarNucleoEmp(cedula));
    }

    /*public VEmpleadoTransportista(String cedulaEmp) {
    initComponents();
    cedulaE = cedulaEmp;
    this.tf_TransIngreso.setText(sdf.format(date));
    this.tf_TransNucleo.setText(this.datosBase.buscarNucleoEmp(cedulaE));
  }*/
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
        btn_salir = new javax.swing.JButton();
        btn_clientes = new javax.swing.JButton();
        btn_transportistas = new javax.swing.JButton();
        btn_encomiendas = new javax.swing.JButton();
        tf_CITransportista = new javax.swing.JTextField();
        btn_BuscarTransportista = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tf_TransNombre = new javax.swing.JTextField();
        tf_TransTelefonoSecu = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tf_TransCedula = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tf_TransCantPedidos = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tf_TransTelefono = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        rb_TransNacional = new javax.swing.JRadioButton();
        rb_TransExtranjero = new javax.swing.JRadioButton();
        tf_TransApellido = new javax.swing.JTextField();
        tf_TransLicencia = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        tf_TransIngreso = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        tf_TransNucleo = new javax.swing.JTextField();
        tf_TransSaldo = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        tf_TransCurso = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_TransAntecedentes = new javax.swing.JTextArea();
        jLabel15 = new javax.swing.JLabel();
        tf_TransCorreo = new javax.swing.JTextField();
        btn_vehiculos = new javax.swing.JButton();
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
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
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
        btn_transportistas.setForeground(new java.awt.Color(34, 40, 49));
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

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 720));

        tf_CITransportista.setBackground(new java.awt.Color(57, 62, 70));
        tf_CITransportista.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        tf_CITransportista.setForeground(new java.awt.Color(238, 238, 238));
        tf_CITransportista.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_CITransportista.setText("Cedula transportista");
        tf_CITransportista.setBorder(null);
        tf_CITransportista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_CITransportistaMouseClicked(evt);
            }
        });
        jPanel1.add(tf_CITransportista, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 310, 40));

        btn_BuscarTransportista.setBackground(new java.awt.Color(57, 62, 70));
        btn_BuscarTransportista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/lupa1.png"))); // NOI18N
        btn_BuscarTransportista.setBorderPainted(false);
        btn_BuscarTransportista.setFocusPainted(false);
        btn_BuscarTransportista.setFocusable(false);
        btn_BuscarTransportista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BuscarTransportistaActionPerformed(evt);
            }
        });
        jPanel1.add(btn_BuscarTransportista, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 20, 40, 40));

        jPanel4.setBackground(new java.awt.Color(57, 62, 70));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(238, 238, 238));
        jLabel2.setText("Nombre:");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 290, 40));

        jLabel3.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(238, 238, 238));
        jLabel3.setText("Telefono");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 290, 40));

        jLabel4.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(238, 238, 238));
        jLabel4.setText("Telefono secundario:");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 290, 40));

        jLabel6.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(238, 238, 238));
        jLabel6.setText("Licencia de conducir:");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 290, 40));

        tf_TransNombre.setBackground(new java.awt.Color(238, 238, 238));
        tf_TransNombre.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        tf_TransNombre.setForeground(new java.awt.Color(34, 40, 49));
        tf_TransNombre.setEnabled(false);
        jPanel4.add(tf_TransNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 320, 40));

        tf_TransTelefonoSecu.setBackground(new java.awt.Color(238, 238, 238));
        tf_TransTelefonoSecu.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        tf_TransTelefonoSecu.setForeground(new java.awt.Color(34, 40, 49));
        jPanel4.add(tf_TransTelefonoSecu, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 380, 320, 40));

        jLabel10.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(238, 238, 238));
        jLabel10.setText("Antecedentes penales");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 290, 40));

        tf_TransCedula.setBackground(new java.awt.Color(238, 238, 238));
        tf_TransCedula.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        tf_TransCedula.setForeground(new java.awt.Color(34, 40, 49));
        tf_TransCedula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_TransCedulaMouseClicked(evt);
            }
        });
        jPanel4.add(tf_TransCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 320, 40));

        jLabel7.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(238, 238, 238));
        jLabel7.setText("Cantidad de pedidos realizados:");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 700, 290, 40));

        tf_TransCantPedidos.setBackground(new java.awt.Color(238, 238, 238));
        tf_TransCantPedidos.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        tf_TransCantPedidos.setForeground(new java.awt.Color(34, 40, 49));
        tf_TransCantPedidos.setText("0");
        tf_TransCantPedidos.setEnabled(false);
        jPanel4.add(tf_TransCantPedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 700, 320, 40));

        jLabel8.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(238, 238, 238));
        jLabel8.setText("Apellido:");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 290, 40));

        tf_TransTelefono.setBackground(new java.awt.Color(238, 238, 238));
        tf_TransTelefono.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        tf_TransTelefono.setForeground(new java.awt.Color(34, 40, 49));
        tf_TransTelefono.setEnabled(false);
        jPanel4.add(tf_TransTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 320, 320, 40));

        jLabel9.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(238, 238, 238));
        jLabel9.setText("Cedula");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 290, 40));

        jLabel11.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(238, 238, 238));
        jLabel11.setText("Estatus");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 290, 40));

        rb_TransNacional.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        rb_TransNacional.setForeground(new java.awt.Color(238, 238, 238));
        rb_TransNacional.setText("Nacional");
        rb_TransNacional.setBorder(null);
        rb_TransNacional.setContentAreaFilled(false);
        rb_TransNacional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_TransNacionalActionPerformed(evt);
            }
        });
        jPanel4.add(rb_TransNacional, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, -1, 40));

        rb_TransExtranjero.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        rb_TransExtranjero.setForeground(new java.awt.Color(238, 238, 238));
        rb_TransExtranjero.setText("Extranjero");
        rb_TransExtranjero.setBorder(null);
        rb_TransExtranjero.setContentAreaFilled(false);
        rb_TransExtranjero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_TransExtranjeroActionPerformed(evt);
            }
        });
        jPanel4.add(rb_TransExtranjero, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 80, -1, 40));

        tf_TransApellido.setBackground(new java.awt.Color(238, 238, 238));
        tf_TransApellido.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        tf_TransApellido.setForeground(new java.awt.Color(34, 40, 49));
        tf_TransApellido.setEnabled(false);
        jPanel4.add(tf_TransApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 320, 40));

        tf_TransLicencia.setBackground(new java.awt.Color(238, 238, 238));
        tf_TransLicencia.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        tf_TransLicencia.setForeground(new java.awt.Color(34, 40, 49));
        jPanel4.add(tf_TransLicencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 440, 320, 40));

        jLabel12.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(238, 238, 238));
        jLabel12.setText("Fecha de ingreso");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 640, 290, 40));

        tf_TransIngreso.setBackground(new java.awt.Color(238, 238, 238));
        tf_TransIngreso.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        tf_TransIngreso.setForeground(new java.awt.Color(34, 40, 49));
        tf_TransIngreso.setEnabled(false);
        jPanel4.add(tf_TransIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 640, 320, 40));

        jLabel13.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(238, 238, 238));
        jLabel13.setText("Nucleo adscrito:");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 820, 290, 40));

        tf_TransNucleo.setBackground(new java.awt.Color(238, 238, 238));
        tf_TransNucleo.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        tf_TransNucleo.setForeground(new java.awt.Color(34, 40, 49));
        tf_TransNucleo.setEnabled(false);
        jPanel4.add(tf_TransNucleo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 820, 320, 40));

        tf_TransSaldo.setBackground(new java.awt.Color(238, 238, 238));
        tf_TransSaldo.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        tf_TransSaldo.setForeground(new java.awt.Color(34, 40, 49));
        tf_TransSaldo.setText("0");
        tf_TransSaldo.setEnabled(false);
        jPanel4.add(tf_TransSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 760, 320, 40));

        jLabel14.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(238, 238, 238));
        jLabel14.setText("Saldo");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 760, 290, 40));

        tf_TransCurso.setBackground(new java.awt.Color(238, 238, 238));
        tf_TransCurso.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        tf_TransCurso.setForeground(new java.awt.Color(34, 40, 49));
        tf_TransCurso.setText("Aún no realizado");
        tf_TransCurso.setEnabled(false);
        jPanel4.add(tf_TransCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 880, 320, 40));

        jLabel16.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(238, 238, 238));
        jLabel16.setText("Curso realizado:");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 880, 290, 40));

        ta_TransAntecedentes.setBackground(new java.awt.Color(238, 238, 238));
        ta_TransAntecedentes.setColumns(20);
        ta_TransAntecedentes.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        ta_TransAntecedentes.setForeground(new java.awt.Color(34, 40, 49));
        ta_TransAntecedentes.setRows(5);
        jScrollPane1.setViewportView(ta_TransAntecedentes);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 500, 320, 120));

        jLabel15.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(238, 238, 238));
        jLabel15.setText("Correo:");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 290, 40));

        tf_TransCorreo.setBackground(new java.awt.Color(238, 238, 238));
        tf_TransCorreo.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        tf_TransCorreo.setForeground(new java.awt.Color(34, 40, 49));
        tf_TransCorreo.setEnabled(false);
        jPanel4.add(tf_TransCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 320, 40));

        btn_vehiculos.setBackground(new java.awt.Color(253, 112, 20));
        btn_vehiculos.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        btn_vehiculos.setForeground(new java.awt.Color(238, 238, 238));
        btn_vehiculos.setText("Vehículos");
        btn_vehiculos.setEnabled(false);
        btn_vehiculos.setFocusPainted(false);
        btn_vehiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_vehiculosActionPerformed(evt);
            }
        });
        jPanel4.add(btn_vehiculos, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 940, 170, 40));

        jScrollPane2.setViewportView(jPanel4);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 770, 510));

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

  private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
      // TODO add your handling code here:
  }//GEN-LAST:event_btn_salirActionPerformed

  private void btn_clientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clientesActionPerformed
      new VEmpleadoCliente().setVisible(true);
      this.dispose();
  }//GEN-LAST:event_btn_clientesActionPerformed

  private void btn_transportistasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_transportistasActionPerformed
      this.tf_CITransportista.setText("Cedula Transportista");
      this.tf_CITransportista.setText("Aún no realizado");
      this.tf_TransCedula.setText("");
      this.tf_TransApellido.setText("");
      this.tf_TransNombre.setText("");
      this.tf_TransCorreo.setText("");
      this.tf_TransTelefono.setText("");
      this.tf_TransTelefonoSecu.setText("");
      this.tf_TransLicencia.setText("");
      this.tf_TransIngreso.setText(sdf.format(date));
      this.tf_TransNucleo.setText(this.datosBase.buscarNombNucleo(this.datosBase.buscarNucleoEmp(cedula)));
      this.tf_TransSaldo.setText("0");
      this.tf_TransCantPedidos.setText("0");
      this.tf_TransCedula.setEnabled(true);
      this.rb_TransExtranjero.setSelected(false);
      this.rb_TransNacional.setSelected(false);
      this.ta_TransAntecedentes.setText("");
      this.btn_actualizar.setEnabled(false);
      this.btn_eliminar.setEnabled(false);
  }//GEN-LAST:event_btn_transportistasActionPerformed

  private void btn_encomiendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_encomiendasActionPerformed
      new VEmpleadoEncom().setVisible(true);
      this.dispose();
  }//GEN-LAST:event_btn_encomiendasActionPerformed

  private void tf_CITransportistaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_CITransportistaMouseClicked
      if (this.tf_CITransportista.getText().equals("Codigo transportista"))
          this.tf_CITransportista.setText("");
  }//GEN-LAST:event_tf_CITransportistaMouseClicked

  private void tf_TransCedulaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_TransCedulaMouseClicked
      if (this.tf_TransCedula.getText().equals("Cedula"))
          this.tf_TransCedula.setText("");
  }//GEN-LAST:event_tf_TransCedulaMouseClicked

  private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
      this.CRUDTransportista.eliminarRegistro(this.tf_TransCedula.getText());
      this.tf_CITransportista.setText("Cedula Transportista");
      this.tf_CITransportista.setText("Aún no realizado");
      this.tf_TransCedula.setText("");
      this.tf_TransApellido.setText("");
      this.tf_TransNombre.setText("");
      this.tf_TransCorreo.setText("");
      this.tf_TransTelefono.setText("");
      this.tf_TransTelefonoSecu.setText("");
      this.tf_TransLicencia.setText("");
      this.tf_TransIngreso.setText(sdf.format(date));
      this.tf_TransNucleo.setText(this.datosBase.buscarNombNucleo(this.datosBase.buscarNucleoEmp(cedula)));
      this.tf_TransSaldo.setText("0");
      this.tf_TransCantPedidos.setText("0");
      this.tf_TransCedula.setEnabled(true);
      this.rb_TransExtranjero.setSelected(false);
      this.rb_TransNacional.setSelected(false);
      this.ta_TransAntecedentes.setText("");
      this.btn_actualizar.setEnabled(false);
      this.btn_eliminar.setEnabled(false);
      this.btn_vehiculos.setEnabled(false);
  }//GEN-LAST:event_btn_eliminarActionPerformed

  private void btn_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aceptarActionPerformed
      char Naci = ' ';
      if (this.rb_TransNacional.isSelected()) {
          Naci = 'N';
      } else if (this.rb_TransExtranjero.isSelected()) {
          Naci = 'E';
      }

      if (this.tf_TransCedula.getText().equals("") && this.tf_TransNombre.getText().equals("") && this.tf_TransApellido.getText().equals("") && Naci == ' ' && this.tf_TransCorreo.getText().equals("") && this.tf_TransIngreso.getText().equals("") && this.tf_TransTelefono.getText().equals("") && this.tf_TransTelefonoSecu.getText().equals("") && this.tf_TransSaldo.getText().equals("") && this.tf_TransCantPedidos.getText().equals("") && this.tf_TransNucleo.getText().equals("")) {
          JOptionPane.showMessageDialog(null, "Llene todos los campos");
      } else {
          this.CRUDTransportista.insertarDatos(this.tf_TransCedula.getText(), Naci, this.tf_TransNombre.getText(), this.tf_TransApellido.getText(), this.tf_TransCorreo.getText(), this.tf_TransTelefono.getText(), this.tf_TransTelefonoSecu.getText(), this.tf_TransLicencia.getText(), this.ta_TransAntecedentes.getText(), this.datosBase.buscarNucleoEmp(cedula));
      }
  }//GEN-LAST:event_btn_aceptarActionPerformed

  private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
      char Naci = ' ';
      if (this.rb_TransNacional.isSelected()) {
          Naci = 'N';
      } else if (this.rb_TransExtranjero.isSelected()) {
          Naci = 'E';
      }
      if (this.tf_TransCedula.getText().equals("") && this.tf_TransNombre.getText().equals("") && this.tf_TransApellido.getText().equals("") && Naci == ' ' && this.tf_TransCorreo.getText().equals("") && this.tf_TransTelefono.getText().equals("") && this.tf_TransTelefonoSecu.getText().equals("") && this.tf_TransLicencia.getText().equals("") && this.ta_TransAntecedentes.getText().equals("")) {
          JOptionPane.showMessageDialog(null, "Llene todos los campos");
      } else {
          this.CRUDTransportista.actualizarDatos(this.tf_TransCedula.getText(), Naci, this.tf_TransNombre.getText(), this.tf_TransApellido.getText(), this.tf_TransCorreo.getText(), this.tf_TransTelefono.getText(), this.tf_TransTelefonoSecu.getText(), this.tf_TransLicencia.getText(), this.ta_TransAntecedentes.getText());
      }
  }//GEN-LAST:event_btn_actualizarActionPerformed

  private void btn_BuscarTransportistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BuscarTransportistaActionPerformed
      if (!this.tf_CITransportista.getText().equals("")) {
          String[] datosTransportista = new String[14];
          datosTransportista = this.CRUDTransportista.buscarTrasportista(this.tf_CITransportista.getText());
          if (!datosTransportista[0].equals("")) {
              this.tf_TransCedula.setText(datosTransportista[0]);
              if (datosTransportista[1].equals('N')) {
                  this.rb_TransNacional.setSelected(true);
              }
              if (datosTransportista[1].equals('E')) {
                  this.rb_TransExtranjero.setSelected(true);
              }
              this.tf_TransCedula.setText(datosTransportista[0]);
              this.tf_TransNombre.setText(datosTransportista[2]);
              this.tf_TransApellido.setText(datosTransportista[3]);
              this.tf_TransCorreo.setText(datosTransportista[4]);
              this.tf_TransTelefono.setText(datosTransportista[5]);
              this.tf_TransTelefonoSecu.setText(datosTransportista[6]);
              this.tf_TransLicencia.setText(datosTransportista[7]);
              this.tf_TransIngreso.setText(datosTransportista[8]);
              this.ta_TransAntecedentes.setText(datosTransportista[9]);
              this.tf_TransCantPedidos.setText(datosTransportista[10]);
              this.tf_TransSaldo.setText(datosTransportista[11]);
              this.tf_TransCurso.setText(datosTransportista[12]);
              if (datosTransportista[13].equals("")) {
                  this.tf_TransNucleo.setText("Aún no realizado");
              }
              this.tf_TransCedula.setEnabled(false);
              this.btn_actualizar.setEnabled(true);
              this.btn_eliminar.setEnabled(true);
              this.btn_vehiculos.setEnabled(true);
          } else {
              JOptionPane.showMessageDialog(null, "No se consiguio transportista");
          }
      }
  }//GEN-LAST:event_btn_BuscarTransportistaActionPerformed

  private void rb_TransNacionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_TransNacionalActionPerformed
      // TODO add your handling code here:
  }//GEN-LAST:event_rb_TransNacionalActionPerformed

  private void rb_TransExtranjeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_TransExtranjeroActionPerformed

  }//GEN-LAST:event_rb_TransExtranjeroActionPerformed

  private void btn_vehiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_vehiculosActionPerformed
      //La lal lllallallalalalalalalalalal
      if (!tf_TransCedula.getText().equals(""))
          new VEmpleadoTransVeh(tf_TransCedula.getText()).setVisible(true);
      else
          JOptionPane.showMessageDialog(null, "Por favor ingrese la cedula del transportista");
  }//GEN-LAST:event_btn_vehiculosActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        new VEmpleadoMenu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

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
            java.util.logging.Logger.getLogger(VEmpleadoTransportista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VEmpleadoTransportista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VEmpleadoTransportista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VEmpleadoTransportista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VEmpleadoTransportista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_BuscarTransportista;
    private javax.swing.JButton btn_aceptar;
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_clientes;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_encomiendas;
    private javax.swing.JButton btn_salir;
    private javax.swing.JButton btn_transportistas;
    private javax.swing.JButton btn_vehiculos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rb_TransExtranjero;
    private javax.swing.JRadioButton rb_TransNacional;
    private javax.swing.JTextArea ta_TransAntecedentes;
    private javax.swing.JTextField tf_CITransportista;
    private javax.swing.JTextField tf_TransApellido;
    private javax.swing.JTextField tf_TransCantPedidos;
    private javax.swing.JTextField tf_TransCedula;
    private javax.swing.JTextField tf_TransCorreo;
    private javax.swing.JTextField tf_TransCurso;
    private javax.swing.JTextField tf_TransIngreso;
    private javax.swing.JTextField tf_TransLicencia;
    private javax.swing.JTextField tf_TransNombre;
    private javax.swing.JTextField tf_TransNucleo;
    private javax.swing.JTextField tf_TransSaldo;
    private javax.swing.JTextField tf_TransTelefono;
    private javax.swing.JTextField tf_TransTelefonoSecu;
    // End of variables declaration//GEN-END:variables
}
