package Pages;

import Poc.BuyProduct;

public class ShoppingCart extends BuyProduct {
	public ShoppingCart checkAddedtoCart()
	{
		System.out.println(driver.findElementByXPath("//h1[@class='a-size-medium a-text-bold']").getText());
		return this;
	}
	public SignInPage clickProceedToBuy()
	{
		driver.findElementByXPath("//a[@id='hlb-ptc-btn-native']").click();
		return new SignInPage();
	}
 
}
