/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tampilan_Data;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.*;
/**
 *
 * @author FAJRUL FALAAH
 */
public class TAMPILAN_UTAMA_07201 
{
    JFrame tampilan = new JFrame();
    JLabel akun,pemesanan,judul,judul2,judul3;
    JRadioButton pemilik,penyewa;
    JTextField namapenyewa,noktppesan,tanggallahirpenyewa,tanggalcheckinpenyewa,tanggalcheckoutpenyewa,daerahasalpenyewa,statuspenyewa,notelppenyewa;
    JButton loginpemilik,datacheckin,checkin,tampilkandata,verifikasi;
    JPasswordField noktpcek,noktppemesanan;
    
    public TAMPILAN_UTAMA_07201()
    {
        tampilan.setSize(730, 630);
        tampilan.setLayout(null);
        tampilan.getContentPane().setBackground(Color.WHITE);
        
        judul = new JLabel("SEWA KAMAR KOS MBAH TOYIB");
        judul.setBounds(100, 10, 600, 50);
        judul.setFont(new Font("Times New Roman",Font.BOLD,30));
        tampilan.add(judul);
        
        judul2 = new JLabel("REGISTRASI");
        judul2.setBounds(465, 120, 600, 50);
        judul2.setFont(new Font("Times New Roman",Font.BOLD,23));
        tampilan.add(judul2);
        
        judul3 = new JLabel("KETERANGAN");
        judul3.setBounds(80, 120, 600, 50);
        judul3.setFont(new Font("Times New Roman",Font.BOLD,23));
        tampilan.add(judul3);
        
        loginpemilik = new JButton("LOGIN PEMILIK");
        loginpemilik.setBounds(380, 170, 150, 40);
        loginpemilik.setBackground(Color.YELLOW);
        tampilan.add(loginpemilik);
        
        datacheckin = new JButton ("LOGIN PENYEWA");
        datacheckin.setBounds(550, 170, 150, 40);
        datacheckin.setBackground(Color.YELLOW);
        tampilan.add(datacheckin);
        
        checkin = new JButton("CHECKIN");
        checkin.setBounds(380, 240, 150, 40);
        checkin.setBackground(Color.YELLOW);
        tampilan.add(checkin);
        
        verifikasi = new JButton("VERIFIKASI");
        verifikasi.setBounds(550, 240, 150, 40);
        verifikasi.setBackground(Color.YELLOW);
        tampilan.add(verifikasi);
        
        tampilkandata = new JButton ("TAMPILKAN DATA");
        tampilkandata.setBounds(465, 310, 150, 50);
        tampilkandata.setBackground(Color.YELLOW);
        tampilan.add(tampilkandata);
    
     checkin.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                Checkin_GUI07201 checkin = new Checkin_GUI07201();
                tampilan.dispose();
            }
            
     });
     
      datacheckin.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                Data_Checkin_GUI07201 checkin = new Data_Checkin_GUI07201();
                tampilan.dispose();
            }
            
     });
      
      loginpemilik.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                Pemilik_Kos_GUI07201 checkin = new Pemilik_Kos_GUI07201();
                tampilan.dispose();
            }
            
     });
      
      verifikasi.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                Verifikasi_GUI07201 verifikasi = new Verifikasi_GUI07201();
                tampilan.dispose();
            }
            
     });
      
      tampilkandata.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                Tampilkan_Data_GUI verifikasi = new Tampilkan_Data_GUI();
                tampilan.dispose();
            }
            
     });
    }
}