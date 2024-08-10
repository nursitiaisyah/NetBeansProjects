/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lib;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ASUS VIVOBOOK
 */
public class koneksi {
private Connection connect;
    private final String driverName   = "com.mysql.cj.jdbc.Driver"; //Driver untuk koneksi
    private final String jdbc         = "jdbc:mysql://";
    private final String host         = "localhost:"; //Bisa menggunakan IP
    private final String port         = "3306/"; //port MySQL
    private final String database     = "db_siska"; //Database yang akan digunakan
    private final String url          = jdbc + host + port + database;
    private final String username     = "root"; //username default mysql
    private final String password     = "";
public Connection getKoneksi() throws SQLException {
    if (connect == null) {
        try {
            Class.forName(driverName);
            System.out.println("Class Driver Ditemukan");
        try {
            connect = DriverManager.getConnection(url,username,password);
            System.out.println("Koneksi Database Sukses");   
        }
        catch (SQLException se) {
            System.out.println("Koneksi Database Gagal  " + se);
            System.exit(0);
        }
        }
        catch (ClassNotFoundException cnfe) {
            System.out.println("Class Driver Tidak Ditemukan, Terjadi Kesalaham Pada : " + cnfe);
            System.exit(0);
        }
    }
    return connect;
}
}
