package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import BrowserSetup.BaseTest;
import ReusableComponent.LogUtil;
import ReusableComponent.PropertiesOperation;

public class AddToCartPage extends BaseTest {

	//---------------- Locator for Add to Cart Button ----------------
	@FindBy(how=How.XPATH ,using ="(//div[@class='product-action']//button)[1]")
	WebElement addtocart_btn;

	public AddToCartPage() {
		PageFactory.initElements(driver, this);
	}
	
		//---------------- Method for Checking Add to Cart Button ----------------
	public void addtocart_btn() throws Exception {

			LogUtil.info(" -------------- The Add To Cart TestCase is Started -------------- ");

			//---------------- Explicit wait of 10 Seconds ----------------

			//---------------- User Clicks Add to Cart Button ----------------
			LogUtil.info(" User clicks add to cart button ");
	        wait.until(ExpectedConditions.elementToBeClickable(addtocart_btn)).click();

	        String buttonstatus = addtocart_btn.getText();
	        Assert.assertEquals(buttonstatus,PropertiesOperation.getPropertiesOperations("addtocart_btn_status"));

	 

	        LogUtil.info(" -------------- The Add To Cart TestCase is Finished -------------- ");
}
}
