package edu.java.thread;

public class Person1Thread extends Thread {

	Person person1;
	
	Person1Thread(Person person) {
		this.person1=person;
	}
	
	@Override
	public void run() {

		for (int i=0; i<10; i++) {
		
			// 객체를 동기화함
			synchronized(person1.getAccount()) {
				person1.getAccount().setMoney(
					person1.getAccount().getMoney() - 1000				
				);
			}
			
			System.out.println(person1.getName() + "님의 잔고 : " + person1.getAccount().getMoney());
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
			
		} // for
		
	} // run()
	
}
