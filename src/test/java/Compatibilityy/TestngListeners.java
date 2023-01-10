package Compatibilityy;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class TestngListeners implements ITestListener{
    @Override
	public void onTestStart(ITestResult result)
	{
		Reporter.log("onTestStart",true);
	}
  @Override
  public void OnTestSuccess(ITestResult result)
  {
	  Reporter.log("onTestSuccess",true);
  }
}
