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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import Controller_Data.Kumpulan_Pusat_Data_Model_CONTROLLER07201;
import Controller_Data.Penyewa_Kos_Controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author FAJRUL FALAAH
 */
public class Data_Penyewa_Kos_GUI07201 {
    private static Penyewa_Kos_Controller penyewa = new Penyewa_Kos_Controller ();
    JFrame pemilik = new JFrame();
    JTable tabeldata = new JTable();
    JScrollPane scrolldata = new JScrollPane(tabeldata);
    JButton back;
    JLabel admin,tulisanketerangan;
    
    public Data_Penyewa_Kos_GUI07201()
    {
        pemilik.setSize(750,550);
        pemilik.setLayout(null);
        pemilik.getContentPane().setBackground(Color.YELLOW);
        
        admin = new JLabel("DATA PENYEWA");
        admin.setBounds(250, 30, 300, 30);
        admin.setFont(new Font("Timer New Roman",Font.BOLD,30));
        pemilik.add(admin);
        
        scrolldata.setBounds(30, 100, 670, 200);
        tabeldata.setModel(penyewa.datapenyewa());
        pemilik.add(scrolldata);
        
        tulisanketerangan = new JLabel("NB : No.kamar => 0. DEPAN  1. TENGAH  2. BELAKANG");
        tulisanketerangan.setBounds(50, 300, 500, 30);
        tulisanketerangan.setFont(new Font("Timer New Roman",Font.BOLD,14));
        pemilik.add(tulisanketerangan);
        
        tulisanketerangan = new JLabel("NB : No.Jenis kamar => 0. BESAR  1. KECIL");
        tulisanketerangan.setBounds(50, 330, 500, 30);
        tulisanketerangan.setFont(new Font("Timer New Roman",Font.BOLD,14));
        pemilik.add(tulisanketerangan);
        
        back = new JButton("back");
        back.setBounds(50, 450, 100, 30);
        back.setBackground(Color.red);
        pemilik.add(back);
        
        pemilik.setLocationRelativeTo(null);
        pemilik.setVisible(true);
        pemilik.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        
         back.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                pemilik.dispose();
                TAMPILAN_UTAMA_07201 men = new TAMPILAN_UTAMA_07201();
            }
        });
         
         tabeldata.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                int i = tabeldata.getSelectedRow();
           
            }
        });
    }
}
