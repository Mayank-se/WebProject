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


public class SingleLineOrderPage extends BaseTest{

	public SingleLineOrderPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using ="//div[1]/h4[contains(text(),'Brocolli - 1 Kg')]/parent::div/div[3]/button")
	WebElement btn_AddItem;
	
	@FindBy(how = How.XPATH, using ="//header/div[1]/div[3]/a[4]/img[1]")
	WebElement Img_CartIcon;
	
	@FindBy(how = How.XPATH, using ="//button[contains(text(),'PROCEED TO CHECKOUT')]")
	WebElement btn_proceedTocheckout;
	
	@FindBy(how = How.XPATH, using ="//header/div[1]/div[3]/div[2]/div[1]/div[1]/ul[1]/li[1]/div[1]/p[1]")
	WebElement Check_AddItem;

	@FindBy(how = How.XPATH, using ="//tbody/tr[1]/td[1]/img[1]")
	WebElement Check_ImgonProductCartpage;
	
	@FindBy(how = How.XPATH, using ="//button[contains(text(),'Place Order')]")
	WebElement btn_Placeorder;
	
	@FindBy(how = How.XPATH, using ="//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/select[1]")
	WebElement btn_SelectOptin;
	
	@FindBy(how = How.XPATH, using ="//option[contains(text(),'Andorra')]")
	WebElement btn_SelectCountryname;
	
	
	@FindBy(how = How.XPATH, using ="//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/input[1]")
	WebElement checkBox_TremsCondition;
	
	
	@FindBy(how = How.XPATH, using ="//button[contains(text(),'Proceed')]")
	WebElement btn_Proceed;
	
	
	public void getAddSingleItem()  {

		LogUtil.info("start getAddSingleItem method");
		
		// clicking AddItem button to add the item in product cart
		btn_AddItem.click();
		
		
		// clicking Img_CartIcon to show the item is added
		wait.until(ExpectedConditions.visibilityOf(Img_CartIcon)).click();
	
		
		// Check the item added to the carticon is display or not
		Assert.assertEquals(ObjectsRepo.AllCarts().containsAll(ObjectsRepo.CompareingList()),true);
		
		LogUtil.info("end getAddSingleItem method");
		
	}
	
	public void getproceedTocheckoutPage()  {
		LogUtil.info("Start getproceedTocheckoutPage method");
		
		// explicit wait - to wait for the Proceed To checkout button to be click-able
		wait.until(ExpectedConditions.elementToBeClickable(btn_proceedTocheckout)).click();
		
		//check the image of the item is display on the page
		wait.until(ExpectedConditions.visibilityOf(Check_ImgonProductCartpage));
		
		//click on Placeorder button to go the next page
		btn_Placeorder.click();
		
		LogUtil.info("end getproceedTocheckoutPage method");
		
	}
	
	public void verifyselectcountryandProceed()  {
		
		LogUtil.info("Start verifyselectcountryandProceed method");
		//click on select option button to choose the country
		btn_SelectOptin.click();
		//click on the chooses country
		wait.until(ExpectedConditions.visibilityOf(btn_SelectCountryname)).click();
		
		//click on the Agree trems and condition radio button
		wait.until(ExpectedConditions.elementToBeClickable(checkBox_TremsCondition)).click();
		
		//click on the Proceed button to palce the order
		btn_Proceed.click();
		LogUtil.info("end verifyselectcountryandProceed method");
		
	}
}
