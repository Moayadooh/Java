package com.moayad.oop.this_key_word;

class Brother{
    String name = "Eyad";
    Brother(){
        Sister sister = new Sister(this); //pass as argument in the constructor call
        sister.BrotherName();
    }

}

class Sister{
    Brother brother;
    Sister(Brother brother){
        this.brother = brother;
    }
    void BrotherName(){
        System.out.println(brother.name);
    }

}

public class Example5 {
    public static void main(String[] args) {
        Brother brother = new Brother();
    }
}
