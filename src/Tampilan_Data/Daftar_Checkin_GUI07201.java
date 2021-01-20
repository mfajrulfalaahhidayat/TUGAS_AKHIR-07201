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
public class Daftar_Checkin_GUI07201 {
    JFrame Data_Checkin = new JFrame();
    JLabel nama,noktp;
    JTextField namapenyewa,noktppenyewa;
    JButton pesan,back,checkdata;
    JTextArea area = new JTextArea();
    JComboBox pilKamar = new JComboBox(Kamar_ENITITY07201.kamar);
    JComboBox pilJenisKamar = new JComboBox(Jenis_Kamar_ENTITY07201.jeniskamar);
    JLabel daftarpilihankamar,daftarpilihanjeniskamar;
    int cek = Kumpulan_Semua_Object_Control_07201.penyewa.cekPemesanan(Kumpulan_Semua_Object_Control_07201.penyewa.penyewaEntity().getnoktp());
    public Daftar_Checkin_GUI07201(){
        
        Data_Checkin.setSize(750, 690);
        Data_Checkin.setLayout(null);
        Data_Checkin.getContentPane().setBackground(Color.YELLOW);
        
        daftarpilihankamar = new JLabel("Daftar Pilihan Kamar");
        daftarpilihankamar.setBounds(450, 100, 300, 30);
        daftarpilihankamar.setFont(new Font("Times New Roman",Font.BOLD,15));
        Data_Checkin.add(daftarpilihankamar);
        pilKamar.setBounds(400, 135, 230, 30);
        Data_Checkin.add(pilKamar);
        
        daftarpilihanjeniskamar = new JLabel("Daftar Pilihan Jenis Kamar");
        daftarpilihanjeniskamar.setBounds(450, 175, 300, 30);
        daftarpilihanjeniskamar.setFont(new Font("Times New Roman",Font.BOLD,15));
        Data_Checkin.add(daftarpilihanjeniskamar);
        pilJenisKamar.setBounds(400, 215, 230, 30);
        Data_Checkin.add(pilJenisKamar);
        
        area.setBounds(30, 30, 300, 500);
        Data_Checkin.add(area);
        
        pesan = new JButton("Daftar");
        pesan.setBounds(450, 560, 100, 30);
        pesan.setBackground(Color.GREEN);
        Data_Checkin.add(pesan);
        
        back = new JButton("Back");
        back.setBounds(30, 560, 100, 30);
        back.setBackground(Color.GREEN);
        Data_Checkin.add(back);
        
        Data_Checkin.setVisible(true);
        Data_Checkin.setLocationRelativeTo(null);
        Data_Checkin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
         
        if(cek==-1){
            JOptionPane.showMessageDialog(null, "Silahkan Memilih Kamar", "Information", JOptionPane.INFORMATION_MESSAGE);        
        }else if(cek==-2){
            JOptionPane.showMessageDialog(null,"Silahkan Memilih Kamar", "Information", JOptionPane.INFORMATION_MESSAGE);
        }else{
            area.setText(datapenyewa());
        }
        
back.addActionListener(new ActionListener(){
   @Override
        public void actionPerformed(ActionEvent ae){
           Data_Checkin.dispose();
           TAMPILAN_UTAMA_07201 tampilan = new TAMPILAN_UTAMA_07201();  
        }
        });
        
pesan.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent ae){
            int indexkamar = pilKamar.getSelectedIndex();
            int indexjeniskamar = pilJenisKamar.getSelectedIndex();
            Kumpulan_Semua_Object_Control_07201.penyewa.Pemesanankamar(indexkamar,indexjeniskamar, Kumpulan_Semua_Object_Control_07201.penyewa.getData(), false);
            area.setText(datapenyewa());
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
}
