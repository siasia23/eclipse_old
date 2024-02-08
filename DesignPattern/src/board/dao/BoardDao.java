package board.dao;
// Data Access Object

import java.util.ArrayList;
import java.util.List;

import board.aggregate.BidAggregate;
import board.bean.Board;
import board.iterator.Iterator;
import board.service.AbstractBoard;

// 객체 생성 및 구체적 구현 가능해짐
// 싱글톤으로 해보자
public class BoardDao extends AbstractBoard {

	private List<Board> boardList;
	
	// 싱글톤
	private static BoardDao bd=new BoardDao();
	
	private BoardDao() {
		
		boardList = new ArrayList<Board>();
		
		registBoard(new Board(1, "제목1", "내용1"));
		registBoard(new Board(2, "제목2", "내용2"));
		registBoard(new Board(3, "제목3", "내용3"));
		
		Iterator it = (Iterator) new BidAggregate().iterator();
		
		while (it.hasNext()) {
			int itNext=(Integer)it.next();
			registBoard(new Board(itNext, "제목"+itNext, "내용"+itNext));
		}
		
	}

	public static BoardDao getInstance() {
		return bd;
	}
	
	@Override
	public List<Board> getBoardList() {
		return boardList;
	}
	
	@Override
	public void registBoard(Board board) {
		boardList.add(board);
	}
	
	@Override
	public void deleteBoard(int bid) {
		
		for (Board board : boardList) {
			
			if (board.getBid() == bid) {
				boardList.remove(board);
			}
			
		} // for
		
	}
	
	@Override
	public void updateBoard(Board board) { // board : 새로 전달해주는 보드
		
		for (Board brd : boardList) { // brd : 보드리스트에서 꺼낸 기존의 보드
			
			if (brd.getBid() == board.getBid()) {
				brd.setTitle(board.getTitle());
				brd.setContent(board.getContent());
			}
			
		} // for
		
	}
	
}
