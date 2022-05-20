package com.automation.pages;

import com.automation.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage(){
        PageFactory.initElements(driver,this);
    }
/*
1.HomePage -
WOMEN, DRESSES, T-SHIRTS and Sign in Links and logo locatores
and create appropriate methods for it.
 */
    @FindBy(xpath = "//a[@title='Women']")
    WebElement women;
    //
    @FindBy(xpath = "//a[@title='Dresses']")
    WebElement dresses;
    //
    @FindBy(xpath = "//a[@title='T-shirts']")
    WebElement t_shirts;
    @FindBy(xpath = "//a[contains(text(),'Sign in')]")
    WebElement signIn;

    public void clickOnWomen(){
        mouseHoverToElementAndClick(women);
        log.info("Clicking on women link : " + women.toString());}

    public void clickOnDresses(){

        mouseHoverToElementAndClick(dresses);
        log.info("Clicking on dresses link : " + dresses.toString());
    }
    public void clickOnT_Shirts(){
        mouseHoverToElementAndClick(t_shirts);
    }
    public void clickOnSignIn(){
        mouseHoverToElementAndClick(signIn);
        log.info("Clicking on sign in link : " + signIn.toString());


    }




}
