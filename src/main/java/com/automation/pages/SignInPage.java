package com.automation.pages;

import com.automation.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SignInPage extends Utility {
    private static final Logger log = LogManager.getLogger(SignInPage.class.getName());
    public SignInPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//input[@id='email']")
    WebElement email;
    @FindBy(xpath = "//input[@id='passwd']")
            WebElement password;
    @FindBy(xpath = "//button[@id='SubmitLogin']")
    WebElement signInButton;
    @FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/button[1]/span[1]")
            WebElement createAccountButton;
    @FindBy(xpath = "//h1[contains(text(),'Authentication')]")
    WebElement authenticationText;
    @FindBy(xpath = "//h3[contains(text(),'Create an account')]")
            WebElement createAccountText;
    @FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/ol[1]")
    WebElement errorMessage;
    @FindBy(xpath = "//a[@class='logout']")
    WebElement logOut;


    public void enterEmailAddress(String myEmail){
        sendTextToElement(email,myEmail);
        log.info("Sending Email Address : " + email.toString());
    }

    public void enterPassword(String myPassword){

        sendTextToElement(password,myPassword);
        log.info("Sending password : " + password.toString());
    }
    public void clickOnSignInButton(){
        clickOnElement(signInButton);
        log.info("Clicking on Sign In Button : "+signInButton.toString());
    }

    public String verifyAuthenticationText(){
        log.info("Getting Authentication text from : " + authenticationText.toString());
       return getTextFromElement(authenticationText);
    }
    public String verifyCreateAnAccountText(){
        log.info("Getting text from : " + createAccountText.toString());
        return getTextFromElement(createAccountText);
//        String expectedMessage = "CREATE AN ACCOUNT";
//        Assert.assertEquals(actualMessage,expectedMessage,"cant find create an account text");
    }

     public String verifyErrorMessage(){
         log.info("Getting text from : " + errorMessage.toString());
        return getTextFromElement(errorMessage);
//        String expectedMessage = myErrorMessage;
//        Assert.assertEquals(actualMessage,expectedMessage,"error message not displayed ");
    }
    public void mouseHoverAndClickOnLogOutButton(){
        mouseHoverToElementAndClick(logOut);
        log.info("Click on Log out : " + logOut.toString());
    }
    public void mouseHoverAndClickOnCreateAccount(){
        mouseHoverToElementAndClick(createAccountButton);
        log.info("Clicking on create an account button : " + createAccountButton.toString());
    }

    public String verifyTextFromLogOutButton(){
        log.info("Getting text from : " + logOut.toString());
     return  getTextFromElement(logOut);
     }

    public String verifySignInText(){

        log.info("Getting text from : " + signInButton.toString());
        return getTextFromElement(signInButton);
//        String expectedMessage = "Sign in";
//        Assert.assertEquals(actualMessage,expectedMessage,"cant find Sign In text");
    }
}
