package com.moayad.data_structure_and_algorithms.graph;

import java.util.LinkedList;
import java.util.Queue;

public class BFSGraph {
	int size;
	adjList[] arr;
	public BFSGraph(int size) {
		this.size = size;
		this.arr = new adjList[size];
		for(int i=0;i<arr.length;i++) {
			arr[i] = new adjList();
			arr[i].head = null;
		}
	}
	public void add(int src, int des) {
		Node newNode = new Node(des, null);
		newNode.next = arr[src].head;
		arr[src].head = newNode;
	}
	public void BFSExplore(int vertex) {
		boolean[] visited = new boolean[size];
		for(int i=0;i<visited.length;i++)
			visited[i] = false;
		Queue<Integer> q = new LinkedList<>();
		q.add(vertex);
		while(!q.isEmpty()) {
			int n = q.poll();
			visited[n] = true;
			System.out.println(n);
			Node head = arr[n].head;
			while(head!=null) {
				if(!visited[head.value]) {
					q.add(head.value);
					head = head.next;
				}else
					head = head.next;
			}
		}
	}

}
