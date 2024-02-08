package edu.java.animal;

public abstract class Animal 
	implements Walkable, Runnable, Flyable, Soundable {
	// implements : 인터페이스를 불러온다.
	
	String sort;
	String name;
	
	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("걷는다");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("뛴다");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("난다");
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("운다");
	}

	
}
