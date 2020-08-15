package com.moayad.oop.upcasting;

class Vehicle{
    Vehicle(){} //Default constructor
    Vehicle(int arg){
        System.out.println("Super class");
    }
    public void VehicleType(){
        System.out.println("Vehicle type");
    }
}
class Nissan extends Vehicle{
    Nissan(){
        System.out.println("Child class");
    }
    public void VehicleType(){
        System.out.println("Nissan X-Trail");
    }
}

public class Example {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(5);
        vehicle.VehicleType();

        Nissan nissan = new Nissan();
        nissan.VehicleType();

        vehicle = nissan; //Upcasting 'Runtime Polymorphism or Dynamic method dispatch'
        vehicle.VehicleType();
    }
}
