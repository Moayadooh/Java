package com.moayad.tools;

public class OverloadMain {
    public static void main(String[] args) {
        System.out.println("This is main");
        main("argument");
        main("argument 1","argument 2");
    }

    public static void main(String args) {
        System.out.println("This is co main");
    }

    public static void main(String args, String args2) {
        System.out.println("This is third main");
    }
}
