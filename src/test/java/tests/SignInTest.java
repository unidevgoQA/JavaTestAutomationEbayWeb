package tests;

import base.BaseTests;
import model.CommonMethods;
import model.Locators;
import model.Timout;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;

import static org.testng.Assert.assertEquals;

public class SignInTest {
    BaseTests baseTests = new BaseTests();
    WebDriver driver = baseTests.setUp();
    Timout timeout = new Timout();
    CommonMethods commonMethods = new CommonMethods(driver);
    HomePage homePage = new HomePage(driver);

    @BeforeClass
    public void setUp () {
        driver.get(homePage.homePageUrl());
        timeout.timeout();
        driver.manage().window().maximize();
    }

    @Test
    public void facebookLoginTest() {
        timeout.timeout();
        commonMethods.clickOnButton(Locators.signIn);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        timeout.timeout();
        commonMethods.clickOnButton(Locators.fbXPath);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertEquals(commonMethods.getTitle(), Locators.fbLoginPageTitle);
    }
    @Test
    public void googleLoginTest () {
        driver.navigate().back();
        timeout.timeout();
        commonMethods.clickOnButton(Locators.googleId);
        timeout.timeout();
        System.out.println(commonMethods.getTitle());
    }

    @AfterClass
    public void tearDown() {
        driver.navigate().back();
        timeout.timeout();
        //driver.quit();
    }
}
