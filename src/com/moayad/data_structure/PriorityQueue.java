package com.moayad.data_structure;

class PrQueue{
	int size;
	int[] array;
	int i;
	PrQueue(int size){
		this.size = size;
		array = new int[size];
		i = - 1;
	}
	public void add(int item) {
		if(i==size-1) {
			System.out.println("Queue is full!!");
			return;
		}
		i++;
		array[i] = item;
		sort();
	}
	public void sort() {
		if(i>0) {
			int j = i;
			while(array[j]<array[j-1]) {
				int temp = array[j];
				array[j] = array[j-1];
				array[j-1] = temp;
				j--;
				if(j==0)
					break;
			}
		}
	}
	public void remove() {
		if(i!=0)
			i--;
		else
			System.out.println("Queue is empty!!");
	}
	public void display() {
		if(i==0)
			System.out.println("Queue is empty!!");
		else {
			for(int j=0;j<=i;j++) {
				System.out.println(array[j]);
			}
		}
	}
}

public class PriorityQueue {

	public static void main(String[] args) {
		PrQueue pq = new PrQueue(5);
		pq.display();
		pq.add(5);
		pq.add(8);
		pq.add(3);
		pq.add(4);
		pq.remove();
		pq.display();

	}

}
