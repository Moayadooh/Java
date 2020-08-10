package com.moayad.graph;

public class DFSGraphDemo {

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
