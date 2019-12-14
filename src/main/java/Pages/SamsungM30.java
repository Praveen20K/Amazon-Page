package Pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import Poc.BuyProduct;

public class SamsungM30 extends BuyProduct {
	public SamsungM30 getPrice()
	{
		String Price = driver.findElementByXPath("(//span[@class='a-price-whole'])[1]").getText();
		System.out.println("The Price of the Mobile is Rs."+Price);
		return this;
	}
	public GalaxyM30 selectMobile()
	{
		driver.findElementByXPath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]").click();
		Set<String> window = driver.getWindowHandles();
		List<String> lis = new ArrayList<String>();
		lis.addAll(window);
		driver.switchTo().window(lis.get(1));
		return new GalaxyM30();
	}
	
	

}
