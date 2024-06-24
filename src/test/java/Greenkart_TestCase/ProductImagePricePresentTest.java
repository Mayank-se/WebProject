package Greenkart_TestCase;

import org.testng.annotations.Test;

import BrowserSetup.BaseTest;
import Pages.ProductImagePricePresentPage;

public class ProductImagePricePresentTest extends BaseTest{
@Test(priority=7)
	public static void Check_product_Image_Price_Present() {
		ProductImagePricePresentobj=new ProductImagePricePresentPage();
		ProductImagePricePresentobj.Verify_product_Image_Price_Present();
	}

}
