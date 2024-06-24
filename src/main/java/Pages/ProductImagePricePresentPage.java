package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import BrowserSetup.BaseTest;
import ReusableComponent.LogUtil;

public class ProductImagePricePresentPage  extends BaseTest{

	public ProductImagePricePresentPage() {
		PageFactory.initElements(driver, this);
	}
	public void Verify_product_Image_Price_Present() {

		List<WebElement> products = driver.findElements(By.xpath("//div[@class='product']"));
        // Iterate through each product and verify image, price, and "Add to Cart" button
        for (WebElement product : products) {
            // Verify Product Image
            WebElement productImage = product.findElement(By.xpath(".//img"));

            if (productImage.isDisplayed()) {

            	LogUtil.info("Product Image is displayed for this product.");

            } else {

            	LogUtil.info("Product Image is not displayed for this product.");

            }

            // Verify Product Price

            WebElement productPrice = product.findElement(By.xpath(".//h4[@class='product-name']"));

            if (productPrice.isDisplayed()) {

            	LogUtil.info("Product Price is displayed for this product.");

            } else {

            	LogUtil.info("Product Price is not displayed for this product.");

            }

            // Verify "Add to Cart" Button

            WebElement addToCartButton = product.findElement(By.xpath(".//button[text()='ADD TO CART']"));

            if (addToCartButton.isDisplayed()) {

            	LogUtil.info("Add to Cart Button is displayed for this product.");

            } else {

            	LogUtil.info("Add to Cart Button is not displayed for this product.");

            }

        }

	}
}
