package com.pages;


import static com.utils.ConfigReader.prop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.utils.ElementsUtils;

public class TShirtPage {

	private WebDriver driver;

	ElementsUtils Utils = new ElementsUtils();


	private By tShirtPage = By.xpath("(//a[@title='T-shirts'][normalize-space()='T-shirts'])[2]");


	public TShirtPage(WebDriver driver) {
		this.driver = driver;

	}


	public void clickonTshirt()  {


		WebElement ele = driver.findElement(tShirtPage);

		Utils.waitforelemetpresent(ele);

		ele.click();
		Utils.verifyTitle(prop.getProperty("expectedTshirtpageTitle"), Utils.getTitle());


	}




}
