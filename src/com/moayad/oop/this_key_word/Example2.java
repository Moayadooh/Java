package com.moayad.oop.this_key_word;

class Something{
    public void DoThis(){
        System.out.println("Do This!!");
    }
    public void DoThat(){
        System.out.println("Do That!!");
        this.DoThis(); //invoke current class method
    }
}

public class Example2 {
    public static void main(String[] args) {
        Something something = new Something();
        something.DoThat();
    }
}
