package com.moayad.data_structure_and_algorithms.graph;

public class BFSGraphDemo {

	public static void main(String[] args) {
		BFSGraph bfs = new BFSGraph(6);
		bfs.add(0, 2);
		bfs.add(0, 1);
		bfs.add(1, 4);
		bfs.add(1, 3);
		bfs.add(1, 0);
		bfs.add(3, 1);
		bfs.add(4, 1);
		bfs.add(2, 5);
		bfs.add(2, 0);
		bfs.add(5, 2);
		bfs.BFSExplore(0);

	}

}
