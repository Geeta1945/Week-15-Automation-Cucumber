package com.automation.testsuite;

import com.automation.pages.HomePage;
import com.automation.pages.SignInPage;
import com.automation.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import resources.testdata.TestData;

public class SignPageTest extends TestBase {

    HomePage homePage;
    SignInPage signInPage;

    @BeforeMethod
    public void inIt() {
        homePage = new HomePage();
        signInPage = new SignInPage();
    }


    @Test

    public void userShouldNavigateToSignInPageSuccessFully() throws InterruptedException {

        homePage.clickOnSignIn();
        Thread.sleep(1000);
        signInPage.verifyAuthenticationText();
    }


    @Test(dataProvider = "credentials", dataProviderClass = TestData.class)

    public void verifyTheErrorMessageWithInValidCredentials(String username, String password, String message) throws InterruptedException {
        homePage.clickOnSignIn();
        Thread.sleep(1000);
        signInPage.enterEmailAddress(username);
        signInPage.enterPassword(password);
        Thread.sleep(1000);
        signInPage.clickOnSignInButton();
        Thread.sleep(2000);
       // signInPage.verifyErrorMessage(message);
        Thread.sleep(1000);
    }


    @Test
    public void verifyThatUserShouldLogInSuccessFullyWithValidCredentials() throws InterruptedException {
        homePage.clickOnSignIn();
        Thread.sleep(3000);
        signInPage.enterEmailAddress("Geeta1945p@gmail.com");
        signInPage.enterPassword("Geeta1945");
        Thread.sleep(1000);
        signInPage.clickOnSignInButton();
        Thread.sleep(3000);

        signInPage.verifyTextFromLogOutButton();
    }


    @Test
    public void verifyThatUserShouldLogOutSuccessFully() throws InterruptedException {
        homePage.clickOnSignIn();
        Thread.sleep(1000);
        signInPage.enterEmailAddress("Geeta1945p@gmail.com");
        signInPage.enterPassword("Geeta1945");
        Thread.sleep(1000);
        signInPage.clickOnSignInButton();
        signInPage.mouseHoverAndClickOnLogOutButton();
        signInPage.verifySignInText();
    }


}

