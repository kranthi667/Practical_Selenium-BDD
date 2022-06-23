package com.pages;


import static com.utils.ConfigReader.prop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import com.utils.ElementsUtils;

public class WomenPage {

	private WebDriver driver;


	ElementsUtils Utils = new ElementsUtils();

	private By womenlink = By.xpath("//a[@title='Women']");


	public WomenPage(WebDriver driver) {
		this.driver = driver;

	}


	public void clickonWomen() {

		WebElement eleclickonWomen = driver.findElement(womenlink);

		Utils.waitforelemetpresent(eleclickonWomen);

		eleclickonWomen.click();
		Utils.verifyTitle(prop.getProperty("expectedWomenpageTitle"), Utils.getTitle());



	}






}
