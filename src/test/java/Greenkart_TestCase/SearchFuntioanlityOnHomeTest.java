package Greenkart_TestCase;

import java.io.IOException;

import org.testng.annotations.Test;

import BrowserSetup.BaseTest;
import Pages.SearchFuntioanlityOnHomePage;
import ReusableComponent.LogUtil;

public class SearchFuntioanlityOnHomeTest extends BaseTest {
	@Test(priority=6)
	public void VerifyTheSearchFuntionality() throws IOException  {
		LogUtil.startTestCase("VerifyTheSearchFuntionality");
		
		SearchFuntioanlityobj=new SearchFuntioanlityOnHomePage();
		SearchFuntioanlityobj.CheckTheSearchFuntionality();
		
		LogUtil.endTestCase("VerifyTheSearchFuntionality");
	}

}
