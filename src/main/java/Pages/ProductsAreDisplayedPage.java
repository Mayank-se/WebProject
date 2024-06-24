package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import BrowserSetup.BaseTest;
import ReusableComponent.LogUtil;

public class ProductsAreDisplayedPage extends BaseTest {

	@FindBy(how = How.XPATH, using ="//div[1]/h4[contains(text(),'Brocolli - 1 Kg')]/parent::div")
	WebElement cart_itemsDisplay; 
	
	public ProductsAreDisplayedPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void verifyProductsAreDisplayedOnTheHomePage() {
		LogUtil.info("Start verifyProductsAreDisplayedOnTheHomePage method");
		Assert.assertEquals(cart_itemsDisplay.isDisplayed(),true);
		if(cart_itemsDisplay.isDisplayed()) {
			LogUtil.info("the product are display on the Home page");
		}
		else {
			LogUtil.info("the product are not display on the Home page");
		}
		
	LogUtil.info("end verifyProductsAreDisplayedOnTheHomePage method");
	}

}
