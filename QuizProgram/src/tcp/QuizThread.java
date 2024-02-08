package tcp;

// I/O 처리를 스레드에서 해야함.
public class QuizThread extends Thread {

	QuizTCPServer socket;
	
	@Override
	public void run() {

		Thread quizList=new Thread();
		
		quizList.start();
		
		try {
			quizList.sleep(10000);
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
		
		
		
	} // run
	
} // Thread class
