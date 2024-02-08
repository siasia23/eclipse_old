package board.service;

import java.util.List;

import board.bean.Board;

// facade (entry point) (service facade)
// 모든 서비스를 이 퍼샤드를 통해서 할거임
public interface BoardService {
// 인터페이스를 implements 하면 소속된 메소드를 "전부 다" 구현해야함

	// 보드의 목록 불러오기
	public abstract List<Board> getBoardList();
	
	// 보드에 등록
	public abstract void registBoard(Board board);
	
	// 삭제
	// 지울 때 목록 번호가 필요할거 같으니 int 값을 인자로 넣어주자
	public abstract void deleteBoard(int bid);
	
	// 보드 수정
	public abstract void updateBoard(Board board);
	
}
