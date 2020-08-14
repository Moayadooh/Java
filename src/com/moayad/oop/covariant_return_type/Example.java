package com.moayad.oop.covariant_return_type;

class House{
    House getInstance(){
        return this;
    }
}
class Room extends House{
    //covariant return type 'overriding by changing return type of non-primitive method'
    Room getInstance(){
        return this;
    }
    public void Display(){
        System.out.println("This is a room!");
    }
}

public class Example {
    public static void main(String[] args) {
        new Room().getInstance().Display();
    }
}
