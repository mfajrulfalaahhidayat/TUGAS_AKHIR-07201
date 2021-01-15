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
public abstract class Penyewa_ABSTRACTENTITY07201 {
   protected String nama,noktp,daerahasal,notelp,status;
   protected Date tanggallahir,tanggalcheckin,tanggalcheckout;
   
    public Penyewa_ABSTRACTENTITY07201(String nama,String noktp,
          Date tanggallahir,String daerahasal,String status,String notelp,Date tanggalcheckin,Date tanggalcheckout)
  {
        this.nama = nama;
        this.noktp = noktp;
        this.tanggallahir = tanggallahir;
        this.daerahasal = daerahasal;
        this.notelp = notelp;
        this.status = status;
        this.tanggalcheckin = tanggalcheckin;
        this.tanggalcheckout = tanggalcheckout;
  }

    public Penyewa_ABSTRACTENTITY07201(){
  }
    
    public abstract String getnama();
    
    public void setnama(String nama)
    {
        this.nama = nama;
    }
    
    public String getnoktp(){
      return noktp;
  }
    public void setnoktp(String noktp)
    {
        this.noktp = noktp;
    }
   public Date gettanggallahir(){
      return tanggallahir;
   }
    
   public void setanggallahir(Date tanggallahir){
      this.tanggallahir = tanggallahir;
  }
    
   public String getdaerahasal(){
      return daerahasal;

   }
   
   public void setdaerahasal(String daerahasal)
    {
        this.daerahasal = daerahasal;
    }
    
    public String getnotelp(){
      return notelp;
   }
    
    public void setnotelp(String notelp)
    {
        this.notelp = notelp;
    }
   
   public String getstatus(){
      return status;
   }
    
   public void setstatus(String status){
      this.status = status;
  }
   
   public Date gettanggalcheckin(){
      return tanggalcheckin;
   }
    
   public void settanggalcheckin(Date tanggalcheckin){
      this.tanggalcheckin = tanggalcheckin;
  }
   public Date gettanggalcheckout(){
      return tanggalcheckout;
   }
    
   public void settanggalcheckout(Date tanggalcheckout){
      this.tanggalcheckout = tanggalcheckout;
  }
   
}
