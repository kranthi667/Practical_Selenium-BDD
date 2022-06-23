package stepDefinations;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import com.pages.TShirtPage;

import base.BaseClass;
import io.cucumber.java.en.Given;

public class TshitPageSteps {

	private TShirtPage tshirtpage = new TShirtPage(BaseClass.driver);
	Logger log =(Logger) LogManager.getLogger(TshitPageSteps.class);
	
	@Given("Click on T-Shirt and verify title")
	public void verifyTheTitleofTshirtPage() {
		
		
		tshirtpage.clickonTshirt();
		log.info("Click on T-Shirt and verify title:    PASS");

	    
	}
	
	
	
	
	
	
}
