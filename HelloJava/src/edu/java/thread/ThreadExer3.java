package edu.java.thread;

public class ThreadExer3 {

	public static void main(String[] args) {

		// 공유 객체
		SharedObject so=new SharedObject(0, true);
		
		// oddThread에 공유객체 설정
		OddThread oddThread = new OddThread();
		oddThread.setSo(so);
		
		// evenThread에 공유객체 설정
		EvenThread evenThread = new EvenThread();
		evenThread.setSo(so);
		
		oddThread.start();
		evenThread.start();
		
		// 실습 2. 공유객체 사용해서 0~30 순차적으로 출력되도록. 
		
		
		
		
		
		
		
	} // main
	
}
