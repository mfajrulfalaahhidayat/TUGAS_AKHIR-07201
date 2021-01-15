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
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author FAJRUL FALAAH
 */
public class Pemilik_Kos_GUI07201 {
    JFrame pemilik_kos = new JFrame();
    JTable tabeldata = new JTable();
    JScrollPane scrolltabeldata = new JScrollPane(tabeldata);
    JButton back,verif,login;
    JLabel admin,noktp,nama,notelp;
    JTextField namapemilik,noktppemilik,notelppemilik;
    private static Penyewa_Kos_Controller penyewa = new Penyewa_Kos_Controller();
    
    public Pemilik_Kos_GUI07201()
    {
        pemilik_kos.setSize(900, 250);
        pemilik_kos.setLayout(null);
        pemilik_kos.getContentPane().setBackground(Color.YELLOW);
        
        nama = new JLabel("Nama");
        nama.setBounds(30, 30, 100, 30);
        pemilik_kos.add(nama);
        namapemilik = new JTextField();
        namapemilik.setBounds(30, 55, 200, 30);
        pemilik_kos.add(namapemilik);
        
        noktp = new JLabel("No.Ktp");
        noktp.setBounds(290,30, 100, 30);
        pemilik_kos.add(noktp);
        noktppemilik = new JTextField();
        noktppemilik.setBounds(290, 55, 200, 30);
        pemilik_kos.add(noktppemilik);
        
        notelp = new JLabel("No.Telp");
        notelp.setBounds(550,30, 100, 30);
        pemilik_kos.add(notelp);
        notelppemilik = new JTextField();
        notelppemilik.setBounds(550, 55, 200, 30);
        pemilik_kos.add(notelppemilik);

        
        login = new JButton("Login");
        login.setBounds(470, 150, 100, 30);
        login.setBackground(Color.GREEN);
        pemilik_kos.add(login);
        
        
        back = new JButton("Back");
        back.setBounds(200, 150, 100, 30);
        back.setBackground(Color.red);
        pemilik_kos.add(back);
        
        pemilik_kos.setVisible(true);
        pemilik_kos.setLocationRelativeTo(null);
        pemilik_kos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
         back.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                pemilik_kos.dispose();
                TAMPILAN_UTAMA_07201 men = new TAMPILAN_UTAMA_07201();
            }
        });
         
          login.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
               try{
                        Kumpulan_Semua_Object_Control_07201.pemilik.dataPemilik();
                        Kumpulan_Semua_Object_Control_07201.pemilik.login(namapemilik.getText(), noktppemilik.getText());
                        String nama = Kumpulan_Semua_Object_Control_07201.pemilik.Pemilik_Kos_ENTITY07201().getnama();
                        JOptionPane.showMessageDialog(null, "Selamat datang "+nama,"information", JOptionPane.INFORMATION_MESSAGE);
                        Data_Penyewa_Kos_GUI07201 pemilik = new  Data_Penyewa_Kos_GUI07201();
                        pemilik_kos.dispose();
                    }catch(Exception exception){
                        JOptionPane.showMessageDialog(null, "Nama atau No.Ktp salah", "information", JOptionPane.INFORMATION_MESSAGE);
                    }
                        kosong();
            }
        });
    }
    void kosong(){
        namapemilik.setText(null);
        noktppemilik.setText(null);
        notelppemilik.setText(null);
    }
    }
