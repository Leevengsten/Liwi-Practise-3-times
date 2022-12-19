package pomPages2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryDemoappPage2 {
	@FindBy(xpath="//a[text()='COURSE']")
	public WebElement coursebtn;
	public WebElement getCoursebtn() {
		return coursebtn;
	}
	@FindBy(xpath="//a[text()='Selenium Training']")
	public WebElement seleniumbtn;
	public SkillraryDemoappPage2(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void seleniumbutton()
	{
	  seleniumbtn.click();
	}
	

}
