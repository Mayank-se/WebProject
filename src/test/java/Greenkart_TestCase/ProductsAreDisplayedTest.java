package Greenkart_TestCase;

import org.testng.annotations.Test;

import BrowserSetup.BaseTest;
import Pages.ProductsAreDisplayedPage;
import ReusableComponent.LogUtil;


public class ProductsAreDisplayedTest extends BaseTest {


	@Test(priority=5)
	public static void checkProductsAreDisplayedOnTheHomePage()  {
		LogUtil.startTestCase("ProductsAreDisplayedTest");
		productsAreDisplayedobj=new ProductsAreDisplayedPage();
		productsAreDisplayedobj.verifyProductsAreDisplayedOnTheHomePage();
		LogUtil.endTestCase("ProductsAreDisplayedTest");
	}
}
