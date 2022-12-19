package genericLib2;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import genericLib.WebDriverUtilies;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass2 {
	public WebDriver driver;
	public PropertyFile2 pdata=new PropertyFile2();
	public WebDriverUtilies driverutilies=new WebDriverUtilies();
	@BeforeMethod
	public void openapp() throws IOException
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(pdata.getdata("url"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	@AfterMethod
	public void closeapp(ITestResult res) throws IOException
	{
		
		String name=res.getName();
		int status=res.getStatus();
		if(status==2)
		{
			Photo2 p=new Photo2();
			p.getphoto(driver, name);
		}
		driver.quit();
		
	}
	

}
