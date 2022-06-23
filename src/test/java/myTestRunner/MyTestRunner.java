package myTestRunner;



import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(

		features = {"src/test/resources/AppFeatures/PreloginPage.feature"},
		glue = {"stepDefinations", "appHooks"},
		//plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		
	    tags="@Testcase6"
        	  

		)

public class MyTestRunner {

}

