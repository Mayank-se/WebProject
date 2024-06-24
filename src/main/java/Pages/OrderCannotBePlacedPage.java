package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import BrowserSetup.BaseTest;
import ReusableComponent.LogUtil;


public class OrderCannotBePlacedPage  extends BaseTest{
	

	@FindBy(how = How.XPATH, using ="//div[1]/h4[contains(text(),'Brocolli - 1 Kg')]/parent::div/div[3]/button")
	WebElement btn_AddItem;
	
	@FindBy(how = How.XPATH, using ="//header/div[1]/div[3]/a[4]/img[1]")
	WebElement Img_CartIcon;
	
	@FindBy(how = How.XPATH, using ="//button[contains(text(),'Proceed')]")
	WebElement btn_Proceed;
	
	@FindBy(how = How.XPATH, using ="//button[contains(text(),'Place Order')]")
	WebElement btn_Placeorder;
	
	@FindBy(how = How.XPATH, using ="//button[contains(text(),'PROCEED TO CHECKOUT')]")
	WebElement btn_proceedTocheckout;

	@FindBy(how = How.XPATH, using ="//b[contains(text(),'Please accept Terms & Conditions - Required')]")
	WebElement txt_TreamCondition;

	public OrderCannotBePlacedPage() {
		PageFactory.initElements(driver, this);
	}

	public void checkTheTreamsAndConditions() {
	LogUtil.info("start getAddSingleItem method");
		
		// clicking AddItem button to add the item in product cart
		btn_AddItem.click();
		// clicking Img_CartIcon to show the item is added
		wait.until(ExpectedConditions.visibilityOf(Img_CartIcon)).click();
		
		// explicit wait - to wait for the Proceed To checkout button to be click-able
		wait.until(ExpectedConditions.elementToBeClickable(btn_proceedTocheckout)).click();
		
		//click on Placeorder button to go the next page
		btn_Placeorder.click();
				
		//click on the Proceed button to palce the order
		btn_Proceed.click();
		
		Assert.assertFalse(txt_TreamCondition.isDisplayed());
		
		LogUtil.info("end getAddSingleItem method");
		
	}
}
