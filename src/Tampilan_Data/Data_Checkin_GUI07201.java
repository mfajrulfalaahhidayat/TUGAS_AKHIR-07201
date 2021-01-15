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
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author FAJRUL FALAAH
 */
public class Data_Checkin_GUI07201 {
    JFrame Data_Checkin = new JFrame();
    JLabel nama,noktp;
    JTextField namapenyewa,noktppenyewa;
    JButton login,back,checkdata;
    JTextArea area = new JTextArea();
    JComboBox pilKamar = new JComboBox(Kamar_ENITITY07201.kamar);
    JComboBox pilJenisKamar = new JComboBox(Jenis_Kamar_ENTITY07201.jeniskamar);
    JLabel daftarpilihankamar,daftarpilihanjeniskamar;
    
    public Data_Checkin_GUI07201(){
        Data_Checkin.setSize(500, 250);
        Data_Checkin.setLayout(null);
        Data_Checkin.getContentPane().setBackground(Color.YELLOW);
        
        nama = new JLabel("Nama");
        nama.setBounds(30, 30, 100, 30);
        Data_Checkin.add(nama);
        namapenyewa = new JTextField();
        namapenyewa.setBounds(30, 55, 200, 30);
        Data_Checkin.add(namapenyewa);
        
        noktp = new JLabel("No.Ktp");
        noktp.setBounds(250,30, 100, 30);
        Data_Checkin.add(noktp);
        noktppenyewa = new JTextField();
        noktppenyewa.setBounds(250, 55, 200, 30);
        Data_Checkin.add(noktppenyewa);

        
        login = new JButton("Login");
        login.setBounds(330, 150, 100, 30);
        login.setBackground(Color.GREEN);
        Data_Checkin.add(login);
        
        
        back = new JButton("Back");
        back.setBounds(30, 150, 100, 30);
        back.setBackground(Color.red);
        Data_Checkin.add(back);
        
        Data_Checkin.setVisible(true);
        Data_Checkin.setLocationRelativeTo(null);
        Data_Checkin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
login.addActionListener(new ActionListener(){
    @Override
    public void actionPerformed(ActionEvent ae){
         try{
                       Kumpulan_Semua_Object_Control_07201.penyewa.login(namapenyewa.getText(),noktppenyewa.getText());
                       String nama = Kumpulan_Semua_Object_Control_07201.penyewa.penyewaEntity().getnama();
                       JOptionPane.showMessageDialog(null, "Selamat datang "+nama,"information", JOptionPane.INFORMATION_MESSAGE);
                       Daftar_Checkin_GUI07201 daftarcheckin = new Daftar_Checkin_GUI07201();
                       Data_Checkin.dispose();
                    }catch(Exception eception){
                        JOptionPane.showMessageDialog(null, "Nama atau No.Ktp salah", "information", JOptionPane.INFORMATION_MESSAGE);
                       kosong();
                    }
    }
    });
   

back.addActionListener(new ActionListener(){
    @Override
    public void actionPerformed(ActionEvent ae){
                Data_Checkin.dispose();
                TAMPILAN_UTAMA_07201 tampilan = new TAMPILAN_UTAMA_07201();    
    }
    });

    } 
    
    void kosong(){
        namapenyewa.setText(null);
        noktppenyewa.setText(null);
    }
}
