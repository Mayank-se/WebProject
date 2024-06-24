package Greenkart_TestCase;

import org.testng.annotations.Test;

import BrowserSetup.BaseTest;
import Pages.AddToCartPage;


public class AddToCartTest extends BaseTest {
	@Test(priority=9)
	public void CheckAddToCartTest() throws Exception {
		AddToCartobj=new AddToCartPage();
		AddToCartobj.addtocart_btn();
	}

}
