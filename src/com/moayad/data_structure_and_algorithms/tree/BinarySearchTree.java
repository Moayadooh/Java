package com.moayad.data_structure_and_algorithms.tree;

class NodeB{
	int value;
	NodeB left;
	NodeB right;
	NodeB(int value, NodeB left, NodeB right){
		this.value = value;
		this.left = left;
		this.right = right;
	}
}

class BST{
	NodeB root;
	BST(){
		root = null;
	}
	public void add(NodeB start, int value) {
		NodeB newNode = new NodeB(value,null,null);
		if(root==null) {
			root = newNode;
			return;
		}
		if(newNode.value>start.value) {
			if(start.right==null)
				start.right = newNode;
			else
				add(start.right,value);
		}
		if(newNode.value<start.value) {
			if(start.left==null)
				start.left = newNode;
			else
				add(start.left,value);
		}
	}
	public void search(NodeB start, int value) {
		if(start==null) {
			System.out.println("Value not found!!");
			return;
		}
		if(start.value==value) {
			System.out.println("Value is found.");
			return;
		}
		if(value>start.value)
			search(start.right, value);
		if(value<start.value)
			search(start.left, value);
	}
}

public class BinarySearchTree {

	public static void main(String[] args) {
		BST bst = new BST();
		bst.add(bst.root, 5);
		bst.add(bst.root, 6);
		bst.add(bst.root, 2);
		bst.add(bst.root, 4);
		bst.add(bst.root, 8);
		bst.search(bst.root, 4);

	}

}
