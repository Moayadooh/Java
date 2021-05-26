package com.moayad.tools;

public class Test {

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i=0;i<1000;i++){
            stringBuilder.append(i+" ");
        }
        String numbers = stringBuilder.toString();
        System.out.println(numbers);
    }

}
