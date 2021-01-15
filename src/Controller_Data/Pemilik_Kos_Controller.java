/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller_Data;
import Entity_Data.Penyewa_ENTITY07201;
import Entity_Data.Pemesanan_ENTITY07201;
import Entity_Data.Pemilik_Kos_ENTITY07201;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author FAJRUL FALAAH
 */
public class Pemilik_Kos_Controller implements Controller_Data_Interfaces07201
{
 int indexlogin= 0;
  private ArrayList<Pemilik_Kos_ENTITY07201> Pemilik_Kos_ENTITY07201ArrayList;
 
 public Pemilik_Kos_Controller(){
 }
 
 public void dataPemilik()
    {
        String namaPemilik [] = {"MbahKung","Fajrul"};
        String noktpPemilik [] = {"3692199","3692009"};
        String notelpPemilik [] = {"0812345009711","081216177482"};
        
        for(int i = 0 ; i<noktpPemilik.length;i++)
        {
            Kumpulan_Pusat_Data_Model_CONTROLLER07201.pemilikkosModel.insertPemilik(new Pemilik_Kos_ENTITY07201(namaPemilik[i],noktpPemilik[i],notelpPemilik[i]));
        }
    }
 public void view()
  {
      for(Pemilik_Kos_ENTITY07201 Pemilik_Kos_ENTITY07201 : Pemilik_Kos_ENTITY07201ArrayList)
      {
          System.out.print(Pemilik_Kos_ENTITY07201.getnama());
          System.out.print(Pemilik_Kos_ENTITY07201.getnoktp());
          System.out.print(Pemilik_Kos_ENTITY07201.getnotelppemilik());
          System.out.println();
      }
  }
 
 public void DaftarPemesanankamar()
 {
     Kumpulan_Pusat_Data_Model_CONTROLLER07201.pemesananModel.view();
 }
 
 @Override
 public void login(String nama, String noktp)
 {
     indexlogin=Kumpulan_Pusat_Data_Model_CONTROLLER07201.pemilikkosModel.cekData(nama, noktp);
 }
 
 public Pemilik_Kos_ENTITY07201 Pemilik_Kos_ENTITY07201()
 {
     return Kumpulan_Pusat_Data_Model_CONTROLLER07201.pemilikkosModel.showDataPemilik(indexlogin);
 }    
 
 public void updateIsveified(int index, int indexKamar,int indexjeniskamar,Penyewa_ENTITY07201 penyewaEntity)
 {
     Kumpulan_Pusat_Data_Model_CONTROLLER07201.pemesananModel.updateIsVerified(index,new Pemesanan_ENTITY07201(index,indexjeniskamar,penyewaEntity,true));
 }
 
 public ArrayList<Pemesanan_ENTITY07201>cekPemesanan_MODEL07201()
 {
     return Kumpulan_Pusat_Data_Model_CONTROLLER07201.pemesananModel.getPemesananEntityArrayList();
 }

}
