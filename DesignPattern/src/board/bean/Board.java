// Java bean
package board.bean;

// Board 객체 하나 == 게시물 하나
public class Board {

	// field
	private int bid;				// 게시물의 번호
	private String title;			// 게시물의 제목
	private String content; 	// 게시물의 내용
	
	// 생성자
	public Board() {
	}

	public Board(int bid, String title, String content) {
		super();
		this.bid=bid;
		this.title = title;
		this.content = content;
	}

	// getters, setters
	public int getBid() {
		return bid;
	}
	
	public void setBid(int bid) {
		this.bid = bid;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	// toString
	@Override
	public String toString() {
		return "Board [bid=" + bid +", title=" + title + ", content=" + content + "]";
	}

}
