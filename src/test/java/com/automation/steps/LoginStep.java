package com.automation.steps;

import com.automation.pages.HomePage;
import com.automation.pages.SignInPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class LoginStep {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }
    @When("^I click On login link$")
    public void iClickOnLoginLink() {
        new HomePage().clickOnSignIn();

    }


    @And("^I verify \"([^\"]*)\" message$")
    public void iVerifyMessage(String message )  {
        Assert.assertEquals("AUTHENTICATION",message,new SignInPage().verifyAuthenticationText());

    }

    @Then("^I should navigate to  login page successfully$")
    public void iShouldNavigateToLoginPageSuccessfully() {
    }



    @And("^I enter email address \"([^\"]*)\"$")
    public void iEnterEmailAddress(String email)  {
        new SignInPage().enterEmailAddress(email);
        }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password)  {
       new SignInPage().enterPassword(password);
    }

    @And("^I click on sign in button$")
    public void iClickOnSignInButton() {

        new SignInPage().clickOnSignInButton();
    }

    @Then("^I verify \"([^\"]*)\"$")
    public void iVerify(String signOutMessage)  {
       Assert.assertEquals("Sign Out button not displayed",signOutMessage,"Sign out");
    }

    @Then("^I click on Log out button$")
    public void iClickOnLogOutButton() {
        new SignInPage().mouseHoverAndClickOnLogOutButton();
    }

    @Then("^I Verify \"([^\"]*)\" error message$")
    public void iVerifyErrorMessage(String errorMessage)  {

        Assert.assertEquals("error message not displayed",new SignInPage().verifyErrorMessage(),errorMessage);

    }
}
