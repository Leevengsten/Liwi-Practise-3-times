package AdvanceSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CompatibbilityParallel2 {
	WebDriver driver;
	@Parameters({"browsername"})
	@Test

	public void openapp(String browser) {
		if(browser.equals("chrome"))
		{
			driver=new ChromeDriver();
			
		}
		else
		{
			driver=new FirefoxDriver();
		}
		WebDriverManager.chromedriver().setup();
	    driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("4");
		
	}

}
