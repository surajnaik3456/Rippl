package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import testBase.TestBase;

public class RipplRewardStagingPage extends TestBase{

	
	public RipplRewardStagingPage() {
		PageFactory.initElements(driver, this);
	}
	public WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	public Actions action=new Actions(driver);
	HomePage homePg = new HomePage();
	
	@FindBy(xpath="//div[@class='_LogoWrapper_1yrt4_25']")
	WebElement homepageLogo;
	
	@FindBy(xpath="//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-12 css-9b0rt']/following::input[1]")
	WebElement nameField;
	
	@FindBy(xpath="//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-12 css-9b0rt']/following::input[2]")
	WebElement shortDescriptionField;
	
	@FindBy(xpath="//div[@class='ql-editor ql-blank' and @contenteditable='true']/p")
	WebElement actionDescriptionField;
	
	@FindBy(xpath="(//input[@placeholder='Click to select a date' and  @class='MuiInputBase-input MuiFilledInput-input MuiInputBase-inputSizeSmall css-7ulcqb'])[1]")
	WebElement startDateField;
	
	@FindBy(xpath="(//input[@placeholder='Click to select a date' and  @class='MuiInputBase-input MuiFilledInput-input MuiInputBase-inputSizeSmall css-7ulcqb'])[2]")
	WebElement endDateField;
	
	@FindBy(xpath="//div[text()='Live image capture']")
	WebElement imageTrackingTypeDropdown;
	
	@FindBy(xpath="//div[text()='Live image capture']")
	WebElement TrackingTypeRadioBtn;
	
	@FindBy(xpath="(//span[text()='Active'])[1]")
	WebElement statusBtn;
	
	@FindBy(xpath="(//div[@class=' css-19bb58m'])[1]")
	WebElement filterByTagsDropdown;
	
	@FindBy(css="input[type=file][name=image]")
	WebElement uploadBannerImgBtn;
	
	@FindBy(css="input[id=':rb:']")
	WebElement optionalMailField;
	
	@FindBy(css="div.ql-editor.ql-blank")
	WebElement contentField;
	
	@FindBy(xpath="//input[@id=':ra:']")
	WebElement pointsField;
	
	@FindBy(xpath="//input[@id=':ra:']/following::input[1]")
	WebElement gallonsOfWaterField;
	
	@FindBy(xpath="//input[@id=':ra:']/following::input[2]")
	WebElement kgsOfPlasticField;
	
	@FindBy(xpath="//input[@id=':rc:' and @type='text']")
	WebElement corelatedTaskField;
	
	@FindBy(xpath="//input[@id=':ra:']/following::input[3]")
	WebElement treesPlantedField;
	
	@FindBy(xpath="//button[text()='Publish' and @type='submit']")
	WebElement publishBtn;
	
	@FindBy(xpath="//p[contains(text(), 'Program')]")
	WebElement program;
	 
	@FindBy(xpath="//p[text()='Tasks']")
	WebElement task;
	
	@FindBy(xpath="//h1[text()='Tasks']")
	WebElement taskPage;
	
	@FindBy(xpath="//p[text()='Community']")
	WebElement community;
	
	@FindBy(xpath="//h1[contains(text(),'Community')]")
	WebElement communityPage;
	
	
	@FindBy(xpath="//button[contains(text(),'Completed Tasks')]")
	WebElement completedTaskTab;
	
	@FindBy(xpath="//button[normalize-space()='# Action']")
	WebElement tagInCommunitySection;
	
	@FindBy(xpath="(//div[@class=' css-1xc3v61-indicatorContainer'])[2]")
	WebElement tagsBtn;
	
	public boolean verifyHomepage()
	{
		return homepageLogo.isDisplayed();
	}
	public void enterName(String name)
	{
		driver.switchTo().defaultContent();
		driver.switchTo().frame("app-iframe");
		nameField.sendKeys(name);
//		Actions action=new Actions(driver);
//		action.sendKeys(nameField, name);
//		action.click(nameField);
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", nameField);
	//	wait.until(ExpectedConditions.elementToBeClickable(nameField)).sendKeys("Fitness Bingo Challenge");
		//nameField.sendKeys(name);
	}
	public void enterShortDescription(String shortDescription)
	{
		shortDescriptionField.click();
		shortDescriptionField.sendKeys(shortDescription);
	}
	public void enterActionDescription(String actionDescription)
	{
		actionDescriptionField.sendKeys(actionDescription);
	}
	public void enterStartDate(String startDate)
	{
		action.moveToElement(startDateField).click();
		startDateField.sendKeys(startDate);
	}
	public void enterEndDate(String endDate)
	{
		action.moveToElement(endDateField).click();
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		endDateField.sendKeys(endDate);
	}
	public void actionRepeatRadioBtnClick(String actionRepeatable)
	{
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='"+actionRepeatable+"']"))).click();
	}
	public void selectStatus(String status)
	{
		action.moveToElement(statusBtn).click();
		//driver.findElement(By.xpath("(//span[text()='Active'])[1]")).click();
	}
	public void selectTrackingType(String trackingType)
	{
		//driver.findElement(By.xpath("//span[contains(text(), '"+trackingType+"')]")).click();
		TrackingTypeRadioBtn.click();
	}
	public void selectImageTrackingType(String imageTrackingType)
	{
		try {
		imageTrackingTypeDropdown.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[text()='"+imageTrackingType+"']"))).click();
		}
		catch(ElementClickInterceptedException e)
		{
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[text()='"+imageTrackingType+"']"))).click();
		}
		//driver.findElement(By.xpath("//li[text()='"+imageTrackingType+"']")).click();
	}
	public void selectFilterByTags(String filterByTags)
	{
		filterByTagsDropdown.click();
		driver.findElement(By.xpath("//div[contains(text(),'"+filterByTags+"')]")).click();
	}
	
	public void selectIconType(String iconType)
	{
		driver.findElement(By.xpath("//span[text()='"+iconType+"']")).click();
	}
	public void uploadBannerImg()
	{
		uploadBannerImgBtn.sendKeys(System.getProperty("user.dir")+"\\images\\banner.jpg");
	}
	public void enterOptionalMail(String optionalMail)
	{
		optionalMailField.sendKeys(optionalMail);
	}
	public void enterContent(String content)
	{
		contentField.sendKeys(content);
	}
	public void enterCorelatedTask(String corelatedTask)
	{
		corelatedTaskField.sendKeys(corelatedTask);
	}
	public void enterPoints(String points)
	{
		pointsField.sendKeys(points);
	}
	public void selectTags(String tags)
	{
		tagsBtn.click();
		driver.findElement(By.xpath("//div[text()='"+tags+"']")).click();
	}
	public void enterGallonsOfWater(String gallonsOfWater)
	{
		gallonsOfWaterField.sendKeys(gallonsOfWater);
	}
	public void enterKgsOfPlastic(String kgsOfPlastic)
	{
		kgsOfPlasticField.sendKeys(kgsOfPlastic);
	}
	public void enterTreesPlanted(String treesPlanted)
	{
		treesPlantedField.sendKeys(treesPlanted);
	}
	public void clickpublishBtnd()
	{
		publishBtn.click();
	}
	public boolean verifyPublishedName(String name)
	{
		return driver.findElement(By.xpath("//p[text()='"+name+"']")).isDisplayed();
	}
	public boolean verifyPublishedPoints(String name,String points)
	{
		return driver.findElement(By.xpath("//p[text()='"+name+"']/following::p[contains(text(),'"+points+"')][1]")).isDisplayed();
	}
	public boolean verifyCorrelatedInTaskSection(String corelatedTask )
	{
		homePg.clickHamburgerIcon();
		task.click();
		taskPage.isDisplayed();
		completedTaskTab.click();
		return driver.findElement(By.xpath("//div[@data-field='taskDescription']/p[contains(text(),'"+corelatedTask+"')]")).isDisplayed();
	}
	public boolean verifyTagsAdded(String tags,String name )
	{
		homePg.clickHamburgerIcon();
		community.click();
		communityPage.isDisplayed();
		driver.findElement(By.xpath("//p[contains(text(),'"+name+"')]/following::div[3]")).click();
		return driver.findElement(By.xpath("//button[normalize-space()='"+tags+"']")).isDisplayed();
	}
}
