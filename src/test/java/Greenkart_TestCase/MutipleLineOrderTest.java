package Greenkart_TestCase;

import org.testng.annotations.Test;

import BrowserSetup.BaseTest;
import Pages.MutipleLineOrderPage;
import ReusableComponent.LogUtil;


public class MutipleLineOrderTest extends BaseTest{

	@Test(priority=2)
	public static void checkMultipleItemOrder()  {
		LogUtil.startTestCase("MutipleLineOrderTest");
		MultipleLineobj=new MutipleLineOrderPage();
		MultipleLineobj.getAddMultipleItems();
		MultipleLineobj.getproceedTocheckoutPage();
		MultipleLineobj.verifyselectcountryandProceed();
		LogUtil.endTestCase("MutipleLineOrderTest");
	}
}
