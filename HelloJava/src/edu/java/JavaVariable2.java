package edu.java;

public class JavaVariable2 {

	int realnsi =1; // non-static 멤버변수
	static int realni=1; // static 멤버변수
	
	{ // non-static block
		int nsi; // 지역변수
		realnsi=1; // block 밖에서 선언된 멤버변수는 갖다 쓸 수 있다.
		realni=1; // non-static 영역에서 static을 사용할 수 있다.
		Fruits a=new Fruits(); // a는 지역변수로 stack에 저장. A() 생성자를 가지고 만들어진 객체는 힙에 저장.
	}
	
	static { // static 초기화 block. 자주 사용됨. static 변수들을 초기화할 때 씀.
		int si=2; // 지역변수
		realnsi=2; // non-static 변수를 static 영역 안에서 쓸 수 없다. 우선권은 static에게 있다.
		realni=1; // static 영역에서 static 사용할 수 있다.
		Fruits a=new Fruits(); // a는 지역변수. 위의 a와 같음.
	}
	
	public static void main(String[] args) {
		System.out.println(nsi);
		System.out.println(si);
		// block 밖에서 선언된 지역변수여서 읽어들일 수 없다.
	}
}
