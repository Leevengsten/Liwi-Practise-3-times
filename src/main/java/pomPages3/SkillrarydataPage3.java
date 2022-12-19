package pomPages3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillrarydataPage3 {
	@FindBy(xpath="//span[text()='Assessments']")
	public WebElement mousehoverassess;
	@FindBy(xpath="(//a[text()='SkillX'])[2]")
    public WebElement skillx;
	public SkillrarydataPage3(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public WebElement getMousehoverassess() {
		return mousehoverassess;
	}
	public void skillxbtn()
	{
		skillx.click();
	}
}
