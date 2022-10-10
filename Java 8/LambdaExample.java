interface Shape
{
   void draw();
}

interface Addition
{
  int add(int a, int b);

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
   //Here rectangle is a variable of type functional interface Shape
      Shape rectangle = () ->  {System.out.println("This is a rectangle");};
      rectangle.draw();
      print(rectangle);
      
      Addition addition=( a, b) ->(a+b);
      System.out.print(addition.add(5,3));
   } 
   
   //Passing lambda expression as a parameter
   public static void print(Shape shape)
   {
   shape.draw();
   }

}