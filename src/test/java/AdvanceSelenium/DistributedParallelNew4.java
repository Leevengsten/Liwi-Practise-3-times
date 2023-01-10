package AdvanceSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DistributedParallelNew4 {
@Test
public void openapp()
{
	WebDriverManager.chromedriver().setup();

	WebDriver driver =new ChromeDriver();
    driver.manage().window().maximize();
	driver.get("url");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("val");
}
}
