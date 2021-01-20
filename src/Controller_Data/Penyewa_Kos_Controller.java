/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller_Data;

import Entity_Data.Penyewa_ENTITY07201;
import Entity_Data.Pemesanan_ENTITY07201;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author FAJRUL FALAAH
 */
public class Penyewa_Kos_Controller implements Controller_Data_Interfaces07201
{
  int indexlogin=0;
  
  public Penyewa_Kos_Controller()
  {
  }
  
  public Penyewa_ENTITY07201 getData()
  {
      return Kumpulan_Pusat_Data_Model_CONTROLLER07201.penyewaModel.getPenyewa_ENTITY07201ArrayList(indexlogin);
  }
  
  public void Pemesanankamar(int indexkamar,int indexjeniskamar,Penyewa_ENTITY07201 penyewaEntity, boolean isVerified){
       Kumpulan_Pusat_Data_Model_CONTROLLER07201.pemesananModel.insertPemesanan_ENTITY07201(new Pemesanan_ENTITY07201(indexkamar,indexjeniskamar,penyewaEntity,isVerified));
  }
  
   @Override
    public void login(String nama, String noktp){
        indexlogin = Kumpulan_Pusat_Data_Model_CONTROLLER07201.penyewaModel.cekData(nama,null);
    }
    
     public void insert(String nama, String noktp, Date tanggallahir, String daerahasal, String notelp, String status, Date tanggalcheckin, Date tanggalcheckout){
        Penyewa_ENTITY07201 penyewaEntity = new Penyewa_ENTITY07201();
        penyewaEntity.setnama(nama);
        penyewaEntity.setnoktp(noktp);
        penyewaEntity.setanggallahir(tanggallahir);
        penyewaEntity.setdaerahasal(daerahasal);
        penyewaEntity.setnotelp(notelp);
        penyewaEntity.setstatus(status);
        penyewaEntity.settanggalcheckin(tanggalcheckin);
        penyewaEntity.settanggalcheckout(tanggalcheckout);
        
        Kumpulan_Pusat_Data_Model_CONTROLLER07201.penyewaModel.insert(penyewaEntity);
    }
     
     public Penyewa_ENTITY07201 penyewaEntity(){
        return  Kumpulan_Pusat_Data_Model_CONTROLLER07201.penyewaModel.getPenyewa_ENTITY07201ArrayList(indexlogin);
    }
     
      public int cekPemesanan(String nama){
        int cek = Kumpulan_Pusat_Data_Model_CONTROLLER07201.pemesananModel.cekData(nama,null);
        return cek;
    }
      
      public Pemesanan_ENTITY07201 showdatapenyewakamar(){
        return Kumpulan_Pusat_Data_Model_CONTROLLER07201.pemesananModel.showdatapenyewakamar(indexlogin);
    }
      
      public void deletedatapenyewa(int index)
      {
          Kumpulan_Pusat_Data_Model_CONTROLLER07201.pemesananModel.deletePemesanan_ENTITY07201(index);
      }
      
      public void deletedatakamarpenyewa(int index)
      {
          Kumpulan_Pusat_Data_Model_CONTROLLER07201.penyewaModel.deletePemesanan_ENTITY07201(index);
      }
      
      public DefaultTableModel datapenyewa(){
        DefaultTableModel dtmpemesanan = new DefaultTableModel();
        Object[] kolom ={"Nama","Noktp","Tanggal Lahir","Daerah Asal","No.Telp","Status","Kamar","Jenis Kamar","Tanggal Checkin","Tanggal Cehckout","Verifikasi"};
        dtmpemesanan.setColumnIdentifiers(kolom);
        int size = Kumpulan_Pusat_Data_Model_CONTROLLER07201.pemesananModel.semuadatapemesanan().size();
        String verif = null;
        for(int i=0;i<size;i++){
            if(Kumpulan_Pusat_Data_Model_CONTROLLER07201.pemesananModel.semuadatapemesanan().get(i).isverified()==false){
                verif = "no";
            }else{
                verif = "yes";
            }
            Object [] data = new Object[11];
            data[0] = Kumpulan_Pusat_Data_Model_CONTROLLER07201.pemesananModel.semuadatapemesanan().get(i).getpenyewa().getnama();
            data[1] = Kumpulan_Pusat_Data_Model_CONTROLLER07201.pemesananModel.semuadatapemesanan().get(i).getpenyewa().getnoktp();
            data[2] = Kumpulan_Pusat_Data_Model_CONTROLLER07201.pemesananModel.semuadatapemesanan().get(i).getpenyewa().gettanggallahir();
            data[3] = Kumpulan_Pusat_Data_Model_CONTROLLER07201.pemesananModel.semuadatapemesanan().get(i).getpenyewa().getdaerahasal();
            data[4] = Kumpulan_Pusat_Data_Model_CONTROLLER07201.pemesananModel.semuadatapemesanan().get(i).getpenyewa().getnotelp();
            data[5] = Kumpulan_Pusat_Data_Model_CONTROLLER07201.pemesananModel.semuadatapemesanan().get(i).getpenyewa().getstatus();
            data[6] = Kumpulan_Pusat_Data_Model_CONTROLLER07201.pemesananModel.semuadatapemesanan().get(i).getindexKamar();
            data[7] = Kumpulan_Pusat_Data_Model_CONTROLLER07201.pemesananModel.semuadatapemesanan().get(i).getindexJenisKamar();
            data[8] = Kumpulan_Pusat_Data_Model_CONTROLLER07201.pemesananModel.semuadatapemesanan().get(i).getpenyewa().gettanggalcheckin();
            data[9] = Kumpulan_Pusat_Data_Model_CONTROLLER07201.pemesananModel.semuadatapemesanan().get(i).getpenyewa().gettanggalcheckout();
            data[10] = verif;
            dtmpemesanan.addRow(data);
        }
        return dtmpemesanan;
    }

    

      }

