package edu.java;

public class JavaVariable {

	// static 멤버변수
	static int si = 1;
	
	// non-static 멤버변수, 초기값을 안 줘도 자동초기화됨. 객체가 소멸될 때 없어짐.
	int nsi = 2;
	
	// static 멤버 메소드
	static int add(int i, int j) { // int 타입으로 반환한다. 파라미터는 int i, int j이며, 이들은 add 메소드의 지역변수.
		return i+j; // i+j 값을 반환해라
	}
	
	// non-static 멤버 메소드
	int mul(int i, int j) {
		return i*j;
	}
}
