package stepDefinations;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import com.pages.TShirtPage;

import base.BaseClass;
import io.cucumber.java.en.Given;

public class TshitPageSteps {

	private TShirtPage tshirtpage = new TShirtPage(BaseClass.getDriver());
	Logger log =(Logger) LogManager.getLogger(TshitPageSteps.class);
	
	@Given("Click on T-Shirt and verify title")
	public void verifyTheTitleofTshirtPage() {
		
		
		tshirtpage.clickOnTshirt();
		log.info("Click on T-Shirt and verify title:    PASS");

	    
	}
	
	
	
	
	
	
}
