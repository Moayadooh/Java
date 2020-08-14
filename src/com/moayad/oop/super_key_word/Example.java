package com.moayad.oop.super_key_word;

class Car{
    String name = "None";
    double price = 0.0;
    Car(String name, double price){
        this.name = name;
        this.price = price;
    }
    double averagePrice = 7000.20;
    void getNameAndPrice(){
        System.out.println("Car name is "+name);
        System.out.println("Car price is "+price);
    }
}

class Corolla extends Car{
    Corolla(){
        super("Corolla",9000.50); //Access super class constructor
    }
    void getAveragePrice(){
        System.out.println("Average price of cars is "+super.averagePrice); //Access super class variable
    }
    void getNameAndPrice(){
        super.getNameAndPrice(); //Access super class method
    }
}

public class Example {
    public static void main(String[] args) {
        Corolla corolla = new Corolla();
        corolla.getNameAndPrice();
        corolla.getAveragePrice();
    }
}
