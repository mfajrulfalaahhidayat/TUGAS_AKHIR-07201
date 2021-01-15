/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tampilan_Data;

import Controller_Data.Penyewa_Kos_Controller;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;

/**
 *
 * @author FAJRUL FALAAH
 */
public class Tampilkan_Data_GUI {
    JFrame view_data = new JFrame();
    JTable tabeldata = new JTable();
    JLabel datadiri;
    JScrollPane scrolldata = new JScrollPane(tabeldata);
    JButton back;
    JLabel admin,tulisanketerangan;
    private static Penyewa_Kos_Controller penyewa = new Penyewa_Kos_Controller ();
    public Tampilkan_Data_GUI(){
        view_data.setSize(750,550);
        view_data.setLayout(null);
        view_data.getContentPane().setBackground(Color.YELLOW);
        
        datadiri = new JLabel("DATA PENYEWA");
        datadiri.setBounds(250, 30, 300, 30);
        datadiri.setFont(new Font("Timer New Roman",Font.BOLD,30));
        view_data.add(datadiri);
        
        scrolldata.setBounds(30, 100, 670, 200);
        tabeldata.setModel(penyewa.datapenyewa());
        view_data.add(scrolldata);
        
        tulisanketerangan = new JLabel("NB : No.kamar => 0. DEPAN  1. TENGAH  2. BELAKANG");
        tulisanketerangan.setBounds(50, 300, 500, 30);
        tulisanketerangan.setFont(new Font("Timer New Roman",Font.BOLD,14));
        view_data.add(tulisanketerangan);
        
        tulisanketerangan = new JLabel("NB : No.Jenis kamar => 0. BESAR  1. KECIL");
        tulisanketerangan.setBounds(50, 330, 500, 30);
        tulisanketerangan.setFont(new Font("Timer New Roman",Font.BOLD,14));
        view_data.add(tulisanketerangan);
        
        back = new JButton("back");
        back.setBounds(50, 450, 100, 30);
        back.setBackground(Color.red);
        view_data.add(back);
        
        view_data.setLocationRelativeTo(null);
        view_data.setVisible(true);
        view_data.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        
         back.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
               view_data.dispose();
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
