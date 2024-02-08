package movie;

import java.util.List;

// 상영관 5개. 좌석 25개씩.
public class Room {
	
	private String roomName;
	private List<Seat> seatList; // Room은 Seat들의 List를 갖는다.
	// 개수를 정해두지 않으려고 List 쓴다.
	// 개수는 main에서 정할거다.

	public Room() {
	}
	
	public Room(String roomName, List<Seat> seatList) {
		super();
		this.roomName = roomName;
		this.seatList = seatList;
	}

	public String getRoomName() {
		return roomName;
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	public List<Seat> getSeatList() {
		return seatList;
	}

	public void setSeatList(List<Seat> seatList) {
		this.seatList = seatList;
	}

	// toString Override 안 하면 메인에서 출력했을 때 @16진수 나옴!
	@Override
	public String toString() {
		return "Room [roomName=" + roomName + ", seatList=" + seatList + "]";
	}

}
