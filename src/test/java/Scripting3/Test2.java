package Scripting3;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import genericlib3.BaseClass3;
import pomPages3.SkillraryDemoPage3;
import pomPages3.SkillraryLogin3;

public class Test2 extends BaseClass3 {
@Test(priority=1)
public void tc2() throws IOException
{
	SkillraryLogin3 sl=new SkillraryLogin3(driver);
	sl.gears();
	sl.demo();
	driverutilies.switchtabs(driver);
	
	SkillraryDemoPage3 sdp=new SkillraryDemoPage3(driver);
	driverutilies.dropdown(sdp.getDropdnbtn(), pdata.getdata("dropdownptn"));
	Point loc = sdp.getScroll().getLocation();
     int x=loc.getX();
     int y=loc.getY();
	driverutilies.scrollbar(driver,x,y);
	sdp.scrollbr(pdata.getdata("thinking"));	
	
}
}