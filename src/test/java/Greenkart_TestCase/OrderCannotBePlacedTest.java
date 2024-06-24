package Greenkart_TestCase;

import org.testng.annotations.Test;

import BrowserSetup.BaseTest;
import Pages.OrderCannotBePlacedPage;

import ReusableComponent.LogUtil;

public class OrderCannotBePlacedTest extends BaseTest{
	@Test(priority=8)
	public static void checkSinglelimeQtyItemOrder()  {
		LogUtil.startTestCase("checkSinglelimeQtyItemOrder");
		OrderCannotBePlacedTermsobj=new OrderCannotBePlacedPage();
		OrderCannotBePlacedTermsobj.checkTheTreamsAndConditions();
		LogUtil.endTestCase("checkSinglelimeQtyItemOrder");
	}

}
