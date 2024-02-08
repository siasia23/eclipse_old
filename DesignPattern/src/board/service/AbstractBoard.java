package board.service;

import java.util.List;

import board.bean.Board;

//구체적인 구현은 안 함. 
//객체 생성 못하고 기본 구현만 함.
//구체적 구현은 이 클래스를 상속받는 하위 클래스에서 할거임.
public abstract class AbstractBoard implements BoardService {
// 인터페이스를 받은 추상클래스를 만들면, 
// 이 추상 클래스를 상속받은 하위클래스는,
// 원하는 메소드만 골라서 구현 가능함!!!!!!!!!!!!!!!!!!!
// 이 추상클래스가 존재하는 이유임!!!!!!!
	
	@Override
	public List<Board> getBoardList() {
		return null;
	}
	
	@Override
	public void registBoard(Board board) {
		
	}
	
	@Override
	public void deleteBoard(int bid) {
		
	}
	
	@Override
	public void updateBoard(Board board) {
			
	}
	
}
