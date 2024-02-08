package book;

public class HankookTire extends Tire {

	// 생성자
	public HankookTire(String location, int maxRotation) {
		// 상위타입 Tire의 생성자를 가져옴
		super(location, maxRotation);
	}
	
	@Override
	public boolean roll() {

		// 오버라이드 하면 상위타입의 필드를 그대로 사용할수있다.
		
		++ accumRotation;
		
		if (accumRotation < maxRotation) {
			
			System.out.println(location + "한국타이어 수명: " + (maxRotation-accumRotation) + "회");
			return true;
			
		} else {
			
			System.out.println(location + "한국타이어 펑크!");
			return false;
			
		}
	
	}
	
}
