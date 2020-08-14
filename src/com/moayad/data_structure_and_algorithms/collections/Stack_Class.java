package com.moayad.data_structure_and_algorithms.collections;

import java.util.Stack;

public class Stack_Class {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(9);
        stack.push(14);
        stack.push(20);
        stack.pop();
        for (Integer num:stack)
            System.out.println(num);
    }
}
