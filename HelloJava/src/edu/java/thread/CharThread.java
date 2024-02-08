package edu.java.thread;

// A(아스키코드 61) ~ Z(아스키코드 90) 출력하는 스레드
public class CharThread extends Thread {

	@Override
	public void run() {

		for(int i=65; i<=90; i++) {
			System.out.println("CharThread: " + (char)i);
		
			try {
				Thread.sleep(500);
			} catch(InterruptedException ie) {
				ie.printStackTrace();
			}
		
		} // for
		
	} // run
	
}
