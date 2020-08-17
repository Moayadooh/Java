package com.moayad.oop.instance_initializer_block;

class Company{
    Company(){
        System.out.println("Super class constructor");
    }
}

class Product extends Company {
    int quantity;
    Product(){
        //super();
        System.out.println("Child class constructor");
    }

    //Instance initializer block
    {
        quantity = 9;
        System.out.println("Quantity is "+quantity);
    }

    //Instance initializer block (called while class is loaded)
    static {
        System.out.println("static instance initializer block");
    }
}

public class Example {
    public static void main(String[] args) {
        new Product();
        new Product();
    }
}
