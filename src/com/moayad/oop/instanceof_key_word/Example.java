package com.moayad.oop.instanceof_key_word;

class Wall{

}

class Stone extends Wall{

}

public class Example {
    public static void main(String[] args) {
        Wall wall = new Stone();
        System.out.println(wall instanceof Wall);
    }
}
