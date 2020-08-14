package com.moayad.data_structure_and_algorithms.collections;

import java.util.PriorityQueue;

public class Priority_Queue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(5);
        pq.add(1);
        pq.add(12);
        pq.add(3);
        pq.add(17);
        System.out.println(pq.poll());
        //System.out.println(pq.peek()); //Print the value in the front
    }
}
