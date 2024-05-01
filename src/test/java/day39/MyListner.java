package day39;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListner implements ITestListener {
	
	public void onTestStart(ITestResult result) {
	    System.out.println("on Test started");
	  }

	public void onTestFailure(ITestResult result) {
		System.out.println("on Test Fail");
	  }
	
	public void onTestSuccess(ITestResult result) {
		System.out.println("on Test Success");
	  }

	public void onTestSkipped(ITestResult result) {
		System.out.println("on Test Skipped");
	  }
	
	
	public void onFinish(ITestContext context) {
		System.out.println("on Test Finished");
	  }
	
}
