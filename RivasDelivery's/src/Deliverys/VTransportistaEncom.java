/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deliverys;

import CRUD.CRUDBase;
import CRUD.Encomiendas;
import Conexion.Conexion;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author angel
 */
public class VTransportistaEncom extends javax.swing.JFrame {
    
    Conexion conexion = new Conexion();
    public static CRUD.CRUDBase crud;
    DefaultTableModel table;

  /**
   * Creates new form VTransportistaEncom
   */
  public VTransportistaEncom() {
    initComponents();
    crud = new CRUDBase(conexion.conectar());
    crud.comboboxPaises(this.cb_pais);
    table = (DefaultTableModel)this.tb_encomienda.getModel();
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
        tb_encomienda = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btn_buscar = new javax.swing.JButton();
        Btn_Ingresar = new javax.swing.JButton();
        cb_pais = new javax.swing.JComboBox<>();
        cb_estado = new javax.swing.JComboBox<>();
        cb_ciudad = new javax.swing.JComboBox<>();

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
        jLabel4.setText("Encomiendas Disponibles");
        jLabel4.setOpaque(true);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 80));

        tb_encomienda.setBackground(new java.awt.Color(57, 62, 70));
        tb_encomienda.setFont(new java.awt.Font("Helvetica", 1, 12)); // NOI18N
        tb_encomienda.setForeground(new java.awt.Color(238, 238, 238));
        tb_encomienda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CodEncomienda", "Pais", "Estado", "Ciudad", "Volumen", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_encomienda.setEnabled(false);
        tb_encomienda.setSelectionForeground(new java.awt.Color(57, 62, 70));
        tb_encomienda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_encomiendaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_encomienda);
        if (tb_encomienda.getColumnModel().getColumnCount() > 0) {
            tb_encomienda.getColumnModel().getColumn(0).setResizable(false);
            tb_encomienda.getColumnModel().getColumn(1).setResizable(false);
            tb_encomienda.getColumnModel().getColumn(2).setResizable(false);
            tb_encomienda.getColumnModel().getColumn(3).setResizable(false);
            tb_encomienda.getColumnModel().getColumn(4).setResizable(false);
            tb_encomienda.getColumnModel().getColumn(5).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 1080, 490));

        jLabel1.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(238, 238, 238));
        jLabel1.setText("Ubicación Destino:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 160, 40));

        btn_buscar.setBackground(new java.awt.Color(253, 112, 20));
        btn_buscar.setFont(new java.awt.Font("Helvetica", 1, 17)); // NOI18N
        btn_buscar.setForeground(new java.awt.Color(238, 238, 238));
        btn_buscar.setText("Buscar");
        btn_buscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(253, 112, 20)));
        btn_buscar.setBorderPainted(false);
        btn_buscar.setFocusPainted(false);
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 100, 100, 40));

        Btn_Ingresar.setBackground(new java.awt.Color(253, 112, 20));
        Btn_Ingresar.setFont(new java.awt.Font("Helvetica", 1, 17)); // NOI18N
        Btn_Ingresar.setForeground(new java.awt.Color(238, 238, 238));
        Btn_Ingresar.setText("Aceptar");
        Btn_Ingresar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(253, 112, 20)));
        Btn_Ingresar.setBorderPainted(false);
        Btn_Ingresar.setFocusPainted(false);
        Btn_Ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_IngresarActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_Ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 660, 140, 40));

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
        jPanel1.add(cb_pais, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 220, 40));

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
        jPanel1.add(cb_estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, 220, 40));

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
        cb_ciudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_ciudadActionPerformed(evt);
            }
        });
        jPanel1.add(cb_ciudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 100, 220, 40));

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

      this.dispose();
  }//GEN-LAST:event_Btn_IngresarActionPerformed

    private void cb_paisItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_paisItemStateChanged
        String paisito = crud.buscarCodPais(cb_pais.getSelectedItem().toString());
        if (this.cb_pais.getSelectedIndex() > 0) {
            this.cb_estado.removeAllItems();
            this.cb_estado.setEnabled(true);
            crud.comboboxEstados(this.cb_estado, paisito);
        }
        else {
            this.cb_estado.removeAllItems();
        }
    }//GEN-LAST:event_cb_paisItemStateChanged

    private void cb_paisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_paisActionPerformed

    }//GEN-LAST:event_cb_paisActionPerformed

    private void cb_estadoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_estadoItemStateChanged
        if (this.cb_estado.getSelectedIndex() > 0) {
            String paisito = crud.buscarCodPais(this.cb_pais.getSelectedItem().toString());
            String estadito = crud.buscarCodEstado(this.cb_estado.getSelectedItem().toString(), paisito);
            this.cb_ciudad.removeAllItems();
            this.cb_ciudad.setEnabled(true);
            crud.comboboxCiudad(this.cb_ciudad, paisito, estadito);
        } else {
            this.cb_ciudad.removeAllItems();
        }
    }//GEN-LAST:event_cb_estadoItemStateChanged

    private void cb_estadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_estadoActionPerformed

    }//GEN-LAST:event_cb_estadoActionPerformed

    private void cb_ciudadItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_ciudadItemStateChanged

        if (cb_ciudad.getSelectedIndex()>0) {
            btn_buscar.setEnabled(true);
        }else{
            btn_buscar.setEnabled(false);
        }
    }//GEN-LAST:event_cb_ciudadItemStateChanged

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        // TODO add your handling code here:
        if((cb_pais.getSelectedIndex()>0)&&(cb_estado.getSelectedIndex()>0)&&(cb_ciudad.getSelectedIndex()>0)){
            String paisito = crud.buscarCodPais(this.cb_pais.getSelectedItem().toString());
            String estadito = crud.buscarCodEstado(this.cb_estado.getSelectedItem().toString(), paisito);
            String ciudad = crud.buscarCodCiudad(paisito, estadito, cb_ciudad.getSelectedItem().toString());
            List<Encomiendas> lista = VTransportistaDatos.crud.encomiendasDisponibles(VTransportistaDatos.ident,paisito, estadito, ciudad);
            for (Encomiendas list : lista) {
                String []datos = new String[6];
                datos[0]=list.getCodEncomienda();
                datos[1]=crud.buscarNombPais(list.getCod_pais());
                datos[2]=crud.buscarNombEstado(list.getCod_pais(),list.getCod_estado());
                datos[3]=crud.buscarNombCiudad(list.getCod_pais(), list.getCod_estado(), list.getCod_ciudad());
                datos[4]=String.valueOf(Float.valueOf(list.getVolumen())/10);
                datos[5]=list.getPrecio();
                table.addRow(datos);
            }
            
        }
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void cb_ciudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_ciudadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_ciudadActionPerformed

    private void tb_encomiendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_encomiendaMouseClicked
        // TODO add your handling code here:
        int filaSeleccionada = this.tb_encomienda.rowAtPoint(evt.getPoint());
        String codEnco = table.getValueAt(filaSeleccionada, 0).toString();
        VTransportistaDatos.crud.insertSolicitud(VTransportistaDatos.ident, codEnco);
        JOptionPane.showMessageDialog(null, "Encomienda solicitada");
    }//GEN-LAST:event_tb_encomiendaMouseClicked

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
      java.util.logging.Logger.getLogger(VTransportistaEncom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(VTransportistaEncom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(VTransportistaEncom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(VTransportistaEncom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new VTransportistaEncom().setVisible(true);
      }
    });
  }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Ingresar;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JComboBox<String> cb_ciudad;
    private javax.swing.JComboBox<String> cb_estado;
    private javax.swing.JComboBox<String> cb_pais;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_encomienda;
    // End of variables declaration//GEN-END:variables
}
