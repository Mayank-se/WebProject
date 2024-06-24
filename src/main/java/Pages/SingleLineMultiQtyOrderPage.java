package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import BrowserSetup.BaseTest;
import ReusableComponent.LogUtil;
import ReusableComponent.ObjectsRepo;


public class SingleLineMultiQtyOrderPage extends BaseTest{

	
	@FindBy(how = How.XPATH, using ="//div[1]/h4[contains(text(),'Brocolli - 1 Kg')]/parent::div/div[2]/a[2]")
	WebElement btn_AddItemQty;
	
	@FindBy(how = How.XPATH, using ="//div[1]/h4[contains(text(),'Brocolli - 1 Kg')]/parent::div/div[3]/button")
	WebElement btn_AddItem;
	
	@FindBy(how = How.XPATH, using ="//header/div[1]/div[3]/a[4]/img[1]")
	WebElement Img_CartIcon;
	
	@FindBy(how = How.XPATH, using ="//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/p[1]")
	WebElement product_Price;


	public SingleLineMultiQtyOrderPage() {
		PageFactory.initElements(driver, this);
	}

public void getAddMultipleQtySingleItem()  {
	
	LogUtil.info("Start getAddMultipleQtySingleItem method");
		// clicking  Multiple times to AddItemQty button for increase the quantity
	
		for (int i = 1; i <num; i++) {
		 btn_AddItemQty.click();
		}
		// clicking AddItem button to add the item in product cart
	    btn_AddItem.click();
		
		// clicking Img_CartIcon to show the item is added
		wait.until(ExpectedConditions.visibilityOf(Img_CartIcon)).click();
		
		//check the quantity of the product that i was select 
		Assert.assertEquals(Integer.parseInt(ObjectsRepo.CompareingAmountLists()),num*Integer.parseInt(product_Price.getText()));
		
		
		LogUtil.info("end getAddMultipleQtySingleItem method");
	}
	
}
