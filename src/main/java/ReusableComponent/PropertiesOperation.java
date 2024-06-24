package ReusableComponent;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.apache.commons.lang3.StringUtils;

public class PropertiesOperation extends ObjectsRepo {
	
	public static  String getPropertiesOperation(String Key) throws IOException {
		try {
			prop=new Properties();
			fis=new FileInputStream("./Resources/config.properties");
		}  catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			prop.load(fis);
			value= prop.getProperty(Key);
			if(StringUtils.isEmpty(value)) {
				throw new Exception("value is not specified");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;

	}
	
	public static  String getPropertiesOperations(String Key) throws IOException {
		try {
			prop=new Properties();
			fis=new FileInputStream("./Resources/TestData.properties");
		}  catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			prop.load(fis);
			value= prop.getProperty(Key);
			if(StringUtils.isEmpty(value)) {
				throw new Exception("value is not specified");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;

	}

}
