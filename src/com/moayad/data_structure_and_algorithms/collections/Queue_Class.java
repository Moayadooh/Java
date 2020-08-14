package com.moayad.data_structure_and_algorithms.collections;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_Class {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(46);
        queue.add(14);
        queue.add(28);
        queue.poll();
        //queue.peek(); //Print the value in the front
        for(Integer num:queue)
            System.out.println(num);
    }
}
