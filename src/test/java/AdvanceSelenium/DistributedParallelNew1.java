package AdvanceSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DistributedParallelNew1 {
@Test
public void openapp()
{
	WebDriverManager.chromedriver().setup();

	WebDriver driver =new ChromeDriver();
    driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("1");
}
}
