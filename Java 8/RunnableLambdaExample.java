//Implementing Runnable interface using traditional and lambda method 



 class ThreadDemo implements Runnable 
{
   public void run()
   {
      System.out.println("Thread is running using traditional approach");
   }
}

public class RunnableLambdaExample
{
   public static void main(String[] args)
   {
      Thread thread=new Thread(new ThreadDemo());
      thread.run();
      
      //Using lambda expression
      Runnable runnable = () ->
      {
      System.out.println("Thread is running using lambda approach");
      };
      
     Thread threadLambda=new Thread(runnable);
     threadLambda.start();
   
   }
   

}