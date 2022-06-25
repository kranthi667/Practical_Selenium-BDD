package com.pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.utils.ElementsUtils;

import dataSet.TestData;

public class TShirtPage {

	private WebDriver driver;

	ElementsUtils utils = new ElementsUtils();
	TestData getTshirtPagedata = new TestData();


	private By tShirtPage = By.xpath("(//a[@title='T-shirts'][normalize-space()='T-shirts'])[2]");


	public TShirtPage(WebDriver driver) {
		this.driver = driver;

	}


	public void clickOnTshirt()  {


		WebElement ele = driver.findElement(tShirtPage);

		utils.waitForElemetPresent(ele);

		ele.click();
		utils.verifyTitle(getTshirtPagedata.getExpectedTshirtpageTitle(), utils.getTitle());


	}




}
