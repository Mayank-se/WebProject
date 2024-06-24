package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import BrowserSetup.BaseTest;
import ReusableComponent.LogUtil;
import ReusableComponent.PropertiesOperation;

public class SearchFuntioanlityOnHomePage extends BaseTest{
	
	@FindBy(how = How.XPATH, using ="//header/div[1]/div[2]/form[1]/input[1]")
	WebElement Txt_Searchfield;
	
	@FindBy(how = How.XPATH, using ="//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/img[1]")
	WebElement cart_itemsDisplay; 
	

	public SearchFuntioanlityOnHomePage() {
		PageFactory.initElements(driver, this);
	}

	public void CheckTheSearchFuntionality() throws IOException  {
		
		LogUtil.info("Start CheckTheSearchFuntionality method");
		
		//searching the product for the search bar
		Txt_Searchfield.sendKeys(PropertiesOperation.getPropertiesOperations("NameofProduct"));

		
		//check the search product are shown on the home page
		Assert.assertEquals(cart_itemsDisplay.isDisplayed(),true);
		
		LogUtil.info("end CheckTheSearchFuntionality method");
		
	}
}
