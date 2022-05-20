package com.automation.steps;

import com.automation.pages.WomenCategoryPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import gherkin.lexer.Th;

public class WomenDressSelectionSteps {
    @When("^I click on woman tab$")
    public void iClickOnWomanTab() {
        new WomenCategoryPage().clickOnWomenTab();
    }

    @And("^I select colour \"([^\"]*)\"$")
    public void iSelectColour(String colour) {
        new WomenCategoryPage().selectColour(colour);

    }

    @And("^I click on product \"([^\"]*)\"$")
    public void iClickOnProduct(String product) throws InterruptedException {
        Thread.sleep(1000);

        new WomenCategoryPage().clickProduct(product);


    }

    @And("^I select quantity \"([^\"]*)\"$")
    public void iSelectQuantity(String quantity) throws InterruptedException {

        new WomenCategoryPage().clearQty();
        Thread.sleep(1000);

        new WomenCategoryPage().enterQtyWanted(quantity);

    }

    @And("^I select size \"([^\"]*)\"$")
    public void iSelectSize(String size) {
        new WomenCategoryPage().enterSize(size);

    }
}
