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

public class HomePageElements {
    BaseTests baseTests = new BaseTests();
    WebDriver driver = baseTests.setUp();
    Timout timeout = new Timout();
    CommonMethods commonMethods = new CommonMethods(driver);
    HomePage homePage = new HomePage(driver);

    @BeforeClass
    public void setUp () {
        driver.manage().window().maximize();
        driver.get(homePage.homePageUrl());
    }

    @Test
    public void dailyDealsTest () {
        timeout.timeout();
        commonMethods.clickOnButton(Locators.dailyDeals);
        timeout.timeout();
        String deals = commonMethods.getText(Locators.deals);
        assertEquals(deals, Locators.dealsText);
        System.out.println("Successfully visit " + deals);
    }

    @Test
    public void helpAndContact () {
        driver.navigate().back();
        timeout.timeout();
        commonMethods.clickOnButton(Locators.helpAndContact);
        timeout.timeout();
        String customerAndServicesText = commonMethods.getText(Locators.customerServiceId);
        assertEquals(customerAndServicesText, Locators.customerServicesText);
        System.out.println("Successfully visit " + customerAndServicesText);
    }
    @Test
    public void sellTest () {
        driver.navigate().back();
        timeout.timeout();
        commonMethods.clickOnButton(Locators.sell);
        timeout.timeout();
        System.out.println(commonMethods.getTitle());

    }
    @AfterClass
    public void tearDown() {
        driver.navigate().back();
        timeout.timeout();
        driver.quit();
    }
}
