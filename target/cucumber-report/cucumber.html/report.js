$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("womencategory.feature");
formatter.feature({
  "line": 1,
  "name": "Select product from Woman tab",
  "description": "As User I want to select product from woman tab",
  "id": "select-product-from-woman-tab",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 5,
  "name": "User should  add product to the cart successfully",
  "description": "",
  "id": "select-product-from-woman-tab;user-should--add-product-to-the-cart-successfully",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@test1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click on woman tab",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I click on product \"\u003cproduct\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I select quantity \"\u003cqty\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I select size \"\u003csize\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I select colour \"\u003ccolour\u003e\"",
  "keyword": "And "
});
formatter.examples({
  "line": 13,
  "name": "",
  "description": "",
  "id": "select-product-from-woman-tab;user-should--add-product-to-the-cart-successfully;",
  "rows": [
    {
      "cells": [
        "product",
        "qty",
        "size",
        "colour"
      ],
      "line": 14,
      "id": "select-product-from-woman-tab;user-should--add-product-to-the-cart-successfully;;1"
    },
    {
      "cells": [
        "Blouse",
        "2",
        "M",
        "White"
      ],
      "line": 15,
      "id": "select-product-from-woman-tab;user-should--add-product-to-the-cart-successfully;;2"
    },
    {
      "cells": [
        "Printed Dress",
        "3",
        "L",
        "Orange"
      ],
      "line": 16,
      "id": "select-product-from-woman-tab;user-should--add-product-to-the-cart-successfully;;3"
    },
    {
      "cells": [
        "Printed Chiffon Dress",
        "4",
        "S",
        "Green"
      ],
      "line": 17,
      "id": "select-product-from-woman-tab;user-should--add-product-to-the-cart-successfully;;4"
    },
    {
      "cells": [
        "Printed Summer Dress with Price $28.98",
        "2",
        "M",
        "Blue"
      ],
      "line": 18,
      "id": "select-product-from-woman-tab;user-should--add-product-to-the-cart-successfully;;5"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 6492563000,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "User should  add product to the cart successfully",
  "description": "",
  "id": "select-product-from-woman-tab;user-should--add-product-to-the-cart-successfully;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@test1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click on woman tab",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I click on product \"Blouse\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I select quantity \"2\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I select size \"M\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I select colour \"White\"",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.match({
  "location": "LoginStep.iAmOnHomepage()"
});
formatter.result({
  "duration": 73545500,
  "status": "passed"
});
formatter.match({
  "location": "WomenDressSelectionSteps.iClickOnWomanTab()"
});
formatter.result({
  "duration": 2799650300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Blouse",
      "offset": 20
    }
  ],
  "location": "WomenDressSelectionSteps.iClickOnProduct(String)"
});
formatter.result({
  "duration": 28436407900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 19
    }
  ],
  "location": "WomenDressSelectionSteps.iSelectQuantity(String)"
});
formatter.result({
  "duration": 6155943400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "M",
      "offset": 15
    }
  ],
  "location": "WomenDressSelectionSteps.iSelectSize(String)"
});
formatter.result({
  "duration": 206333900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "White",
      "offset": 17
    }
  ],
  "location": "WomenDressSelectionSteps.iSelectColour(String)"
});
formatter.result({
  "duration": 141677000,
  "status": "passed"
});
formatter.after({
  "duration": 816353800,
  "status": "passed"
});
formatter.before({
  "duration": 4770963900,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "User should  add product to the cart successfully",
  "description": "",
  "id": "select-product-from-woman-tab;user-should--add-product-to-the-cart-successfully;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@test1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click on woman tab",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I click on product \"Printed Dress\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I select quantity \"3\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I select size \"L\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I select colour \"Orange\"",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.match({
  "location": "LoginStep.iAmOnHomepage()"
});
formatter.result({
  "duration": 25400,
  "status": "passed"
});
formatter.match({
  "location": "WomenDressSelectionSteps.iClickOnWomanTab()"
});
formatter.result({
  "duration": 2119795400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Printed Dress",
      "offset": 20
    }
  ],
  "location": "WomenDressSelectionSteps.iClickOnProduct(String)"
});
formatter.result({
  "duration": 27492516300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 19
    }
  ],
  "location": "WomenDressSelectionSteps.iSelectQuantity(String)"
});
formatter.result({
  "duration": 6128004700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "L",
      "offset": 15
    }
  ],
  "location": "WomenDressSelectionSteps.iSelectSize(String)"
});
formatter.result({
  "duration": 157613500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Orange",
      "offset": 17
    }
  ],
  "location": "WomenDressSelectionSteps.iSelectColour(String)"
});
formatter.result({
  "duration": 148065500,
  "status": "passed"
});
formatter.after({
  "duration": 807281400,
  "status": "passed"
});
formatter.before({
  "duration": 5201959200,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "User should  add product to the cart successfully",
  "description": "",
  "id": "select-product-from-woman-tab;user-should--add-product-to-the-cart-successfully;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@test1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click on woman tab",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I click on product \"Printed Chiffon Dress\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I select quantity \"4\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I select size \"S\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I select colour \"Green\"",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.match({
  "location": "LoginStep.iAmOnHomepage()"
});
formatter.result({
  "duration": 47100,
  "status": "passed"
});
formatter.match({
  "location": "WomenDressSelectionSteps.iClickOnWomanTab()"
});
formatter.result({
  "duration": 1677069100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Printed Chiffon Dress",
      "offset": 20
    }
  ],
  "location": "WomenDressSelectionSteps.iClickOnProduct(String)"
});
formatter.result({
  "duration": 27308947100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "4",
      "offset": 19
    }
  ],
  "location": "WomenDressSelectionSteps.iSelectQuantity(String)"
});
formatter.result({
  "duration": 6137144200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "S",
      "offset": 15
    }
  ],
  "location": "WomenDressSelectionSteps.iSelectSize(String)"
});
formatter.result({
  "duration": 104688500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Green",
      "offset": 17
    }
  ],
  "location": "WomenDressSelectionSteps.iSelectColour(String)"
});
formatter.result({
  "duration": 114849000,
  "status": "passed"
});
formatter.after({
  "duration": 748743900,
  "status": "passed"
});
formatter.before({
  "duration": 4375017900,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "User should  add product to the cart successfully",
  "description": "",
  "id": "select-product-from-woman-tab;user-should--add-product-to-the-cart-successfully;;5",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@test1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click on woman tab",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I click on product \"Printed Summer Dress with Price $28.98\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I select quantity \"2\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I select size \"M\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I select colour \"Blue\"",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.match({
  "location": "LoginStep.iAmOnHomepage()"
});
formatter.result({
  "duration": 38900,
  "status": "passed"
});
formatter.match({
  "location": "WomenDressSelectionSteps.iClickOnWomanTab()"
});
formatter.result({
  "duration": 1687483300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Printed Summer Dress with Price $28.98",
      "offset": 20
    }
  ],
  "location": "WomenDressSelectionSteps.iClickOnProduct(String)"
});
formatter.result({
  "duration": 28503526400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 19
    }
  ],
  "location": "WomenDressSelectionSteps.iSelectQuantity(String)"
});
formatter.result({
  "duration": 6140442200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "M",
      "offset": 15
    }
  ],
  "location": "WomenDressSelectionSteps.iSelectSize(String)"
});
formatter.result({
  "duration": 184701100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Blue",
      "offset": 17
    }
  ],
  "location": "WomenDressSelectionSteps.iSelectColour(String)"
});
formatter.result({
  "duration": 1884500,
  "status": "passed"
});
formatter.after({
  "duration": 774046200,
  "status": "passed"
});
});