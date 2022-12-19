package genericlib3;



import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass3 {
	public PropertyFile3 pdata=new PropertyFile3();
	public WebDriver driver;
	public WebDriverUtilies3 driverutilies=new WebDriverUtilies3();
	@BeforeMethod
	public void openapp() throws InterruptedException, IOException
	{
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(pdata.getdata("url"));
	    Thread.sleep(3000);
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	@AfterMethod
	public void closeapp(ITestResult res)
	{
		String name=res.getName();
		int status=res.getStatus();
		if(status==2)
		{
			Photo3 p=new Photo3();
		}
		driver.quit();
	}

}
