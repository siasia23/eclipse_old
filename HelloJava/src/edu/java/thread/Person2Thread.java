package edu.java.thread;

public class Person2Thread extends Thread {

	Person person2;
	
	Person2Thread(Person person) {
		this.person2=person;
	}
	
	@Override
	public void run() {

		for (int i=0; i<10; i++) {
		
			synchronized (person2.getAccount()) {
				person2.getAccount().setMoney(
					person2.getAccount().getMoney() + 500
				);
			} // 동기화된 블럭
			
			System.out.println(person2.getName() + "님의 잔고 : " + person2.getAccount().getMoney());
	
			try {
				Thread.sleep(1000);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
			
		} // for
		
	} // run
	
}
