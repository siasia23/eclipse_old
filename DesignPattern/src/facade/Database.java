package facade;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Database {
	
	private Database() {

	}

	public static Properties getProperties(String dbname) {
		
		Properties prop=new Properties();
		String filename = "C:/data/maildata.txt";
		
		try {
			
  			prop.load(new FileReader(filename));

		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		
		return prop;
		
	}
	
}
