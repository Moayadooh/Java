package com.moayad.oop.this_key_word;

class Bike{
    public void Run(Bike bike){
        System.out.println("bike is running!!");
    }
    public void RunBike(){
        Run(this); //pass as an argument in the method
    }
}

public class Example4 {
    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.RunBike();
    }
}
