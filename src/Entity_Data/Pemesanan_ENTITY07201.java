/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity_Data;

/**
 *
 * @author FAJRUL FALAAH
 */
public class Pemesanan_ENTITY07201 
{
  private Penyewa_ENTITY07201 penyewa;
  private boolean isverified;
  private int indexKamar,indexjeniskamar;
  
  public Pemesanan_ENTITY07201 (int indexKamar,int indexjeniskamar, Penyewa_ENTITY07201 penyewa, boolean isverified)
  {
      this.penyewa = penyewa;
      this.isverified = isverified;
      this.indexKamar = indexKamar;
      this.indexjeniskamar = indexjeniskamar;
  }
  
  public Penyewa_ENTITY07201 getpenyewa()
  {
      return penyewa;
  }
  
  public void setpenyewa(Penyewa_ENTITY07201 penyewa)
  {
      this.penyewa = penyewa;
  }
  
  public boolean isverified()
  {
      return isverified;
  }
  
  public void setVerified(boolean verified)
  {
      isverified = verified;
  }
  
  public int getindexKamar()
  {
      return indexKamar;
  }
  
  public void setindexKamar(int indexKamar)
  {
      this.indexKamar = indexKamar;
  }
  
   public int getindexJenisKamar()
  {
      return indexjeniskamar;
  }
  
  public void setindexJenisKamar(int indexjeniskamar)
  {
      this.indexjeniskamar = indexjeniskamar;
  }
}
