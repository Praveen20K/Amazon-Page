package Pages;

import Poc.BuyProduct;

public class AmazonHomePage extends BuyProduct {
	
	public AmazonHomePage searchMobile()
	{
		driver.findElementById("twotabsearchtextbox").sendKeys("Samsung Galaxy M30");
		return this;
	}
	
	public SamsungM30 clickSearch()
	{
		driver.findElementByXPath("//input[@class='nav-input']").click();
		return new SamsungM30();
	}

}
