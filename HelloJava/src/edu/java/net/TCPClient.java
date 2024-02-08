package edu.java.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClient {

	// 접속할 서버 아이피 주소
	final static String TCPSERVER_IP="172.30.1.30"; 
	// 접속할 서버 포트
	final static int TCPSERVER_PORT=8888;
	// 클라이언트가 보낼 문자열
	final static String MESSAGE_FROM_CLIENT="밥 뭐먹지";
	
	public static void main(String[] args) {
		
		// 클라이언트 소켓
		Socket socket=null;
		
		// 클라이언트가 서버에 보낼 바이트스트림
		OutputStream os=null;
		// 클라이언트가 서버에서 받을 바이트스트림
		InputStream is=null;
		
		try {
			
			// 클라이언트 소켓 생성
			socket=new Socket(TCPSERVER_IP,TCPSERVER_PORT);

			os=socket.getOutputStream();
			is=socket.getInputStream();

			// 서버에 메세지 전송
			os.write(MESSAGE_FROM_CLIENT.getBytes());
			os.flush(); // 버퍼스트림 안 쓰면 flush 필수
			
			// 서버가 보낸 바이트스트림을 저장할 버퍼
			byte[] data=new byte[16];
			int n=is.read(data);
			final String messageFromServer=new String(data, 0, n);
			
		} catch (UnknownHostException uhe) {
			uhe.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			try {
				socket.close();
				os.close();
				is.close();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		} // try-catch-finally
		
	} // main
	
} // class
