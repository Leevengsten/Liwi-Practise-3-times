package AdvanceSelenium;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestngGroups {
	@Test(groups="open")
	public void open()
	{
		Reporter.log("open",true);
	}
     @Test(groups="close")
     public void close()
     {
    	 Reporter.log("close",true);
     }
     @Test(groups="login")
     public void login()
     {
    	 Reporter.log("login",true);
     }
}
