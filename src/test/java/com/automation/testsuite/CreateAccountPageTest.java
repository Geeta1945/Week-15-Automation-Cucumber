package com.automation.testsuite;

import com.automation.pages.CreateAccountPage;
import com.automation.pages.HomePage;
import com.automation.pages.SignInPage;
import com.automation.testbase.TestBase;
import com.google.common.base.Verify;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAccountPageTest extends TestBase {
    HomePage homePage;
    SignInPage signInPage;
    CreateAccountPage createAccountPage;

    @BeforeMethod
    public void inIt() {
        homePage = new HomePage();
        signInPage = new SignInPage();
        createAccountPage = new CreateAccountPage();
    }


    @Test
    public void verifyThatUserShouldCreateAccountSuccessfully() throws InterruptedException {
        Thread.sleep(1000);
        homePage.clickOnSignIn();
        createAccountPage.enter_createAccount_EmailAddress("ppatel_purvi@yahoo.co.uk");
        Thread.sleep(1000);
        signInPage.mouseHoverAndClickOnCreateAccount();
        Thread.sleep(1000);
        createAccountPage.clickOnGenderButton();
        createAccountPage.enterFirstName("My First Name");
        createAccountPage.enterLastName("My Last Name");
        createAccountPage.enterCreateAccountPassword("MyTrickyPassword123");
        //createAccountPage.selectDaysFromDropDown("11");
       // createAccountPage.selectMonthFromDropDown("August");
        //createAccountPage.selectYearFromDropDown("2001");
        Thread.sleep(1000);
        createAccountPage.enterAddress("107,My Road");
        Thread.sleep(1000);
        createAccountPage.enterCity("My City");
        createAccountPage.selectStateFromDropDown("California");
        Thread.sleep(1000);
        createAccountPage.enterPostcode("36101");
        createAccountPage.enterHomeNumber("0123456789");
        createAccountPage.enterMobileNumber("0123456789");

        Thread.sleep(1000);
        createAccountPage.clickOnRegisterButton();
        Thread.sleep(1000);
          // Verify message ="My Account";
            String expectedMessage = "MY ACCOUNT";
            String actualMessage = createAccountPage.verifyMyAccountText();
           Assert.assertEquals(expectedMessage, actualMessage);
    }

}
