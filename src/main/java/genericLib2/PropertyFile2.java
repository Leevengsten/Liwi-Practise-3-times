package genericLib2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile2 {
	public String getdata(String key) throws IOException
	{
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream(AutoConstant2.propertyfilepath);
		p.load(fis);
		return p.getProperty(key);
	}

}
