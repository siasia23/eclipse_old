package board;

public abstract class Template {

	public abstract void printTop();
	public abstract void printMiddle();
	public abstract void printBottom();
	
	// Template method pattern
	public void printList() {
		printTop();
		printMiddle();
		printBottom();
	}
	
}
