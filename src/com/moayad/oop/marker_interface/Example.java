package com.moayad.oop.marker_interface;

interface College{
    //Marker interface
}
class Person1 implements College{

}
class Person2{

}

public class Example {
    public static void main(String[] args) {
        Person1 person1 = new Person1();
        if (person1 instanceof College)
            System.out.println("The person is eligible to enter the class");
        else
            System.out.println("The person is not eligible to enter the class");
    }
}
