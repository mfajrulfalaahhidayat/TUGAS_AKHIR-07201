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
public class Pemilik_Kos_ENTITY07201 extends Pemilik_Kos_ABSTRACTENTITY07201 {


   public Pemilik_Kos_ENTITY07201(String nama,String noktp,String notelp)
   {
       super(nama, noktp,notelp);
   }
   
   @Override
   public String getnama()
   {
       return nama;
   }
   
}
