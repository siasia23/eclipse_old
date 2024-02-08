package edu.java.thread;

// 1~30의 정수 중 홀수만 출력하는 스레드
public class OddThread extends Thread {
	
	// 공유객체를 이 스레드가 가지도록
	private SharedObject so;
	
	public SharedObject getSo() {
		return so;
	}

	public void setSo(SharedObject so) {
		this.so = so;
	}


	@Override
	public void run() {
		
		for(int i=1; i<30; i+=2) {
			System.out.println("OddThread: " + i);
/*
			if(i==9) {
				new EvenThread().start();    
			}
*/			
			try {
				Thread.sleep(500);
			} catch(InterruptedException ie) {
				ie.printStackTrace();
			} // try-catch
			
		} // for
	
	} // run
	
}
