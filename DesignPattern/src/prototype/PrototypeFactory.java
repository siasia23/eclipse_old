package prototype;

public abstract class PrototypeFactory {

	public Object createMessageBox(String str) {
		
		MessageBox mb=messageBox(str);
		
		return messageBox;
		
	}
	
}
