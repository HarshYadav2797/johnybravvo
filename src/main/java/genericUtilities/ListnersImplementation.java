package genericUtilities;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

/**
 * This method provides implementation iTestListners interface of TestNg
 */

public class ListnersImplementation implements ITestListener {

	public void onTestStart(ITestResult result) {
		
		String methodName = result.getMethod().getMethodName();
		System.out.println(methodName + " ---Test Execution Starts---");
		
	}

	public void onTestSuccess(ITestResult result) {
		
		String methodName = result.getMethod().getMethodName();
		System.out.println(methodName + " ---Test Passed---");
		
	}

	public void onTestFailure(ITestResult result) {
		
		String methodName = result.getMethod().getMethodName();
		System.out.println(methodName + " ---Test Failed---");
		System.out.println(result.getThrowable());
		
		//capture the ScreenShot
		
		SeleniumUtility su= new SeleniumUtility();
		JavaUtility ju= new JavaUtility();
        String ScreenShot = methodName +"-" + ju.getSystemDate();		
        try {
			su.captureScreenShot(BaseClass.sDriver, ScreenShot);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void onTestSkipped(ITestResult result) {
		
		String methodName = result.getMethod().getMethodName();
		System.out.println(methodName + " ---Test Skipped--");
		System.out.println(result.getThrowable());
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	public void onStart(ITestContext context) {
		System.out.println("Suite Execution Started");
		
	}

	public void onFinish(ITestContext context) {
		
		System.out.println("Suite Execution Finished");
		
	}
	
	

}
