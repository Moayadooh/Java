package com.moayad.data_structure_and_algorithms.data_structure;

class NodeD{
	NodeD next;
	NodeD previous;
	Object value;
	NodeD(NodeD next, NodeD previous, Object value){
		this.next = next;
		this.previous = previous;
		this.value = value;
	}
}

class DLS{
	NodeD head;
	DLS(){
		head = null;
	}
	public void Add(Object value) {
		NodeD newNode = new NodeD(null,null,value);
		if(head==null) {
			head = newNode;
			head.previous = null;
		}
		else {
			newNode.next = head;
			head.previous = newNode;
			head = newNode;
		}
	}
	public void Remove() {
		if(head == null)
			System.out.println("Doubly linked list is empty!!");
		else {
			head = head.next;
			head.previous = null;
		}
	}
	public void Display() {
		if(head == null)
			System.out.println("Doubly linked list is empty!!");
		else {
			NodeD temp = head;
			while(temp!=null) {
				System.out.print(temp.value+" ");
				temp = temp.next;
			}
		}
	}
}

public class DoublyLinkedList {

	public static void main(String[] args) {
		DLS dls = new DLS();
		dls.Remove();
		dls.Add(6);
		dls.Add(9);
		dls.Add(1);
		dls.Remove();
		dls.Display();

	}

}
