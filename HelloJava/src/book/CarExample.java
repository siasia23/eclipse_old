package book; //343p 

public class CarExample {

	public static void main(String[] args) {
		
		Car car=new Car();
		
		for (int i=1; i<5; i++) {
			
			// for문 로컬변수
			int problemTireNum=car.run();
			
			switch(problemTireNum) {
			
				case 1:
					System.out.println("앞왼 한국타이어로 교체");
					car.frontLeft=new HankookTire("앞왼", 15);
					break;
					
				case 2:
					System.out.println("앞오른 한국타이어로 교체");
					car.frontRight=new HankookTire("앞오른", 13);
					break;
					
				case 3:
					System.out.println("뒤왼 한국타이어로 교체");
					car.backLeft=new HankookTire("뒤왼", 14);
					break;
					
				case 4:
					System.out.println("뒤오른 한국타이어로 교체");
					car.backRight=new HankookTire("뒤오른", 17);
					break;
			
			} // switch
			
			System.out.println("----1회전 끝----");
			
		} // for
	
	} // main

} // class