package Scripting3;

import org.testng.annotations.Test;

import genericlib3.BaseClass3;
import pomPages3.SkillraryLogin3;
import pomPages3.SkillrarydataPage3;

public class Test1 extends BaseClass3{
@Test(priority=2,invocationCount=2)
public void tc1()
{
	SkillraryLogin3 sl=new SkillraryLogin3(driver);
	sl.downbutton();
	sl.dataanalysis();
	SkillrarydataPage3 sd=new SkillrarydataPage3(driver);
	driverutilies.mousehover(driver, sd.getMousehoverassess());
	sd.skillxbtn();
	
	
}

}
