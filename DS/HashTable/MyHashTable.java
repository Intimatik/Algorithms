package ru.javabean.hashtable;

public class MyHashTable

    {
        private static final int TABLE_SIZE = 128;
        MyHashEntry[] table;
        MyHashTable() 
        {
          table = new MyHashEntry[TABLE_SIZE];
          for (int i = 0; i<TABLE_SIZE; i++) 
          {
              table[i] = null;
  //            System.out.println(i + "=null" );
          }
        }
        
        public int get(int key)
        {
           int hash = (key % TABLE_SIZE);
           while (table[hash] != null && table[hash].getKey() != key)
           {
               hash = (hash+1) % TABLE_SIZE;
//               System.out.println(table[hash].getValue());
           }    
           if (table[hash]==null)
               return -1;
           return table[hash].getValue();
        }

        public void put (int key, int value) 
        {
           int hash = (key % TABLE_SIZE); 
           while (table[hash] != null && table[hash].getKey() != key)
              hash = (hash+1) % TABLE_SIZE;
           table[hash] = new MyHashEntry(key, value);
    //       System.out.println("key="+ key +" value="+value);
    //       System.out.println(table[hash].getValue());
    //       System.out.println(table[hash].getKey());
        }

      }