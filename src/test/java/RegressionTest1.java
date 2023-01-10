import org.testng.Reporter;
import org.testng.annotations.Test;

public class RegressionTest1 {
	@Test(groups="id")
	public void empid()
	{

		Reporter.log("empid",true);
	}
	@Test(groups="name")
	public void empname()
	{
		Reporter.log("empname",true);
	}
	@Test(groups="age")
	public void empage()
	{
		Reporter.log("empage",true);
	}

}
