package edu.java.io;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class AdderServer {

	public static void main(String[] args) {
		
		ServerSocket ss=null;
		Socket socket=null;
		OutputStreamWriter osw=null;
		
		try {
			
			ss=new ServerSocket(5678);
			if (ss!=null) System.out.println("AdderServer 준비완료!");

			socket=ss.accept();
			System.out.println(socket.getInetAddress() + "님 접속!");
			
			osw=new OutputStreamWriter(socket.getOutputStream());
			
			while(true) {
				int writeNum= (int) (Math.random()*9)+1;
				System.out.println("서버에서 보낸 수: " + writeNum);
				
				if(osw != null) {
					osw.write(writeNum);
					osw.flush();
				}
				Thread.sleep(5000);
			} // while
			
		} catch(IOException ioe) {
			ioe.printStackTrace();
		} catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		
		finally {
			try {
				osw.close();
				socket.close();
				ss.close();
			} catch(IOException ioe) {
				ioe.printStackTrace();
			}
		}
		
	} // main
	
}
