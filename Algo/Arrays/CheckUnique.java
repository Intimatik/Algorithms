public class CheckUnique {

         public static void main (String[] args)
         {

             removeDuplicates(args[0]);

         }

         private static void removeDuplicates(String args)
         {

               boolean[] barr = new boolean[256];

                for (int i=0; i<args.length(); i++)
                {
                    int index = args.charAt(i);
                    if (!barr[index])
                    {
                         barr[index] = true;
                    }
                    else System.out.println("Symbol " +args.charAt(i)+ " is a duplicate");
                }

          }
}