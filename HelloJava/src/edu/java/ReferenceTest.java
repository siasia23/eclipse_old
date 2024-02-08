package edu.java;

public class ReferenceTest { 
	
	// static 바깥인 여기는 non-static 영역.

	static Person person1; // non-static 변수 person1 선언
	static Person person2; // non-static 변수 person2 선언
	
	public static void main(String[] args) { 
		
		// 이 안은 static 영역. static main으로 설정했으니까.
		
		person1 = new Person(); // 에러 이유 : static 영역에서 non-static 변수는 사용불가
		person2 = new Person(); // 라인7,8의 앞에 static 붙이면 에러 수정됨  
		
		System.out.println(person1);
		System.out.println(person2);
		
		// 출력하면 참조값이 다름을 알 수 있다.
		// 서로 다른 곳에 저장됐다는 뜻.
		
		person1.si = 2; // person1d의 si 값을 2로 바꿔보자
		System.out.println(person2.si);
		
		person1.setName("홍길동"); // person1의 변수 name의 값을 "홍길동"으로 setting
		person2.setName("홍길동"); // person2의 변수 name의 값을 "강감찬"으로 setting
		
		System.out.println(person1.getName()); // person1의 변수 name의 값을 불러오자(get)
		System.out.println(person2.getName());
		
		System.out.println(person1.name.hashCode()); // person1의 name의 hashCode
		System.out.println(person2.name.hashCode());
		System.out.println("홍길동".hashCode());
		System.out.println(new String("홍길동").hashCode());
		
		System.out.println(
				person1.name == person2.name
				// 같은 객체인지 = 같은 메모리에 있는지 = 참조가 같은지
				// person이 static에 저장되어 있으니까 = static은 메모리 한 번만 만드니까 = 같은 메모리다.
				// person이 non-static으로 선언됐으면, 서로 다른 객체다.
		);
		
		System.out.println(
				person1.name.equals(person2.name)
				// 문자열의 배열이 같은지
		);
		
		
	} // main
	
} // class
