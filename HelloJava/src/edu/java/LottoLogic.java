package edu.java;

// 로또로직
public class LottoLogic {

	LottoBall[] comNums; // 컴퓨터가 추출한 7개의 번호
	LottoBall[] userNums; // 사용자가 입력한 6개의 번호

	LottoLogic() {
		
	}
	
	LottoLogic(LottoBall[] comNums, LottoBall[] userNums) {
		this.comNums = comNums;
		this.userNums = userNums;
	}
	
	// 순위를 연산해서 리턴해주는 메소드
	int getRank() {
		return 0;
	}
	
}
