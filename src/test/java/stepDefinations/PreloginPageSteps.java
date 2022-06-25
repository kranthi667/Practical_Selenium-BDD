package stepDefinations;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.testng.Assert;

import com.pages.PreloginPage;

import base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PreloginPageSteps {
	
	private PreloginPage preloginPage = new PreloginPage(BaseClass.getDriver());
	Logger log =(Logger) LogManager.getLogger(PreloginPageSteps.class);
	
	@Given("Launch URL")
	public void launch_url() {
		//preloginPage.launchURL();
	log.info("Launching Url");
	    
	}

	@When("Captµure title and add TestNg assertion to check title {string}")
	public void capturePageTitleAndAddTestNGAssertionToCheckTitle(String Expectedtitle) {
		
		String actualpagetitle = preloginPage.getLoginPageTitle();
		log.info("Page title is: "+actualpagetitle);
	
		Assert.assertEquals(Expectedtitle, actualpagetitle);
		log.info("Captµure title and add TestNg assertion to check title {string} :  PASS");
		
	    
	}
	@Then("Verify Logo is displayed on screen")
	public void verifyLogoIsDisplayedOnScreen() {
		Assert.assertEquals(preloginPage.logo(), true);
	   log.info("Verify Logo is displayed on screen:    PASS");
	}



	@Then("Verify Call us now is displayed along with the valid phone number")
	public void verifyCallUsNowWithValidNumIsDisplayed() {
		
		preloginPage.callUsNow();
	   Assert.assertEquals(preloginPage.callUsNow(), true);
	   log.info("Verify Call us now is displayed : PASS");
	}

	@Then("Verify Contact us, Sign In is displayed")
	public void verifyContactAndUsSignInTextIsDisplayed() {
		
		preloginPage.contactus();
		Assert.assertEquals(preloginPage.contactus(), true);
		log.info("Verify Contact us : PASSED ");
		preloginPage.signIn();
		Assert.assertEquals(preloginPage.signIn(), true);
		log.info("Verify Sign In : PASSED ");
	  
	}

	@When("On Search Text box check placeHolderText")
	public void VerifyThePlaceHolderTextOnSearchTextBox(){
		
	 String actualPlaceholdertext=  preloginPage.placeholderText();
	 
	 Assert.assertEquals(actualPlaceholdertext, preloginPage.excepectedPlaceholderText());
	  
	   log.info("On Search Text box check placeHolderText:    PASS");
	   
	}
	@Given("Scroll to end of the page")
	public void scrollToEndOfThePage() {
		
		
		preloginPage.footer_ScrollBottom();
		log.info("Scroll to end of the page   : PASS");
	 
	}

	@Given("Verify three titles “Categories“, “Information”, “My Account” is displayed")
	public void verifyThreeTitlesCategoriesInformationMyaccountIsDisplayed() {
	   
		preloginPage.footer_Categories();
		log.info("Verify Footer Categories  : PASS");
		preloginPage.footer_Information();
		log.info("Verify Footer Information  : PASS ");	
		preloginPage.footer_MyAccount();
		log.info("Verify Footer My Account  : PASS ");
		
		
	}

	@Then("Verify all the sub links in each category with getText")
	public void verifyAllTheSubLinksInEachCategoryWithGeText() {
		
		preloginPage.verifySublinksWithText();
		log.info("verifySublinksWithText :    PASS");
				
	}
	@Given("Tap on any product")
	public void tapOnAnyProduct() {
	   
		preloginPage.clickOnProduct();
		log.info("Clicked on product :    PASS");
		
	}
	

}
