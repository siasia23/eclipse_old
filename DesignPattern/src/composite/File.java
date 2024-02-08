package composite;

public class File extends Entry {
	
	String name;
	long size;

	@Override
	public String getName() {
		return name;
	}

	@Override
	public long getSize() {
		return size;
	}

	@Override
	public void printList() {

	}

}
