package strategy;

public class Hand {
	
	static Hand rock;
	static Hand paper;
	static Hand scissors;

	static Hand[] hand= {rock, scissors, paper};
	
	static int handvalue;

	public Hand(Hand rock, Hand paper, Hand scissors) {
		this.rock = rock;
		this.paper = paper;
		this.scissors = scissors;
	}

	public Hand getHand() {
		
		if (handvalue==0) return hand[0]; // rock
		if (handvalue==1) return hand[1]; // scissors
		if (handvalue==2) return hand[2]; // paper
		
		return null; // handvalue가 0,1,2가 아닌 경우의 리턴값

	}
	
	public boolean isStrongerThan() {
		
		return true;
	}
	
	public boolean isWeakerThan() {
		return true;
	}

	public int fight() {
		
		if (this.handvalue == handvalue) return 0; 				// 무승부
		if ((this.handvalue+1) % 3 == handvalue) return 1; 	// 이긴다.
		if ((this.handvalue+2) % 3 == handvalue) return 2; 	// 진다.
		
		return 999;
		
	}

}
