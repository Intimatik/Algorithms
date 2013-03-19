package ru.javabean.hashtable;

public class MyHashTableNew
{
   MyHashEntry[] table;
   private static final int  TABLE_SIZE = 128;
   
   MyHashTableNew() {
      table = new MyHashEntry[TABLE_SIZE];
   }
   
   public int get (int key) 
   {
    int hash = key % TABLE_SIZE;
    
    while (table[hash] !=null && table[hash].getKey() != key)
        hash = (hash+1) % TABLE_SIZE;
        if (table[hash] == null) 
            return -1;
        else 
            return table[hash].getValue();
   }

    public void put (int key, int value) 
    {
       int hash = key % TABLE_SIZE;
       while (table[hash] !=null && table[hash].getKey() != key)
           hash = (hash+1) % TABLE_SIZE;
        table[hash] = new MyHashEntry(key, value);
    }

    public void remove (int key) 
    {
          int hash = key % TABLE_SIZE;
       while (table[hash] !=null && table[hash].getKey() != key)
           hash = (hash+1) % TABLE_SIZE;
        table[hash] = null;
    }



}