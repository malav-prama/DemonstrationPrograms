interface Shape
{
   void draw();
}

//Traditional way of implementing a functional interface
 class Rectangle implements Shape
 {

    @Override
    public void draw()
    {
       System.out.println("This is a rectangle");
    }
 
 }

public class LambdaExample
{
   public static void main(String[] args)
   {
   //Implementing functional interface using Lambda Expression
      Shape rectangle = () ->  {System.out.println("This is a rectangle");};
      rectangle.draw();
   }

}