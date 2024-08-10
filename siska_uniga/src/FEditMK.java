/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
import java.sql.*;
import javax.swing.JOptionPane;
import lib.koneksi;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;

/**
 *
 * @author ASUS VIVOBOOK
 */
public class FEditMK extends javax.swing.JInternalFrame {
    koneksi konek = new koneksi ();
    private ActionEvent evt;
    String pilKodeMK, pilNamaMK, pilKredit, pilPrasyarat, pilStatus, pilTahunSemester;

    /**
     * Creates new form FTambahMK
     */
    public FEditMK() {
        initComponents();
        btRefreshActionPerformed(evt);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTBEditMK = new javax.swing.JTable();
        btUbah = new javax.swing.JButton();
        btHapus = new javax.swing.JButton();
        btRefresh = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Form Tambah MK");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("EDIT MK");

        jLabel2.setText("Kode MK");

        jLabel3.setText("Nama MK");

        jLabel4.setText("Kredit");

        jLabel5.setText("Prasyarat");

        jLabel6.setText("Status");

        jLabel7.setText("Tahun Semester");

        jTBEditMK.setModel(new javax.swing.table.DefaultTableModel(
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
        jTBEditMK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTBEditMKMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTBEditMK);

        btUbah.setText("Ubah");
        btUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUbahActionPerformed(evt);
            }
        });

        btHapus.setText("Hapus");
        btHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHapusActionPerformed(evt);
            }
        });

        btRefresh.setText("Refresh");
        btRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btRefresh))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
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
                                        .addComponent(btUbah)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btHapus))
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
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(400, 400, 400)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
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
                            .addComponent(btUbah)
                            .addComponent(btHapus)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btRefresh)
                .addGap(0, 9, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUbahActionPerformed
    String kodeMK = pilKodeMK;
    String namaMK = tfNamaMK.getText();
    int kredit = Integer.parseInt(tfKredit.getText());
    String prasyarat = tfPrasyarat.getText();
    String status = tfStatus.getText();
    String tahunSemester = tfThMK.getText();

    if (!kodeMK.isEmpty() && !namaMK.isEmpty()) {
    String sql = "UPDATE daftar_mk SET nama_mk='" + namaMK + "', kredit=" + kredit + ", prasyarat='" + prasyarat + "', status='" + status + "', tahun_semester='" + tahunSemester + "' WHERE kode_mk='" + kodeMK + "'";

    try {
        Statement s = konek.getKoneksi().createStatement();
        s.executeUpdate(sql);
        s.close();
        JOptionPane.showMessageDialog(this, "Data Mata Kuliah Berhasil Diubah");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Data Mata Kuliah Gagal Diubah: " + e);
    }
    } else {
    JOptionPane.showMessageDialog(this, "Kode MK dan Nama MK harus di isi dengan benar.");
}

    this.btRefreshActionPerformed(evt);
    tfKodeMK.setText("");
    tfNamaMK.setText("");
    tfKredit.setText("");
    tfPrasyarat.setText("");
    tfStatus.setText("");
    tfThMK.setText("");

    }//GEN-LAST:event_btUbahActionPerformed

    private void btRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRefreshActionPerformed
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
        jTBEditMK.setModel(tabelmk); // jTBMatkul adalah nama tabel untuk menampilkan data mata kuliah
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Kesalahan : " + e);
    }
    }//GEN-LAST:event_btRefreshActionPerformed

    private void btHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHapusActionPerformed
    String hapus = "DELETE FROM daftar_mk WHERE kode_mk='" + pilKodeMK + "'";
if (JOptionPane.showConfirmDialog(null, "Apakah Anda yakin menghapus data " + pilKodeMK + " ini?", "Informasi",
        JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE) == JOptionPane.OK_OPTION) {
    try {
        Connection connection = konek.getKoneksi();
        String sql = "DELETE FROM daftar_mk WHERE kode_mk=?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, pilKodeMK);

            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
                this.btRefreshActionPerformed(evt);
            } else {
                JOptionPane.showMessageDialog(null, "Data tidak ditemukan");
            }
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Terjadi Kesalahan: " + e);
    }
} else {
    this.btRefreshActionPerformed(evt);
    tfKodeMK.setText("");
    tfNamaMK.setText("");
    tfKredit.setText("");
    tfPrasyarat.setText("");
    tfStatus.setText("");
    tfThMK.setText("");
}

    }//GEN-LAST:event_btHapusActionPerformed

    private void jTBEditMKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTBEditMKMouseClicked
        int i = this.jTBEditMK.getSelectedRow();
if (i == -1) {
    return;
}

pilKodeMK = (String) this.jTBEditMK.getValueAt(i, 2);
tfKodeMK.setText(pilKodeMK);

pilNamaMK = (String) this.jTBEditMK.getValueAt(i, 3);
tfNamaMK.setText(pilNamaMK);

pilKredit = String.valueOf(this.jTBEditMK.getValueAt(i, 4));
tfKredit.setText(pilKredit);

pilPrasyarat = (String) this.jTBEditMK.getValueAt(i, 5);
tfPrasyarat.setText(pilPrasyarat);

pilStatus = (String) this.jTBEditMK.getValueAt(i, 6);
tfStatus.setText(pilStatus);

pilTahunSemester = (String) this.jTBEditMK.getValueAt(i, 7);
tfThMK.setText(pilTahunSemester);

    }//GEN-LAST:event_jTBEditMKMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btHapus;
    private javax.swing.JButton btRefresh;
    private javax.swing.JButton btUbah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTBEditMK;
    private javax.swing.JTextField tfKodeMK;
    private javax.swing.JTextField tfKredit;
    private javax.swing.JTextField tfNamaMK;
    private javax.swing.JTextField tfPrasyarat;
    private javax.swing.JTextField tfStatus;
    private javax.swing.JTextField tfThMK;
    // End of variables declaration//GEN-END:variables
}