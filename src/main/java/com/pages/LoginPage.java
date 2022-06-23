package com.pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.utils.ElementsUtils;
import static com.utils.ConfigReader.prop;

public class LoginPage {


	private WebDriver driver;

	private By emailId = By.id("email");
	private By password = By.id("passwd");
	private By signInButton = By.id("SubmitLogin");
	private By signIntab = By.linkText("Sign in");
	private By usernameveri = By.xpath("//a[@title='View my customer account']/span");

	ElementsUtils Utils = new ElementsUtils();


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


		String et=prop.getProperty("ecpectedTitle");


		Utils.verifyTitle(et, Utils.getTitle());



	}

	public void Usernameverify() {

		WebElement ele =driver.findElement(usernameveri);
		Utils.verifytext(prop.getProperty("Username"), ele);

	}



}
