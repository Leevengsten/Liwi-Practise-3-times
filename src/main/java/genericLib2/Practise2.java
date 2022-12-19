package genericLib2;

import java.io.FileInputStream;
import java.util.Properties;

public class Practise2 {
	Select s=-new Select(ele);
	s.selectByVisisbletext(txt);
	s.deselectByVisibleText();
	Actions a=new Actions(driver);
	a.contextClick(ele).perform();
	a.dragAndDrop(ele1,ele2).perform();
	  moveToElement
	  doubleClick
	  Properties p=new Properties();
	  FileInputStream fis=new FileInputStream();
	  p.load(fis);
	  driver.switchTo().frame(0);
	  Alert a=driver.switchTo().alert();
	  a.accept();
	  driver.navigate().to(url);
	 = driver.getWindowHandles(ele);
	 getOptions();
	 getAllSeleceteddO[]
	 TakesScreenshot ts=(TakesScreenshot) driver;
	 File src=ts.getScreenshotAs(OutputType.FILE);
	 File dest=new File("./photo/amazon.png/");
	 FileUtils.copyFile(src,dest);
	 
	 JavascriptExecutor js=(JavascriptExecutor) driver;
	 js.executeScript("window.scrollBy(0,6000)");
	 
	 driver.switchTo().newWindow(WindowType.TAB);
	 
	

}
