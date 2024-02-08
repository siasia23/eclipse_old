package board.aggregate;

import board.iterator.BidIterator;

public class BidAggregate implements Aggregate {

	private int[] bidArray=new int[10];
	
	public BidAggregate() {

		for (int i=1; i<10; i++) {
			bidArray[i]=i;
		}
	
	}
	
	public int[] getBidArray() {
		return this.bidArray;
	}
	
	@Override
	public Object iterator() {
		return new BidIterator();
	}

}
