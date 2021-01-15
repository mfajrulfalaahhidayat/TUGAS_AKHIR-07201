/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model_Data;

import Entity_Data.Pemilik_Kos_ENTITY07201;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 *
 * @author FAJRUL FALAAH
 */
public class Pemilik_Kos_MODEL07201
{
  private ArrayList<Pemilik_Kos_ENTITY07201> Pemilik_Kos_ENTITY07201ArrayList;
  
  public Pemilik_Kos_MODEL07201()
{
 Pemilik_Kos_ENTITY07201ArrayList = new ArrayList<Pemilik_Kos_ENTITY07201>();   
}
  
  public void insertPemilik(Pemilik_Kos_ENTITY07201 pemilik)
  {
      Pemilik_Kos_ENTITY07201ArrayList.add(pemilik);
  }
  

  public int cekData(String nama, String noktp)
  {
      int loop = 0;
      for(Pemilik_Kos_ENTITY07201 Pemilik_Kos_ENTITY07201 : Pemilik_Kos_ENTITY07201ArrayList)
      {
          if(Pemilik_Kos_ENTITY07201.getnama().equals(nama) && Pemilik_Kos_ENTITY07201.getnoktp().equals(noktp))
          {
              break;
          }else{
              loop++;
          }
      }
      return loop;
  }
  
  public Pemilik_Kos_ENTITY07201 showDataPemilik(int index)
  {
      return Pemilik_Kos_ENTITY07201ArrayList.get(index);
  }
}

