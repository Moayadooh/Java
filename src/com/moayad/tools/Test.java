package com.moayad.tools;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        String word = "independent";
        char letters[] = word.toCharArray();

        Arrays.sort(letters);

        for(char letter : letters)
            System.out.println(letter);
    }

}
