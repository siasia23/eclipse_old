package edu.java.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

// TCP 서버
public class TCPServer {

	// 서버 포트번호 : 0~1023 제외, ~65534 중에서 하나
	final static int SERVER_PORT=15321;
	
	// 서버에서 클라이언트에게 보낼 문자열
	final static String MESSAGE_FROM_SERVER="Hello Client!";
			
	public static void main(String[] args) {
		
		// 서버는 ServerSocket 필요함.
		// 클라이언트에게 할당할 Socket을 관리하는 역할
		ServerSocket serverSocket=null;
		
		try {
			
			// 설정한 포트를 사용하는 서버소켓 생성
			serverSocket=new ServerSocket(SERVER_PORT);
		
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} // try-catch
		
		// 서버의 인풋스트림 = 클라이언트에서 서버로 들어오는 바이트스트림
		InputStream is=null;
		// 서버의 아웃풋스트림 = 서버에서 클라이언트로 내보내는 바이트스트림
		OutputStream os=null;
		
		try {
			
			// 서버는 클라이언트로부터 계속 요청 받아야 하니까 무한반복.
			// 서버 계속 살아있도록
			while(true) {
				
				// 서버소켓의 accept 메소드 = Blocking 메소드(이후의 구문을 실행하지 않고 block 상태 유지)
				// accept 메소드 호출되면 클라이언트의 연결을 대기함
				
				// 클라이언트와 통신할 서버소켓
				Socket socket=serverSocket.accept();
				
				// 클라이언트 연결되기 전까지는 여기에서 실행 일시중지 상태
				
				// 클라이언트와 연결되면 클라이언트에 할당한 소켓의 입출력스트림을 얻음
				is=socket.getInputStream(); 	// 클라이언트>서버 들어오는 데이터(바이트스트림)
				os=socket.getOutputStream(); 	// 서버>클라이언트 보내는 데이터(바이트스트림)
				
				// 16바이트 단위로 읽을 버퍼
				byte[] data=new byte[16];
				// 읽어들인 바이트 수를 반환하는 int n
				int n=is.read(data);
				// 클라이언트에게서 받은 바이트스트림을 문자열로 변환
				final String messageFromClient=new String(data, 0, n);

				// 서버에서 클라이언트에게 바이트 배열을 보냄
				os.write(MESSAGE_FROM_SERVER.getBytes());
				// OutputStream은 flush 해야 클라이언트에게 전송됨
				os.flush(); // BufferedOutputStream 쓸 때는 flush 안 써도 됨.
				
			} // while
			
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			try {
				serverSocket.close();
				is.close();
				os.close();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		} // try-catch-finally
		
	} // main
	
}
