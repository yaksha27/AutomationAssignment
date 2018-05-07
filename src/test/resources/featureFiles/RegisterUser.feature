Feature: Register to the web-site using valid email ID

Scenario: Register to the web-site
Given user has opened the Retail Web-site and Sign in is visible
When Click on Sign in button
Then Authentication Page is displayed
And User enters valid email ID "shanewarne29@gmail.com"
And Clicks on Create Account Button
And select the title "Mr"
And enter first name "Shane"
And enter last name "Warne"
And enter password "Shane@1234"
And select date "5"
And select month 5
And select year "2000"
And enter address "7th Main"
And enter city "Chicago"
And select state "Illinois"
And enter zip code "54126"
And enter phone number "9054123677"
Then click on register button
Then close the browser