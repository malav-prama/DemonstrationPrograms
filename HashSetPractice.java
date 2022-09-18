import java.lang.reflect.Array;
import java.util.*;

//Demonstration Program for HashSet
class HashSetPractice {
    public static void main(String[] args) {

        //1. Creating a simple HashSet and add() method
        Set<Integer> hs=new HashSet<Integer>();

        hs.add(99);
        hs.add(2);
        hs.add(3);
        hs.add(47);
        hs.add(5);

        //2. Operations on the Set interface

        Set<Integer> setA=new HashSet<Integer>();

        setA.addAll(Arrays.asList(new Integer[]{1, 3, 2, 4, 8, 9, 0}));

        Set<Integer> setB=new HashSet<Integer>();

        setB.addAll(Arrays.asList(new Integer[]{ 1, 3, 7, 5, 4, 0, 7, 5 }));
        //a. Union
        HashSet<Integer> union=new HashSet<Integer>(setA);
        union.addAll(setB);
        System.out.println("Union is"+union);

        //b. Intersection
        HashSet<Integer> intersection=new HashSet<Integer>(setA);
        intersection.retainAll(setB);
        System.out.println("Intersection is "+intersection);

        //c. Difference

        HashSet<Integer> difference= new HashSet<>(setA);
        difference.removeAll(setB);
        System.out.println("Difference is "+ difference);

        //3. Accessing the elements using the contains() method
        int contains=5;         //Here contains is int type but the set objects are Integer type so why would it still run?
        System.out.println("Contains? "+contains+setA.contains(contains));

        //4. Removing the elements using remove() method
        setA.remove(9);
        System.out.println(setA);

        //5. Iterating through the set
        System.out.println("Iterating over a set using for loop");
        for (int value: setA)
        {

            System.out.print(value + " , ");
        }
        System.out.println();

        System.out.println("Iterating over a set using iterator");

        Iterator<Integer> iterator=setA.iterator();

        while(iterator.hasNext())
        {
            System.out.println(iterator.next());

        }

        //LinkedHashSet

        Set<String> lh = new LinkedHashSet<String>();

        // Adding elements into the LinkedHashSet
        // using add()
        lh.add("India");
        lh.add("Australia");
        lh.add("South Africa");

        // Adding the duplicate
        // element
        lh.add("India");

        // Displaying the LinkedHashSet
        System.out.println(lh);

        // Removing items from LinkedHashSet
        // using remove()
        lh.remove("Australia");
        System.out.println("Set after removing "
                + "Australia:" + lh);

        // Iterating over linked hash set items
        System.out.println("Iterating over set:");
        Iterator<String> i = lh.iterator();
        while (i.hasNext())
            System.out.println(i.next());

    }
}