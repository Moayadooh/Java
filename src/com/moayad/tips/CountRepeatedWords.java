package com.moayad.tips;

import java.util.HashMap;
import java.util.Map;

public class CountRepeatedWords {

    public static void main(String[] args) {
        String text = "Fuzzy logic is a form of many-valued logic in which the truth values of variables may be any real number between 0 and 1 both inclusive. It is employed to handle the concept of partial truth, where the truth value may range between completely true and completely false.";
        text = text.replace(",", "").replace(".", "").replace("-", " ");
        String[] words = text.split(" ");
        HashMap<String, Integer> hashMap = new HashMap<>();

        for (String word : words) {
            if (hashMap.containsKey(word)) {
                int value = hashMap.get(word);
				hashMap.put(word, ++value);
            } else
				hashMap.put(word, 1);
        }

        for (Map.Entry word : hashMap.entrySet()) {
            System.out.println(word.getKey() + " " + word.getValue());
        }

    }

}
