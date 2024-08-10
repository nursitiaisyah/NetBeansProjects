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
public class FEditMahasiswa extends javax.swing.JInternalFrame {
    koneksi konek = new koneksi ();
    private ActionEvent evt;
    String pilNIM, pilNamaMahasiswa, pilTempatLahir, pilJenisKelamin, pilAlamat, pilNoTlp, pilEmail, pilAsalSekolah, pilJurusan, pilOrangTua;


    /**
     * Creates new form FTambahMahasiswa
     */
    public FEditMahasiswa() {
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
        btRefreshMhs = new javax.swing.JButton();
        dcTanggal = new com.toedter.calendar.JDateChooser();
        btUbahMhs = new javax.swing.JButton();
        btHapusMhs = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Form Tambah Mahasiswa");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("EDIT MAHASISWA");

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
        jTBMahasiswa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTBMahasiswaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTBMahasiswa);

        btRefreshMhs.setText("Refresh");
        btRefreshMhs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRefreshMhsActionPerformed(evt);
            }
        });

        btUbahMhs.setText("Ubah");
        btUbahMhs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUbahMhsActionPerformed(evt);
            }
        });

        btHapusMhs.setText("Hapus");
        btHapusMhs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHapusMhsActionPerformed(evt);
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
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(btUbahMhs)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btHapusMhs))
                        .addComponent(tfAlamat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                        .addComponent(tfOrangTua, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tfJurusan, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tfAsalSekolah, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tfEmail, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tfNoTlp, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(tfNIM))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btRefreshMhs)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(309, 309, 309))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btUbahMhs)
                    .addComponent(btRefreshMhs)
                    .addComponent(btHapusMhs))
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
        
        tabelmahasiswa.setRowCount(0);
        while(hasil.next()){
            no = no + 1;
            tabelmahasiswa.addRow(new Object[]{no, hasil.getString(1), hasil.getString(2), hasil.getString(3), hasil.getString(4), hasil.getString(5), hasil.getString(6), hasil.getString(7), hasil.getString(8), hasil.getString(9), hasil.getString(10), hasil.getString(11), hasil.getString(12)});
        }
    jTBMahasiswa.setModel(tabelmahasiswa);
        }catch(Exception e){//JIKA TIDAK BERHASIL
        JOptionPane.showMessageDialog(this, "Kesalahan : " + e);
        }
    }//GEN-LAST:event_btRefreshMhsActionPerformed

    private void btUbahMhsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUbahMhsActionPerformed

    String nim              = pilNIM;
    String nama_mhs         = tfNamaMahasiswa.getText(); 
    String tempat_lahir     = tfTempatLahir.getText();
    String tanggal_lahir    = new SimpleDateFormat("yyyy-MM-dd").format(dcTanggal.getDate());
    String jenis_kelamin    = tfJK.getText();
    String alamat           = tfAlamat.getText();
    String no_hp            = tfNoTlp.getText();
    String email            = tfEmail.getText();
    String asal_sekolah     = tfAsalSekolah.getText();
    String jurusan          = tfJurusan.getText();
    String orang_tua        = tfOrangTua.getText();
    
    if (!nim.isEmpty() && !nama_mhs.isEmpty()) {
        String sql = "UPDATE daftar_mahasiswa SET nama_mhs='"+nama_mhs+"', tempat_lahir='"+tempat_lahir+"', tgl_lahir='"+tanggal_lahir+"', jenis_kelamin='"+jenis_kelamin+"', alamat='"+alamat+"', no_hp='"+no_hp+"', email='"+email+"', asal_sekolah='"+asal_sekolah+"', jurusan='"+jurusan+"', orang_tua='"+orang_tua+"' WHERE nim='"+nim+"'";
        try {
            
            Statement s = konek.getKoneksi().createStatement();
            s.executeUpdate(sql);
            s.close();
            JOptionPane.showMessageDialog(this, "Data Mahasiswa Berhasil Diubah");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Data Mahasiswa Gagal Diubah: " + e);
        }
     }else {
        JOptionPane.showMessageDialog(this, "NIM dan Nama Mahasiswa harus diisi dengan benar." ); 
    }
    this.btRefreshMhsActionPerformed(evt);
        tfNIM.setText("");
        tfNamaMahasiswa.setText("");
        tfTempatLahir.setText("");
        dcTanggal.setDate(null);
        tfJK.setText("");
        tfAlamat.setText("");
        tfNoTlp.setText("");
        tfEmail.setText("");
        tfAsalSekolah.setText("");
        tfJurusan.setText("");
        tfOrangTua.setText("");
    }//GEN-LAST:event_btUbahMhsActionPerformed

    private void btHapusMhsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHapusMhsActionPerformed
    String hapus = "DELETE FROM daftar_mahasiswa WHERE nim='" + pilNIM + "'";
    if (JOptionPane.showConfirmDialog(null, "Apakah anda yakin menghapus data " + pilNIM + " ini?", "Konfirmasi Hapus Data",
            JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE) == JOptionPane.OK_OPTION) {
        try {
            Connection connection = konek.getKoneksi();
            String sql = "DELETE FROM daftar_mahasiswa WHERE nim=?";
            
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setString(1, pilNIM);
    
                int rowsAffected = preparedStatement.executeUpdate();
    
                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
                    this.btRefreshMhsActionPerformed(evt);
                } else {
                    JOptionPane.showMessageDialog(null, "Data tidak ditemukan");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Terjadi Kesalahan: " + e);
        }
    } else {
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
    }

    
    }//GEN-LAST:event_btHapusMhsActionPerformed

    private void jTBMahasiswaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTBMahasiswaMouseClicked
                                  
    int i = this.jTBMahasiswa.getSelectedRow();
    if (i == -1) {
        return;
    }
    pilNIM = (String) this.jTBMahasiswa.getValueAt(i, 2);
    tfNIM.setText(pilNIM);
    
    pilNamaMahasiswa = (String) this.jTBMahasiswa.getValueAt(i, 3);
    tfNamaMahasiswa.setText(pilNamaMahasiswa);
    
    pilTempatLahir = (String) this.jTBMahasiswa.getValueAt(i, 4);
    tfTempatLahir.setText(pilTempatLahir);
    
    pilJenisKelamin = (String) this.jTBMahasiswa.getValueAt(i, 6);
    tfJK.setText(pilJenisKelamin);
    
    pilAlamat = (String) this.jTBMahasiswa.getValueAt(i, 7);
    tfAlamat.setText(pilAlamat);
    
    pilNoTlp = (String) this.jTBMahasiswa.getValueAt(i, 8);
    tfNoTlp.setText(pilNoTlp);
    
    pilEmail = (String) this.jTBMahasiswa.getValueAt(i, 9);
    tfEmail.setText(pilEmail);
    
    pilAsalSekolah = (String) this.jTBMahasiswa.getValueAt(i, 10);
    tfAsalSekolah.setText(pilAsalSekolah);
    
    pilJurusan = (String) this.jTBMahasiswa.getValueAt(i, 11);
    tfJurusan.setText(pilJurusan);
    
    pilOrangTua = (String) this.jTBMahasiswa.getValueAt(i, 12);
    tfOrangTua.setText(pilOrangTua);
    }//GEN-LAST:event_jTBMahasiswaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btHapusMhs;
    private javax.swing.JButton btRefreshMhs;
    private javax.swing.JButton btUbahMhs;
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
