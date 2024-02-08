package book;

public class Tire {

	public int maxRotation;
	public int accumRotation;
	public String location;
	
	// 생성자
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	public boolean roll() {
		
		++ accumRotation;
		
		if (accumRotation < maxRotation) {
			
			System.out.println(location + "타이어 수명: " + (maxRotation-accumRotation) + "회");
			return true;
			
		} else {
			
			System.out.println(location + "타이어 펑크!");
			return false;
			
		}
		
	}
	
}
