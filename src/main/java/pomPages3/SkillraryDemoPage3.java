package pomPages3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryDemoPage3 {
	@FindBy(xpath="//select[@class=\"chosen-select\"]")
	public WebElement dropdnbtn;
	@FindBy(xpath="(//input[@type='text'])[3]")
	public WebElement scroll;
	public SkillraryDemoPage3(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement getDropdnbtn() {
		return dropdnbtn;
	}
	public WebElement getScroll() {
		return scroll;
	}
	public void scrollbr(String thinking)
	{
		scroll.sendKeys(thinking);
	}

}
