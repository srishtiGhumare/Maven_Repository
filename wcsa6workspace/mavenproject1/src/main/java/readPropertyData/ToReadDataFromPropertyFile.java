package readPropertyData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ToReadDataFromPropertyFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis = new FileInputStream("./src/main/resources/Config.properties");
		
		Properties prop = new Properties();
		prop.load(fis);
		
		String data = prop.getProperty("Url");
		System.out.println(data);

	}

}
