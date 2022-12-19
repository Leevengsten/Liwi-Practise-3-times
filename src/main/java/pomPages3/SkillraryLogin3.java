package pomPages3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryLogin3 {
	@FindBy(xpath="//a[text()='CATEGORIES']")
	public WebElement downbtn;
	
	@FindBy(xpath="(//a[text()='Data & Analytics'])[1]")
	public WebElement dataanaly;
	
	@FindBy(xpath="//a[text()=' GEARS ']")
	public WebElement gearbtn;
	
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
	public WebElement demoapp;
	
	public SkillraryLogin3(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void downbutton()
	{
	   downbtn.click();	
	}
	public void dataanalysis()
	{
		dataanaly.click();
	}
	public void gears()
	{
		gearbtn.click();
	}
	public void demo()
	{
		demoapp.click();
	}
    
}
