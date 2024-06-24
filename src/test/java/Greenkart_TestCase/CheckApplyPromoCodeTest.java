package Greenkart_TestCase;

import java.io.IOException;

import org.testng.annotations.Test;

import BrowserSetup.BaseTest;
import Pages.CheckApplyPromoCodePage;

public class CheckApplyPromoCodeTest extends BaseTest{

@Test(priority=10)
public static void CheckApplyPromoCode() throws IOException {
	CheckApplyPromoCodeobj=new CheckApplyPromoCodePage();
	CheckApplyPromoCodeobj.VerifytheApplyPromoCode();
}
}
