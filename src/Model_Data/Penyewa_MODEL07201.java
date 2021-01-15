/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model_Data;

import Entity_Data.Penyewa_ENTITY07201;
import java.util.ArrayList;

/**
 *
 * @author FAJRUL FALAAH
 */
public class Penyewa_MODEL07201 implements Model_CekData_Interfaces
{
 private ArrayList<Penyewa_ENTITY07201> Penyewa_ENTITY07201ArrayList;
 
 public Penyewa_MODEL07201()
 {
     Penyewa_ENTITY07201ArrayList = new ArrayList<Penyewa_ENTITY07201>();
 }
 
 public void insert(Penyewa_ENTITY07201 penyewaEntity)
 {
     Penyewa_ENTITY07201ArrayList.add(penyewaEntity);
 }
 

 
 public int cekData(String nama, String noktp)
 {
     int loop = 0;
     while(!Penyewa_ENTITY07201ArrayList.get(loop).getnama().equals(nama)&&!Penyewa_ENTITY07201ArrayList.get(loop).getnoktp().equals(noktp))
     {
         loop++;
     }
     return loop;
 }
 
 public Penyewa_ENTITY07201 getPenyewa_ENTITY07201ArrayList(int indexpesanan)
 {
     return Penyewa_ENTITY07201ArrayList.get(indexpesanan);
 }
}
