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
public class FTambahMahasiswa extends javax.swing.JInternalFrame {
    koneksi konek = new koneksi ();
    private ActionEvent evt;

    /**
     * Creates new form FTambahMahasiswa
     */
    public FTambahMahasiswa() {
        initComponents();
        btRefreshMhsActionPerformed(evt);
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
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tfNIM = new javax.swing.JTextField();
        tfNamaMahasiswa = new javax.swing.JTextField();
        tfTempatLahir = new javax.swing.JTextField();
        tfJK = new javax.swing.JTextField();
        tfAlamat = new javax.swing.JTextField();
        tfNoTlp = new javax.swing.JTextField();
        tfEmail = new javax.swing.JTextField();
        tfAsalSekolah = new javax.swing.JTextField();
        tfJurusan = new javax.swing.JTextField();
        tfOrangTua = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTBMahasiswa = new javax.swing.JTable();
        btSimpan = new javax.swing.JButton();
        btRefreshMhs = new javax.swing.JButton();
        dcTanggal = new com.toedter.calendar.JDateChooser();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Form Tambah Mahasiswa");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("TAMBAH MAHASISWA");

        jLabel2.setText("NIM");

        jLabel3.setText("Nama Mahasiswa");

        jLabel4.setText("Tempat Lahir");

        jLabel5.setText("Tanggal Lahir");

        jLabel6.setText("Jenis Kelamin");

        jLabel7.setText("Alamat");

        jLabel8.setText("No. Tlp");

        jLabel9.setText("Email");

        jLabel10.setText("Asal Sekolah");

        jLabel11.setText("Jurusan");

        jLabel12.setText("Orang Tua");

        tfTempatLahir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTempatLahirActionPerformed(evt);
            }
        });

        tfOrangTua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfOrangTuaActionPerformed(evt);
            }
        });

        jTBMahasiswa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "NIM", "Nama Mahasiswa", "Tempat Lahir", "Tanggal Lahir", "Jenis Kelamin", "Alamat", "No. Tlp", "Email", "Asal Sekolah", "Jurusan", "Orang Tua"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTBMahasiswa);

        btSimpan.setText("Simpan");
        btSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSimpanActionPerformed(evt);
            }
        });

        btRefreshMhs.setText("Refresh");
        btRefreshMhs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRefreshMhsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfJK, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfTempatLahir, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                    .addComponent(dcTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNamaMahasiswa)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btSimpan)
                            .addGap(46, 46, 46)
                            .addComponent(btRefreshMhs))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tfAlamat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addComponent(tfOrangTua, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfJurusan, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfAsalSekolah, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfEmail, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfNoTlp, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addComponent(tfNIM))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tfNIM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(tfNamaMahasiswa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(tfTempatLahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(dcTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(tfJK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(tfAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(tfNoTlp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(tfAsalSekolah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(tfJurusan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(tfOrangTua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btSimpan)
                    .addComponent(btRefreshMhs))
                .addGap(0, 13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfTempatLahirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTempatLahirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTempatLahirActionPerformed

    private void tfOrangTuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfOrangTuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfOrangTuaActionPerformed

    private void btSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSimpanActionPerformed
    String nim = tfNIM.getText();
    String nama_mhs = tfNamaMahasiswa.getText();
    String tempat_lahir = tfTempatLahir.getText();
    String tanggal_lahir = new SimpleDateFormat("yyyy-MM-dd").format(dcTanggal.getDate());
    String jenis_kelamin = tfJK.getText();
    String alamat = tfAlamat.getText();
    String no_hp = tfNoTlp.getText();
    String email = tfEmail.getText();
    String asal_sekolah = tfAsalSekolah.getText();
    String jurusan = tfJurusan.getText();
    String orang_tua = tfOrangTua.getText();
    
    if (!nim.isEmpty() && !nama_mhs.isEmpty()) {
        String sql = "INSERT INTO daftar_mahasiswa(nim, nama_mhs, tempat_lahir, tgl_lahir, jenis_kelamin, alamat, no_hp, email, asal_sekolah, jurusan, orang_tua) VALUES('"+ nim + "', '" + nama_mhs + "', '" + tempat_lahir + "', '" + tanggal_lahir + "', '"+ jenis_kelamin + "', '" + alamat + "', '" + no_hp + "', '" + email + "', '" + asal_sekolah + "', '"+ jurusan + "', '" + orang_tua + "')";
        try {
            Statement s = konek.getKoneksi().createStatement();
            s.executeUpdate(sql);
            s.close();
            JOptionPane.showMessageDialog(this, "Data Dosen Berhasil Disimpan");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Data Dosen Gagal Disimpan: " + e);
        }
    } else {
        JOptionPane.showMessageDialog(this, "NIM dan Nama Mahasiswa harus di isi dengan benar." ); 
    }
        this.btRefreshMhsActionPerformed(evt);
        tfNIM.setText("");
        tfNamaMahasiswa.setText("");
        tfTempatLahir.setText("");
        tfJK.setText("");
        tfAlamat.setText("");
        tfNoTlp.setText("");
        tfEmail.setText("");
        tfAsalSekolah.setText("");
        tfJurusan.setText("");
        tfOrangTua.setText("");
    }//GEN-LAST:event_btSimpanActionPerformed

    private void btRefreshMhsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRefreshMhsActionPerformed
    DefaultTableModel tabelmahasiswa = new DefaultTableModel();
        tabelmahasiswa.addColumn("No");
        tabelmahasiswa.addColumn("ID");
        tabelmahasiswa.addColumn("NIM");
        tabelmahasiswa.addColumn("Nama Mahasiswa");
        tabelmahasiswa.addColumn("Tempat Lahir");
        tabelmahasiswa.addColumn("Tanggal Lahir");
        tabelmahasiswa.addColumn("Jenis Kelamin");
        tabelmahasiswa.addColumn("Alamat");
        tabelmahasiswa.addColumn("No. Tlp");
        tabelmahasiswa.addColumn("Email");
        tabelmahasiswa.addColumn("Asal Sekolah");
        tabelmahasiswa.addColumn("Jurusan");
        tabelmahasiswa.addColumn("Orang Tua");
    try{ //PENGUJIAN
        String sql = "Select * from daftar_mahasiswa ";
        Statement st = konek.getKoneksi().createStatement();
        ResultSet hasil = st.executeQuery(sql);
        int no = 0;
        while(hasil.next()){
            no = no + 1;
            tabelmahasiswa.addRow(new Object[]{no, hasil.getString(1), hasil.getString(2), hasil.getString(3), hasil.getString(4), hasil.getString(5), hasil.getString(6), hasil.getString(7), hasil.getString(8), hasil.getString(9), hasil.getString(10), hasil.getString(11), hasil.getString(12)});
        }
    jTBMahasiswa.setModel(tabelmahasiswa);
        }catch(Exception e){//JIKA TIDAK BERHASIL
        JOptionPane.showMessageDialog(this, "Kesalahan : " + e);
    
        }
      
    }//GEN-LAST:event_btRefreshMhsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btRefreshMhs;
    private javax.swing.JButton btSimpan;
    private com.toedter.calendar.JDateChooser dcTanggal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTBMahasiswa;
    private javax.swing.JTextField tfAlamat;
    private javax.swing.JTextField tfAsalSekolah;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfJK;
    private javax.swing.JTextField tfJurusan;
    private javax.swing.JTextField tfNIM;
    private javax.swing.JTextField tfNamaMahasiswa;
    private javax.swing.JTextField tfNoTlp;
    private javax.swing.JTextField tfOrangTua;
    private javax.swing.JTextField tfTempatLahir;
    // End of variables declaration//GEN-END:variables
}
