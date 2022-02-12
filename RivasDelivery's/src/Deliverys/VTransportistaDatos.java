/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deliverys;

import CRUD.CRUDBase;
import CRUD.CRUDTransportistaDatos;
import Conexion.Conexion;

/**
 *
 * @author angel
 */
public class VTransportistaDatos extends javax.swing.JFrame {
    String id;
    Conexion conexion = new Conexion();
    public static CRUDTransportistaDatos crud ;
    CRUD.CRUDBase base;
    public static String ident;

  /**
   * Creates new form VTransportistaDatos
   */
  public VTransportistaDatos() {
    initComponents();
    id=VIniciarSesion.cedula;
    ident=id;
    String []info = new String[6];
    crud = new CRUDTransportistaDatos(conexion.conectar());
    base= new CRUDBase(conexion.conectar());
    info=crud.datos(id);
    txt_id.setText(info[0]);
    txt_name.setText(info[1]);
    txt_email.setText(info[2]);
    txt_tlf.setText(info[3]);
    txt_nucleo.setText(base.buscarNombNucleo(info[5]));
    txt_saldo.setText(info[4]);
      if (info[6]==null) {
          txt_curso.setText("No tiene curso realizado");
      }else{
          txt_curso.setText(info[6]);
      }
    
    cb_nucleo.removeAllItems();
    cb_nucleo.addItem("Selecciona");
    base.comboNucleo(cb_nucleo);
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
    Btn_Ingresar = new javax.swing.JButton();
    btn_solicitar = new javax.swing.JButton();
    jPanel2 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    jLabel6 = new javax.swing.JLabel();
    jLabel7 = new javax.swing.JLabel();
    txt_id = new javax.swing.JTextField();
    txt_name = new javax.swing.JTextField();
    txt_email = new javax.swing.JTextField();
    txt_tlf = new javax.swing.JTextField();
    txt_nucleo = new javax.swing.JTextField();
    txt_saldo = new javax.swing.JTextField();
    jLabel8 = new javax.swing.JLabel();
    cb_curso = new javax.swing.JComboBox<>();
    txt_curso = new javax.swing.JTextField();
    cb_nucleo = new javax.swing.JComboBox<>();
    cb_fecha = new javax.swing.JComboBox<>();
    jButton1 = new javax.swing.JButton();
    Btn_Ingresar2 = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jPanel1.setBackground(new java.awt.Color(34, 40, 49));
    jPanel1.setMaximumSize(new java.awt.Dimension(1080, 720));
    jPanel1.setMinimumSize(new java.awt.Dimension(1080, 720));
    jPanel1.setPreferredSize(new java.awt.Dimension(1080, 720));
    jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jLabel4.setBackground(new java.awt.Color(253, 112, 20));
    jLabel4.setFont(new java.awt.Font("Helvetica", 1, 36)); // NOI18N
    jLabel4.setForeground(new java.awt.Color(255, 255, 255));
    jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel4.setText("Datos personales");
    jLabel4.setOpaque(true);
    jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 80));

    Btn_Ingresar.setBackground(new java.awt.Color(253, 112, 20));
    Btn_Ingresar.setFont(new java.awt.Font("Helvetica", 1, 17)); // NOI18N
    Btn_Ingresar.setForeground(new java.awt.Color(238, 238, 238));
    Btn_Ingresar.setText("Salir");
    Btn_Ingresar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
    Btn_Ingresar.setBorderPainted(false);
    Btn_Ingresar.setFocusPainted(false);
    Btn_Ingresar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        Btn_IngresarActionPerformed(evt);
      }
    });
    jPanel1.add(Btn_Ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 660, 140, 40));

    btn_solicitar.setBackground(new java.awt.Color(253, 112, 20));
    btn_solicitar.setFont(new java.awt.Font("Helvetica", 1, 17)); // NOI18N
    btn_solicitar.setForeground(new java.awt.Color(238, 238, 238));
    btn_solicitar.setText("Solicitar");
    btn_solicitar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(253, 112, 20)));
    btn_solicitar.setBorderPainted(false);
    btn_solicitar.setFocusPainted(false);
    btn_solicitar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btn_solicitarActionPerformed(evt);
      }
    });
    jPanel1.add(btn_solicitar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 650, 140, 40));

    jPanel2.setBackground(new java.awt.Color(57, 62, 70));
    jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jLabel1.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
    jLabel1.setForeground(new java.awt.Color(238, 238, 238));
    jLabel1.setText("Identificacion");
    jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 250, 40));

    jLabel2.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
    jLabel2.setForeground(new java.awt.Color(238, 238, 238));
    jLabel2.setText("Nombre");
    jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 250, 40));

    jLabel3.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
    jLabel3.setForeground(new java.awt.Color(238, 238, 238));
    jLabel3.setText("Email");
    jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 250, 40));

    jLabel5.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
    jLabel5.setForeground(new java.awt.Color(238, 238, 238));
    jLabel5.setText("Telefono Principal");
    jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 250, 40));

    jLabel6.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
    jLabel6.setForeground(new java.awt.Color(238, 238, 238));
    jLabel6.setText("Nucleo");
    jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 250, 40));

    jLabel7.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
    jLabel7.setForeground(new java.awt.Color(238, 238, 238));
    jLabel7.setText("Cursos realizados");
    jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 250, 40));

    txt_id.setEditable(false);
    txt_id.setBackground(new java.awt.Color(238, 238, 238));
    txt_id.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
    txt_id.setForeground(new java.awt.Color(34, 40, 49));
    txt_id.setEnabled(false);
    jPanel2.add(txt_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, 300, 40));

    txt_name.setEditable(false);
    txt_name.setBackground(new java.awt.Color(238, 238, 238));
    txt_name.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
    txt_name.setForeground(new java.awt.Color(34, 40, 49));
    txt_name.setEnabled(false);
    jPanel2.add(txt_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, 300, 40));

    txt_email.setEditable(false);
    txt_email.setBackground(new java.awt.Color(238, 238, 238));
    txt_email.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
    txt_email.setForeground(new java.awt.Color(34, 40, 49));
    txt_email.setEnabled(false);
    jPanel2.add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, 300, 40));

    txt_tlf.setEditable(false);
    txt_tlf.setBackground(new java.awt.Color(238, 238, 238));
    txt_tlf.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
    txt_tlf.setForeground(new java.awt.Color(34, 40, 49));
    txt_tlf.setEnabled(false);
    jPanel2.add(txt_tlf, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, 300, 40));

    txt_nucleo.setEditable(false);
    txt_nucleo.setBackground(new java.awt.Color(238, 238, 238));
    txt_nucleo.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
    txt_nucleo.setForeground(new java.awt.Color(34, 40, 49));
    txt_nucleo.setEnabled(false);
    jPanel2.add(txt_nucleo, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, 300, 40));

    txt_saldo.setEditable(false);
    txt_saldo.setBackground(new java.awt.Color(238, 238, 238));
    txt_saldo.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
    txt_saldo.setForeground(new java.awt.Color(34, 40, 49));
    txt_saldo.setEnabled(false);
    jPanel2.add(txt_saldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 330, 300, 40));

    jLabel8.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
    jLabel8.setForeground(new java.awt.Color(238, 238, 238));
    jLabel8.setText("Saldo");
    jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 250, 40));

    cb_curso.setBackground(new java.awt.Color(238, 238, 238));
    jPanel2.add(cb_curso, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 450, 180, 40));

    txt_curso.setEditable(false);
    txt_curso.setBackground(new java.awt.Color(238, 238, 238));
    txt_curso.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
    txt_curso.setForeground(new java.awt.Color(34, 40, 49));
    txt_curso.setEnabled(false);
    jPanel2.add(txt_curso, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 390, 300, 40));

    cb_nucleo.setBackground(new java.awt.Color(238, 238, 238));
    cb_nucleo.addItemListener(new java.awt.event.ItemListener() {
      public void itemStateChanged(java.awt.event.ItemEvent evt) {
        cb_nucleoItemStateChanged(evt);
      }
    });
    jPanel2.add(cb_nucleo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 180, 40));

    cb_fecha.setBackground(new java.awt.Color(238, 238, 238));
    cb_fecha.addItemListener(new java.awt.event.ItemListener() {
      public void itemStateChanged(java.awt.event.ItemEvent evt) {
        cb_fechaItemStateChanged(evt);
      }
    });
    jPanel2.add(cb_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 450, 180, 40));

    jButton1.setBackground(new java.awt.Color(253, 112, 20));
    jButton1.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
    jButton1.setForeground(new java.awt.Color(238, 238, 238));
    jButton1.setText("Agregar");
    jButton1.setFocusPainted(false);
    jButton1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton1ActionPerformed(evt);
      }
    });
    jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 450, 110, 40));

    jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 780, 520));

    Btn_Ingresar2.setBackground(new java.awt.Color(253, 112, 20));
    Btn_Ingresar2.setFont(new java.awt.Font("Helvetica", 1, 17)); // NOI18N
    Btn_Ingresar2.setForeground(new java.awt.Color(238, 238, 238));
    Btn_Ingresar2.setText("Encomiendas");
    Btn_Ingresar2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(253, 112, 20)));
    Btn_Ingresar2.setBorderPainted(false);
    Btn_Ingresar2.setFocusPainted(false);
    Btn_Ingresar2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        Btn_Ingresar2ActionPerformed(evt);
      }
    });
    jPanel1.add(Btn_Ingresar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 650, 140, 40));

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

  private void Btn_IngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_IngresarActionPerformed

  }//GEN-LAST:event_Btn_IngresarActionPerformed

  private void btn_solicitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_solicitarActionPerformed

      new VTransportistaEncom().setVisible(true);
  }//GEN-LAST:event_btn_solicitarActionPerformed

    private void Btn_Ingresar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Ingresar2ActionPerformed
        // TODO add your handling code here:
        new VTransportistaListaE().setVisible(true);
    }//GEN-LAST:event_Btn_Ingresar2ActionPerformed

    private void cb_nucleoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_nucleoItemStateChanged
        // TODO add your handling code here:
        if (cb_nucleo.getSelectedIndex()>0) {
            cb_fecha.removeAllItems();
            cb_fecha.addItem("Seleccione");
            base.fechasCursos(cb_fecha, base.buscarCodNucleo(cb_nucleo.getSelectedItem().toString()));
        }else{
            cb_fecha.removeAllItems();
            cb_curso.removeAllItems();
        }
    }//GEN-LAST:event_cb_nucleoItemStateChanged

    private void cb_fechaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_fechaItemStateChanged
        // TODO add your handling code here:
        if (cb_fecha.getSelectedIndex()>0) {
            cb_curso.removeAllItems();
            cb_curso.addItem("Seleccion");
            base.buscarCodCurso(cb_curso, base.buscarCodNucleo(cb_nucleo.getSelectedItem().toString()), cb_fecha.getSelectedItem().toString());
        }else{
            cb_curso.removeAllItems();
        }
    }//GEN-LAST:event_cb_fechaItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (cb_curso.getSelectedIndex()>0) {
            base.updateCursoTransportista(cb_curso.getSelectedItem().toString(), id);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
      java.util.logging.Logger.getLogger(VTransportistaDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(VTransportistaDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(VTransportistaDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(VTransportistaDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new VTransportistaDatos().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton Btn_Ingresar;
  private javax.swing.JButton Btn_Ingresar2;
  private javax.swing.JButton btn_solicitar;
  private javax.swing.JComboBox<String> cb_curso;
  private javax.swing.JComboBox<String> cb_fecha;
  private javax.swing.JComboBox<String> cb_nucleo;
  private javax.swing.JButton jButton1;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JLabel jLabel8;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JTextField txt_curso;
  private javax.swing.JTextField txt_email;
  private javax.swing.JTextField txt_id;
  private javax.swing.JTextField txt_name;
  private javax.swing.JTextField txt_nucleo;
  private javax.swing.JTextField txt_saldo;
  private javax.swing.JTextField txt_tlf;
  // End of variables declaration//GEN-END:variables
}
