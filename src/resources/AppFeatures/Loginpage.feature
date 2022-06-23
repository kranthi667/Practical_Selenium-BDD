Feature: Login page feature

@Testcase1
Scenario: Verify title & URL of the launch URL
Given Launch URL
When Captµure title and add TestNg assertion to check title "My Store" 
Then Verify Logo is displayed on screen

@Testcase2
Scenario: Verify Links in header
Given user is on login page
Then Verify Call us now is displayed along with the valid phone number
And Verify Contact us, Sign In is displayed

@Testcase3
Scenario: Verify placeholderText
Given Launch URL
When On Search Text box check placeHolderText

@Testcase4
Scenario: Verify on different tabs and verify title
Given Launch URL
And  Click on Women and verify title
And Click on Dresses and verify title
And Click on T-Shirt and verify title

@Testcase5
Scenario: Verify Login functionality
Given Launch URL
When Click on Sign In tab
Then Verify title of SignIn screen
And user enters username "kranthi14337@gmail.com"
Then user enters password "June@123"
And user clicks on SignIn	 button
Then Verify UserName on screen once Logged IN

@Testcase6
Scenario: Verify Footer of the page
Given Scroll to end of the page
And   Verify three titles “Categories“, “Information”, “My Account” is displayed
Then  Verify all the sub links in each category with getText

@Testcase7
Scenario: Verify Product details
Given Tap on any product
And  Verify that image is loaded and displayed
And Verify the product details I.e. Product name, Description
Then Verify links for Tweet Share Google+ and Pinterest is displayed
And Verify Data Sheet of the product
Then Verify More info content is displayed
