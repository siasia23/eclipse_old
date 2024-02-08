package edu.java.thread;

public class ThreadExer1 {

	public static void main(String[] args) {

/* 1. Runnable 구현한 경우
 * 
		Thread oddPrinter1=new Thread(new OddPrinter1());
		// thread OddPrinter1의 객체 생성
		
		oddPrinter1.start();
*/

		
/* 2. Thread 상속받은 경우 
		new OddPrinter2().start();
*/
	
		
 //3. Thread를 구현한 클래스의 익명객체를 생성한 경우
 
		Thread thread=new Thread() {
			
			@Override
			public void run() {
				
				for (int i=1; i<100; i+=2) {
					
					System.out.println("OddPrinter1 thread : " + i);
					
					try {
						Thread.sleep(500);
					} catch (InterruptedException ie) {
						ie.printStackTrace();
					}
					
				} // for
			} // run
		}; // Thread
		
		thread.start();
		
		thread.setName("홀수출력스레드");
		System.out.println(thread.getName());
		
		
		  
		// main thread
		for (int i=2; i<102; i+=2) {
			
			System.out.println("main thread : " + i);
			
			try {
				Thread.sleep(500); // 500 = 0.5s
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
			
		} // for
		
	} // main
	
}
