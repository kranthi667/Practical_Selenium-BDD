package stepDefinations;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.testng.Assert;

import com.pages.ProductPage;

import base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class ProductPageSteps {
	
	private ProductPage productpage = new ProductPage(BaseClass.driver);
	
	Logger log =(Logger) LogManager.getLogger(ProductPageSteps.class);


	@Given("Verify that image is loaded and displayed")
	public void verifyProductImageIsLoadedAndDisplayed() {
	    
		Assert.assertEquals(productpage.productImage(),true);
		log.info("Verify productimage is loaded  : PASS");
	
				
	}

	@Given("Verify the product details I.e. Product name, Description")
	public void verifyTheProductNameAndDescription() {
	    
		productpage.productName();
		log.info("Verify productName is expected  : PASS ");
		productpage.productDescription();		 	
		log.info("Verify productDescription is expected  : PASS");
		
	}

	@Then("Verify links for Tweet Share Google+ and Pinterest is displayed")
	public void verifyLinksForTweetShareGoogleAndPinterestIsDisplayed() {
	   
		Assert.assertEquals(productpage.tweetlink(),true);
		
		log.info("Verify tweetlink is present : PASS ");
		Assert.assertEquals(productpage.sharelink(),true);
		log.info("Verify sharelink is present : PASS ");
		
		Assert.assertEquals(productpage.googlelink(),true);
		log.info("Verify googlelink is present  : PASS ");
		
		Assert.assertEquals(productpage.pinterestlink(),true);
		log.info("Verify pinterestlink is present  : PASS ");
		
		
		
	}

	@Then("Verify Data Sheet of the product")
	public void verifyDataSheetOfTheProduct() {
		Assert.assertEquals(productpage.dataSheet(),true);
		log.info("Data Sheet of the product is present : PASS ");
		
	  
	}

	@Then("Verify More info content is displayed")
	public void verifyMoreInfoContentIsDisplayed() {
	    
		Assert.assertEquals(productpage.moreinfocontent(),true);
		log.info("Verify moreinfocontent is present  : PASS ");
		
	}


}
