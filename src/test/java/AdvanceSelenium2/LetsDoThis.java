package AdvanceSelenium2;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class LetsDoThis {
	@Test
	public void test1()
	{
		WebDriverManager.chromedriver().setup();
	WebDriver driver =new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	WebElement abd=driver.findElement(By.xpath("//div[text()='Login ']"));
	System.out.println(abd.getText()+"   textget");
	abd.click();
	String ele = driver.getCurrentUrl();	
	System.out.println(ele+"currenturl");
	
	String ele2 = driver.getWindowHandle();
	System.out.println(ele2+"getwindowhandle");
	
	Set<String> ele3 = driver.getWindowHandles();
	System.out.println(ele3+"getwindowhandles");
	
	
	Class<? extends WebDriver> ele4 = driver.getClass();	
	System.out.println(ele4+"getclass");
	
	//String ele5 = driver.getPageSource();
	//System.out.println(ele5+"pagesource");
	
	String ele6 = driver.getTitle();
	System.out.println(ele6+"gettitle");
	
	Set<String> elem1=driver.getWindowHandles();
	for(String b:elem1)
	{
	driver.switchTo().window(b);		
	}
	
    String elemen = driver.toString();
    System.out.println(elemen+"  toString");
}
	 public void dropdown(WebElement ele, String txt)
	    {
	    	Select s=new Select(ele);
	    	s.selectByVisibleText(txt);
	    	
	    }
	    
}
