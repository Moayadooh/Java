package com.moayad.tools;

public class Test {

    public static void main(String[] args) {
        String word = "aallaa";
        int i = 0;
        int j = word.length() - 1;
        boolean isPal = true;
        while (j>i){
            if(word.charAt(i) != word.charAt(j)){
                isPal = false;
                break;
            }
            i++;
            j--;
        }
        if(isPal)
            System.out.println("Is a palindrome.");
        else
            System.out.println("Is not a palindrome.");
    }

}
