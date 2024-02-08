package edu.java.exception;

public class ExceptionTest2 {

	public static void main(String[] args) {
		
		// 실습1. OutOfMemory 발생
		// heap이 가득참. 객체 무한생성.
//		int count=0;
//		while(true) {
//			ExceptionTest2 e2=new ExceptionTest2();
//			System.out.println(++count + ":" + e2);
//		}
		
		
		
		// 실습2. StackOverflow 발생
		// 무한 호출
		a();
	}
	
	public static void a() {
		b();
	}
	
	public static void b() {
		a();
	}
	
}
