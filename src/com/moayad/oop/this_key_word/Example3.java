package com.moayad.oop.this_key_word;

class Car{
    Car(){
        System.out.println("Empty Constructor");
    }
    Car(String name){
        this(); //invoke current class constructor
        System.out.println("Car name is "+name);
    }
}

public class Example3 {
    public static void main(String[] args) {
        Car car = new Car("Suzuki");
    }
}
