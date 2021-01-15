/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity_Data;

import java.util.Date;

/**
 *
 * @author FAJRUL FALAAH
 */
public class Penyewa_ENTITY07201 extends Penyewa_ABSTRACTENTITY07201 {
    
  public Penyewa_ENTITY07201(String nama,String noktp,
          Date tanggallahir,String daerahasal,String status,String notelp,Date tanggalcheckin, Date tanggalcheckout)
  {
        super(nama,noktp,tanggallahir,daerahasal,status,notelp,tanggalcheckin,tanggalcheckout);
       
  }

    public Penyewa_ENTITY07201() {
    }
  
   @Override
   public String getnama()
   {
       return nama;
   }
   
   @Override
   public String getnoktp()
   {
       return noktp;
   }
   
    @Override
   public Date gettanggallahir()
   {
       return tanggallahir;
   }
   
   @Override
   public String getdaerahasal()
   {
       return daerahasal;
   }
   
    @Override
   public String getstatus()
   {
       return status;
   }
   
   @Override
   public String getnotelp()
   {
       return notelp;
   }
   
    @Override
   public Date gettanggalcheckin()
   {
       return tanggalcheckin;
   }
   
   @Override
   public Date gettanggalcheckout()
   {
       return tanggalcheckout;
   }
  
}
