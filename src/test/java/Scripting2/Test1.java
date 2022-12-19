package Scripting2;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import genericLib2.BaseClass2;
import pomPages2.SkillraryDemoappPage2;
import pomPages2.SkillraryLoginPage2;
import pomPages2.SkillrarySeleniumPage2;

public class Test1 extends BaseClass2{
	@Test
	public void tc1()
	{
	SkillraryLoginPage2 sl=new SkillraryLoginPage2(driver);
	sl.gearsbutton();
	sl.demoapppage();
	driverutilies.switchtabs(driver);
	SkillraryDemoappPage2 sd= new SkillraryDemoappPage2(driver);
	driverutilies.mouseHover(driver, sd.getCoursebtn());
    sd.seleniumbutton();
    SkillrarySeleniumPage2 ss=new SkillrarySeleniumPage2(driver);
    driverutilies.doubleclick(driver,ss.getDoubleclk());
    ss.addtocartbtn();
    driverutilies.alertpopup(driver);
	
	
	}
}
