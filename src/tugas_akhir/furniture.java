/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tugas_akhir;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author supercellmoonton
 */
public class furniture extends javax.swing.JFrame {

    /**
     * Creates new form furniture
     */
     public Statement st;
    public ResultSet rs;
    Connection cn = koneksi.DBConnection.OpenKoneksi();
    
    public furniture() {
        initComponents();
        TampilData();
    }
    
    private void Bersih(){
        txtId.setText("");
        txtNama.setText("");
        txtJmlh.setText("");
        txtHrg.setText("");
        
        btnSimpan.setText("Simpan");
        txtId.setEditable(true);
    }
    
    private void TampilData(){
        try{
            st = cn.createStatement();
            rs = st.executeQuery("SELECT * FROM barang");
            
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("NO. ");
            model.addColumn("KODE BARANG");
            model.addColumn("JENIS BARANG");
            model.addColumn("JUMLAH BARANG");
            model.addColumn("HARGA PER UNIT");

            int no = 1;

            
            model.getDataVector().removeAllElements();
            model.fireTableDataChanged();
            model.setRowCount(0);
            
            while (rs.next()){
                Object[] data = {
                    no ++,
                  rs.getString("id_barang"),
                    rs.getString("nama_barang"),
                    rs.getString("jumlah_stok"),
                    rs.getString("harga")
                };
                model.addRow(data);
                tblData.setModel(model);
            }
        } catch (Exception e) {
            
        }
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        Id = new javax.swing.JLabel();
        Nama = new javax.swing.JLabel();
        Jmlh = new javax.swing.JLabel();
        Hrg = new javax.swing.JLabel();
        txtJudul = new javax.swing.JLabel();
        btnKeluar = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        txtJmlh = new javax.swing.JTextField();
        txtHrg = new javax.swing.JTextField();
        btnSimpan = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();
        btnBatal = new javax.swing.JButton();
        btnTransaksi = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Id.setText("KODE BARANG");
        getContentPane().add(Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        Nama.setText("JENIS BARANG");
        getContentPane().add(Nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        Jmlh.setText("JUMLAH STOK");
        getContentPane().add(Jmlh, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        Hrg.setText("HARGA /UNIT");
        getContentPane().add(Hrg, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, -1));

        txtJudul.setText("TOKO FURNITURE");
        getContentPane().add(txtJudul, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        btnKeluar.setText("Keluar");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });
        getContentPane().add(btnKeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, -1, -1));

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });
        getContentPane().add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 280, -1));
        getContentPane().add(txtNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 280, -1));
        getContentPane().add(txtJmlh, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 280, -1));

        txtHrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHrgActionPerformed(evt);
            }
        });
        getContentPane().add(txtHrg, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 280, -1));

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });
        getContentPane().add(btnSimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 320, -1, -1));

        btnHapus.setText("Hapus");
        btnHapus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHapusMouseClicked(evt);
            }
        });
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });
        getContentPane().add(btnHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, -1, -1));

        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "KODE BARANG", "JENIS BARANG", "JUMLAH BARANG", "HARGA PER UNIT"
            }
        ));
        tblData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDataMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblData);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 560, 200));

        btnBatal.setText("Batal");
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });
        getContentPane().add(btnBatal, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, -1, -1));

        btnTransaksi.setText("Penjualan");
        btnTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransaksiActionPerformed(evt);
            }
        });
        getContentPane().add(btnTransaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        // TODO add your handling code here:
         Login log = new Login();
         log.setVisible(true);
    }//GEN-LAST:event_btnKeluarActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void txtHrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHrgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHrgActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
         // TODO add your handling code here:
         try{
             st = cn.createStatement();
             if(txtId.getText().equals("") || 
                     txtNama.getText().equals("") || txtJmlh.getText().equals("") || 
                     txtHrg.getText().equals("")){
                 JOptionPane.showMessageDialog(null, "Data tidak boleh kosong", "Validasi Data", JOptionPane.INFORMATION_MESSAGE);
                 return;
                 
                 
             }
             //Aksi Simpan Wak
             if(btnSimpan.getText() == "Simpan"){
                 String cek = "SELECT * FROM barang WHERE id_barang = '" + txtId.getText() + "'";
                 rs = st.executeQuery(cek);
                 if(rs.next()){
                     JOptionPane.showMessageDialog(null, "Alamak. . . Kode barang sudah ada");
                     
                 } else{
                     String sql = "INSERT INTO barang VALUES ('" + txtId.getText() + 
                             "','" + txtNama.getText()+
                             "','" + txtJmlh.getText()+
                             "','" + txtHrg.getText() + "')";
                     st.executeUpdate(sql);
                     JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
                     Bersih();
                     TampilData();
                 }
             }else{
                 //aksi ubah wak
                 String update = "UPDATE barang SET nama_barang = '" + txtNama.getText() +
                         "', jumlah_stok = '" + txtJmlh.getText() + 
                         "', harga = '" + txtHrg.getText() + 
                         "' WHERE id_barang = '" + txtId.getText() + "'";
                 st.executeUpdate(update);
                 JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
                 Bersih();
                 TampilData();
                 
                 
                 
             }
         } catch (Exception e){
             JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
             
         }
         
        
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        if(txtId.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Silahkan pilih data yang akan dihapus hehe");
        } else{
            int jawab = JOptionPane.showConfirmDialog(null, "Data ini akan dihapus, Lanjutkan Nggak nih?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
            if (jawab == 0){
                try{
                    st = cn.createStatement();
                    String sql = "DELETE FROM barang WHERE id_barang = '" + txtId.getText() + "'";
                    st.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus Yahahahahahaha");
                    Bersih();
                    TampilData();  
                } catch (Exception e){
                    JOptionPane.showMessageDialog(null, e);
                }
                
            }
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnHapusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHapusMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHapusMouseClicked

    private void tblDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDataMouseClicked
        // TODO add your handling code here:
        txtId.setText(tblData.getValueAt(tblData.getSelectedRow(), 1).toString());
        txtNama.setText(tblData.getValueAt(tblData.getSelectedRow(), 2).toString());
        txtJmlh.setText(tblData.getValueAt(tblData.getSelectedRow(), 3).toString());
        txtHrg.setText(tblData.getValueAt(tblData.getSelectedRow(), 4).toString());
        
        txtId.setEditable(false);
        btnSimpan.setText("Ubah");
    }//GEN-LAST:event_tblDataMouseClicked

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        // TODO add your handling code here:
        Bersih();
    }//GEN-LAST:event_btnBatalActionPerformed

    private void btnTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransaksiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTransaksiActionPerformed

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
            java.util.logging.Logger.getLogger(furniture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(furniture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(furniture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(furniture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new furniture().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Hrg;
    private javax.swing.JLabel Id;
    private javax.swing.JLabel Jmlh;
    private javax.swing.JLabel Nama;
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnTransaksi;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable tblData;
    private javax.swing.JTextField txtHrg;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtJmlh;
    private javax.swing.JLabel txtJudul;
    private javax.swing.JTextField txtNama;
    // End of variables declaration//GEN-END:variables
}
