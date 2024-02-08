package edu.java.io;

import java.io.Serializable;

// 직렬화 가능하게 인터페이스 Serializable 구현
public class Person implements Serializable {
	
	// 네트워크 상의 식별자. 네트워크에서 다른 동명 클래스와의 충돌방지.
	public static final long serialVersionUID=256261216663536L; // 값은 임의로 지정

	private String ssn;		// 주민번호
	private String name; 	// 이름
	private int age; 			// 나이
	
	public Person() {
	}

	public Person(String ssn, String name, int age) {
		super();
		this.ssn = ssn;
		this.name = name;
		this.age = age;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [ssn=" + ssn + ", name=" + name + ", age=" + age + "]";
	}
	
}
