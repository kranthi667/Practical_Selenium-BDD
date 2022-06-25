package com.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.utils.ElementsUtils;

import dataSet.TestData;


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


	ElementsUtils utils = new ElementsUtils();
	TestData getProductPagedata = new TestData();



	public ProductPage(WebDriver driver) {
		this.driver=driver;

	}



	public boolean productImage() {


		boolean ProductImagePresent =driver.findElement(image).isDisplayed();

		return ProductImagePresent;

	}


	public boolean productName() {



		WebElement productNamePresent =driver.findElement(productName);

		boolean productNameVerify =	utils.verifyText(getProductPagedata.getProductName(), productNamePresent);

		return productNameVerify;

	}
	public boolean productDescription() {


		boolean productDescriptionVerify =	utils.textExistPgSource(getProductPagedata.getDescription(),driver);

		return productDescriptionVerify;

	}


	public boolean dataSheet() {

		utils.scrollByKeys();
		WebElement wb = driver.findElement(dataSheet);

		return utils.verifyText(getProductPagedata.getDataSheet(), wb);



	}


	public boolean tweetLink () {

		boolean tweetlinkPresent =driver.findElement(tweet).isDisplayed();

		return tweetlinkPresent;

	}
	public boolean shareLink () {

		boolean SharelinkPresent =driver.findElement(share).isDisplayed();

		return SharelinkPresent;

	}
	public boolean googleLink () {

		boolean GooglelinkPresent =driver.findElement(google).isDisplayed();

		return GooglelinkPresent;

	}
	public boolean pinterestLink () {

		boolean PinterestlinkPresent =driver.findElement(pinterest).isDisplayed();

		return PinterestlinkPresent;

	}
	public boolean moreInfoContent() {

		boolean moreinfocontentPresent =driver.findElement(moreinfo).isDisplayed();

		return moreinfocontentPresent;

	}
}
