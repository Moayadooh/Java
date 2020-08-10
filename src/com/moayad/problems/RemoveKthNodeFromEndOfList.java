package com.moayad.problems;

class Node{
	Node next;
	Object value;
	Node(Node next,Object value){
		this.next = null;
		this.value = value;
	}
}

class LS{
	Node head;
	LS(){
		head = null;
	}
	public void add(Object value)
	{
		Node newNode = new Node(null, value);
		if(head==null)
			head = newNode;
		else
		{
			newNode.next = head;
			head = newNode;
		}
	}
	public void remove(int k)
	{
		if(head==null)
			return;
		Node kthNode = head;
		Node lastNode = head;
		while(lastNode.next!=null)
		{
			lastNode = lastNode.next;
			if(k==0)
				kthNode = kthNode.next;
			else
				k--;
		}
		Node temp = kthNode.next;
		kthNode.next = temp.next;
	}
	public void display()
	{
		Node temp = head;
		while(temp!=null)
		{
			System.out.print(temp.value+" ");
			temp = temp.next;
		}
		System.out.println();
	}
}

public class RemoveKthNodeFromEndOfList {

	public static void main(String[] args) {
		//Remove Kth Node FromEnd of List
		LS ls = new LS();
		ls.add(1);
		ls.add(2);
		ls.add(3);
		ls.add(4);
		ls.add(5);
		ls.display();
		ls.remove(3);
		ls.display();

	}

}
