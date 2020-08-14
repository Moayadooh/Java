package com.moayad.oop.array_of_object;

public class Demo {
    public static void main(String[] args) {
        //Array of object
		Student[] obj = new Student[2];
        obj[0] = new Student("Eyad",1);
        obj[1] = new Student("Mohammed",2);
		for(Student st:obj) {
			System.out.println("ID: "+st.id);
			System.out.println("Name: "+st.name);
		}
    }
}
