package com.moayad.graph;

import java.util.Stack;

public class DFSGraph {
	int size;
	adjList[] arr;
	DFSGraph(int size){
		this.size = size;
		this.arr = new adjList[size];
		for(int i=0;i<arr.length;i++) {
			arr[i] = new adjList();
			arr[i].head = null;
		}
	}
	public void add(int src, int des) {
		Node newNode = new Node(des,null);
		newNode.next = arr[src].head;
		arr[src].head = newNode;
	}
	public void DFSExplore(int vertex) {
		boolean[] visited = new boolean[size];
		for(int i=0;i<visited.length;i++)
			visited[i] = false;
		Stack<Integer> st = new Stack<>();
		st.push(vertex);
		while(!st.isEmpty()) {
			int n = st.pop();
			st.push(n);
			visited[n] = true;
			boolean isDone = true;
			Node head = arr[n].head;
			while(head!=null) {
				if(!visited[head.value]) {
					st.push(head.value);
					isDone = false;
					break;
				}else
					head = head.next;
			}
			if(isDone) {
				int out = st.pop();
				System.out.println(out);
			}
		}
	}
	
}
