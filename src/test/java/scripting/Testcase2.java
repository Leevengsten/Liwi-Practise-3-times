package scripting;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.Skillraryloginpage;

public class Testcase2 extends BaseClass {
	@Test
	public void tc2()
	{
		Skillraryloginpage s=new Skillraryloginpage(driver);
		s.gerasbutton();
		s.skillrarydemoapp();
		driverutilies.switchtabs(driver);
		
		SkillraryDemoLogin sd=new SkillraryDemoLogin(driver);
		driverutilies.dropdown(sd.getCoursedd(),pdata.);
	}
	
	

}
