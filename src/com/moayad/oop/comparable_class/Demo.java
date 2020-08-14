package com.moayad.oop.comparable_class;

import java.util.ArrayList;
import java.util.Collections;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Family> persons = new ArrayList<Family>();
        persons.add(new Family("Moayad",23));
        persons.add(new Family("Eyad",1));
        persons.add(new Family("Salim",45));
        Collections.sort(persons);
        for(Family person:persons)
        {
            System.out.println("Name: "+person.name);
            System.out.println("Age: "+person.age);
        }
    }
}
