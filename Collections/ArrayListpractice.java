import java.util.*;

public class ArrayListpractice
{

public static void main(String[] args) {
       List<Integer> listOne=new ArrayList<Integer>();
      //Adding elements to the Array List
       listOne.add(1);
       listOne.add(4);

        // Adding specifying the index to be added
        listOne.add(2, 9);
        
         // Setting element at 1st index
        listOne.set(1, 45);
        
        // Removing element
        listOne.remove(0);
       
       //Iterating through the Arraylist
         for (int i = 0; i < listOne.size(); i++)
            System.out.print(listOne.get(i) + " ");
    }






}