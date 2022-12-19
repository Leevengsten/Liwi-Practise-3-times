package pomPages2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillrarySeleniumPage2 {
	@FindBy(xpath="//i[@class='fa fa-plus']")
	public WebElement doubleclk;
	public WebElement getDoubleclk() {
		return doubleclk;
	}
	@FindBy(xpath="(//button[@type=\"submit\"])[2]")
	public WebElement addtocart;
	public SkillrarySeleniumPage2(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void addtocartbtn()
	{
		addtocart.click();
	}
	

}
