package appHooks;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.utils.ConfigReader;

import base.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class ApplicationHooks {


	private BaseClass driverFactory;
	private WebDriver driver;
	private ConfigReader configReader;
	Properties prop;


	@Before(order = 0)
	public Properties getProperty() {
		configReader = new ConfigReader();
		return prop = configReader.init_prop();


	}


	@Before(order = 1)
	public void launchBrowser() {
		String browserName = prop.getProperty("browser");
		driverFactory = new BaseClass();
		driver = driverFactory.init_driver(browserName);
		driver.get(prop.getProperty("url"));

	}

	@After(order = 0)
	public void quitBrowser() {
		driver.quit();
	}


	@After(order = 1)
	public void tearDown(Scenario scenario) {
		if (scenario.isFailed()) {
			String screenshotName = scenario.getName().replaceAll(" ", "_");
			byte[] sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(sourcePath, "image/png", screenshotName);

		}
	}




}
