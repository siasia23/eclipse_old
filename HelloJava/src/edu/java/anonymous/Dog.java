package edu.java.anonymous;

public class Dog implements Soundable {
	
	String name;
	String sound;
	
	Dog() {
		
	}
	
	Dog(String name) {
		this.name=name;
	}
	
	Dog(String name, String sound) {
		this.name=name;
		this.sound=sound;
	}

	@Override
	public String name() {
		return this.name;
	}
	
	@Override
	public String sound() {
		return this.sound;
	}

}
