package com.moayad.data_structure_and_algorithms.tree.practise;

class Node{
    Node left;
    Node right;
    int value;
    Node(Node left, Node right, int value){
        this.left = left;
        this.right = right;
        this.value = value;
    }
}

class BST{
    Node root;
    BST(){
        root = null;
    }
    public void add(Node start ,int value){
        Node newNode = new Node(null, null ,value);
        if (start==null){
            root = newNode;
            return;
        }
        if (value> start.value){
            if (start.right==null)
                start.right = newNode;
            else
                add(start.right, value);
        }
        if (value< start.value){
            if (start.left==null)
                start.left = newNode;
            else
                add(start.left, value);
        }
    }
    public void search(Node start ,int value){
        if (start==null){
            System.out.println("Value is not found!");
            return;
        }
        if (value==start.value){
            System.out.println("Value is found");
            return;
        }
        if (value> start.value){
            //start = start.right;
            search(start.right, value);
        }
        if (value< start.value){
            //start = start.left;
            search(start.left, value);
        }
    }
}

public class BinarySearchTree {
    public static void main(String[] args) {
        BST bst = new BST();
        bst.add(bst.root, 5);
        bst.add(bst.root, 9);
        bst.add(bst.root, 3);
        bst.add(bst.root, 2);
        bst.add(bst.root, 4);
        bst.search(bst.root,10);

    }
}
