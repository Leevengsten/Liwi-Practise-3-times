package scripting;

import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderss {
	
	public void login()
	{
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("[password");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		String ele = driver.getCurrentUrl();	
		System.out.println(ele);
		String ele2 = driver.getWindowHandle();
		System.out.println(ele2);
		Set<String> ele3 = driver.getWindowHandles();
		System.out.println(ele3);
		Class<? extends WebDriver> ele4 = driver.getClass();	
		System.out.println(ele4);
		String ele5 = driver.getPageSource();
		System.out.println(ele5);
		String ele6 = driver.getTitle();
		System.out.println(ele6);
		
		
	}

}
