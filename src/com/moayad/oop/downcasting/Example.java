package com.moayad.oop.downcasting;

class Device{

}
class Phone extends Device{
    static void Info(Device obj){
        if (obj instanceof Phone){
            Phone building = (Phone)obj; //downcasting
            System.out.println("Downcasting is done");
        }
        else
            System.out.println("Downcasting is not performed");
    }

}

public class Example {
    public static void main(String[] args) {
        Device device = new Device();
        System.out.println(device instanceof Device);

        Device d = new Phone();
        Phone.Info(d);

    }
}
