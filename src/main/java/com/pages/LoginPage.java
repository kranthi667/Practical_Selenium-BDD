package com.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.utils.ElementsUtils;

import  dataSet.TestData;
public class LoginPage {


	private WebDriver driver;



	private By emailId = By.id("email");
	private By password = By.id("passwd");
	private By signInButton = By.id("SubmitLogin");
	private By signIntab = By.linkText("Sign in");
	private By usernameveri = By.xpath("//a[@title='View my customer account']/span");

	ElementsUtils utils = new ElementsUtils();
	TestData getLoginPagedata = new TestData();


	public LoginPage(WebDriver driver) {
		this.driver=driver;


	}

	public String getpageTitle() {
		return driver.getTitle();
	}

	public void  clickOnSignInTab() {

		driver.findElement(signIntab).click();
	}

	public void enterUserName(String username) {
		driver.findElement(emailId).sendKeys(username);
	}

	public void enterPassword(String pwd) {
		driver.findElement(password).sendKeys(pwd);
	}

	public void clickOnSignInbutton() {
		driver.findElement(signInButton).click();
	}

	public void sginInscreenTitle() {

		utils.verifyTitle(getLoginPagedata.getExpectedTitle(), utils.getTitle());

	}

	public void UserNameVerify() {

		WebElement usernameveriele =driver.findElement(usernameveri);
		utils.verifyText(getLoginPagedata.getUsername(), usernameveriele);

	}



}
