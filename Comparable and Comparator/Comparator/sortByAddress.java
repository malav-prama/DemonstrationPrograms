package com.example.comparatorpractice;

import java.util.Comparator;

public class sortByAddress implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getAddress().compareTo(o2.getAddress());
    }
}
