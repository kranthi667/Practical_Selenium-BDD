package com.pages;


import static com.utils.ConfigReader.prop;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.utils.ElementsUtils;

public class DressesPage {

	static Logger log =LogManager.getLogger();

	private WebDriver driver;

	ElementsUtils Utils = new ElementsUtils();

	private By   dressesPage  =By.xpath("(//a[@title='Dresses'][normalize-space()='Dresses'])[2]");
			


	public DressesPage(WebDriver driver) {
		this.driver = driver;

	}


	public void clickondresses() {

		WebElement ele1 = driver.findElement(dressesPage);

		Utils.waitforelemetpresent(ele1);

		ele1.click();

		Utils.verifyTitle(prop.getProperty("expectedDressespageTitle"), Utils.getTitle());




	}


}
