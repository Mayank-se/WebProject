package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import BrowserSetup.BaseTest;

import ReusableComponent.PropertiesOperation;

public class CheckApplyPromoCodePage extends BaseTest {

	@FindBy(how = How.XPATH, using ="//div[1]/h4[contains(text(),'Brocolli - 1 Kg')]/parent::div/div[3]/button")
	WebElement btn_AddItem;
	
	@FindBy(how = How.XPATH, using ="//header/div[1]/div[3]/a[4]/img[1]")
	WebElement Img_CartIcon;
	
	@FindBy(how = How.XPATH, using ="//button[contains(text(),'PROCEED TO CHECKOUT')]")
	WebElement btn_proceedTocheckout;
	
	@FindBy(how = How.XPATH, using ="//button[contains(text(),'Apply')]")
	WebElement btn_Apply;
	
	@FindBy(how = How.XPATH, using ="//span[contains(text(),'Empty code ..!')]")
	WebElement msg_ForApplyEmpty;
	
	@FindBy(how = How.XPATH, using ="//span[contains(text(),'Invalid code ..!')]")
	WebElement msg_ForApplyInvalid;
	
	
	@FindBy(how = How.XPATH, using ="//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
	WebElement msg_EnterPromo;

	public CheckApplyPromoCodePage() {
		PageFactory.initElements(driver, this);
	}
	public void VerifytheApplyPromoCode() throws IOException {
	
	// clicking AddItem button to add the item in product cart
	btn_AddItem.click();
	
	
	// clicking Img_CartIcon to show the item is added
	wait.until(ExpectedConditions.visibilityOf(Img_CartIcon)).click();

	
	// explicit wait - to wait for the Proceed To checkout button to be click-able
	wait.until(ExpectedConditions.elementToBeClickable(btn_proceedTocheckout)).click();
	
	wait.until(ExpectedConditions.visibilityOf(btn_Apply)).click();
	
	msg_EnterPromo.sendKeys(PropertiesOperation.getPropertiesOperations("Promocode"));
	
	wait.until(ExpectedConditions.visibilityOf(btn_Apply)).click();
	
	Assert.assertFalse(msg_ForApplyInvalid.isDisplayed());
}
}
