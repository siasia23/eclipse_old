package board;

  import board.bean.Board;
import board.dao.BoardDao;
import board.service.BoardService;

public class BoardMain extends Template{

	// 보드서비스를 쓸거다				
	  
	// 구현 가능한 클래스는 BoardDao 뿐이다
	// static main에서 쓸거니까 static으로 선언하자
	static BoardService boardService = BoardDao.getInstance(); 
	
	public static void main(String[] args) {

		Template bm=new BoardMain();
		
		// 구현 테스트
		bm.printList();

		// 삭제 테스트
		boardService.deleteBoard(2);
		bm.printList();
		
		// 등록 테스트
		Board board4=new Board(4, "제목4", "내용4");
		boardService.registBoard(board4);
		bm.printList();
		
		// 업데이트 테스트
		board4.setTitle("새 제목4");
		board4.setContent("새 내용4");
		boardService.updateBoard(board4);
		bm.printList();
		
	} // main

	@Override
	public void printTop() {
		System.out.println("리스트 출력 시작!");
	}
	
	@Override
	public void printMiddle() {
		
		// 람다식......................
		boardService.getBoardList().forEach(bl -> {
			System.out.println("제목 : " + bl.getTitle());
			System.out.println("내용 : " + bl.getContent());
		});
		
	}
	
	@Override
	public void printBottom() {
		System.out.println("리스트 출력 끝!");
	}

/*
	@Override
	public void printList() {
		super.printList();
	}
*/
	
} // class
