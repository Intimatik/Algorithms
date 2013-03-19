import java.util.*;
public class HashTableExample {

          public static void main(String[] args) {
          HashMap<Integer, String> table = new HashMap<Integer, String>();
          String[] strings = {"Kentucky", "Washington", "California", "Florida", "Utah"}; 
          
          for (int i=0; i< strings.length-1; i++) {
              table.put(i, strings[i]);
             System.out.println(i +"=" +strings[i]); 
          }
          System.out.println("------Entry set-------");
          for (Map.Entry<Integer, String> entry : table.entrySet())
          System.out.println(entry.getKey() +"=" +entry.getValue());
          
          
          Collection<String> values = table.values();
          Collection<Integer> keys = table.keySet();
          
           System.out.println("------key collection-------");
          for (Integer i : keys)
          System.out.println(i);
          
           System.out.println("------value collection-------");
          for (String i : values)
          System.out.println(i);
          
          HashMap<Integer, String> newmap = new HashMap<Integer, String>();
          
          newmap.putAll(table);
          System.out.println("The size of my hashmap is " + newmap.size());
          newmap.remove(1);
          
          if (newmap.containsKey(2))
          System.out.println("The size of my hashmap is " +  newmap.size());
          
          if (newmap.containsValue("California"));
          System.out.println("California is in here");
          
          //for ()
          
          } 







}