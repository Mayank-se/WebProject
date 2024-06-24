package ReusableComponent;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import Pages.AddToCartPage;
import Pages.CheckApplyPromoCodePage;
import Pages.MultiLineMultiQtyOrderPage;
import Pages.MutipleLineOrderPage;
import Pages.OrderCannotBePlacedPage;
import Pages.ProductImagePricePresentPage;
import Pages.ProductsAreDisplayedPage;
import Pages.SearchFuntioanlityOnHomePage;
import Pages.SingleLineMultiQtyOrderPage;
import Pages.SingleLineOrderPage;






public class ObjectsRepo {
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static ExtentReports extent;
	public static ExtentTest test;
	public static FileInputStream fis;
	public static  Properties prop;
	public static String value;
	public static SingleLineOrderPage SingleLineobj;
	public static MutipleLineOrderPage MultipleLineobj;
	public static SingleLineMultiQtyOrderPage SingleLineMultiQtyobj;
	public static MultiLineMultiQtyOrderPage MultiLineMultiQtyobj;
	public static ProductsAreDisplayedPage productsAreDisplayedobj;
	public static SearchFuntioanlityOnHomePage SearchFuntioanlityobj;
	public static  OrderCannotBePlacedPage  OrderCannotBePlacedTermsobj;
	public static ProductImagePricePresentPage ProductImagePricePresentobj;
	public static AddToCartPage AddToCartobj;
	public static CheckApplyPromoCodePage CheckApplyPromoCodeobj;
	public static int num=4;
	
	
	public static List<String> AllCarts() {
		// Storing all the cart name in the arraylist for assertion 
		List<String> values=new ArrayList<String>();
		List<WebElement> element=driver.findElements(By.className("product-name"));
		for (WebElement x: element) {
			values.add(x.getText());
		}
		values.removeAll(Collections.singleton(""));
	return values;
	}
	
	public static List<String> CompareingList(){
		List<String> val=new ArrayList<String>();
		List<WebElement> elem=driver.findElements(By.xpath("//div[1]/ul[1]/li[contains(@class,cart-items)]/div[1]/p[1]"));
		for (WebElement x: elem) {
			val.add(x.getText());
		}
		val.removeAll(Collections.singleton(""));
		if(val.isEmpty())
		{
			val.add(null);
		}
		return val;
	}
	public static String CompareingAmountLists(){
		String elem=driver.findElement(By.xpath("//div[1]/ul[1]/li[contains(@class,cart-items)]/div[2]/p[2]")).getText();
		return elem;
	}
	
}
