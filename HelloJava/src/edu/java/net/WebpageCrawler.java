package edu.java.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

// 웹페이지 코드 읽어오기
public class WebpageCrawler {

	public static void main(String[] args) {
		
		URL url=null;
		URLConnection urlConn=null;
		BufferedReader br=null;
		
		try {
		
			url=new URL("http://www.google.com");
			
			urlConn=url.openConnection(); // URL 연결객체
			
			br= new BufferedReader( // 3. 속도향상
					new InputStreamReader( // 2. 읽어온 바이트 단위를 문자열로 변환하기
							urlConn.getInputStream() // 1. urlConn의 InputStream 얻어오기
					)
				);
			
			String readedLine=null;
			
			while((readedLine=br.readLine()) != null) {
				System.out.println(readedLine);
			}
		
		} catch (MalformedURLException mue) {
			mue.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} // try-catch 
		
		finally {
			try {
				br.close();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		} // finally
		
	} // main
	
}