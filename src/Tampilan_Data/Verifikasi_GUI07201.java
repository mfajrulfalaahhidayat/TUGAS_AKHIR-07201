/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tampilan_Data;

import Controller_Data.Penyewa_Kos_Controller;
import Controller_Data.Kumpulan_Pusat_Data_Model_CONTROLLER07201;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

/**
 *
 * @author FAJRUL FALAAH
 */
public class Verifikasi_GUI07201 {
    JFrame verifikasi = new JFrame();
    JTable tabeldata = new JTable();
    JScrollPane scrolldata = new JScrollPane(tabeldata);
    JButton back,verif;
    JLabel admin,namalabel,noktplabel,tulisanketerangan;
    JTextField namapenyewa,noktppenyewa;
    private static Penyewa_Kos_Controller penyewa = new Penyewa_Kos_Controller();
    public Verifikasi_GUI07201(){
        verifikasi.setSize(750,550);
        verifikasi.setLayout(null);
        verifikasi.getContentPane().setBackground(Color.YELLOW);
        
        admin = new JLabel("DATA VERIFIKASI");
        admin.setBounds(250, 30, 300, 30);
        admin.setFont(new Font("Timer New Roman",Font.BOLD,30));
        verifikasi.add(admin);
        
        scrolldata.setBounds(30, 100, 670, 200);
        tabeldata.setModel(penyewa.datapenyewa());
        verifikasi.add(scrolldata);
        
        tulisanketerangan = new JLabel("NB : No.kamar => 0. DEPAN  1. TENGAH  2. BELAKANG");
        tulisanketerangan.setBounds(50, 300, 500, 30);
        tulisanketerangan.setFont(new Font("Timer New Roman",Font.BOLD,14));
        verifikasi.add(tulisanketerangan);
        
        tulisanketerangan = new JLabel("NB : No.Jenis kamar => 0. BESAR  1. KECIL");
        tulisanketerangan.setBounds(50, 330, 500, 30);
        tulisanketerangan.setFont(new Font("Timer New Roman",Font.BOLD,14));
        verifikasi.add(tulisanketerangan);
        
        namalabel = new JLabel("Nama");
        namalabel.setBounds(50, 360, 100, 30);
        verifikasi.add(namalabel);
        namapenyewa = new JTextField();
        namapenyewa.setBounds(50, 390, 100, 30);
        verifikasi.add(namapenyewa);
        
        noktplabel = new JLabel("No.Ktp");
        noktplabel.setBounds(200, 360, 100, 30);
        verifikasi.add(noktplabel);
        noktppenyewa = new JTextField();
        noktppenyewa.setBounds(200, 390, 100, 30);
        verifikasi.add(noktppenyewa);
        
        verif = new JButton("verifikasi");
        verif.setBounds(350, 390, 100, 30);
        verif.setBackground(Color.GREEN);
        verifikasi.add(verif);
        
        back = new JButton("back");
        back.setBounds(50, 450, 100, 30);
        back.setBackground(Color.red);
        verifikasi.add(back);
        
        verifikasi.setLocationRelativeTo(null);
        verifikasi.setVisible(true);
        verifikasi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        back.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
               verifikasi.dispose();
                TAMPILAN_UTAMA_07201 tampilan = new TAMPILAN_UTAMA_07201();
            }
        });
        verif.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                String nama = namapenyewa.getText();
                String noktp = noktppenyewa.getText();
                int index = Kumpulan_Pusat_Data_Model_CONTROLLER07201.pemesananModel.cekData(nama, noktp);
                int indexjeniskamar = Kumpulan_Pusat_Data_Model_CONTROLLER07201.pemesananModel.cekData(nama, noktp);
                Kumpulan_Semua_Object_Control_07201.pemilik.updateIsveified(index,indexjeniskamar,Kumpulan_Semua_Object_Control_07201.penyewa.showdatapenyewakamar().getindexJenisKamar(),Kumpulan_Semua_Object_Control_07201.penyewa.showdatapenyewakamar().getpenyewa());
                tabeldata.setModel(penyewa.datapenyewa());
            }
        });
        tabeldata.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                int i = tabeldata.getSelectedRow();
                namapenyewa.setText(Kumpulan_Semua_Object_Control_07201.penyewa.datapenyewa().getValueAt(i, 0).toString());
                noktppenyewa.setText(Kumpulan_Semua_Object_Control_07201.penyewa.datapenyewa().getValueAt(i, 1).toString());
            }
        });
    }
    }
