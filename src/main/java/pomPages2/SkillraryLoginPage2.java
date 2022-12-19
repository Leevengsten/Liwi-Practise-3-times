package pomPages2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryLoginPage2 {
	@FindBy(xpath="//a[text()=' GEARS ']")
	public WebElement gearsbtn;
	
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
	public WebElement demopage;
	
	public SkillraryLoginPage2(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
    public void gearsbutton()
    {
    	gearsbtn().click();
    }
    public void demoapppage()
    {
    	demopage().click();
    }
}
