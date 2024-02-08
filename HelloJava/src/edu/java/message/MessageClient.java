package edu.java.message;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// 직렬화 : 객체 > 스트림
// ObjectOutputStream
// Socket

// Message 객체를 생성해서 서버로 전송
public class MessageClient { // 서버 실행 후에 클라이언트 실행

	// 필드
	final static String TCPSERVER_IP="172.30.1.99"; 	// 내 컴퓨터 IP
	final static int TCPSERVER_PORT=23533; 			// 임의의 포트번호 지정
	
	// main()
	public static void main(String[] args) {
	
		Socket socket=null;
		
		OutputStream os=null;
		ObjectOutputStream oos=null;
		
		List<Message> msgList=new ArrayList<Message>();
		msgList.add(new Message("제목임","내용임",new Date()));
		msgList.add(new Message("제목이고","내용이고",new Date()));
		msgList.add(new Message("제목이다","내용이다",new Date()));
		
		try {
		
			socket=new Socket(TCPSERVER_IP,TCPSERVER_PORT);
			
			os=socket.getOutputStream();
			oos=new ObjectOutputStream(os);

//			oos.writeObject(new Message("제목", "내용", new Date())); // Message 객체 여러 개 담으려면 List로 담아야 함
			oos.writeObject(msgList);
			oos.flush();
				
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} 
		
		finally { // 닫는건 연 순서의 반대로
			try {
  				oos.close();
//				os.close(); // os와 oos가 연결되어 있어서 oos를 닫으면 os도 같이 닫힘
				socket.close();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		} // finally
	
	} // main()
	
} // class
