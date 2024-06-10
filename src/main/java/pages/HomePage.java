package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import testBase.TestBase;

public class HomePage extends TestBase{

	public WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class='_LogoWrapper_1yrt4_25']")
	WebElement homepageLogo;
	 
	@FindBy(css="span._Details_1g1mh_4")
	WebElement stores;
	
	@FindBy(xpath="//a[contains(text(),'Rippl Rewards Staging')]")
	WebElement ripplRewardStagePage;
	
	@FindBy(xpath="//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-colorInherit MuiIconButton-sizeMedium css-10myjs0' and @type='button']")
	WebElement hamburgerIcon;
	
	@FindBy(xpath="//p[contains(text(), 'Program')]")
	WebElement program;
	
	@FindBy(xpath="//p[contains(text(), 'Points')]")
	WebElement points;
	
	@FindBy(xpath="//h2[contains(text(), 'Points status')]")
	WebElement pointsStatus;
	
	@FindBy(xpath="//button[contains(text(), 'Add Ways to Earn')]")
	WebElement addWaystoEarnBtn;
	
	@FindBy(xpath="//h1[contains(text(), 'Basic Actions')]")
	WebElement basicActions;
	
	@FindBy(xpath="//h2[contains(text(),'Build From Scratch')]")
	WebElement buildFromScratchBtn;
	
	@FindBy(xpath="//p[contains(text(),'Basic Info')]")
	WebElement basicInfo;
	
	
	public boolean verifyHomepage()
	{
		return homepageLogo.isDisplayed();
	}
	
	public void selectStore(String store)
	{
		stores.click();
		
		driver.findElement(By.xpath("//div[@class='Polaris-Box' and contains(text(),'"+store+"')]")).click();
		
	}
	public boolean verifyStoreSelected(String store)
	{
		return driver.findElement(By.xpath("//p[contains(text(),'"+store+"')]")).isDisplayed();
	}
	public void clickRipplRewardStaging(String ripplRewardsStaging)
	{
		driver.findElement(By.xpath("//span[contains(text(),'"+ripplRewardsStaging+"')]")).click();
	}
	public boolean verifyRipplRewardStagingPage(String ripplRewardsStaging)
	{
		try {
		return wait.until(ExpectedConditions.elementToBeClickable(ripplRewardStagePage)).isDisplayed();
		}
		catch(StaleElementReferenceException s)
		{
			return wait.until(ExpectedConditions.elementToBeClickable(ripplRewardStagePage)).isDisplayed();	
		}
	}
	public void clickHamburgerIcon()
	{
		driver.switchTo().frame("app-iframe");
		wait.until(ExpectedConditions.elementToBeClickable(hamburgerIcon)).click();
	}
	public void clickPrograms()
	{
		program.click();
	}
	public void selectPoints()
	{
		points.click();
	}
	public boolean pointsStatusPageCheck()
	{
		return wait.until(ExpectedConditions.elementToBeClickable(pointsStatus)).isDisplayed();
	}
	public void clickAddWaystoEarnBtn(String waysToEarn)
	{
		driver.findElement(By.xpath("//button[contains(text(), '"+waysToEarn+"')]")).click();
	}
	public boolean basicActionPageDisplayed()
	{
		return basicActions.isDisplayed();
	}
	public void clickBuildFromScratch(String buildFrmScratch)
	{
		driver.findElement(By.xpath("//h2[contains(text(),'"+buildFrmScratch+"')]")).click();
	}
	public boolean basicInfoPgDisplayed()
	{
		return basicInfo.isDisplayed();
	}
	
	
}
