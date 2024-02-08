package tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class QuizTCPServer { // 임의의 포트번호 필요

	final static int PORT=15324;
	
	public static void main(String[] args) {
		
		ServerSocket ss=null;
		Socket socket=null;
		InputStream is=null;
		OutputStream os=null;
		
		Scanner sc=new Scanner(System.in);
		
		try {
			
			ss=new ServerSocket(PORT); // 포트 번호 가진 서버소켓 생성
			
			while(true) {
				
				socket=ss.accept(); // 클라이언트와 통신할 소켓 생성
				
				// 바이트 단위 입출력
				is=socket.getInputStream(); 		// 클라이언트>서버
				os=socket.getOutputStream(); 	// 서버>클라이언트

				String mms=sc.nextLine();

				is.read(mms.getBytes("UTF-8"));
				os.write(mms.getBytes("UTF-8"));
				
				
			} // while
			
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			try {
				ss.close();
				socket.close();
				is.close();
				os.close();
				scanner.close();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		} // try-catch-finally
		
	} // main
	
}
