package ru.javabean.hashtable;

public class HashTest 
{
  public static void main (String[] args) 
  {
  
      MyHashTableNew table = new MyHashTableNew();
  
      table.put (1, 54000);
      table.put (43, 1540);
      table.put (543, 10654500);
      table.put (54353, 165000);
      table.put (5435345, 5400);
      table.put (454, 31000);
      table.put (3453, 551000);
      table.put (656, 154000);
      table.put (6, 105400);
      table.put (7, 1054500);
      table.put (41, 10545300);
      table.put (31, 154000);
      table.put (531, 106500);
      table.put (645641, 1064500);
      table.put (5353451, 10760);table.put (1676, 176570);
      table.put (54354353, 1760);
      table.put (6556, 1765700);
      table.put (134, 1765700);
      table.remove(134);
//     ; for (int i : table)
      System.out.println(table.get(134));
  }



}