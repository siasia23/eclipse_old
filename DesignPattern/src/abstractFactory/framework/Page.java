package abstractFactory.framework;

public abstract class Page {

	private Item item;
	
	public Item getItem() {
		return item;
	}
	
	private String title;
	private String author;
	private String content;
	
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public String getContent() {
		return content;
	}
	
	void add() {
		
	}

	void output() {
		
	}
	
	public abstract String makeHTML();
}
