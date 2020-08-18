package com.moayad.oop.default_constructor;

class Region{
    //No need for default constructor since there is no parameter constructor in the parent class
}
class Company{
    public Company(){} //Default constructor
    Company(String name){
        System.out.println("Product name is "+name);
    }
}
class Product extends Company{
    Product(){
        System.out.println("child class constructor");
    }
    Product(int a){

    }
}

public class Example {
    public static void main(String[] args) {
        new Product();
    }
}
