/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deliverys;

import CRUD.CRUDBase;
import Conexion.Conexion;

/**
 *
 * @author Noel Roberto
 */
public class VCurso extends javax.swing.JFrame {
    Conexion conexion = new Conexion();
    CRUD.CRUDBase crud;

    /**
     * Creates new form VCurso
     */
    public VCurso() {
        initComponents();
        crud= new CRUDBase(conexion.conectar());
        crud.comboNucleo(cb_nucleo);
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
    btn_aceptar = new javax.swing.JButton();
    btn_cancelar = new javax.swing.JButton();
    jPanel2 = new javax.swing.JPanel();
    cs_fecha = new javax.swing.JTextField();
    jLabel2 = new javax.swing.JLabel();
    jLabel1 = new javax.swing.JLabel();
    tf_curso = new javax.swing.JTextField();
    cb_nucleo = new javax.swing.JComboBox<>();
    jLabel3 = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jPanel1.setBackground(new java.awt.Color(34, 40, 49));
    jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jLabel4.setBackground(new java.awt.Color(253, 112, 20));
    jLabel4.setFont(new java.awt.Font("Helvetica", 1, 36)); // NOI18N
    jLabel4.setForeground(new java.awt.Color(255, 255, 255));
    jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel4.setText("Curso");
    jLabel4.setOpaque(true);
    jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 80));

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
    jPanel1.add(btn_aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 140, 40));

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
    jPanel1.add(btn_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, 140, 40));

    jPanel2.setBackground(new java.awt.Color(57, 62, 70));
    jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    cs_fecha.setEditable(false);
    cs_fecha.setBackground(new java.awt.Color(238, 238, 238));
    cs_fecha.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
    cs_fecha.setForeground(new java.awt.Color(34, 40, 49));
    cs_fecha.setText("yyyy/mm/dd");
    cs_fecha.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        cs_fechaMouseClicked(evt);
      }
    });
    jPanel2.add(cs_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 220, 40));

    jLabel2.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
    jLabel2.setForeground(new java.awt.Color(238, 238, 238));
    jLabel2.setText("Nucleo");
    jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 150, 40));

    jLabel1.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
    jLabel1.setForeground(new java.awt.Color(238, 238, 238));
    jLabel1.setText("Fecha (yyyy/mm/dd)");
    jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 150, 40));

    tf_curso.setEditable(false);
    tf_curso.setBackground(new java.awt.Color(238, 238, 238));
    tf_curso.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
    tf_curso.setForeground(new java.awt.Color(34, 40, 49));
    tf_curso.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    tf_curso.setBorder(null);
    tf_curso.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        tf_cursoActionPerformed(evt);
      }
    });
    jPanel2.add(tf_curso, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 220, 40));

    cb_nucleo.setBackground(new java.awt.Color(238, 238, 238));
    cb_nucleo.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
    cb_nucleo.setForeground(new java.awt.Color(34, 40, 49));
    cb_nucleo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione nucleo" }));
    cb_nucleo.addItemListener(new java.awt.event.ItemListener() {
      public void itemStateChanged(java.awt.event.ItemEvent evt) {
        cb_nucleoItemStateChanged(evt);
      }
    });
    jPanel2.add(cb_nucleo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 220, 40));

    jLabel3.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
    jLabel3.setForeground(new java.awt.Color(238, 238, 238));
    jLabel3.setText("CodCurso");
    jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, 30));

    jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 440, 200));

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

    private void btn_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aceptarActionPerformed
        if (cb_nucleo.getSelectedIndex()>0 && cs_fecha.getText()!="" && tf_curso.getText()!="" ){
            crud.insertarCurso(crud.buscarCodNucleo(cb_nucleo.getSelectedItem().toString()), tf_curso.getText(), cs_fecha.getText());
        }
    }//GEN-LAST:event_btn_aceptarActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void tf_cursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_cursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_cursoActionPerformed

    private void cb_nucleoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_nucleoItemStateChanged
        // TODO add your handling code here:
        if (cb_nucleo.getSelectedIndex()>0) {
            tf_curso.setEditable(true);
            cs_fecha.setEditable(true);
        }
    }//GEN-LAST:event_cb_nucleoItemStateChanged

  private void cs_fechaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cs_fechaMouseClicked
    if(this.cs_fecha.getText().equals("yyyy/mm/dd")){
      this.cs_fecha.setText("");
    }
  }//GEN-LAST:event_cs_fechaMouseClicked

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
            java.util.logging.Logger.getLogger(VCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VCurso().setVisible(true);
            }
        });
    }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btn_aceptar;
  private javax.swing.JButton btn_cancelar;
  private javax.swing.JComboBox<String> cb_nucleo;
  private javax.swing.JTextField cs_fecha;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JTextField tf_curso;
  // End of variables declaration//GEN-END:variables
}
