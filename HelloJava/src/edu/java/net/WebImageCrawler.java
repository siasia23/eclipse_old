package edu.java.net;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class WebImageCrawler {

	public static void main(String[] args) {
		
		BufferedReader br=null;
		BufferedOutputStream bo=null;
		
		try {
		
		// crawling
			URL url=new URL("http://imgnews.pstatic.net/image/658/2023/11/16/0000058209_001_20231116162401674.jpg");
			
			br=new BufferedReader(
					new InputStreamReader(
							url.openStream()
					)
			); // br
			
			System.out.println(br);
			
			
		// file copy
			URLConnection urlc=url.openConnection();
			
			byte[] buffer=new byte[2048];
			
			bo=new BufferedOutputStream(
					new FileOutputStream("C:/data/img.jpg")
			);
			
			while(true) {
				int i = urlc.getInputStream().read(buffer);
				if(i == -1) break;
				bo.write(buffer);
			}
			
			
		// try-catch	
		} catch (MalformedURLException mue) {
			mue.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} // try-catch
		
		finally {
			try {
				br.close();
				bo.close();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		} // finally
		
	} // main
	
}
