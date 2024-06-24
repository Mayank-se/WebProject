package BrowserSetup;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ReusableComponent.ObjectsRepo;
import ReusableComponent.PropertiesOperation;

public class BaseTest extends ObjectsRepo {

	
	@BeforeMethod
	public  void setup () throws IOException {
		String browser=PropertiesOperation.getPropertiesOperation("browser");
		String url=PropertiesOperation.getPropertiesOperation("url");
		int globalwait=Integer.valueOf(PropertiesOperation.getPropertiesOperation("Globalwait"));
		
		if(browser.equalsIgnoreCase("chrome")) {
//			ChromeOptions options=new ChromeOptions();
//			options.addArguments("Window_size=1400,800");
//			options.addArguments("Headless");
//			driver = new ChromeDriver(options);
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
//			FirefoxOptions options=new FirefoxOptions ();
//			options.addArguments("Window_size=1400,800");
//			options.addArguments("Headless");
//			driver = new FirefoxDriver(options);
			driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("edge")) {
//			EdgeOptions options=new EdgeOptions ();
//			options.addArguments("Window_size=1400,800");
//			options.addArguments("Headless");
//			driver = new EdgeDriver(options);
			driver=new EdgeDriver();
		}
		else {
			System.out.println("Invalid browser choice");
		}
//		explicitly Wait
		wait=new WebDriverWait(driver, Duration.ofSeconds(globalwait));
		
//		implicitly Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(globalwait));
		driver.manage().window().maximize();
		driver.get(url);
	}
	@AfterMethod
	public void quitBrowser()   {
		driver.quit();
	}


}
