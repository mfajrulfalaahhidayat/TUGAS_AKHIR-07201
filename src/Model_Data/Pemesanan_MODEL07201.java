/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model_Data;

import Entity_Data.Jenis_Kamar_ENTITY07201;
import Entity_Data.Pemesanan_ENTITY07201;
import Entity_Data.Kamar_ENITITY07201;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 *
 * @author FAJRUL FALAAH
 */
public class Pemesanan_MODEL07201 implements Model_Data_Interfaces 
{
    private ArrayList<Pemesanan_ENTITY07201> PemesananEntityArrayList;
    
    public Pemesanan_MODEL07201()
    {
        PemesananEntityArrayList = new ArrayList<Pemesanan_ENTITY07201>();
    }
    
    public void insertPemesanan_ENTITY07201(Pemesanan_ENTITY07201 penyewa)
    {
        PemesananEntityArrayList.add(penyewa);
    }
    
    
    public ArrayList<Pemesanan_ENTITY07201> getPemesananEntityArrayList()
    {
        return PemesananEntityArrayList;
    }
    
    @Override
    public void view()
    {
        for(Pemesanan_ENTITY07201 datapenyewa : PemesananEntityArrayList)
        {
            System.out.println("=============================================");
            System.out.println(
                               "\n Nama : "+datapenyewa .getpenyewa().getnama()+
                               "\n No.Ktp : "+datapenyewa .getpenyewa().getnoktp()+
                               "\n Tanggal Checkin : "+new SimpleDateFormat("dd-MM-YYYY").format(datapenyewa .getpenyewa().gettanggalcheckin())+
                               "\n Tanggal Checkout : "+new SimpleDateFormat("dd-MM-YYYY").format(datapenyewa .getpenyewa().gettanggalcheckout())+
                               "\n Kamar : "+Kamar_ENITITY07201.kamar[datapenyewa .getindexKamar()]+
                               "\n Jenis Kamar : "+Jenis_Kamar_ENTITY07201.jeniskamar[datapenyewa.getindexJenisKamar()]+
                               "\n IsVerified : ");
            
            if(datapenyewa .isverified() == false)
            {
                System.out.println("Belum Di Verifikasi");
            }else{
                System.out.println("Telah Di Verifikasi");
            }
            
            System.out.println("=============================================");
        }
    }
    
    public int cekData(String nama,String noktp)
    {
        int loop = 0;
        if(PemesananEntityArrayList.size() == 0)
        {
            loop = -1;//data kosong
        }else{
            for(int i = 0; i<PemesananEntityArrayList.size(); i++)
            {
                if(PemesananEntityArrayList.get(i).getpenyewa().getnoktp().equals(noktp))
                {
                    loop = i;
                    break;
                }else{
                    loop = -2;
                }
            }
        }return loop;
    }
    
    public Pemesanan_ENTITY07201 showdatapenyewakamar(int index)
    {
        return PemesananEntityArrayList.get(index);
    }
    
    public void updateIsVerified(int indexpesanan, Pemesanan_ENTITY07201 Pemesanan_ENTITY07201)
    {
        PemesananEntityArrayList.set(indexpesanan, Pemesanan_ENTITY07201);
    }
    
    public void deletePemesanan_ENTITY07201(int index)
    {
        PemesananEntityArrayList.remove(index);
    }
    
    public ArrayList<Pemesanan_ENTITY07201> semuadatapemesanan()
    {
        return  PemesananEntityArrayList;
    }
}
