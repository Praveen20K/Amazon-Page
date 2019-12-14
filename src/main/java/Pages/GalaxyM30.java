package Pages;

import Poc.BuyProduct;

public class GalaxyM30 extends BuyProduct{
	public GalaxyM30 deliveryDate()
	{
		String Date = driver.findElementByXPath("(//div[@id='ddmDeliveryMessage']//following-sibling::span)[1]").getText();
		System.out.println("The Delivery date is: "+Date);
		return this;
	}
	public ShoppingCart clickAddToCart()
	{
		driver.findElementById("add-to-cart-button").click();
		return new ShoppingCart();
				
	}

}
