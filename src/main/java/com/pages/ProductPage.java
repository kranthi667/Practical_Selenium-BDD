package com.pages;

import java.awt.AWTException;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import com.utils.ElementsUtils;
import static com.utils.ConfigReader.prop;

public class ProductPage {


	private WebDriver driver;

	private By image = By.xpath("//*[@id='bigpic' and @title='Faded Short Sleeve T-shirts']");	
	private By productName = By.xpath("//h1[@itemprop='name']");	
	private By tweet = By.xpath("//button[@class='btn btn-default btn-twitter']");
	private By share  = By.xpath("//button[@class='btn btn-default btn-facebook']");
	private By google = By.xpath("//button[@class='btn btn-default btn-google-plus']");
	private By pinterest  = By.xpath("//button[@class='btn btn-default btn-pinterest']");
	private By dataSheet =By.xpath("//h3[contains(text(),'Data sheet')]");
	private By moreinfo = By.xpath("//div[@class='rte']");


	ElementsUtils Utils = new ElementsUtils();



	public ProductPage(WebDriver driver) {
		this.driver=driver;

	}



	public boolean productImage() {


		boolean ProductImagePresent =driver.findElement(image).isDisplayed();

		return ProductImagePresent;

	}


	public boolean productName() {



		WebElement productNamePresent =driver.findElement(productName);

		boolean productNameVerify =	Utils.verifytext(prop.getProperty("productName"), productNamePresent);

		return productNameVerify;

	}
	public boolean productDescription() {

		Utils.waitforpagetoload();

		boolean productDescriptionVerify =	Utils.textExistPgSource(prop.getProperty("description"),driver);

		return productDescriptionVerify;

	}


	public boolean dataSheet() {

		Utils.scrollbykeys();
		WebElement wb = driver.findElement(dataSheet);

		return Utils.verifytext(prop.getProperty("dataSheet"), wb);



	}


	public boolean tweetlink () {

		boolean tweetlinkPresent =driver.findElement(tweet).isDisplayed();

		return tweetlinkPresent;

	}
	public boolean sharelink () {

		boolean SharelinkPresent =driver.findElement(share).isDisplayed();

		return SharelinkPresent;

	}
	public boolean googlelink () {

		boolean GooglelinkPresent =driver.findElement(google).isDisplayed();

		return GooglelinkPresent;

	}
	public boolean pinterestlink () {

		boolean PinterestlinkPresent =driver.findElement(pinterest).isDisplayed();

		return PinterestlinkPresent;

	}
	public boolean moreinfocontent() {

		boolean moreinfocontentPresent =driver.findElement(moreinfo).isDisplayed();

		return moreinfocontentPresent;

	}
}
