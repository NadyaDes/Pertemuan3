/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan3;

import javax.swing.JOptionPane;
/**
 *
 * @author asus
 */
public class Pertemuan3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String kondisi;
        kondisi = JOptionPane.showInputDialog(null," Silahka Pilih Kondisi : [Biodata, Kalkulator] ");
        Pertemuan3 per = new Pertemuan3();
        if (kondisi.equals("Biodata")){
            per.biodata();
        } else if (kondisi.equals("Kalkulator")){
            per.kalkulator();
        }
    }
   void biodata(){
       String nama_depan, nama_belakang, tempat, tgl_lahir, alamat, matkul;
       int nohp, nilai ;
       
    //
       nama_depan = JOptionPane.showInputDialog(null, "Masukan Nama Depan Anda : ");
       nama_belakang = JOptionPane.showInputDialog(null, "Masukan Nama belakang Anda : ");
       tempat = JOptionPane.showInputDialog(null, "Masukan Tempat Lahir Anda : ");
       tgl_lahir = JOptionPane.showInputDialog(null, "Masukan Tanggal lahir Anda : ");
       nohp = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukan No Hp Anda"));
       matkul = JOptionPane.showInputDialog(null, "Masukan Nama Matakuliah Anda : ");
       nilai = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukan Nilai Matakuliah Anda : "));
       alamat = JOptionPane.showInputDialog(null, "Masukan Alamat Anda : ");

    // output popup
        JOptionPane.showMessageDialog(null, "==========Biodata==========\n" +
        "Nama : " +nama_depan + " " + nama_belakang + "\n"  +
        "tempat/tanggal lahir : " + tempat + " " + tgl_lahir + "\n" +
        "No Hp : " + nohp + "\n" +
        "Nama Matakuliah saat ini : " + matkul + "\n" +
        "Nilai Angka : " + nilai + "\n" +
        "Nilai Huruf : ?" +  "\n" +
        "Alamat : " +alamat 
        );
        
   } 
   void kalkulator(){
       int bilangan1, bilangan2, tambah, kurang, bagi, kali ;
       
    //
       
       bilangan1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukan Bilangan Pertama"));
       bilangan2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukan Bilangan Kedua : "));
       tambah = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukan Angka Tambah : "));
       kurang = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukan Angka Kurang : "));
       bagi = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukan Angka bagi : "));
       kali = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukan Angka kali : "));
    

    // output popup
        JOptionPane.showMessageDialog(null, "==========Kalkulator==========\n" +
        "Bilangan2 : " + bilangan1 + "\n"  +
        "Bilangan2 : " + bilangan2 + "\n" +
        "Tambah : " + tambah + "\n" +
        "Kurang : " + kurang + "\n" +
        "Bagi : " + bagi + "\n" +
        "Kali : " + kali 
        ); 
    }
    
}
