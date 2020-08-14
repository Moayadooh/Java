package com.moayad.data_structure_and_algorithms.data_structure;

class Node{
	Node next;
	Object value;
	public Node(Node next, Object value) {
		this.next = next;
		this.value = value;
	}
}

class LS{
	Node head;
	LS(){
		head = null;
	}
	public void Add(Object value) {
		Node newNode = new Node(null,value);
		if(head==null)
			head = newNode;
		else {
			newNode.next = head;
			head = newNode;
		}
	}
	public void Remove() {
		if(head==null)
			System.out.println("Linked list is empty!!");
		else
			head = head.next;
	}
	public void Display() {
		if(head==null)
			System.out.println("Linked list is empty!!");
		else {
			Node temp = head;
			while(temp!=null) {
				System.out.print(temp.value+" ");
				temp = temp.next;
			}
			System.out.println();
		}
	}
}

public class LinkedListImplementation {

	public static void main(String[] args) {
		LS ls = new LS();
		ls.Remove();
		ls.Display();
		ls.Add(5);
		ls.Add(8);
		ls.Add("Eyad");
		ls.Add(2);
		ls.Remove();
		ls.Display();
		ls.Remove();
		ls.Remove();
		ls.Remove();
		ls.Remove();
		ls.Display();
	}
}
