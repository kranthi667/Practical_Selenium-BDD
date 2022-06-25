package com.pages;





import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.utils.ElementsUtils;
import dataSet.TestData;


public class DressesPage {



	private WebDriver driver;

	ElementsUtils Utils = new ElementsUtils();
	TestData getDressesPageData = new TestData();

	private By   dressesPage  =By.xpath("(//a[@title='Dresses'][normalize-space()='Dresses'])[2]");
			


	public DressesPage(WebDriver driver) {
		this.driver = driver;
		

	}


	public void clickOnDresses() {

		WebElement dressespage = driver.findElement(dressesPage);

		Utils.waitForElemetPresent(dressespage);

		dressespage.click();

		Utils.verifyTitle(getDressesPageData.getExpectedDressespageTitle(), Utils.getTitle());

	}


}
