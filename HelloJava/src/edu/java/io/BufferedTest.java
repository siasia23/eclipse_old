package edu.java.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class BufferedTest {

	public static void main(String[] args) {
		
		InputStream is=null;
		OutputStream os=null;
		
		InputStreamReader isr=null;
		OutputStreamWriter osw=null;
		
		BufferedReader br=null;
		BufferedWriter bw=null;
		
		try {
			
			is=new FileInputStream("C:/data/다운로드.jpeg");
			isr=new InputStreamReader(is); // 바이트 단위 데이터 is를 문자열로 읽어오기
			br=new BufferedReader(isr); // isr의 성능향상
			
			os=new FileOutputStream("C:/data/다운로드.jpeg");
			osw=new OutputStreamWriter(os);
			bw=new BufferedWriter(osw);

			// 한 줄로 쓰기 (익명 객체 개념)
			bw=new BufferedWriter(
					new OutputStreamWriter(
							new FileOutputStream("C:/data/다운로드.jpeg")
					)
				);
			
		} catch(Exception ex) {
			ex.printStackTrace();
		}

	} // main
	
}
