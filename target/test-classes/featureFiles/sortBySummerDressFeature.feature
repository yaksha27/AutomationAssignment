@smokeTest
Feature: To Check if user is able to sort by price the Summer dress catalog

Scenario: Check if Sort by price is functioning properly

Given user has opened the Retail Web-site and Sign in is visible
Then click on Dresses
And Click on Summer Dresses
And verify if Dresses are sorted according to their price in ascending order
Then close the browser