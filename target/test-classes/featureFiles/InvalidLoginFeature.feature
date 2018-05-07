Feature: Trying to register with invalid email ID

Scenario:
Enter invalid emailID while trying to register

Given user has opened the Retail Web-site and Sign in is visible
When Click on Sign in button
Then Authentication Page is displayed
And User enters invalid email ID
Then Clicks on Create Account Button
Then an error should pop up
Then close the browser