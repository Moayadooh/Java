package com.moayad.problems;

import java.util.HashMap;
import java.util.Map;

public class CountRepeatedWords {
    public static void main(String args[]) {
        String sentence = "Subversion is used for Subversion Subversion and Subversion versions of projects. Subversion is an open source centralized version control system. It's licensed under Apache. It's also referred to as a software version and revisioning control system";
        String words[] = sentence.split(" ");
        HashMap<String, Integer> hashMap = new HashMap<>();

        for (String word : words) {
            if (hashMap.containsKey(word)) {
                int value = hashMap.get(word);
                hashMap.put(word, ++value);
            } else {
                hashMap.put(word, 1);
            }
        }

        for (Map.Entry<String, Integer> hm : hashMap.entrySet()) {
            System.out.println("Word: " + hm.getKey() + ", repeated " + hm.getValue() + " time");
        }
    }
}
