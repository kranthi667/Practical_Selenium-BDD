package stepDefinations;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import com.pages.WomenPage;

import base.BaseClass;
import io.cucumber.java.en.Given;

public class WomenPageSteps {
	
	
	private WomenPage womenpage = new WomenPage(BaseClass.driver);
	
	Logger log =(Logger) LogManager.getLogger(WomenPageSteps.class);
	

	@Given("Click on Women and verify title")
	public void verifyTheTitleofWomenPage() {
			
		womenpage.clickonWomen();
		 log.info("Click on Women and verify title:    PASS");
	  
	}
	

}
