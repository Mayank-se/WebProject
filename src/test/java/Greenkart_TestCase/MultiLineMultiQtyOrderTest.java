package Greenkart_TestCase;

import org.testng.annotations.Test;

import BrowserSetup.BaseTest;
import Pages.MultiLineMultiQtyOrderPage;
import ReusableComponent.LogUtil;


public class MultiLineMultiQtyOrderTest extends BaseTest {

	
	@Test(priority=4)
	public static void checkMultilimeQtyItemOrder()  {
		LogUtil.startTestCase("MultiLineMultiQtyOrderTest");
		MultiLineMultiQtyobj=new MultiLineMultiQtyOrderPage();
		MultiLineMultiQtyobj.getAddMultipleQtySingleItem();
		LogUtil.endTestCase("MultiLineMultiQtyOrderTest");
	}

}
