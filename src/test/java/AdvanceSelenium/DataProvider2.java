package AdvanceSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProvider2 {
	@DataProvider
	public Object[] getdata()
	{
		Object[][] obj=new Object[2][2];
		obj[0][0]="admin";
		obj[0][1]="manager";
		obj[1][0]="bat";
		obj[1][1]="ball";
		return obj;
		
	}
	@Test(dataProvider="getdata")
	public void actitimelogin(String obj)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys(obj);
		driver.findElement(By.name("pwd")).sendKeys("hai");
		//driver.quit();
		
	}
	

}
