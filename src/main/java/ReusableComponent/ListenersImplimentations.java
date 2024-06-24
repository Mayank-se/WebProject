package ReusableComponent;


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.Status;

public class ListenersImplimentations extends ExtentSetup implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		test=extent.createTest(result.getMethod().getMethodName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, "Test Case "+result.getMethod().getMethodName()+" is Passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL, "Test Case "+result.getMethod().getMethodName()+" is failed");
		test.log(Status.FAIL, result.getThrowable());
		//add screenshot on failed test cases
		String screenshotPath=ScreenShotCaputre.getCaptureFailedTestCaseScreenShot(driver);
		test.addScreenCaptureFromPath(screenshotPath,"Test case Failure screenshot");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP, "Test Case "+result.getMethod().getMethodName()+" is Skiped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {


	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {

	}

	@Override
	public void onStart(ITestContext context) {
		extent=ExtentSetup.setupExtentReport();
	}

	@Override
	public void onFinish(ITestContext context) {
		extent.flush();
	}

}
