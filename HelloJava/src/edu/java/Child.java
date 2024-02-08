package edu.java;

public class Child extends Parent {

	String name="Child";
	
	@Override // 오버라이딩 메소드 위에 써줌. 실수 방지 위해.
	String getName() {
		return this.name;
	}
	
}
