$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Search.feature");
formatter.feature({
  "line": 1,
  "name": "Search and place order for vegetables",
  "description": "",
  "id": "search-and-place-order-for-vegetables",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Search for items and validate the results",
  "description": "",
  "id": "search-and-place-order-for-vegetables;search-for-items-and-validate-the-results",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User is on GreenKart Landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User search for \"Cucumber\" Vegetable",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "\"Cucumber\" results are displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinationGreenKart.user_is_on_greenkart_landing_page()"
});
formatter.result({
  "duration": 10745263000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Cucumber",
      "offset": 17
    }
  ],
  "location": "stepDefinationGreenKart.user_search_for_something_vegetable(String)"
});
formatter.result({
  "duration": 3355538300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Cucumber",
      "offset": 1
    }
  ],
  "location": "stepDefinationGreenKart.something_results_are_displayed(String)"
});
formatter.result({
  "duration": 133742800,
  "status": "passed"
});
formatter.after({
  "duration": 66600,
  "status": "passed"
});
formatter.after({
  "duration": 1260405700,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 10,
  "name": "Search for items and then move to checkout page",
  "description": "",
  "id": "search-and-place-order-for-vegetables;search-for-items-and-then-move-to-checkout-page",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 9,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "User is on GreenKart Landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "User search for \u003cFruitName\u003e Vegetables",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "\u003cFruitName\u003e Fruit results are displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "Add items to cart",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User proceeded to Checkout page for purchase",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Verify selected \u003cFruitName\u003e items are displayed in Check out page",
  "keyword": "Then "
});
formatter.examples({
  "line": 19,
  "name": "",
  "description": "",
  "id": "search-and-place-order-for-vegetables;search-for-items-and-then-move-to-checkout-page;",
  "rows": [
    {
      "cells": [
        "FruitName"
      ],
      "line": 20,
      "id": "search-and-place-order-for-vegetables;search-for-items-and-then-move-to-checkout-page;;1"
    },
    {
      "cells": [
        "Cucumber"
      ],
      "line": 21,
      "id": "search-and-place-order-for-vegetables;search-for-items-and-then-move-to-checkout-page;;2"
    },
    {
      "cells": [
        "Brinjal"
      ],
      "line": 22,
      "id": "search-and-place-order-for-vegetables;search-for-items-and-then-move-to-checkout-page;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 21,
  "name": "Search for items and then move to checkout page",
  "description": "",
  "id": "search-and-place-order-for-vegetables;search-for-items-and-then-move-to-checkout-page;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 9,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "User is on GreenKart Landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "User search for Cucumber Vegetables",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "Cucumber Fruit results are displayed",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "Add items to cart",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User proceeded to Checkout page for purchase",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Verify selected Cucumber items are displayed in Check out page",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinationGreenKart.user_is_on_greenkart_landing_page()"
});
formatter.result({
  "duration": 8603316600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Cucumber",
      "offset": 16
    }
  ],
  "location": "stepDefinationGreenKart.user_search_for_vegetables(String)"
});
formatter.result({
  "duration": 3404466700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Cucumber",
      "offset": 0
    }
  ],
  "location": "stepDefinationGreenKart.fruit_results_are_displayed(String)"
});
formatter.result({
  "duration": 63071000,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinationGreenKart.add_items_to_cart()"
});
formatter.result({
  "duration": 517665600,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinationGreenKart.user_proceeded_to_checkout_page_for_purchase()"
});
formatter.result({
  "duration": 364177100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Cucumber",
      "offset": 16
    }
  ],
  "location": "stepDefination.verify_selected_items_are_displayed_in_check_out_page(String)"
});
formatter.result({
  "duration": 690048400,
  "status": "passed"
});
formatter.after({
  "duration": 32000,
  "status": "passed"
});
formatter.after({
  "duration": 1353777400,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "Search for items and then move to checkout page",
  "description": "",
  "id": "search-and-place-order-for-vegetables;search-for-items-and-then-move-to-checkout-page;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 9,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "User is on GreenKart Landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "User search for Brinjal Vegetables",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "Brinjal Fruit results are displayed",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "Add items to cart",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User proceeded to Checkout page for purchase",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Verify selected Brinjal items are displayed in Check out page",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinationGreenKart.user_is_on_greenkart_landing_page()"
});
formatter.result({
  "duration": 9246903000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Brinjal",
      "offset": 16
    }
  ],
  "location": "stepDefinationGreenKart.user_search_for_vegetables(String)"
});
formatter.result({
  "duration": 3455561700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Brinjal",
      "offset": 0
    }
  ],
  "location": "stepDefinationGreenKart.fruit_results_are_displayed(String)"
});
formatter.result({
  "duration": 60349100,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinationGreenKart.add_items_to_cart()"
});
formatter.result({
  "duration": 307580700,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinationGreenKart.user_proceeded_to_checkout_page_for_purchase()"
});
formatter.result({
  "duration": 369723200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Brinjal",
      "offset": 16
    }
  ],
  "location": "stepDefination.verify_selected_items_are_displayed_in_check_out_page(String)"
});
formatter.result({
  "duration": 674102000,
  "status": "passed"
});
formatter.after({
  "duration": 34800,
  "status": "passed"
});
formatter.after({
  "duration": 1288984100,
  "status": "passed"
});
});