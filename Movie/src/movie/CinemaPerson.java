package movie;

// 예매자정보. 총 200명. 
// 이름 CP1~CP200
// 구현 시 Math.random() 활용
public class CinemaPerson {
	
	private String name; // "CP";
	
	private Seat reservationSeat;
	
	public CinemaPerson() {
	}

	public CinemaPerson(String name, Seat reservationSeat) {
		super();
		this.name = name;
		this.reservationSeat = reservationSeat;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Seat getReservationSeat() {
		return reservationSeat;
	}

	public void setReservationSeat(Seat reservationSeat) {
		this.reservationSeat = reservationSeat;
	}

	@Override
	public String toString() {
		return "CinemaPerson [name=" + name + ", reservationSeat=" + reservationSeat + "]";
	}
	
}
