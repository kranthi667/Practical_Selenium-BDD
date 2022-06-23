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



	public Object scrollwindowbottom(WebDriver driver) {

		js= (JavascriptExecutor) driver;

		return  js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

	}

	public void scrollbykeys() {

		Actions a = new Actions(driver);
		a.sendKeys(Keys.PAGE_DOWN).build().perform();

	}

	public void elementclickwithkeys(WebElement wb) {

		utils.waitforpagetoload();

		wb.sendKeys(Keys.LEFT_CONTROL,Keys.ENTER);

	}


	public void waitforpagetoload(){
		BaseClass.driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}

	public void waitforelemetpresent(WebElement wb){
		WebDriverWait wait=new WebDriverWait(BaseClass.driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(wb));
	}

	public void waitforelemetvisible(By wb) throws InterruptedException{

		WebDriverWait wait = new WebDriverWait(driver, 20);
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(wb));
		} catch (NoSuchElementException e) {

			e.printStackTrace();
		}
		WebElement ele5 = wait.until(ExpectedConditions.elementToBeClickable(wb));
		ele5.click();

	}


	public boolean verifytext(String expectedResult,WebElement wb){
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
			expectedflag = driver.findElement(we).isDisplayed();
		} catch (NoSuchElementException e) {
			System.out.println("element is not found:" + we);
			e.printStackTrace();
		}

		return expectedflag;

	}


	public  String getTitle() {
		return BaseClass.driver.getTitle();
	}

	public void verifyLinks() {

		List<WebElement> allLinks = driver.findElements(By.tagName("a"));


		for(WebElement link:allLinks){
			System.out.println(link.getText() + " - " + link.getAttribute("href"));
		}

	} 

	public void verifySubLinks(By ele) {

		WebElement footer= driver.findElement(ele); 
		System.out.println(footer.findElements(By.tagName("a")).size()) ;
		List<WebElement> footlinks = footer.findElements(By.tagName("a"));

		for(WebElement link:footlinks){
			System.out.println(link.getText() + " - " + link.getAttribute("href"));
		}
	}



	public boolean textExistPgSource(String t,WebDriver driver) {
		if ( driver.getPageSource().contains("Faded short sleeve t-shirt with high neckline")){
			System.out.println("Text: " + t + " is present. ");
			return true;
		} else {
			System.out.println("Text: " + t + " is not present. ");
			return false;
		}

	}

	public  void movetoelement(WebElement locator,WebDriver driver)
	{
		Actions actions = new Actions(driver);    
		try {
			actions.moveToElement(locator).build().perform();
		} catch (NoSuchElementException e) {

			e.printStackTrace();
		} 

	} 

}

