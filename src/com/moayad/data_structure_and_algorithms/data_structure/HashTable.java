package com.moayad.data_structure_and_algorithms.data_structure;

class Entry{
	int key;
	Object value;
	Entry next;
	Entry(int key,Object value){
		this.key = key;
		this.value = value;
	}
	Entry(){
		next = null;
	}
}

class myHashTable<T>{
	int size;
	Entry[] hashArray;
	myHashTable(int size){
		this.size = size;
		hashArray = new Entry[size];
		for(int i=0;i<size;i++) {
			hashArray[i] = new Entry();
		}
	}
	public void put(int key ,Object value) {
		int indexLocation = key % size;
		Entry newItem = new Entry(key,value);
		newItem.next = hashArray[indexLocation].next;
		hashArray[indexLocation].next = newItem;
		/*newItem.next = hashArray[indexLocation];
		hashArray[indexLocation] = newItem;*/
	}
	public T display(int key) {
		int indexLocation = key % size;
		Entry temp = hashArray[indexLocation];
		T value = null;
		while(temp!=null) {
			if(temp.key==key) {
				value = (T)temp.value;
				break;
			}
			temp = temp.next;
		}
		return value;
	}
}

public class HashTable {

	public static void main(String[] args) {
		myHashTable<Integer> ht = new myHashTable<Integer>(2);
		ht.put(20, 6);
		ht.put(20, 5);
		ht.put(10, 2);
		ht.put(8, 8);
		ht.put(1, 33);
		
		System.out.println(ht.display(8));
		System.out.println(ht.display(10));
		System.out.println(ht.display(20));
		System.out.println(ht.display(11));

	}

}
