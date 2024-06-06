package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import testBase.TestBase;

public class LoginPage extends TestBase{

//	FluentWait<WebDriver> Fluentwait = new FluentWait<>(driver)
//            .withTimeout(Duration.ofSeconds(10))
//            .pollingEvery(Duration.ofSeconds(3))
//            .ignoring(InterruptedException.class);
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	By continueBtn = By.cssSelector("span.ui-button__hover-icon");
	
	@FindBy(css="input#account_email")
	WebElement emailField;
	 
	@FindBy(xpath="//h1[@class='ui-heading' and contains(text(),'Log in')]")
	WebElement loginScreen;
	
	@FindBy(css="span[class='ui-button__hover-icon']")
	WebElement continueWithEmailBtn;
	
	@FindBy(id="account_password")
	WebElement paswordField;
	
	@FindBy(css="span.ui-button__hover-icon")
	WebElement loginBtn;
	
	public boolean VerifyloginPage()
	{
		return loginScreen.isDisplayed();
	}
    public void enterEmailId(String email )
    {
    	emailField.sendKeys(email);
    }
    public void clickContinueWithEmailBtn()
    {
    	try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    	continueWithEmailBtn.click();
    }
    public void enterPwd(String password )
    {
    	wait.until(ExpectedConditions.elementToBeClickable(paswordField));
    	paswordField.sendKeys(password);
    }
    public void clickLoginBtn()
    {
    	try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    	loginBtn.click();
    }
}
