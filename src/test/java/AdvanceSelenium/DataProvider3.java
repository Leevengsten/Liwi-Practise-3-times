package AdvanceSelenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProvider3 {
	@DataProvider
	public Object[] getdata()
	{
		Object [] obj=new Object[3];
		obj[0]="phone";
		obj[1]="dress";
		obj[2]="bat";
		return obj;
		
		
	}
	@Test(dataProvider="getdata")
	public void amazonSearch(String obj)
	{
		WebDriverManager.chromedriver().setup();

		WebDriver driver =new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(obj);
		driver.quit();
		
	}

}
