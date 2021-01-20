/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tampilan_Data;

import Entity_Data.Jenis_Kamar_ENTITY07201;
import Entity_Data.Kamar_ENITITY07201;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author FAJRUL FALAAH
 */
public class Pembayaran_GUI07201 {
    
    JFrame pembayaran = new JFrame();
    JButton back,checkout,view,bayar;
    JLabel judul,judulkedua,lamasewakamar;
    JLabel nomor,judulkamar,nomorkamar;
    JTextArea area = new JTextArea();
    JTextField nomordatapenyewa,nomordatapenyewakamar,lamapenyewaankamar,nomorkamarpenyewa,lamawaktusewa;
    JTextArea tempatkosong = new JTextArea();
    
    public Pembayaran_GUI07201(){
        
        pembayaran.setSize(700, 750);
        pembayaran.setLayout(null);
        pembayaran.getContentPane().setBackground(Color.YELLOW);
        
        judul = new JLabel("PEMBAYARAN");
        judul.setBounds(170, 10, 600, 50);
        judul.setFont(new Font("Times New Roman",Font.BOLD,50));
        pembayaran.add(judul);
        
        nomor = new JLabel("NOMOR DATA PENYEWA");
        nomor.setBounds(50, 100, 250, 30);
        pembayaran.add(nomor);
        nomordatapenyewa = new JTextField();
        nomordatapenyewa.setBounds(50, 130, 200, 30);
        pembayaran.add(nomordatapenyewa);
        
        area.setBounds(350, 110, 300, 400);
        pembayaran.add(area);
        
        judulkamar = new JLabel("HARGA KAMAR");
        judulkamar.setBounds(50, 250, 200, 30);
        pembayaran.add(judulkamar);
        
        judulkamar = new JLabel("1. BESAR = Rp. 700.000");
        judulkamar.setBounds(50, 285, 200, 30);
        pembayaran.add(judulkamar);
        
        judulkamar = new JLabel("2. KECIL = Rp. 500.000");
        judulkamar.setBounds(50, 320, 200, 30);
        pembayaran.add(judulkamar);
        
        nomorkamar = new JLabel("KAMAR (1/2)");
        nomorkamar.setBounds(50, 355, 250, 30);
        pembayaran.add(nomorkamar);
        nomordatapenyewakamar = new JTextField();
        nomordatapenyewakamar.setBounds(50, 385, 200, 30);
        pembayaran.add(nomordatapenyewakamar);
        
        lamasewakamar = new JLabel("LAMA WAKTU SEWA (PER BULAN)");
        lamasewakamar.setBounds(50, 425, 250, 30);
        pembayaran.add(lamasewakamar);
        lamapenyewaankamar = new JTextField();
        lamapenyewaankamar.setBounds(50, 455, 200, 30);
        pembayaran.add(lamapenyewaankamar);
        
        bayar = new JButton("BAYAR");
        bayar.setBounds(50, 500, 100, 30);
        pembayaran.add(bayar);
        
        checkout = new JButton("CHECKOUT");
        checkout.setBounds(50, 180, 100, 30);
        pembayaran.add(checkout);
        
        view = new JButton("TAMPILKAN DATA");
        view.setBounds(170, 180, 140, 30);
        pembayaran.add(view);
        
        back = new JButton("Back");
        back.setBounds(30, 650, 100, 30);
        back.setBackground(Color.red);
        pembayaran.add(back);
        
        
        pembayaran.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pembayaran.setVisible(true);
        pembayaran.setLocationRelativeTo(null);
        

        
         checkout.addActionListener(new ActionListener(){
        @Override
public void actionPerformed(ActionEvent ae){
          try{
                    Kumpulan_Semua_Object_Control_07201.penyewa.deletedatapenyewa();
                    Kumpulan_Semua_Object_Control_07201.penyewa.deletedatakamarpenyewa();
                    JOptionPane.showMessageDialog(null, "Data Penyewa Di terima", "information", JOptionPane.INFORMATION_MESSAGE);                        
                    kosong();
                }catch(Exception exception){
                    JOptionPane.showMessageDialog(null, "TERIMA KASIH TELAH MENYEWA KAMAR DISINI !!!!", "information", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        
         back.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                pembayaran.dispose();
                TAMPILAN_UTAMA_07201 tampilan = new TAMPILAN_UTAMA_07201();
            }
        });
         
         view.addActionListener(new ActionListener(){
        @Override
public void actionPerformed(ActionEvent ae){
                    area.setText(datapenyewa());
}   
        });
         
         bayar.addActionListener(new ActionListener(){
        @Override
public void actionPerformed(ActionEvent ae){
    int pilihnomorkamar = Integer.parseInt(nomordatapenyewakamar.getText());
    if(pilihnomorkamar==1)
    {
        double hargakamar=700000;
        double lamawaktu = Double.parseDouble(lamapenyewaankamar.getText());
        JOptionPane.showMessageDialog(null, "TOTAL PEMBAYARAN = "+(hargakamar*lamawaktu), "information", JOptionPane.INFORMATION_MESSAGE);
        
    }else{
        
        double hargakamar=500000;
        double lamawaktu = Double.parseDouble(lamapenyewaankamar.getText());
        JOptionPane.showMessageDialog(null, "TOTAL PEMBAYARAN = "+(hargakamar*lamawaktu), "information", JOptionPane.INFORMATION_MESSAGE);
    }
}
});
    }
    
    String datapenyewa(){
        
        String cekverif;
        if( Kumpulan_Semua_Object_Control_07201.penyewa.showdatapenyewakamar().isverified()==false){
            cekverif = "Belum diverifikasi";
        }else{
            cekverif = "Sudah diverifikasi";
        }
   String text = "Nama = "+Kumpulan_Semua_Object_Control_07201.penyewa.showdatapenyewakamar().getpenyewa().getnama()+"\n"
                +"No.Ktp = "+Kumpulan_Semua_Object_Control_07201.penyewa.showdatapenyewakamar().getpenyewa().getnoktp()+"\n"
                +"Tanggal Lahir = "+new SimpleDateFormat("dd-MM-yyyy").format(Kumpulan_Semua_Object_Control_07201.penyewa.showdatapenyewakamar().getpenyewa().gettanggallahir())+"\n"
                +"Daerah Asal = "+Kumpulan_Semua_Object_Control_07201.penyewa.showdatapenyewakamar().getpenyewa().getdaerahasal()+"\n"
                +"No Telp = "+Kumpulan_Semua_Object_Control_07201.penyewa.showdatapenyewakamar().getpenyewa().getnotelp()+"\n"
                +"Status = "+Kumpulan_Semua_Object_Control_07201.penyewa.showdatapenyewakamar().getpenyewa().getstatus()+"\n"
                +"Kamar = "+Kamar_ENITITY07201.kamar[Kumpulan_Semua_Object_Control_07201.penyewa.showdatapenyewakamar().getindexKamar()]+"\n"
                +"Jenis Kamar = "+Jenis_Kamar_ENTITY07201.jeniskamar[Kumpulan_Semua_Object_Control_07201.penyewa.showdatapenyewakamar().getindexJenisKamar()]+"\n"
                +"Tanggal Checkin = "+new SimpleDateFormat("dd-MM-yyyy").format(Kumpulan_Semua_Object_Control_07201.penyewa.showdatapenyewakamar().getpenyewa().gettanggalcheckin())+"\n"
                +"Tanggal Checkout = "+new SimpleDateFormat("dd-MM-yyyy").format(Kumpulan_Semua_Object_Control_07201.penyewa.showdatapenyewakamar().getpenyewa().gettanggalcheckout())+"\n"
                +"Verifikasi = "+cekverif;               
        return text;
    }
    void kosong(){
        nomordatapenyewa.setText(null);
        nomorkamarpenyewa.setText(null);
        lamawaktusewa.setText(null);
    }
}
    

