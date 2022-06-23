Feature: Login page feature


@Testcase5
Scenario: Verify Login functionality
Given Launch URL
When Click on Sign In tab
Then Verify title of SignIn screen
And user enters username "kranthi14337@gmail.com"
Then user enters password "June@123"
And user clicks on SignIn	 button
Then Verify UserName on screen once Logged IN

