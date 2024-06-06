package stepDefinition;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.RipplRewardStagingPage;

public class BuildFromScratchModule {
	
	HomePage homePg = new HomePage();
	RipplRewardStagingPage rewardPg = new RipplRewardStagingPage();
	
	@Given("User is on shopify dashboard")
	public void user_is_on_shopify_dashboard() {
		Assert.assertTrue(homePg.verifyHomepage());
	}
	@When("User selects the Store from the right corner as {string}")
	public void user_selects_the_store_from_the_right_corner_as(String store) {
		homePg.selectStore(store);
		
	  
	}
	@Then("Store is switched to {string} in dashboard")
	public void store_is_switched_to_staging_may_test_store_in_dashboard(String store) {
		homePg.verifyStoreSelected(store);
	}
	@Then("User clicks on {string} on the left panel")
	public void user_clicks_on_on_the_left_panel(String ripplRewardsStaging) {
		homePg.clickRipplRewardStaging(ripplRewardsStaging);
		Assert.assertTrue(homePg.verifyRipplRewardStagingPage(ripplRewardsStaging));
	}
	@Then("User Navigate to the Points from the sub-menu inside Rippl App")
	public void user_navigate_to_the_points_from_the_sub_menu_inside_rippl_app() {
		homePg.clickHamburgerIcon();
		homePg.clickPrograms();
		homePg.selectPoints();
	}
	@Then("Points page is displayed")
	public void points_page_is_displayed() {
		homePg.pointsStatusPageCheck();
	}
	@Then("User clicks on {string} link")
	public void user_clicks_on_link(String waysToEarn) {
		homePg.clickAddWaystoEarnBtn(waysToEarn);
		homePg.basicActionPageDisplayed();
	}
	@Then("User clicks on {string} module")
	public void user_clicks_on_module(String buildFrmScratch) {
		homePg.clickBuildFromScratch(buildFrmScratch); 
		homePg.basicInfoPgDisplayed();
	}
	
	@Then("^User fills (.*),(.*),(.*),(.*) and (.*) the parameters$")
	public void user_fills_in_all_the_parameters(String name,String shortDescription,String actionDescription,String startDate,String endDate) {
		rewardPg.enterName(name);
		rewardPg.enterShortDescription(shortDescription);
		rewardPg.enterActionDescription(actionDescription);
		rewardPg.enterStartDate(startDate);
		rewardPg.enterEndDate(endDate);
	    
	}
	
	@Then("^User sets (.*),(.*),(.*),(.*),(.*) and (.*)$")
	public void user_sets_parameters(String actionRepeatable,String status,String trackingType,String imageTrackingType,String filterByTags,String iconType)
	{
		rewardPg.actionRepeatRadioBtnClick(actionRepeatable);
		rewardPg.selectStatus(status);
		rewardPg.selectTrackingType(trackingType);
		rewardPg.selectImageTrackingType(imageTrackingType);
		rewardPg.selectFilterByTags(filterByTags);
		rewardPg.selectIconType(iconType);
	}
	@Then("User uploads banner image")
	public void user_uploads_banner() {
		rewardPg.uploadBannerImg();
	}
	@Then("^User enters (.*),(.*),(.*),(.*),(.*),(.*) and (.*)$")
	public void user_enters_parameters(String optionalMail,String content,String corelatedTask,String points,String gallonsOfWater,String kgsOfPlastic,String treesPlanted )
	{
		rewardPg.enterOptionalMail(optionalMail);	
		rewardPg.enterContent(content);
		rewardPg.enterCorelatedTask(corelatedTask);
		rewardPg.enterPoints(points);
		rewardPg.enterGallonsOfWater(gallonsOfWater);
		rewardPg.enterKgsOfPlastic(kgsOfPlastic);
		rewardPg.enterTreesPlanted(treesPlanted);
	}
	@Then("User clicks on publish button")
	public void user_clicks_on_publish_button() {
		rewardPg.clickpublishBtnd();
	}
	@Then ("Verify all the details are updated accordingly")
	public void verify_actions_created(String name, String points, String corelatedTask) {
		Assert.assertTrue(rewardPg.verifyPublishedName(name));
		Assert.assertTrue(rewardPg.verifyPublishedPoints(name, points));
		Assert.assertTrue(rewardPg.verifyCorrelatedInTaskSection(corelatedTask));
	}



}
