package com.automation.pages;

import com.automation.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class WomenCategoryPage extends Utility {
    private static final Logger log = LogManager.getLogger(CreateAccountPage.class.getName());
    public WomenCategoryPage(){
        PageFactory.initElements(driver,this);
    }


    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[1]/a[1]")
    WebElement womenTab;

    @FindBy(xpath = "//span[@class='cat-name']")
    WebElement womenText;
    @FindBy(xpath = "//input[@id='quantity_wanted']")
    WebElement qty_Wanted;

    @FindBy(xpath = "//select[@id='group_1']")
    WebElement size;
    @FindBy(xpath = "//a[@id='color_8']")
    WebElement colourWhite;
    @FindBy(xpath = "//a[@id='color_11']")
    WebElement colourBlack;
    @FindBy(xpath = "//span[contains(text(),'Add to cart')]")
    WebElement addToCartButton;
    @FindBy(xpath = "//a[@id='color_13']")
    WebElement orange;
    @FindBy(xpath = "//a[@id='color_15']")
    WebElement green;

    @FindBy(xpath="//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[2]/div[1]/div[2]/h5[1]/a[1]")
    WebElement blouse;

    @FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[2]/ul[1]/li[3]/div[1]/div[2]/h5[1]/a[1]")
    WebElement printedDress;
    @FindBy(xpath = "//a[contains(text(),'Faded Short Sleeve T-shirts')]")
    WebElement fadedShortSleeve;
    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[4]/div[1]/div[1]/div[1]/a[1]/img[1]")
    WebElement black_PrintedDress;
    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[5]/div[1]/div[2]/h5[1]/a[1]")
    WebElement yellow_SummerDress;
    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[6]/div[1]/div[2]/h5[1]/a[1]")
    WebElement black_SummerDress ;
    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[7]/div[1]/div[2]/h5[1]/a[1]")
    WebElement chiffonDress;

    @FindBy(xpath = "//div[@class='layer_cart_product col-xs-12 col-md-6']")
    WebElement successfullyAdded_Message;

    @FindBy(xpath="//span[@title='Close window']")
    WebElement closeButton;

    public void clickOnWomenTab(){

        mouseHoverToElementAndClick(womenTab);
        log.info("Clicking on Woman tab : " + womenTab.toString());
    }

    public String getWomenText(){
        log.info("Getting women text from : " + womenText.toString());
        return getTextFromElement(womenText);
    }
    public void clickProduct(String text){

        if(text.equalsIgnoreCase("Faded Short Sleeve T-shirts")){

            clickOnElement(fadedShortSleeve);
            log.info("Clicking on faded short sleeve T-shirts : " + fadedShortSleeve.toString());

        }

        else if(text.equalsIgnoreCase("Blouse")){

            clickOnElement(blouse);
            log.info("Clicking on faded short sleeve T-shirts : " + blouse.toString());
        }

        else if(text.equalsIgnoreCase("Printed Dress")){

            clickOnElement(printedDress);
            log.info("Clicking on Printed Dress: " + printedDress.toString());
        }
        else if (text.equalsIgnoreCase("Printed Chiffon Dress")){

            clickOnElement(chiffonDress);
            log.info("Clicking on chiffonDress : " + chiffonDress.toString());
        }
        else if (text.equalsIgnoreCase("Printed Summer Dress with Price $28.98")){

            clickOnElement(yellow_SummerDress);
            log.info("Clicking on yellow summer dress : " + yellow_SummerDress.toString());
        }
    }


//
    public void clearQty(){
      qty_Wanted.clear();

    }
    public void enterQtyWanted(String qty){
    sendTextToElement(qty_Wanted,qty);
        log.info("Entering quantity wanted: " + qty_Wanted.toString());

    }
    public void enterSize(String mySize){

        selectByVisibleTextFromDropDown(size,mySize);
        log.info("Selecting size from drop down : "+size.toString());
    }
    public void selectColour(String myColour){


        if (myColour.equalsIgnoreCase("White"))
        {
            clickOnElement(colourWhite);
            log.info("Clicking on white colour tab : " + colourWhite.toString());

        }
        else if(myColour.equalsIgnoreCase("Black"))
        {
            clickOnElement(colourBlack);
            log.info("Clicking on black colour tab : " + colourBlack.toString());
        }
        else if(myColour.equalsIgnoreCase("Orange"))
        {

            clickOnElement(orange);
            log.info("Clicking on orange colour tab : " + orange.toString());
        }
        else if(myColour.equalsIgnoreCase("Green"))
        {
            clickOnElement(green);
            log.info("Clicking on green colour tab : " + green.toString());
        }


    }
    public void clickOn_AddToCart(){

        clickOnElement(addToCartButton);
        log.info("Clicking on add to cart button : " + addToCartButton.toString());
    }
    public String getSuccessfullyAdded_Message(){
        log.info("Getting successfully added message : "+successfullyAdded_Message.toString());
        return getTextFromElement(successfullyAdded_Message).substring(0,48);

    }
    public void clickOnCloseButton(){

        clickOnElement(closeButton);
        log.info("Clicking on close button : " + closeButton.toString());

    }


}
