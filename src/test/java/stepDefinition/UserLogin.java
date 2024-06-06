package stepDefinition;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LandingPage;
import pages.LoginPage;

public class UserLogin {
	
	LandingPage landingPg = new LandingPage();
	LoginPage loginPg = new LoginPage();
	HomePage homePg = new HomePage();
	
	@Given("User is on homepage")
	public void user_is_on_homepage() {
		Assert.assertTrue(landingPg.logoVerify());    
	}

	@When("User clicks on login link")
	public void user_clicks_on_login_link() {
		landingPg.clickLoginLink();
		Assert.assertTrue(loginPg.VerifyloginPage());
	}
	
	@Then("Login page is displayed")
	public void login_page_displayed()
	{
		Assert.assertTrue(loginPg.VerifyloginPage());
	}
	
	@When("^User enters valid (.*) into email field$")
	public void user_enters_valid_email(String email) {
		loginPg.enterEmailId(email);
	    
	}

	@When("User clicks on Continue with email button")
	public void user_clicks_on_button() {
		loginPg.clickContinueWithEmailBtn();
	}

	@When("^User enters the valid (.*)$")
	public void user_enters_the_valid_password(String password) {
		
		loginPg.enterPwd(password);
	}

	@When("User clicks on the Log in button")
	public void user_clicks_on_the_log_in_button() {
		loginPg.clickLoginBtn();
	}

	@Then("User should see the shopify dashboard")
	public void user_should_see_the_shopify_dashboard() {
		homePg.verifyHomepage();
	}


}
