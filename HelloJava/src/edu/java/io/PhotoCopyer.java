package edu.java.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class PhotoCopyer {

	public static void main(String[] args) {
		
		InputStream is=null;
		OutputStream os=null;
		
		try {
			
			is = new FileInputStream("C:/data/bigfile.dat"); // 원본을 읽어서
			os = new FileOutputStream("C:/data/bigfile_copy.dat"); // 복사본을 출력함
			
			byte[] buffer=new byte[1024]; // 숫자는 일일이 테스트 해보고 빠른걸로 정해야함.
			
			long startTime=System.currentTimeMillis();
			
			while(true) {
				int readByteNum = is.read(buffer); // 1024 바이트 단위로(=buffer만큼) 읽고
				if(readByteNum == -1) break;
				os.write(buffer); // 쓰고
			} // while
			
			long endTime=System.currentTimeMillis();
			
			System.out.println(endTime-startTime);
			
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			try {
				is.close();
				os.close();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		} // finally
		
		
	} // main
	
} // class
