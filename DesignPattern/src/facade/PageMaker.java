package facade;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PageMaker {

	private PageMaker() {

	}
	
	public static void makeWelcomePage(String mailadrress, String filename) {
		
		Properties mailProp=Database.getProperties("maildata");
		String username=mailProp.getProperty(mailadrress);
		
		try {
		
			HtmlWriter writer=new HtmlWriter(new FileWriter(filename));
			
			writer.title(username + "'s web page");
			writer.paragraph("Welcome to " + username + "'s web page!");
			writer.paragraph("Hello!");
			writer.mailto(mailadrress, username);
			writer.close();
			
			System.out.println(filename + " is created for " + mailadrress + " (" + username + ")");
		
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		
	}
	
}
