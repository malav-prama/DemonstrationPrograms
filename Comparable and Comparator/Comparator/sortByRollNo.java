package com.example.comparatorpractice;

import java.util.Comparator;

public class sortByRollNo implements Comparator<Student> {

public int compare(Student a, Student b)
{
    if(a.getRollNo() > b.getRollNo())
    {
        return 1;
    }
    else if (a.getRollNo() < b.getRollNo())
    {
        return -1;

    }
    else
    {
        return 0;
    }
}
}
