package edu.java.anonymous;

public class Cat implements Soundable {
	
	String name;
	String sound;
	
	Cat() {
		
	}

	Cat(String name) {
		this.name=name;
	}
	
	Cat(String name, String sound) {
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
