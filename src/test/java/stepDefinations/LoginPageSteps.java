package stepDefinations;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.testng.Assert;

import com.pages.LoginPage;

import base.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps {

	//private static String title;
	
	private LoginPage loginPage = new LoginPage(BaseClass.driver);
	Logger log =(Logger) LogManager.getLogger(LoginPageSteps.class);
  
		

	@When("Click on Sign In tab")
	public void clickOnSignInTab() {
		loginPage.clickOnSignInTab();
		log.info("Click on SignIn Tab :   PASS");
	}

	@Then("Verify title of SignIn screen")
	public void verifyTitleOfSignInScreen() {
		
	 loginPage.sginInscreenTitle();
     log.info("Verify title of SignIn screen   :    PASS");
	
	 
	}

	@Then("user enters username {string}")
	public void enterUsername(String string) {
		loginPage.enterUserName(string);
		log.info("UserEnetered Usename :");
	   
	}

	@Then("user enters password {string}")
	public void enterPassword(String string) {
	   loginPage.enterPassword(string);
	   log.info("UserEnetered Password :");
	}

	@Then("user clicks on SignIn	 button")
	public void clickOnSignInButton() {
		
	    loginPage.clickOnSignInbutton();
	  
	   log.info("User is in the user Account page: ");
	}

	@Then("Verify UserName on screen once Logged IN")
	public void verifyUserNameOnScreenOnceLoggedIn() {
		
		loginPage.Usernameverify();
		
		log.info("Username is Verified:     PASS");
		
	    
	}
	
	

	
}
