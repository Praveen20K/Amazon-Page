package Testcase;

import org.testng.annotations.Test;

import Pages.AmazonHomePage;
import Poc.BuyProduct;

public class TC001_Amazon extends BuyProduct {
	@Test
	public void Amazon()
	{
		new AmazonHomePage()
		.searchMobile()
		.clickSearch()
		.getPrice()
		.selectMobile()
		.deliveryDate()
		.clickAddToCart()
		.checkAddedtoCart()
		.clickProceedToBuy()
		.clickContinue()
		.getSignInPageTitle()
		.PrintError();
	}

}
