package com.automation.steps;

import com.automation.pages.CreateAccountPage;
import com.automation.pages.SignInPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.checkerframework.checker.units.qual.C;
import org.junit.Assert;

public class CreateAccountSteps {


    @And("^I click on \"([^\"]*)\" button$")
    public void iClickOnButton(String registerButton) {

        new SignInPage().mouseHoverAndClickOnCreateAccount();

    }

    @And("^I click on Gender Button$")
    public void iClickOnGenderButton() {
        new CreateAccountPage().clickOnGenderButton();

    }


    @And("^I enter first name \"([^\"]*)\"$")
    public void iEnterFirstName(String firstName)  {
        new CreateAccountPage().enterFirstName(firstName);

    }


    @And("^I enter last name \"([^\"]*)\"$")
    public void iEnterLastName(String lastName)  {
        new CreateAccountPage().enterLastName(lastName);

    }

    @And("^I enter my password \"([^\"]*)\"$")
    public void iEnterMyPassword(String password) {
       new CreateAccountPage().enterCreateAccountPassword(password);
    }


    @And("^I enter my address \"([^\"]*)\"$")
    public void iEnterMyAddress(String address)  {
        new CreateAccountPage().enterAddress(address);
    }


    @And("^I enter my city \"([^\"]*)\"$")
    public void iEnterMyCity(String city) {
        new CreateAccountPage().enterCity(city);
    }


    @And("^I select my state from dropdown \"([^\"]*)\"$")
    public void iSelectMyStateFromDropdown(String state) {
        new CreateAccountPage().selectStateFromDropDown(state);

    }

    @And("^I enter Mobile number \"([^\"]*)\"$")
    public void iEnterMobileNumber(String mobileNo)  {
        new CreateAccountPage().enterMobileNumber(mobileNo);

    }

    @And("^I enter my postcode \"([^\"]*)\"$")
    public void iEnterMyPostcode(String postCode) {
        new CreateAccountPage().enterPostcode(postCode);

    }

    @And("^I  enter Home Number \"([^\"]*)\"$")
    public void iEnterHomeNumber(String homeNo)  {
        new CreateAccountPage().enterHomeNumber(homeNo);

    }

    @Then("^I click on register button$")
    public void iClickOnRegisterButton() {
        new CreateAccountPage().clickOnRegisterButton();

    }

    @And("^verify \"([^\"]*)\" message$")
    public void verifyMessage(String message)  {

        Assert.assertEquals("",new CreateAccountPage().verifyMyAccountText(),message);

    }


}
