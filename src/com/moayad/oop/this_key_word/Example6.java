package com.moayad.oop.this_key_word;

class Book{
    Book getMessage(){
        return this; //return current class instance
    }
    void DisplayMessage(){
        System.out.println("Message is displayed!");
    }
}

public class Example6 {
    public static void main(String[] args) {
        new Book().getMessage().DisplayMessage();
    }
}
