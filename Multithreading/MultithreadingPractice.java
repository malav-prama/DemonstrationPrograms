public class MultithreadingPractice
{
   public static void main(String[] args)
   {
   
   MultithreadDemo mt=new MultithreadDemo();
   mt.start();
   //for Runnable interface
   Thread demoTwo=new Thread(new DemoTwo());
   demoTwo.start();
   }
}

class MultithreadDemo extends Thread
{
   public void run()
   {
      try
      {
      System.out.println("Thread " + Thread.currentThread().getId() + " is running using Thread class");
      }
      
      catch(Exception e)
      {
         System.out.println("Exception is caught");
      }
   }

}

class DemoTwo implements Runnable
{
public void run()
{
System.out.println("Thread is running using Runnable interface");
}
}