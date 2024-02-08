package tcp;

// 붕어빵 틀

// 퀴즈가 각자 갖고 있는 것
// 퀴즈 객체 10개를 만들기 위해
public class Quiz {

	private int no; 			// 문제 번호
	private String que; 		// 문제
	private String answer; // 정답
	
	public Quiz() {
	}

	public Quiz(int no, String que, String answer) {
		super();
		this.no = no;
		this.que = que;
		this.answer = answer;
	}

}
