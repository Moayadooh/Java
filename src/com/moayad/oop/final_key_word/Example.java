package com.moayad.oop.final_key_word;

final class Region{

}
class Country{
    final int size = 5;
    //size = 10; //change final variable not allowed
    final public void Show(){
        System.out.println("Show something!");
    }
}
//class Oman extends Region{ } //extends final class not allowed
class Oman extends Country{
    //public void Show(){ } //override final method not allowed
}

public class Example {
}
