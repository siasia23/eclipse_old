package edu.java;

public class Person {

	static int si = 1; // static은 무조건!! 초기화부터 해놓고 사용해야함.
	int nsi; // int의 기본값인 0으로 초기화된 상태, 객체가 생성되기 전인 상태.
	String name; // String의 기본값인 null로 초기화된 상태, 객체가 생성되기 전인 상태.
	
	// getter method
	// get할 변수명의 첫글자는 대문자
	// get 했으면, 그 값을 return(반환) 해야함
	String getName() {
		return this.name;
	}
	
	// setter method
	// void로 시작
	// set할 변수명의 첫글자도 대문자
	// () 안에는 set할 재료
	// setting만 하는거니까 반환할 값이 없다.
	void setName(String name) {
		this.name = name; 
		// this : 현재 메모리에서 참조된 객체 자기 자신(에 임시로 부여한 이름)
		// 아직 객체가 생성되기 전이어서 구체적인 이름이 없지만, 생성될 예정인 객체의 임시 이름이 필요할 때 사용
		// 관습적으로 '홍길동'이라고 쓰듯이.
	}
	
	
	
	int getNsi() {
		return this.nsi;
	}
	
	void setNsi(int nsi) {
		this.nsi = nsi;
	}
	
}
