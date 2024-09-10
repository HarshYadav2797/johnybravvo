package genericUtilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileUtility {
	public String propertyFile(String Object) throws IOException
	
	{
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\cm.properties");
		Properties pro = new Properties();
		pro.load(fis);
		String ob = pro.getProperty(Object);
		return ob;
	}

}
