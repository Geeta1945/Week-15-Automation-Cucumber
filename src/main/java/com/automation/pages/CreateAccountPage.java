package com.automation.pages;

import com.automation.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPage extends Utility {
    private static final Logger log = LogManager.getLogger(CreateAccountPage.class.getName());
    public CreateAccountPage() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath="//input[@id='email_create']")
    WebElement createAccount_EmailAddress;


    @FindBy(xpath="//label[@for='id_gender1']")
    WebElement genderTitle;


    @FindBy(xpath="//input[@id='customer_firstname']")
    WebElement firstName;


    @FindBy(xpath="//input[@id='customer_lastname']")
    WebElement lastName;


    @FindBy(xpath="//input[@id='passwd']")
    WebElement password;

    @FindBy(xpath="//select[@id='days']")
    WebElement days;



    @FindBy(xpath="//select[@id='months']")
    WebElement month;

    @FindBy(xpath="//select[@id='years']")
    WebElement year;


    @FindBy(xpath="//input[@id='address1']")
    WebElement address;

    @FindBy(xpath="//input[@id='city']")
    WebElement city;

    @FindBy(xpath = "//select[@id='id_state']")
    WebElement state;

    @FindBy(xpath="//input[@id='postcode']")
    WebElement postCode;


    @FindBy(xpath="//input[@id='phone']")
     WebElement homeNumber;

    @FindBy(xpath = "//input[@id='phone_mobile']")
    WebElement mobileNumber;

    @FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/div[4]/button[1]/span[1]")
    WebElement registerButton;

    @FindBy(xpath="//h1[contains(text(),'My account')]")
    WebElement verifyWelcomeText;

    //

    public void enter_createAccount_EmailAddress(String myEmail){
        sendTextToElement(createAccount_EmailAddress,myEmail);
        log.info("Entering email address : " + createAccount_EmailAddress.toString());
    }

    public void clickOnGenderButton(){
        clickOnElement(genderTitle);
        log.info("Clicking on gender button : " + genderTitle.toString());
    }
    public void enterFirstName(String myFirstName){
        sendTextToElement(firstName,myFirstName);
        log.info("Entering first name : " + firstName.toString());

    }
    public void enterLastName(String myLastName){
        sendTextToElement(lastName,myLastName);
        log.info("Entering last name : " + lastName.toString());

    }
    public void enterCreateAccountPassword(String myAccountPassword){
        sendTextToElement(password,myAccountPassword);
        log.info("Entering password: " + password.toString());

    }
    public void selectDaysFromDropDown(String day){

        selectByValueFromDropDown(days,day);
        log.info("Selecting days from dropdown" + days.toString());

    }
    public void selectMonthFromDropDown(String myMonth){

       selectByVisibleTextFromDropDown(month,myMonth);
        log.info("Selecting month from dropdown " + month.toString());
    }

    public void selectYearFromDropDown(String myYear){

        selectByValueFromDropDown(year,myYear);
        log.info("Selecting year from dropdown " + year.toString());
    }

    public void enterAddress(String myAddress){
        sendTextToElement(address,myAddress);
        log.info("Entering Address: " + address.toString());

    }
    public void enterCity(String myCity){

        sendTextToElement(city,myCity);
        log.info("Entering city: " + city.toString());

    }

    public void selectStateFromDropDown(String myState){

        selectByVisibleTextFromDropDown(state,myState);
        log.info("Entering state: " + state.toString());
    }

    public void enterPostcode(String myPostcode){
        sendTextToElement(postCode,myPostcode);
        log.info("Entering postcode: " + postCode.toString());

    }
    public void enterHomeNumber(String myHomeNo){
        sendTextToElement(homeNumber,myHomeNo);
        log.info("Entering home telephone number: " + homeNumber.toString());

    }
    public void enterMobileNumber(String myMobileNo){
        sendTextToElement(mobileNumber,myMobileNo);
        log.info("Entering Mobile number " + mobileNumber.toString());

    }
    public void clickOnRegisterButton(){

        clickOnElement(registerButton);
        log.info("Clicking on register button : " + registerButton.toString());

    }

    public String verifyMyAccountText(){
        log.info("Getting text from : " + verifyWelcomeText.toString());

        return getTextFromElement(verifyWelcomeText);
    }


}
