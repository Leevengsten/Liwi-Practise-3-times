package AdvanceSelenium;




import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProvider1 {
	@DataProvider
	public Object[][] getdata()
	{
		Object[][] obj=new Object[2][2];
		obj[0][0]="Liwi";
		obj[0][1]="aju";
		obj[1][0]="felix";
		obj[1][1]="aadvik";
		return obj;
		
	}
	@Test(dataProvider="getdata")
	public void Dataproviderr(String get)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("q")).sendKeys("get");
		driver.quit();
	}

}
