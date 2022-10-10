package com.example.comparatorpractice;

public class Student implements Comparable<Student> {
    private int RollNo;
    private String name, address;

    public Student(int rollNo, String name, String address) {
        RollNo = rollNo;
        this.name = name;
        this.address = address;
    }

    @Override
    public int compareTo(Student o) {

        if(this.RollNo==o.RollNo)
        {
            return 0;
        }
        else if (this.RollNo>o.RollNo){
          return 1;
        }
        else
        {
            return -1;
        }
    }

    public int getRollNo() {
        return RollNo;
    }

    public void setRollNo(int rollNo) {
        RollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "RollNo=" + RollNo +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }


}
