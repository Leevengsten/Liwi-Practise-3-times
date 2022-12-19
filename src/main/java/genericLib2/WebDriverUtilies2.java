package genericLib2;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtilies2 {
	public void dropdown(WebElement ele, String text)
	{
		Select s=new Select(ele);
		s.selectByVisibleText(text);
	}
   public void mousehover(WebDriver driver, WebElement ele)
   {
	   Actions a=new Actions(driver);
	   a.moveToElement(ele).perform();
	   
   }
   public void doubleclick(WebDriver driver, WebElement ele)
   {
	   Actions a=new Actions(driver);
	   a.doubleClick(ele).perform();
   }

   public void drapanddrop(WebDriver driver, WebElement ele1, WebElement ele2)
   {
	   Actions a=new Actions(driver);
	   a.dragAndDrop(ele1, ele2).perform();
	   
   }
   public void switchbacktoframe(WebDriver driver)
   {
	   driver.switchTo().defaultContent();
   }
   public void alertpopup(WebDriver driver)
   {
	   driver.switchTo().alert().accept();
	   
   }
   public void scrollbar(WebDriver driver, int x, int y)
   {
	   JavascriptExecutor js=(JavascriptExecutor)driver;
	   js.executeScript("window.scrollBy(x,y)");
   }
   public void switchtabs(WebDriver driver) {
	 Set<String> child = driver.getWindowHandles();
	 for(String b:child)
	 {
		 driver.switchTo().window(b);
	 }
   }
}
