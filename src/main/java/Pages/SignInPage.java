package Pages;

import Poc.BuyProduct;

public class SignInPage extends BuyProduct{
	public SignInPage clickContinue()
	{
		driver.findElementById("continue").click();
		return this;
	}
	public SignInPage getSignInPageTitle()
	{
		String Header = "Amazon Sign In";
		String title = driver.getTitle();
		System.out.println(title);
		if(title.contentEquals(Header))
		{
			System.out.println("This is the Sign In Page");
			
		}
		else
		{
			System.out.println("This is not the Sign In page");
			
		}
		return this;
	}
	public SignInPage PrintError()
	{
		String error = driver.findElementByXPath("(//div[@class='a-alert-content'])[2]").getText();
		System.out.println(error);
		return this;
	}

}
