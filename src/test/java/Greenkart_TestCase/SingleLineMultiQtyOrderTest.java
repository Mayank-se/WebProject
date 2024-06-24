package Greenkart_TestCase;

import org.testng.annotations.Test;

import BrowserSetup.BaseTest;
import Pages.SingleLineMultiQtyOrderPage;
import ReusableComponent.LogUtil;


public class SingleLineMultiQtyOrderTest extends BaseTest {

	@Test(priority=3)
	public static void checkSinglelimeQtyItemOrder()  {
		LogUtil.startTestCase("SingleLineMultiQtyOrderTest");
		SingleLineMultiQtyobj=new SingleLineMultiQtyOrderPage();
		SingleLineMultiQtyobj.getAddMultipleQtySingleItem();
		LogUtil.endTestCase("SingleLineMultiQtyOrderTest");
	}
}
