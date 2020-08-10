package com.moayad.exceptions;

import java.util.ArrayList;

public class Task3 {

    public static void main(String[] args) { 
        new Task3().funct1(); 
        new Task3().funct2(); 
    }
    
    public void funct1(){ 
        A a = new A(); 
        try { 
            System.out.print(" -> " + a.getIntegerField()); 
            int result = a.getStringField().length() + a.getIntegerField(); 
            System.out.print(" -> " + result); 
        } 
        catch (IndexOutOfBoundsException e){ 
            System.out.print(" -> funct1 indexOutOfBounds"); 
        } 
        catch (RuntimeException e){ 
            System.out.print(" -> funct1 runtime"); 
        } 
        finally { 
            System.out.print(" -> funct1 finally"); 
        } 
    } 

    public void funct2() { 
        A a = new A(1,"funct2"); 
        A b = null; 
        ArrayList<A> c = new ArrayList<>(); 
        c.add(a); 
        c.add(a); 
        try { 
            System.out.print(" -> " + b.getIntegerField()); 
            System.out.print(" -> " + c.get(2).getStringField() + c.get(1).getIntegerField()); 
        } 
        catch (IndexOutOfBoundsException e){ 
            System.out.print(" -> funct2 indexOutOfBounds"); 
        } 
        catch (NullPointerException e){ 
            System.out.print(" -> funct2 nullPointer"); 
        } 
        finally { 
            System.out.print(" -> funct1 finally"); 
        } 
    } 

    class A { 
        private int integerField; 
        private String stringField; 

        public A() { 
        } 

        public A(int integerField, String stringField) { 
            this.integerField = integerField; 
            this.stringField = stringField; 
        } 

        public int getIntegerField() { 
            return integerField; 
        } 

        public void setIntegerField(int integerField) { 
            this.integerField = integerField; 
        } 

        public String getStringField() { 
            return stringField; 
        } 

        public void setStringField(String stringField) { 
            this.stringField = stringField; 
        } 
    } 
}