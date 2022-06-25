package com.pages;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.utils.ElementsUtils;
import dataSet.TestData;

public class WomenPage {

	private WebDriver driver;


	ElementsUtils utils = new ElementsUtils();
	TestData getWomensPagedata = new TestData();

	private By womenlink = By.xpath("//a[@title='Women']");


	public WomenPage(WebDriver driver) {
		this.driver = driver;

	}


	public void clickOnWomen() {

		WebElement eleclickonWomen = driver.findElement(womenlink);

		utils.waitForElemetPresent(eleclickonWomen);

		eleclickonWomen.click();
		
		utils.verifyTitle(getWomensPagedata.getExpectedWomenpageTitle(), utils.getTitle());



	}






}
