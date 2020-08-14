package com.moayad.data_structure_and_algorithms.data_structure;

class Queue{
	int[] array;
	int size;
	int front = -1;
	int rear = -1;
	int count = 0;
	public Queue(int size) {
		array = new int[size];
		this.size = size;
	}
	public void Enqueue(int num) {
		if(count==size) {
			System.out.println("Queue is full!!");
			return;
		}
		if(front==-1) {
			front = 0;
			rear = 0;
		}
		else {
			front = (front+1) % size;
		}
		array[front] = num;
		System.out.println(array[front]+" is added");
		count++;
	}
	public void Dequeue() {
		if(count==0) {
			System.out.println("Queue is empty!!");
			return;
		}
		System.out.println(array[rear]+" is removed");
		rear = (rear+1) % size;
		count--;
	}
	public void Display() {
		if(count==0)
			System.out.println("Queue is empty!!");
		else {
			for(int i=rear;i!=front+1;i=(i+1)%size) {
				System.out.print(array[i]+" ");
			}
		}
	}
}

public class QueueImplementation {

	public static void main(String[] args) {
		Queue q = new Queue(6);
		q.Dequeue();
		q.Enqueue(1);
		q.Enqueue(5);
		q.Enqueue(2);
		q.Enqueue(11);
		q.Enqueue(7);
		q.Enqueue(89);
		q.Enqueue(100);
		q.Enqueue(37);
		q.Enqueue(4);
		q.Dequeue();
		q.Dequeue();
		q.Dequeue();
		q.Dequeue();
		q.Dequeue();
		q.Dequeue();
		q.Enqueue(9);
		q.Dequeue();
		q.Display();

	}

}
