package scripting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test2 {
	@Test
	public void tc2()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
	
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

}
