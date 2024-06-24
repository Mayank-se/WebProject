package Greenkart_TestCase;

import org.testng.annotations.Test;

import BrowserSetup.BaseTest;
import Pages.SingleLineOrderPage;
import ReusableComponent.LogUtil;

public class SingleLineOrderTest extends BaseTest{

	@Test(priority=1)
	public static void checkSingleItemOrder() throws InterruptedException  {
		LogUtil.startTestCase("SingleLineOrderTest");
		SingleLineobj=new SingleLineOrderPage();
		SingleLineobj.getAddSingleItem();
		SingleLineobj.getproceedTocheckoutPage();
		SingleLineobj.verifyselectcountryandProceed();
		LogUtil.endTestCase("SingleLineOrderTest");
	}

}
