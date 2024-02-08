package edu.java;

public class Animal {

	String sort;
	int footNum;
	
	Animal() {
		
	}
	
	Animal(String sort){
		this.sort = sort;
	}
	
	Animal(String sort, int footNum) {
		this.sort = sort;
		this.footNum = footNum;
	}
	
}
	
class AnimalA {
	
	public static void main(String[] args) {
				
		Animal a1 = new Animal("포유류", 4);
		
		Animal a2 = new Animal("어류", 0);

		System.out.println(a1);
		System.out.println(a2);
		
	}
}
