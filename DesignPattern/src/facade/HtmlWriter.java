package facade;

import java.io.IOException;
import java.io.Writer;

public class HtmlWriter {

	Writer writer;
	
	// 생성자
	public HtmlWriter(Writer writer) {
		this.writer=writer;
	}
	
	// 제목 출력 메소드
	public void title(String title) {
		
		try {
			
			writer.write("<!DOCTYPE html>");
			writer.write("<html>");
			
			writer.write("<head>");
			writer.write("<title>" + title +"</title>");
			writer.write("</head>");
			
			writer.write("<body>");
			writer.write("<\n>");
			writer.write("<h1>" + title + "</h1>");
			writer.write("<\n>");
			
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		
	}
	
	// 단락 출력 메소드
	public void paragraph(String message) {
		
		try {
		
			writer.write("<p>" + message + "</p>");
			writer.write("\n");
			
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		
	}
	
	// 링크 출력 메소드
	public void link(String href, String caption) {

		paragraph("<a href=\"" + href + "\">" + caption + "</a>");
	
	}
	
	// 이메일 주소 출력 메소드
	public void mailto(String mailaddress, String username) {
		
		link("mailto:" + mailaddress, username);
		
	}
	
	// HTML 닫기
	public void close() {
		
		try {
			
			writer.write("</body>");
			writer.write("</html>");
			writer.write("<\n>");
			writer.close();
			
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		 
	}
	
} // class
