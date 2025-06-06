package readPropertyData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromProperty {

	public static void main(String[] args) throws IOException {
		
		// To specify the path of the file
		FileInputStream fis = new FileInputStream("./data/TestData.properties");

		// Creating the object of Properties class to access load() 
		Properties prop = new Properties();
		
		// To load the specified file or make the file ready to read
		prop.load(fis);
		
		// To read email(data) from property file
		String email = prop.getProperty("email");
		System.out.println(email);
		
		// To read password(data) from property file
		String pwd = prop.getProperty("password");
		System.out.println(pwd);
		
	}

}
