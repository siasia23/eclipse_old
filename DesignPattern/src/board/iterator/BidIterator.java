package board.iterator;

import board.aggregate.Aggregate;
import board.aggregate.BidAggregate;

public class BidIterator implements Iterator {

	Aggregate bidAggregate;
	int currentBid;

	// BidIterator가 BidAggregate를 가지게 함
	public BidIterator() {
		bidAggregate=new BidAggregate();
	}
	
	@Override
	public boolean hasNext() {

		if (currentBid == 10) {
			return false;
		} else {
			return true;
		}
		
	} // hasNext
	
	@Override
	public Object next() {
		
		int[] bidArray = ((BidAggregate)bidAggregate).getBidArray();
		return bidArray[currentBid];
	
	} // next
	
} // class
