package tcp;

import java.util.ArrayList;
import java.util.List;

// 붕어빵

public class QuizList extends Thread {

	@Override
	public void run() {
		
		// 퀴즈 10개를 담을 리스트 quiz
		List<Quiz> quiz=new ArrayList<>();
		
		quiz.add(new Quiz(1, "문제 1.", "답 1."));
		quiz.add(new Quiz(2, "문제 2.", "답 2."));
		quiz.add(new Quiz(3, "문제 3.", "답 3."));
		quiz.add(new Quiz(4, "문제 4.", "답 4."));
		quiz.add(new Quiz(5, "문제 5.", "답 5."));
		quiz.add(new Quiz(6, "문제 6.", "답 6."));
		quiz.add(new Quiz(7, "문제 7.", "답 7."));
		quiz.add(new Quiz(8, "문제 8.", "답 8."));
		quiz.add(new Quiz(9, "문제 9.", "답 9."));
		quiz.add(new Quiz(10, "문제 10.", "답 10."));
		
		System.out.println(quiz);
	
	} // run
}
