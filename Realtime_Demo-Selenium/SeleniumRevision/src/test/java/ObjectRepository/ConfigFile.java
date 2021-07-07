package ObjectRepository;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigFile {

	public static void main(String[] args) throws IOException {
		
		File src = new File("./src/test/resources/config.property");
		FileInputStream fis = new FileInputStream(src);
		
		Properties pro = new Properties();
		pro.load(fis);
		
		System.out.println(pro.getProperty("UserName"));

	}

}
