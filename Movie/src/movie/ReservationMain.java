package movie;

import java.util.ArrayList;
import java.util.List;

// 메인
public class ReservationMain {

	public static final int ROOM_COUNT=5;
	public static final int SEAT_COUNT_PER_ROOM=25;
	public static final int CINEMAPERSON_COUNT=200;
	
	public static void main(String[] args) {

		/* 1. 좌석 만들기 : 총 25*5 개 */
		List<Seat> seatList=new ArrayList<Seat>();
		
		for (int i=0; i < SEAT_COUNT_PER_ROOM * ROOM_COUNT; i++) {
			seatList.add(new Seat(String.valueOf(i+1), false));
		}
		
		System.out.println(seatList);
		
		
		/* 2. 상영관 만들기 : 5개 룸이 좌석 25개씩 subList 사용 */
		List<Room> roomList=new ArrayList<Room>();
		
		for (int i=0; i<ROOM_COUNT; i++) {
			
			roomList.add(new Room(
					(i+1)+"관",
					seatList.subList(i*SEAT_COUNT_PER_ROOM, (i+1)*SEAT_COUNT_PER_ROOM))
			);
			
		} // for
		
		System.out.println(roomList);
		
		
		/* 2-1. 영화관 만들기 */
		Cinema cinema=new Cinema(roomList);
		
		System.out.println(cinema);
		
		
		/* 3. 사람 만들기 : 예매좌석번호 아직 모르니까 null */
		List<CinemaPerson> cinemaPersonList=new ArrayList<CinemaPerson>();
		
		for (int i=0; i<CINEMAPERSON_COUNT; i++) {
			cinemaPersonList.add(new CinemaPerson("CP"+i+1, null));
		}
		
		System.out.println(cinemaPersonList);
		
		
		/* 4. 예매 로직 */
		// 사람이 상영관 & 좌석 고름 > 해당좌석 boolean true 
		
		
		/* 5. 출력 로직 */
		// > 사람이 해당 좌석값 가지게 됨
		
		
		
		
	} // main

} // class
