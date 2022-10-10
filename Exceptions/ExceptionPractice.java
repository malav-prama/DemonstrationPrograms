public class ExceptionPractice
{
   public void main(String[] args)
   {
   
//       // int i, j, k;
// //       i=8;
// //       j=0;
// //       try
// //       {
// //          k=i/j;
// //       }
// //       catch(Exception e)
// //       {
// //          System.out.print(e);
// //       }
      
      int m=5;
      try{
      if(m<10)
      {
      throw new myException("Error");
      }
      }
      catch (Exception e)
      {
      System.out.print(e);
      }
   }
   
   //Creating a custom exception.
   class myException extends Exception
   {
   public myException(String msg)
   {
   super(msg);
   }
   }
   

}