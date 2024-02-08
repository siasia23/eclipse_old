package edu.java;

public class Fruits {

	String color;
	int price;

	Fruits() {
		
	}
	
	Fruits(String color, int price) {
		this.color=color;
		this.price=price;
	}
	
	void println(String color) {
		System.out.println(color);
	}
}
