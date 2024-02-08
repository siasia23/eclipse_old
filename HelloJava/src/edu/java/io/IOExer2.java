package edu.java.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOExer2 {

	public static void main(String[] args) {

		BufferedWriter bw=null;
		
		BufferedReader br=null;
		
		try {
			
			String filePath="C:/data/poem.txt";
			
			bw=new BufferedWriter(
					new FileWriter(filePath)
				);
			
			bw.write("죽는날까지 하늘을 우러러");
			bw.newLine(); // 줄바꿈
			bw.write("한 점 부끄럼 없기를");
			bw.newLine();
			bw.write("!");
			
			bw.flush();
			
			br=new BufferedReader(
					new FileReader(filePath)
				);
			
			String lineData=null;
			while((lineData=br.readLine()) != null) { // null이 아닌 동안 무한루프. break 안 쓰려고 이렇게 씀.
				System.out.println(lineData);
			}
			
		} catch(IOException ioe) {
			ioe.printStackTrace();
		} finally {
			
			try {
				bw.close();
				br.close();  
			} catch(IOException ioe) {
				ioe.printStackTrace();
			}
			
		} // finally
		
	} // main
	
}
