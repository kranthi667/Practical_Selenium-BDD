Feature: Prelogin page features



@Testcase1
Scenario: Verify title & URL of the launch URL
Given Launch URL
When Captµure title and add TestNg assertion to check title "My Store" 
Then Verify Logo is displayed on screen

@Testcase2
Scenario: Verify Links in header
Then Verify Call us now is displayed along with the valid phone number
And Verify Contact us, Sign In is displayed

@Testcase3
Scenario: Verify placeholderText
Given Launch URL
When On Search Text box check placeHolderText


@Testcase6
Scenario: Verify Footer of the page
Given Scroll to end of the page
And   Verify three titles “Categories“, “Information”, “My Account” is displayed
Then  Verify all the sub links in each category with getText