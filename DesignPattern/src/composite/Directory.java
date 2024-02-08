package composite;

public class Directory extends Entry {
	
	Entry entry; // 디렉토리가 엔트리를 상속받았으니, 엔트리를 갖고있어야 함
	
	String name;
	String directory;

	@Override
	public String getName() {
		return name;
	}

	@Override
	public long getSize() {
		return 0L;
	}

	@Override
	public void printList() {

	}
	
	public void add() {
		
	}

}
