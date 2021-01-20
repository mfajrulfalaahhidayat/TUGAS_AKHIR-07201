/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tampilan_Data;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author FAJRUL FALAAH
 */
public class Keterangan_GUI07201 {
    
    JFrame keterangan = new JFrame();
    JButton back,fasilitas,hargakamar,aksesjalan,layanan;
    JTextArea area = new JTextArea();
    
    public Keterangan_GUI07201(){
        
    
        keterangan.setSize(700, 650);
        keterangan.setLayout(null);
        keterangan.getContentPane().setBackground(Color.YELLOW);
        
        area.setBounds(30, 30, 300, 500);
        keterangan.add(area);
        
        fasilitas = new JButton("FASILITAS KAMAR");
        fasilitas.setBounds(450, 100, 200, 30);
        fasilitas.setBackground(Color.GREEN);
        keterangan.add(fasilitas);
        
        hargakamar = new JButton("HARGA KAMAR");
        hargakamar.setBounds(450, 200, 200, 30);
        hargakamar.setBackground(Color.GREEN);
        keterangan.add(hargakamar);
        
        aksesjalan = new JButton("AKSES JALAN KOS");
        aksesjalan.setBounds(450, 300, 200, 30);
        aksesjalan.setBackground(Color.GREEN);
        keterangan.add(aksesjalan);
        
        layanan = new JButton("SERVICE DAN LAYANAN");
        layanan.setBounds(450, 400, 200, 30);
        layanan.setBackground(Color.GREEN);
        keterangan.add(layanan);
        
        back = new JButton("BACK");
        back.setBounds(50, 550, 100, 30);
        back.setBackground(Color.RED);
        keterangan.add(back);
        
        keterangan.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        keterangan.setVisible(true);
        keterangan.setLocationRelativeTo(null);
        
        fasilitas.addActionListener(new ActionListener(){
   @Override
        public void actionPerformed(ActionEvent ae){
           area.setText(fasilitas());
        }
        });
        
        hargakamar.addActionListener(new ActionListener(){
   @Override
        public void actionPerformed(ActionEvent ae){
           area.setText(harga());
        }
        });
        
        aksesjalan.addActionListener(new ActionListener(){
   @Override
        public void actionPerformed(ActionEvent ae){
           area.setText(aksesjalan());
        }
        });
        
        layanan.addActionListener(new ActionListener(){
   @Override
        public void actionPerformed(ActionEvent ae){
           area.setText(layanan());
        }
        });
        
         back.addActionListener(new ActionListener(){
   @Override
        public void actionPerformed(ActionEvent ae){
           keterangan.dispose();
           TAMPILAN_UTAMA_07201 tampilan = new TAMPILAN_UTAMA_07201();
        }
        });
        
}
    String fasilitas()
    {
      String text= "KAMAR BESAR \n"+
                   "1. Kipas Angin \n"+
                   "2. Lemari Besar \n"+
                   "3. Kasur (2 Buah) \n"+
                   "\n"+
                   "KAMAR KECIL \n"+
                   "1. Kipas Angin \n"+
                   "2. Lemari Besar \n"+
                   "3. Kasur (2 Buah) \n";
      
      return text;
    }
    
    String harga()
    {
         String text= "HARGA KAMAR \n"+
                      "1. BESAR = Rp. 700.000 \n"+
                      "2. KECIL = Rp. 500.000 \n";
         
         return text;
    }
    
    String aksesjalan()
    {
         String text= "AKSES JALAN \n"+
                      "(1) 20 Menit dari Royal Plaza \n"+
                      "(2) 15 Menit dari Plaza Maina \n"+
                      "(3) 40 Menit dari Kebun Binatang Surabaya \n";
         
         return text;
    }
    
    String layanan()
    {
         String text= "SERVICE DAN LAYANAN \n"+
                      "1. Pemesanan Air Galon \n"+
                      "2. Kompor Masak \n"+
                      "3. Mesin Cuci \n";
         
         return text;
    }
}
