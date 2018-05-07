$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("sortBySummerDressFeature.feature");
formatter.feature({
  "line": 2,
  "name": "To Check if user is able to sort by price the Summer dress catalog",
  "description": "",
  "id": "to-check-if-user-is-able-to-sort-by-price-the-summer-dress-catalog",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@smokeTest"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "Check if Sort by price is functioning properly",
  "description": "",
  "id": "to-check-if-user-is-able-to-sort-by-price-the-summer-dress-catalog;check-if-sort-by-price-is-functioning-properly",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "user has opened the Retail Web-site and Sign in is visible",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "click on Dresses",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Click on Summer Dresses",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "verify if Dresses are sorted according to their price in ascending order",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "RegisterUser.user_has_opened_the_Retail_Web_site_and_Sign_in_is_visible()"
});
formatter.result({
  "duration": 21255676724,
  "status": "passed"
});
formatter.match({
  "location": "MegaMenuValidation.click_on_Dresses()"
});
formatter.result({
  "duration": 5676506693,
  "status": "passed"
});
formatter.match({
  "location": "MegaMenuValidation.click_on_Summer_Dresses()"
});
formatter.result({
  "duration": 5391927947,
  "status": "passed"
});
formatter.match({
  "location": "SortByPriceValidation.verify_if_Dresses_are_sorted_according_to_their_price_in_ascending_order()"
});
formatter.result({
  "duration": 8858823132,
  "status": "passed"
});
formatter.match({
  "location": "RegisterUser.close_the_browser()"
});
formatter.result({
  "duration": 959336056,
  "status": "passed"
});
});