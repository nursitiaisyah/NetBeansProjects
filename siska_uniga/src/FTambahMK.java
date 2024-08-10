/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
import java.sql.*;
import javax.swing.JOptionPane;
import lib.koneksi;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.text.SimpleDateFormat;
/**
 *
 * @author ASUS VIVOBOOK
 */
public class FTambahMK extends javax.swing.JInternalFrame {
    koneksi konek = new koneksi ();
    private ActionEvent evt;
    /**
     * Creates new form FTambahMK
     */
    public FTambahMK() {
        initComponents();
        btRefreshMKActionPerformed(evt);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfKodeMK = new javax.swing.JTextField();
        tfNamaMK = new javax.swing.JTextField();
        tfKredit = new javax.swing.JTextField();
        tfPrasyarat = new javax.swing.JTextField();
        tfStatus = new javax.swing.JTextField();
        tfThMK = new javax.swing.JTextField();
        btSimpan = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTBTambahMK = new javax.swing.JTable();
        btRefreshMK = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Form Tambah MK");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("TAMBAH MK");

        jLabel2.setText("Kode MK");

        jLabel3.setText("Nama MK");

        jLabel4.setText("Kredit");

        jLabel5.setText("Prasyarat");

        jLabel6.setText("Status");

        jLabel7.setText("Tahun Semester");

        btSimpan.setText("Simpan");
        btSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSimpanActionPerformed(evt);
            }
        });

        jTBTambahMK.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Kode MK", "Nama MK", "Kredit", "Prasyarat", "Stasus", "Tahun Semester"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTBTambahMK);

        btRefreshMK.setText("Refresh");
        btRefreshMK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRefreshMKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(53, 53, 53)
                                .addComponent(tfKodeMK))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btSimpan)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btRefreshMK))
                                    .addComponent(tfStatus)
                                    .addComponent(tfThMK)
                                    .addComponent(tfPrasyarat)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(71, 71, 71)
                                        .addComponent(tfKredit))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(49, 49, 49)
                                        .addComponent(tfNamaMK, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(400, 400, 400)
                        .addComponent(jLabel1)))
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tfKodeMK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tfNamaMK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tfKredit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(tfPrasyarat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(tfStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(tfThMK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btSimpan)
                            .addComponent(btRefreshMK)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btRefreshMKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRefreshMKActionPerformed
    DefaultTableModel tabelmk = new DefaultTableModel();
        tabelmk.addColumn("No");
        tabelmk.addColumn("ID MK");
        tabelmk.addColumn("Kode MK");
        tabelmk.addColumn("Nama MK");
        tabelmk.addColumn("Kredit");
        tabelmk.addColumn("Prasyarat");
        tabelmk.addColumn("Status");
        tabelmk.addColumn("Tahun Semester");
    try {
        String sql = "Select * from daftar_mk ";
        Statement st = konek.getKoneksi().createStatement();
        ResultSet hasil = st.executeQuery(sql);
        int no = 0;
        while (hasil.next()) {
            no = no + 1;
            tabelmk.addRow(new Object[]{no, hasil.getString(1), hasil.getString(2), hasil.getString(3), hasil.getString(4), hasil.getString(5), hasil.getString(6), hasil.getString(7)});
        }
        jTBTambahMK.setModel(tabelmk); // jTBMatkul adalah nama tabel untuk menampilkan data mata kuliah
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Kesalahan : " + e);
    }
    }//GEN-LAST:event_btRefreshMKActionPerformed

    private void btSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSimpanActionPerformed
                                        
    String kodeMK = tfKodeMK.getText();
    String namaMK = tfNamaMK.getText();
    int kredit = Integer.parseInt(tfKredit.getText());
    String prasyarat = tfPrasyarat.getText();
    String status = tfStatus.getText();
    String tahunSemester = tfThMK.getText();

    if (!kodeMK.isEmpty() && !namaMK.isEmpty()) {
        String sql = "INSERT INTO daftar_mk(kode_mk, nama_mk, kredit, prasyarat, status, tahun_semester) VALUES('" + kodeMK + "', '" + namaMK + "', " + kredit + ", '" + prasyarat + "', '" + status + "', '" + tahunSemester + "')";

        try {
            Statement s = konek.getKoneksi().createStatement();
            s.executeUpdate(sql);
            s.close();
            JOptionPane.showMessageDialog(this, "Data Mata Kuliah Berhasil Disimpan");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Data Mata Kuliah Gagal Disimpan: " + e);
        }
    } else {
        JOptionPane.showMessageDialog(this, "Kode MK dan Nama MK harus diisi dengan benar.");
    }

    this.btRefreshMKActionPerformed(evt);
    tfKodeMK.setText("");
    tfNamaMK.setText("");
    tfKredit.setText("");
    tfPrasyarat.setText("");
    tfStatus.setText("");
    tfThMK.setText("");


    }//GEN-LAST:event_btSimpanActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btRefreshMK;
    private javax.swing.JButton btSimpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTBTambahMK;
    private javax.swing.JTextField tfKodeMK;
    private javax.swing.JTextField tfKredit;
    private javax.swing.JTextField tfNamaMK;
    private javax.swing.JTextField tfPrasyarat;
    private javax.swing.JTextField tfStatus;
    private javax.swing.JTextField tfThMK;
    // End of variables declaration//GEN-END:variables
}
