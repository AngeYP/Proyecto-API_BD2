/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deliverys;

import CRUD.Encomiendas;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author angel
 */
public class VTransportistaListaE extends javax.swing.JFrame {
    DefaultTableModel tableListiner;
    String id;
    String codEncomienda;

  /**
   * Creates new form VTransportistaListaE
   */
    
  public VTransportistaListaE() {
    initComponents();
    tableListiner=(DefaultTableModel)this.jTable1.getModel();
    List<Encomiendas> lista= VTransportistaDatos.crud.encomiendasActuales(VTransportistaDatos.ident);
      for (Encomiendas enco : lista) {
          String []objeto= new String[8];
          objeto[0]=enco.getCodEncomienda();
          objeto[1]=enco.getStatus();
          objeto[2]=enco.getCod_pais();
          objeto[3]=enco.getCod_estado();
          objeto[4]=enco.getCod_ciudad();
          objeto[5]=enco.getPrecio();
          objeto[6]=enco.getDistancia();
          float precio=Float.valueOf(enco.getPrecio());
          precio = precio / 10;
          objeto[7]=String.valueOf(precio);
          tableListiner.addRow(objeto);
      }
      
      VTransportistaDatos.crud.comboboxVuelos(cb_codvuelos, id);
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
    jScrollPane1 = new javax.swing.JScrollPane();
    jTable1 = new javax.swing.JTable();
    Btn_Ingresar = new javax.swing.JButton();
    cb_codvuelos = new javax.swing.JComboBox<>();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

    jPanel1.setBackground(new java.awt.Color(34, 40, 49));
    jPanel1.setMaximumSize(new java.awt.Dimension(1080, 720));
    jPanel1.setMinimumSize(new java.awt.Dimension(1080, 720));
    jPanel1.setPreferredSize(new java.awt.Dimension(1080, 720));
    jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jLabel4.setBackground(new java.awt.Color(253, 112, 20));
    jLabel4.setFont(new java.awt.Font("Helvetica", 1, 36)); // NOI18N
    jLabel4.setForeground(new java.awt.Color(255, 255, 255));
    jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel4.setText("Lista de Encomiendas");
    jLabel4.setOpaque(true);
    jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 80));

    jTable1.setBackground(new java.awt.Color(57, 62, 70));
    jTable1.setFont(new java.awt.Font("Helvetica", 1, 12)); // NOI18N
    jTable1.setForeground(new java.awt.Color(238, 238, 238));
    jTable1.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {

      },
      new String [] {
        "Encomienda", "Estatus", "Pais", "Estado", "Ciudad", "Precio", "Distancia", "Peso"
      }
    ) {
      boolean[] canEdit = new boolean [] {
        false, false, false, false, false, false, false, false
      };

      public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit [columnIndex];
      }
    });
    jTable1.setEnabled(false);
    jTable1.setOpaque(false);
    jTable1.setSelectionForeground(new java.awt.Color(57, 62, 70));
    jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        jTable1MouseClicked(evt);
      }
    });
    jScrollPane1.setViewportView(jTable1);
    if (jTable1.getColumnModel().getColumnCount() > 0) {
      jTable1.getColumnModel().getColumn(0).setResizable(false);
      jTable1.getColumnModel().getColumn(1).setResizable(false);
      jTable1.getColumnModel().getColumn(2).setResizable(false);
      jTable1.getColumnModel().getColumn(3).setResizable(false);
      jTable1.getColumnModel().getColumn(4).setResizable(false);
      jTable1.getColumnModel().getColumn(5).setResizable(false);
      jTable1.getColumnModel().getColumn(6).setResizable(false);
      jTable1.getColumnModel().getColumn(7).setResizable(false);
    }

    jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 1080, 510));

    Btn_Ingresar.setBackground(new java.awt.Color(253, 112, 20));
    Btn_Ingresar.setFont(new java.awt.Font("Helvetica", 1, 17)); // NOI18N
    Btn_Ingresar.setForeground(new java.awt.Color(238, 238, 238));
    Btn_Ingresar.setText("Aceptar");
    Btn_Ingresar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(253, 112, 20)));
    Btn_Ingresar.setBorderPainted(false);
    Btn_Ingresar.setEnabled(false);
    Btn_Ingresar.setFocusPainted(false);
    Btn_Ingresar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        Btn_IngresarActionPerformed(evt);
      }
    });
    jPanel1.add(Btn_Ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 660, 140, 40));

    cb_codvuelos.setBackground(new java.awt.Color(238, 238, 238));
    cb_codvuelos.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
    cb_codvuelos.setForeground(new java.awt.Color(34, 40, 49));
    cb_codvuelos.addItemListener(new java.awt.event.ItemListener() {
      public void itemStateChanged(java.awt.event.ItemEvent evt) {
        cb_codvuelosItemStateChanged(evt);
      }
    });
    cb_codvuelos.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        cb_codvuelosActionPerformed(evt);
      }
    });
    jPanel1.add(cb_codvuelos, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 660, 320, 40));

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
  }// </editor-fold>//GEN-END:initComponents

  private void Btn_IngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_IngresarActionPerformed
    VTransportistaDatos.crud.agregarVuelo(codEncomienda, id, this.cb_codvuelos.getSelectedItem().toString());
  }//GEN-LAST:event_Btn_IngresarActionPerformed

  private void cb_codvuelosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_codvuelosItemStateChanged
    if(this.cb_codvuelos.getSelectedIndex()>0) {
      this.Btn_Ingresar.setEnabled(true);
    } else {
      this.Btn_Ingresar.setEnabled(false);
    }
  }//GEN-LAST:event_cb_codvuelosItemStateChanged

  private void cb_codvuelosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_codvuelosActionPerformed

  }//GEN-LAST:event_cb_codvuelosActionPerformed

  private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
    int filaSeleccionada = this.jTable1.rowAtPoint(evt.getPoint());
    codEncomienda = this.jTable1.getValueAt(filaSeleccionada, 0).toString();
  }//GEN-LAST:event_jTable1MouseClicked

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
      java.util.logging.Logger.getLogger(VTransportistaListaE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(VTransportistaListaE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(VTransportistaListaE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(VTransportistaListaE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new VTransportistaListaE().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton Btn_Ingresar;
  private javax.swing.JComboBox<String> cb_codvuelos;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTable jTable1;
  // End of variables declaration//GEN-END:variables
}
