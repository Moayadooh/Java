package com.moayad.oop.nested_class;

public class Demo {
    public static void main(String[] args) {
        Outer out = new Outer();
		Outer.Nested nest = out.new Nested();
		nest.Display();
    }
}
