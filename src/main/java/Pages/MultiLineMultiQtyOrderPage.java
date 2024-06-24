package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import BrowserSetup.BaseTest;
import ReusableComponent.LogUtil;


public class MultiLineMultiQtyOrderPage extends BaseTest{

	@FindBy(how = How.XPATH, using ="//div[1]/h4[contains(text(),'Brocolli - 1 Kg')]/parent::div/div[2]/a[2]")
	WebElement btn_AddItemQty1;
	
	@FindBy(how = How.XPATH, using ="//div[2]/h4[contains(text(),'Cauliflower - 1 Kg')]/parent::div/div[2]/a[2]")
	WebElement btn_AddItemQty2;
	
	@FindBy(how = How.XPATH, using ="//div[1]/h4[contains(text(),'Brocolli - 1 Kg')]/parent::div/div[3]/button")
	WebElement btn_AddItem;
	
	@FindBy(how = How.XPATH, using ="//div[2]/h4[contains(text(),'Cauliflower - 1 Kg')]/parent::div/div[3]/button")
	WebElement btn_AddItems2;
	
	@FindBy(how = How.XPATH, using ="//header/div[1]/div[3]/a[4]/img[1]")
	WebElement Img_CartIcon;
	
	public MultiLineMultiQtyOrderPage() {
		PageFactory.initElements(driver, this);
	}

	public void getAddMultipleQtySingleItem()  {
		
		LogUtil.info("Start getAddMultipleQtySingleItem method");
		// clicking  Multiple times to AddItemQty button for increase the quantity
	
		for (int i = 1; i <num; i++) {
			wait.until(ExpectedConditions.visibilityOf( btn_AddItemQty1)).click();
			wait.until(ExpectedConditions.visibilityOf(btn_AddItemQty2)).click();
		}
		
		// clicking AddItem button to add the item in product cart
	    btn_AddItem.click();
	    
	    btn_AddItems2.click();
		
		// clicking Img_CartIcon to show the item is added
		wait.until(ExpectedConditions.visibilityOf(Img_CartIcon)).click();
		
		LogUtil.info("end getAddMultipleQtySingleItem method");
	
	}
	
}
