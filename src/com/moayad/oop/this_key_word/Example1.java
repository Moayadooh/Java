package com.moayad.oop.this_key_word;

class Employee{
    private String name;
    private int age;
    Employee(String name, int age){
        //refer to current class instance variable
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
}

public class Example1 {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Moayad", 23);
        Employee emp2 = new Employee("Mohanned", 21);
        System.out.println("Employee name: "+emp1.getName());
        System.out.println("Employee age: "+emp1.getAge());
    }
}
