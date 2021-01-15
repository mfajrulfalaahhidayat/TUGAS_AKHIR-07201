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
public abstract class Pemilik_Kos_ABSTRACTENTITY07201 {
   protected String nama,noktp,notelp;
   
    public Pemilik_Kos_ABSTRACTENTITY07201(String nama,String noktp,String notelp)
  {
        this.nama = nama;
        this.noktp = noktp;
        this.notelp = notelp;
        
  }

    public Pemilik_Kos_ABSTRACTENTITY07201(){
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
    
     public String getnotelppemilik(){
      return notelp;
  }
    public void setnotelppemilik(String notelp)
    {
        this.notelp = notelp;
    }
}
