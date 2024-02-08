package strategy;

public class Player implements Strategy{

	String name;
	
	Strategy strategy;
	
	int wincount;
	int losecount;
	int gamecount;
	
	public Player() {

	}
	
	public Player(String name, Strategy strategy, int wincount, int losecount, int gamecount) {
		super();
		this.name = name;
		this.strategy = strategy;
		this.wincount = wincount;
		this.losecount = losecount;
		this.gamecount = gamecount;
	}

	@Override
	public Hand nextHand() {

		strategy.nextHand();
		return null;
	}
	
	@Override
	public boolean study() {

		strategy.study();
		return false;
	}
	
	public void win() {
		
	}
	
	public void lose() {
		
	}
	
	public void even() {
		
	}
	
}
