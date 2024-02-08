package strategy;

public class WinningStrategy implements Strategy {

	boolean won;
	
	Hand prevHand;
	
	
	
	
	@Override
	public Hand nextHand() {

		if (won) 
		
		return null;
	}

	@Override
	public boolean study() {
		// TODO Auto-generated method stub
		return false;
	}

}
