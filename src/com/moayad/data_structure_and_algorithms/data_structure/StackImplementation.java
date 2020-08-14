package com.moayad.data_structure_and_algorithms.data_structure;

class Stack<T>{
	Object[] array;
	int size;
	int count = 0;
	int top = -1;
	Stack(int size){
		array = new Object[size];
		this.size = size;
	}
	public void Add(T value) {
		if(count==size)
			System.out.println("Stack is full!!");
		else {
			top++;
			array[top] = value;
			System.out.println(array[top]+" is added");
			count++;
		}
	}
	public void Remove() {
		if(count==0)
			System.out.println("Stack is empty!!");
		else {
			System.out.println(array[top]+" is removed");
			top--;
			count--;
		}
	}
	public void Display() {
		if(count==0)
			System.out.println("Stack is empty!!");
		else {
			for(int i=0;i<=top;i++) {
				System.out.print(array[i]+" ");
			}
			System.out.println();
		}
	}
}

public class StackImplementation {

	public static void main(String[] args) {
		Stack<Object> st = new Stack<Object>(5);
		st.Add(1);
		st.Add(2);
		st.Add(3);
		st.Display();
		st.Remove();
		st.Remove();
		st.Remove();
		st.Display();
		st.Add("Moayad");
		st.Add("Mohammed");
		st.Add("Mohanned");
		st.Add("Eyad");
		st.Add("Manasik");
		st.Add("Miqat");
		st.Display();
		st.Remove();
		st.Remove();
		st.Display();
	}

}
