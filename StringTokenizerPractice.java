import java.util.*;
public class StringTokenizerPractice
{
   public static void main(String[] args)
   {
   
      String string1 = "Peter is playing football";
      StringTokenizer stringTokenizer = new StringTokenizer(string1);
      while (stringTokenizer.hasMoreTokens())
      {
         System.out.println(stringTokenizer.nextToken());
      }
   
      System.out.println("");
   
        //With a specific delimeter
      String string2="Peter&is&playing&football&again";
      String delimeter="&";
      StringTokenizer stringTokenizer1=new StringTokenizer(string2,delimeter);
   
      while (stringTokenizer1.hasMoreTokens())
      {
         System.out.println(stringTokenizer1.nextToken());
      }
   
   }

}