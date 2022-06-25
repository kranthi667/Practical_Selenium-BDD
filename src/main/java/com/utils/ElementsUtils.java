package com.utils;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.BaseClass;

public class ElementsUtils extends BaseClass{



	ElementsUtils utils;

	JavascriptExecutor js ;
	public static final Logger log = LogManager.getLogger(ElementsUtils.class);



	public Object scrollWindowBottom(WebDriver driver) {

		js= (JavascriptExecutor) BaseClass.getDriver();

		return  js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

	}

	public void scrollByKeys() {

		Actions a = new Actions(BaseClass.getDriver());
		a.sendKeys(Keys.PAGE_DOWN).build().perform();

	}

	public void elementClickWithKeys(WebElement wb) {

		utils.waitForPageToLoad();

		wb.sendKeys(Keys.LEFT_CONTROL,Keys.ENTER);

	}


	public void waitForPageToLoad(){
		BaseClass.driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}

	public void waitForElemetPresent(WebElement wb){
		WebDriverWait wait=new WebDriverWait(BaseClass.getDriver(),20);
		wait.until(ExpectedConditions.elementToBeClickable(wb));
	}

	public void waitForElemetvisible(By wb) throws InterruptedException{

		WebDriverWait wait = new WebDriverWait(driver, 20);
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(wb));
		} catch (NoSuchElementException e) {

			e.printStackTrace();
		}
		WebElement ele5 = wait.until(ExpectedConditions.elementToBeClickable(wb));
		ele5.click();

	}


	public boolean verifyText(String expectedResult,WebElement wb){
		boolean flag=false;
		String ActualResult = null;
		try {
			ActualResult = wb.getText();
		} catch (Exception e) {

			e.printStackTrace();
		}
		if(expectedResult.equals(ActualResult)){
			flag=true;
			System.out.println("Text is verified==pass");
		}else{
			System.out.println("Text is not verified==fail");
		}
		return flag;

	}

	public void verifyTitle(String expectedtitile,String actualTitle) {

		if(expectedtitile.equalsIgnoreCase(actualTitle))
			System.out.println("Title Matched :"+ actualTitle );
		else
			System.out.println("Title didn't match: "+actualTitle);
	}


	public boolean isDisplayed(By we) {

		boolean expectedflag = false;

		try {
			expectedflag = BaseClass.getDriver().findElement(we).isDisplayed();
		} catch (NoSuchElementException e) {
			System.out.println("element is not found:" + we);
			e.printStackTrace();
		}

		return expectedflag;

	}


	public  String getTitle() {
		return BaseClass.getDriver().getTitle();
	}

	public void verifyLinks() {

		List<WebElement> allLinks = BaseClass.getDriver().findElements(By.tagName("a"));


		for(WebElement link:allLinks){
			System.out.println(link.getText() + " - " + link.getAttribute("href"));
		}

	} 

	public void verifySubLinks(By ele) {

		WebElement footer= BaseClass.getDriver().findElement(ele); 
		System.out.println(footer.findElements(By.tagName("a")).size()) ;
		List<WebElement> footlinks = footer.findElements(By.tagName("a"));

		for(WebElement link:footlinks){
			System.out.println(link.getText() + " - " + link.getAttribute("href"));
		}
	}



	public boolean textExistPgSource(String t,WebDriver driver) {
		if ( BaseClass.getDriver().getPageSource().contains("Faded short sleeve t-shirt with high neckline")){
			System.out.println("Text: " + t + " is present. ");
			return true;
		} else {
			System.out.println("Text: " + t + " is not present. ");
			return false;
		}

	}

	public  void moveToElement(WebElement locator,WebDriver driver)
	{
		Actions actions = new Actions(BaseClass.getDriver());    
		try {
			actions.moveToElement(locator).build().perform();
		} catch (NoSuchElementException e) {

			e.printStackTrace();
		} 

	} 

}

