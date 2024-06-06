package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class LandingPage extends TestBase{
	 
	public LandingPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="a[data-component-name='logo-home']")
	WebElement logo;
	 
	@FindBy(xpath="//a[contains(text(),'Log in')]")
	WebElement loginLink;
	
	public boolean logoVerify()
	{
		return logo.isDisplayed();
	}
    public void clickLoginLink()
    {
    	loginLink.click();
    }
}
