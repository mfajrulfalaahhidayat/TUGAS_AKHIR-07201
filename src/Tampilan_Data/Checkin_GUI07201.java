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
import java.text.SimpleDateFormat;
import javax.swing.*;
import Entity_Data.Kamar_ENITITY07201;
import Entity_Data.Jenis_Kamar_ENTITY07201;
import java.util.Date;

/**
 *
 * @author FAJRUL FALAAH
 */
public class Checkin_GUI07201 {
    JFrame penyewa = new JFrame();
    JButton back,checkin,tampilkandata;
    JLabel judul,judulkedua;
    JLabel nama,noktp,tanggallahir,daerahasal,notelp,status,tanggalcheckin,tanggalcheckout;
    JTextField namapenyewa,noktppenyewa,tanggallahirpenyewa,daerahasalpenyewa,notelppenyewa,statuspenyewa,tanggalcheckinpenyewa,tanggalcheckoutpenyewa;
    JTextArea tempatkosong = new JTextArea();
    
    public Checkin_GUI07201(){
    
        penyewa.setSize(720, 680);
        penyewa.setLayout(null);
        penyewa.getContentPane().setBackground(Color.YELLOW);
        
        judul = new JLabel("PENDATAAN");
        judulkedua = new JLabel("PENYEWA");
        judul.setBounds(40, 200, 600, 50);
        judulkedua.setBounds(60,250,600,50);
        judul.setFont(new Font("Times New Roman",Font.BOLD,50));
        judulkedua.setFont(new Font("Times New Roman",Font.BOLD,50));
        penyewa.add(judul);
        penyewa.add(judulkedua);
        
        nama = new JLabel("Nama");
        nama.setBounds(400, 50, 100, 30);
        penyewa.add(nama);
        namapenyewa = new JTextField();
        namapenyewa.setBounds(400, 80, 200, 30);
        penyewa.add(namapenyewa);
        
        noktp = new JLabel("No.Ktp");
        noktp.setBounds(400, 115, 100, 30);
        penyewa.add(noktp);
        noktppenyewa = new JTextField();
        noktppenyewa.setBounds(400, 145, 200, 30);
        penyewa.add(noktppenyewa);
        
        tanggallahir = new JLabel("Tanggal Lahir (dd/mm/yyyy)");
        tanggallahir.setBounds(400, 180, 200, 30);
        penyewa.add(tanggallahir);
        tanggallahirpenyewa = new JTextField();
        tanggallahirpenyewa.setBounds(400, 210, 200, 30);
        penyewa.add(tanggallahirpenyewa);
        
        daerahasal = new JLabel("Daerah Asal");
        daerahasal.setBounds(400, 245, 100, 30);
        penyewa.add(daerahasal);
        daerahasalpenyewa = new JTextField();
        daerahasalpenyewa.setBounds(400, 270, 200, 30);
        penyewa.add(daerahasalpenyewa);
        
        notelp = new JLabel("No.Telp");
        notelp.setBounds(400, 305, 200, 30);
        penyewa.add(notelp);
        notelppenyewa = new JTextField();
        notelppenyewa.setBounds(400, 330, 200, 30);
        penyewa.add(notelppenyewa);
        
        status = new JLabel("Status");
        status.setBounds(400, 365, 200, 30);
        penyewa.add(status);
        statuspenyewa = new JTextField();
        statuspenyewa.setBounds(400, 390, 200, 30);
        penyewa.add(statuspenyewa);
        
        tanggalcheckin = new JLabel("Tanggal Checkin");
        tanggalcheckin.setBounds(400, 425, 200, 40);
        penyewa.add(tanggalcheckin);
        tanggalcheckinpenyewa = new JTextField();
        tanggalcheckinpenyewa.setBounds(400, 455, 200, 30);
        penyewa.add(tanggalcheckinpenyewa);
        
        tanggalcheckout = new JLabel("Tanggal Checkout");
        tanggalcheckout.setBounds(400, 485, 200, 40);
        penyewa.add(tanggalcheckout);
        tanggalcheckoutpenyewa = new JTextField();
        tanggalcheckoutpenyewa.setBounds(400, 515, 200, 30);
        penyewa.add(tanggalcheckoutpenyewa);
        
        checkin = new JButton("Daftar");
        checkin.setBounds(450, 560, 100, 30);
        checkin.setBackground(Color.GREEN);
        penyewa.add(checkin);
        
        back = new JButton("Back");
        back.setBounds(30, 560, 100, 30);
        back.setBackground(Color.red);
        penyewa.add(back);
        
        penyewa.setVisible(true);
        penyewa.setLocationRelativeTo(null);
        penyewa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
 checkin.addActionListener(new ActionListener(){
        @Override
public void actionPerformed(ActionEvent ae){
          try{
                    String nama = namapenyewa.getText();
                    String noktp = noktppenyewa.getText();
                    Date tanggallahir = new Date(tanggallahirpenyewa.getText());
                    String daerahasal = daerahasalpenyewa.getText();
                    String notelp = notelppenyewa.getText();
                    String status = statuspenyewa.getText();
                    Date tanggalcheckin = new Date(tanggalcheckinpenyewa.getText());
                    Date tanggalcheckout = new Date(tanggalcheckoutpenyewa.getText());
                    Kumpulan_Semua_Object_Control_07201.penyewa.insert(nama, noktp, tanggallahir, daerahasal, notelp, status,tanggalcheckin,tanggalcheckout);
                    JOptionPane.showMessageDialog(null, "Data Penyewa Di terima", "information", JOptionPane.INFORMATION_MESSAGE);
                    JOptionPane.showMessageDialog(null, "Silahkan Memilih Kamar", "Information", JOptionPane.INFORMATION_MESSAGE);        
                    kosong();
                }catch(Exception exception){
                    JOptionPane.showMessageDialog(null, "Maaf !!! Format Penulisan Salah", "Registrasi Gagal", JOptionPane.INFORMATION_MESSAGE);
                }
              
            }
        });

 back.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                penyewa.dispose();
                TAMPILAN_UTAMA_07201 tampilan = new TAMPILAN_UTAMA_07201();
            }
        });
    }
    
    void kosong(){
        namapenyewa.setText(null);
        noktppenyewa.setText(null);
        tanggallahirpenyewa.setText(null);
        daerahasalpenyewa.setText(null);
        notelppenyewa.setText(null);
        statuspenyewa.setText(null);
        tanggalcheckinpenyewa.setText(null);
        tanggalcheckoutpenyewa.setText(null);
    }
    
    }