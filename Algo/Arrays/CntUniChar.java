import java.util.*;
public class CntUniChar {


  public static void main (String[] args) {
  
   String value = args[0];
   HashMap<Character, Integer> tableOfChars = new HashMap<Character, Integer>();
   for (char ch : value.toCharArray()) {
      Integer cnt =  tableOfChars.get(ch);
     if (cnt == null)
         tableOfChars.put(ch,1);
    else
         tableOfChars.put(ch,cnt+1);
   }
  
  for (Map.Entry<Character, Integer> entry : tableOfChars.entrySet())
      System.out.println("key "+entry.getKey() + "value "+ entry.getValue());
  
  }




}