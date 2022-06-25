package com.pages;

import static com.utils.ConfigReader.prop;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.utils.ElementsUtils;

import dataSet.TestData;

public class PreloginPage {

	private WebDriver driver;


	ElementsUtils utils = new ElementsUtils();
	TestData getPreLoginPagedata = new TestData();



	private By logo =By.xpath("//img[@class='logo img-responsive']");
	private By callUsNow =By.xpath("//span[@class='shop-phone']");
	private By contactUs=By.xpath("//a[contains(text(),'Contact us')]");
	private By signIn=By.xpath("//a[contains(text(),'			Sign in')]");
	private By placeholderText =By.xpath("//input[@placeholder='Search']");	
	private By categories =By.xpath("(//*[contains(text(),'Categories')])[2]");
	private By information =By.xpath("//*[contains(text(),'Information')]");
	private By myAccount =By.xpath("//a[normalize-space()='My account']");
	private By product = By.xpath("//*[@id=\"homefeatured\"]/li[1]/div/div[1]/div/a[1]");
	private By footerlinks=By.xpath("//div[@class='footer-container']");



	public PreloginPage(WebDriver driver) {
		this.driver = driver;

	}


	public  void launchURL() {

		driver.get(prop.getProperty("url"));
	}

	public String getLoginPageTitle() {
		return driver.getTitle();
	}


	public boolean logo() {

		boolean logoPresent =driver.findElement(logo).isDisplayed();

		return logoPresent;

	}


	public boolean callUsNow() {

		boolean CallUsNowPresent =driver.findElement(callUsNow).isDisplayed();

		return CallUsNowPresent;

	}


	public boolean contactus() {

		boolean ContactusPresent =driver.findElement(contactUs).isDisplayed();

		return ContactusPresent;

	}	

	public boolean signIn() {

		boolean SignInPresent =driver.findElement(signIn).isDisplayed();

		return SignInPresent;

	}

	public String placeholderText() {

		String PlaceholderTextPresent =driver.findElement(placeholderText).getAttribute("placeholder");

		return PlaceholderTextPresent;

	}

	public String excepectedPlaceholderText() {

		String  ExcPlaceholderText =getPreLoginPagedata.getPlaceHolderText();

		return ExcPlaceholderText;


	}


	public void footer_ScrollBottom()  {

		utils.scrollWindowBottom(driver);


	}


	public void footer_Categories() {


		WebElement Footer_CategoriesPresent = driver.findElement(categories);

		String print = Footer_CategoriesPresent.getText();

		utils.verifyText(getPreLoginPagedata.getFooter_CategoriesPresent(), Footer_CategoriesPresent);
		System.out.println(print);

	}

	public void footer_Information() {

		WebElement footer_InformationPresent = driver.findElement(information);

		String print = footer_InformationPresent.getText();

		utils.verifyText(getPreLoginPagedata.getFooter_InformationPresent(), footer_InformationPresent);
		System.out.println(print);

	}

	public void footer_MyAccount() {


		WebElement Footer_MyAccountPresent = driver.findElement(myAccount);
		String print = Footer_MyAccountPresent.getText();


		utils.verifyText(getPreLoginPagedata.getFooter_MyAccountPresent(), Footer_MyAccountPresent);

		System.out.println(print);

	}

	public void verifySublinksWithText() {


		utils.verifySubLinks(footerlinks);

	}




	public void  clickOnProduct() {
		driver.findElement(product).click();
	}


}
