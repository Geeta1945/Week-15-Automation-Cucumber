package com.automation.testsuite;

import com.automation.pages.HomePage;
import com.automation.pages.SignInPage;
import com.automation.pages.WomenCategoryPage;
import com.automation.testbase.TestBase;
import com.automation.utility.Utility;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import resources.testdata.ProductsData;

public class WomenCategoryPageTest extends TestBase {

    HomePage homePage;
    SignInPage signInPage;
    WomenCategoryPage womenCategoryPage;

    @BeforeMethod
    public void inIt() {
        homePage = new HomePage();
        signInPage = new SignInPage();
        womenCategoryPage = new WomenCategoryPage();
    }



    @Test
    public void verifyUserShouldNavigateToWomenCategoryPageSuccessfully() throws InterruptedException {

        womenCategoryPage.clickOnWomenTab();
        String actualMessage =  womenCategoryPage.getWomenText();
        Thread.sleep(1000);
        Assert.assertEquals(actualMessage,"Women","You are not on women page");
    }



    @Test(dataProvider = "products",dataProviderClass = ProductsData.class)
    public void verifyUserShouldAddProductToTheCartSuccessfully(String product, String qty, String
            size, String colour) throws InterruptedException {
        Thread.sleep(2000);
        womenCategoryPage.clickOnWomenTab();
        Thread.sleep(5000);
        womenCategoryPage.clickProduct(product);
        womenCategoryPage.enterQtyWanted(qty);
        Thread.sleep(2000);
        womenCategoryPage.enterSize(size);
        Thread.sleep(2000);
        womenCategoryPage.selectColour(colour);
        Thread.sleep(2000);
        womenCategoryPage.clickOn_AddToCart();
        Thread.sleep(7000);
        String actualMessage = womenCategoryPage.getSuccessfullyAdded_Message();
        System.out.println(actualMessage);
        //actualMessage,"","Product not added to cart."
        Assert.assertEquals(actualMessage,"Product successfully added to your shopping cart");

        womenCategoryPage.clickOnCloseButton();
        Thread.sleep(2000);
    }
}
