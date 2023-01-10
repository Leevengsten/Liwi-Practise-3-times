package TechMahindra;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AamzonLogin {
	@Test
	public void tc11()
	{
		WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
    driver.get("https://www.amazon.in/");
    WebElement ele=driver.findElement(By.id("twotabsearchtextbox"));
   driver.getTitle();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	String title = driver.getTitle();
	if(title.equals(""))
	{
	Reporter.log("Home page");
	}
	else
	{
	Reporter.log("error");
	}
	

}
}
