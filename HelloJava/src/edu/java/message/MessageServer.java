package edu.java.message;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.List;

// 역직렬화 : 스트림 > 객체
// ObjectInputStream
// ServerSocket, Socket

// 전송받은 Message 객체의 제목, 내용, 작성일시를 출력
public class MessageServer { // 서버 먼저 실행

	final static int TCPSERVER_PORT=23533;
	
	// main()
	public static void main(String[] args) {
		
		ServerSocket ss=null;
		Socket socket=null;
		ObjectInputStream ois=null;
		
		FileWriter fw=null;
		
		try {
			
			ss=new ServerSocket(TCPSERVER_PORT);
			socket=ss.accept();

			ois=new ObjectInputStream(socket.getInputStream());
			
/* 			// 하나의 객체 받을 때
			Message msg=(Message) ois.readObject();
			
			System.out.println(msg);
			
			System.out.println( "제목: " + msg.getSubject() );
			System.out.println( "내용: " + msg.getContent() );
			
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm");
			System.out.println( "작성일시: " + sdf.format(msg.getWriteDate()) );
*/			
			
			// 객체를 리스트로 받을 때
			List<Message> msgList=(List<Message>) ois.readObject();
			
			File file=new File("C:/java_logs/log_20231121.txt");
			if(!file.exists()) file.createNewFile();
			
			fw=new FileWriter(file);
			
			for(Message msg:msgList) { // msgList에서 Message 타입의 msg를 하나씩 꺼내자
				
				System.out.println( "제목: " + msg.getSubject() );
				System.out.println( "내용: " + msg.getContent() );
				
				SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm");
				System.out.println( "작성일시: " + sdf.format(msg.getWriteDate()) );
			
				fw.write( sdf.format(msg.getWriteDate()) + " " + msg.getSubject() + " " + msg.getContent() + "\n");
				fw.flush();
				
			} // for 
			
		} catch(IOException ioe) {
			ioe.printStackTrace();
		} catch(ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		} 
		
		finally {
			try {
				fw.close();
				ois.close();
				ss.close();
			} catch(IOException ioe) {
				ioe.printStackTrace();
			}
		} // finally
		
	} // main()
	
} // class
