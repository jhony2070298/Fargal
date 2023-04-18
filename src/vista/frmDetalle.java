package vista;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Sena CSET
 */
public class frmDetalle extends javax.swing.JFrame {

    /**
     * Creates new form frmDetalle
     */
    public frmDetalle() {
        initComponents();    
        this.setLocationRelativeTo(null);
    }
    
    DefaultTableModel tabladatos;
    
    public void creartabla() {
        Object modelodata[][] = new Object[0][0];
        Object modelotitulos[] = {"Producto", "Cantidad", "Valor productos"};
        tabladatos = new DefaultTableModel();
        tabladatos = new DefaultTableModel(modelodata, modelotitulos);
        this.tblDetalle.setModel(this.tabladatos);
    }

    public void borrartabla() {
        while (0 < this.tblDetalle.getRowCount()) {
            tblDetalle.setModel(new DefaultTableModel());
            this.creartabla();
        }
    }
    
    public void llenartabla(){
        /**
        try {
                borrartabla();
                obj.set();
                obj.buscar();
                while (obj.datos.next() == true) {
                    lblNumPed.setText(lblNumPed.getText()+"  " +obj.datos.getString(1));
                    lblFec.setText(lblFec.getText()+"  " +obj.datos.getString(2));
                    lblNomCli.setText(lblNomCli.getText()+"  " +obj.datos.getString(3));
                    lblEst.setText(lblEst.getText()+"  " +obj.datos.getString(4));
                    lblValPed.setText(lblValPed.getText()+"  "+obj.datos.getString(5));
                    String Producto = obj.datos.getString(6);
                    String Cantidad = obj.datos.getString(7);
                    String ValorProductos = obj.datos.getString(8);
                    Object fila[] = {Producto,Cantidad, ValorProductos};
                    tabladatos.addRow(fila);
                }
            } catch (SQLException ex) {
                System.out.println("error al llenar la tabla" + ex);
            }
        */
    }
    
    public void modificarEstado(){
        cboEst.setEnabled(true);
        btnGua.setEnabled(true);
    }
    
    public void editarEstado(){
        /**
        if (cboEst.getSelectedIndex()== 0) {
                cboEst.grabFocus();
                JOptionPane.showMessageDialog(null, "Debe seleccionar el nuevo estado que quiere asignar al pedido");
            }
        else {
            obj.setEstado((String) cboEst.getSelectedItem());
            obj.metodo();
        }
        */
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDetalle = new javax.swing.JTable();
        lblNumPed = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnReg = new javax.swing.JButton();
        lblNomCli = new javax.swing.JLabel();
        lblFec = new javax.swing.JLabel();
        cboEst = new javax.swing.JComboBox<>();
        lblValPed = new javax.swing.JLabel();
        btnMod = new javax.swing.JButton();
        btnGua = new javax.swing.JButton();
        lblEst = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(819, 535));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        tblDetalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto", "Cantidad", "Valor Productos"
            }
        ));
        jScrollPane1.setViewportView(tblDetalle);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(90, 270, 640, 200);

        lblNumPed.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNumPed.setText("N° Pedido:");
        jPanel1.add(lblNumPed);
        lblNumPed.setBounds(100, 99, 66, 17);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Detalle del pedido");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(70, 52, 141, 22);

        btnReg.setText("Regresar");
        jPanel1.add(btnReg);
        btnReg.setBounds(10, 11, 100, 23);

        lblNomCli.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNomCli.setText("Nombre cliente:");
        jPanel1.add(lblNomCli);
        lblNomCli.setBounds(70, 155, 96, 17);

        lblFec.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblFec.setText("Fecha:");
        jPanel1.add(lblFec);
        lblFec.setBounds(125, 127, 41, 17);

        cboEst.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "Aprobado", "Pendiente", "Cancelado" }));
        cboEst.setEnabled(false);
        jPanel1.add(cboEst);
        cboEst.setBounds(184, 184, 120, 20);

        lblValPed.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblValPed.setText("Valor total:");
        jPanel1.add(lblValPed);
        lblValPed.setBounds(100, 220, 70, 17);

        btnMod.setText("Modificar");
        btnMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModActionPerformed(evt);
            }
        });
        jPanel1.add(btnMod);
        btnMod.setBounds(505, 220, 90, 23);

        btnGua.setText("Guardar");
        btnGua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuaActionPerformed(evt);
            }
        });
        jPanel1.add(btnGua);
        btnGua.setBounds(620, 220, 90, 23);

        lblEst.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblEst.setText("Estado:");
        jPanel1.add(lblEst);
        lblEst.setBounds(119, 184, 47, 17);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 820, 540);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModActionPerformed
    this.modificarEstado();    // TODO add your handling code here:
    }//GEN-LAST:event_btnModActionPerformed

    private void btnGuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuaActionPerformed
    this.editarEstado();        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuaActionPerformed

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
            java.util.logging.Logger.getLogger(frmDetalle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmDetalle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmDetalle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmDetalle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmDetalle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGua;
    private javax.swing.JButton btnMod;
    private javax.swing.JButton btnReg;
    private javax.swing.JComboBox<String> cboEst;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEst;
    private javax.swing.JLabel lblFec;
    private javax.swing.JLabel lblNomCli;
    private javax.swing.JLabel lblNumPed;
    private javax.swing.JLabel lblValPed;
    private javax.swing.JTable tblDetalle;
    // End of variables declaration//GEN-END:variables
}
