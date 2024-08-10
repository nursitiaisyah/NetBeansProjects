import lib.koneksi;
import java.sql.SQLException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS VIVOBOOK
 */
public class test {
public static void main(String[] args) throws SQLException {
        koneksi connection = new koneksi();
        connection.getKoneksi();
    
    }       
}
