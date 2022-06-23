package stepDefinations;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import com.pages.DressesPage;

import base.BaseClass;
import io.cucumber.java.en.Given;

public class DressesPageSteps {

	private DressesPage dressespage = new DressesPage(BaseClass.driver);
	Logger log =(Logger) LogManager.getLogger(DressesPageSteps.class);
	
	@Given("Click on Dresses and verify title")
	public void verifyTheTitleofDressesPage() {	
		dressespage.clickondresses();

	log.info("Verified the Dresses page Title:   PASS");
	  
	}

	
	
}
