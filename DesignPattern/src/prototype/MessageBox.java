package prototype;

public class MessageBox implements Product, Cloneable {

	private String decochar;

	public MessageBox(String decochar) {
		this.decochar=decochar;
	}
	
	@Override
	public Object createClone() throws CloneNotSupportedException {
		return this.clone();
	}
	
	@Override
	public void use() {
		System.out.println(decochar);
	}
	
}
