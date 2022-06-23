
## Selenium Web UI Project
This is sample ecommerce website  Different workflows for adding products to cart, checking out cart, making payments etc.




## Build Project

This  project is written in Eclipse and will serve an example of implementing a Selenium test project with  (Selenium3) and Maven. Everything is set up and tests can be added straight away. Used Testrunner is the Failsafe plugin. To execute the tests just browse to the path where the basic-selenium-project is located in your terminal and type mvn clean verify -Pbrowser-chrome or execute the tests in your IDE. maven profiles for all browsers exists in the pom.xml.


## Implemented Browsers

Thanks to the awesome webdrivermanager it supports the following browsers and automatically downloads OS specific binaries for:

Chrome




#### The Webdriver Setup

The webdriver setup is based on the "WebDriverManager" and the DesiredCapabilitiesFactory to have a separation between driver instantiation and browser specific settings.
## Technologies&Tools Used
- Eclipse

- Java

- Selenium 

- Maven 

- JUint

- BDD Cucumber Framework

- log4j2

- Extent Reporting
## Page Object Model


page object pattern is used to have reusable WebElements/small helper methods separated from actual test classes and give the opportunity to have nice structured and easily readable tests (BDD-Frameworks like Cucumber ).
## Annotations

Beside a bunch of [Convenient Methods] the basic-selenium-project provides some nice custom annotations to comfortably set some test conditions and/or assumptions Example test that uses several annotations:

@Before	This annotation is used if you want to execute some statement such as preconditions before each test case.


@After	This annotation can be used if you want to execute some statements after each Test Case for e.g resetting variables, deleting temporary files ,variables, etc.
## Convenient Methods

you can find a couple of convenient methods like waits, isElementPresent/Visible, hover, dragAndDrop, etc. in ElementUtils.java as well as helper methods  are added and should show the the usage self-evident.
## Take Screenshots

On test failures screenshots will automatically be taken and stored under src/screenshots. The screenshot files will be named with a combination of the class name and the test method name.

##  Console Output


The console output is more intuitive and better readable as the default one of jUnit and Selenium. A  console output will give you a clear overview about which tests are currently running. Furthermore obvious markers will be set at succeeded (green marker) and failed (red marker) tests.
To get an even more clear overview of the test execution the project uses the  to pretty print executed tests.
## Centralized Project Config

All global configurations are living in a properties file (test/resources/config.properties) and can be adjusted. It gives you the possibility to edit the global project behaviour in one place without messing around with project/setup specific code. Furthermore all properties can be overridden via system properties.
## Waits

Testing web applications that are asynchroniously loading / rerendering parts of the page can become hard to test with Selenium.

## Extent Test Result Report

Extent provides a good representation of test execution output and is designed to create reports that are clear to everyone by creating graphs regarding test execution time, overall test result overviews, test result history, etc.