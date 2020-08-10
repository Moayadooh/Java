package com.moayad.oop.practise;

public class Car<T> {
	T price;
	Car(){
		
	}
	void setPrice(T price) {
		this.price = price;
	}
	T getPrice() {
		return price;
	}
}
