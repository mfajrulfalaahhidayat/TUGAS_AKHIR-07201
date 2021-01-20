/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tampilan_Data;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author FAJRUL FALAAH
 */
public class Pembayaran_GUI07201 {
    
    JFrame pembayaran = new JFrame();
    JButton back,checkout;
    JLabel judul,judulkedua;
    JLabel nomor;
    JTextField nomordatapenyewa;
    JTextArea tempatkosong = new JTextArea();
    
    public Pembayaran_GUI07201(){
        
        pembayaran.setSize(700, 600);
        pembayaran.setLayout(null);
        pembayaran.getContentPane().setBackground(Color.WHITE);
        
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
        
        checkout = new JButton("CHECKOUT");
        checkout.setBounds(50, 180, 100, 30);
        pembayaran.add(checkout);
        
        
        
        pembayaran.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pembayaran.setVisible(true);
        pembayaran.setLocationRelativeTo(null);
        
        
    }
}
