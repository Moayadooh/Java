package com.moayad.data_structure_and_algorithms.graph.practise;

import java.util.Stack;

class Node {
	int value;
	Node next;
	Node(int value, Node next) {
		this.value = value;
		this.next = next;
	}
}

class adjList {
	Node head = null;
}

public class DFSGraph {
	int size;
	adjList[] arr;
	DFSGraph(int size){
		this.size = size;
		arr = new adjList[size];
		for(int i=0;i<arr.length;i++)
			arr[i] = new adjList();
	}
	public void add(int src, int des) {
		Node newNode = new Node(des, null);
		newNode.next = arr[src].head;
		arr[src].head = newNode;
	}
	public void DFSExplore(int vertex) {
		boolean[] visited = new boolean[size];
		for(int i=0;i<arr.length;i++)
			visited[i] = false;
		Stack<Integer> st = new Stack<>();
		st.push(vertex);
		while(!st.isEmpty()) {
			int n = st.pop();
			st.push(n);
			visited[n] = true;
			boolean doBacktracking = true;
			Node head = arr[n].head;
			while(head!=null) {
				if(!visited[head.value]) {
					st.push(head.value);
					doBacktracking = false;
					break;
				}else
					head = head.next;
			}
			if(doBacktracking) {
				int out = st.pop();
				System.out.println("Visited item is: "+out);
			}
		}
	}
	public static void main(String[] args) {
		DFSGraph dfs = new DFSGraph(6);
		dfs.add(0, 2);
		dfs.add(0, 1);
		dfs.add(1, 4);
		dfs.add(1, 3);
		dfs.add(1, 0);
		dfs.add(3, 1);
		dfs.add(4, 1);
		dfs.add(2, 5);
		dfs.add(2, 0);
		dfs.add(5, 2);
		dfs.DFSExplore(0);

	}

}
