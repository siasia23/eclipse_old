package abstractFactory.framework;

public abstract class Tray extends Item{
	
	// Item을 상속받아서 Item을 가짐.
	private Item tray;
	
	public Item getTray() {
		return tray;
	}
	
	public abstract void add();

	@Override
	public abstract String makeHTML();	
	
	
}
