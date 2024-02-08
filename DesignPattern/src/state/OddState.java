package state;

//싱글톤 패턴
public class OddState implements State {
	
	private static OddState oddState =new OddState();
	
	private OddState() {

	}
	
	public Object getInstance() {
		return oddState;
	}
	
}
