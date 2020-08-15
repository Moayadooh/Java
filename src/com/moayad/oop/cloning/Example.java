package com.moayad.oop.cloning;

class Person implements Cloneable{
    String name;
    int age;
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}

public class Example {
    public static void main(String[] args) {
        try {
            Person person = new Person("Eyad", 1);
            System.out.println("Person name is "+person.name);
            System.out.println("Person age is "+person.age);

            //Cloning the object
            Person person1 = (Person)person.clone();
            System.out.println("Person name is "+person1.name);
            System.out.println("Person age is "+person1.age);
        }catch (CloneNotSupportedException e){
            System.out.println(e);
        }
    }
}
