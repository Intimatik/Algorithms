public class Reverse {


              public static void main (String[] args) 
              {
                 System.out.println(reverseString("hello world"));
              
              
              }

                  public static String reverseString(String s) 
                  {
                          if (s.length() <= 1) 
                          {
                           return s;
                           } 
                  return reverseString(s.substring(1,s.length())) + s.charAt(0);
                  }

}