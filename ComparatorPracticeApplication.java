package com.example.comparatorpractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

@SpringBootApplication
public class ComparatorPracticeApplication {

    public static void main(String[] args) {
        SpringApplication.run(ComparatorPracticeApplication.class, args);

        List<Student> students=new ArrayList<>();
        students.add(new Student(111, "Mayank", "london"));
        students.add(new Student(131, "Anshul", "nyc"));
        students.add(new Student(121, "Solanki", "jaipur"));
        students.add(new Student(101, "Aggarwal", "Hongkong"));

        //Using Comparable
        Collections.sort(students);
        Iterator<Student> it=students.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }

        //Using Comparator

          Collections.sort(students,new sortByRollNo());
          Collections.sort(students,new sortByName());
          Collections.sort(students, new sortByAddress());
        Iterator<Student> it2=students.iterator();
        while (it2.hasNext())
        {
            System.out.println(it2.next());
        }




    }

}

