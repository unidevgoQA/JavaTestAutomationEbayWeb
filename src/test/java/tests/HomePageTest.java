package tests;

import base.BaseTests;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utils.Timout;

public class HomePageTest {
    BaseTests baseTests = new BaseTests();
    WebDriver driver = baseTests.setUp();
    Timout timeout = new Timout();

    @BeforeClass
    public void setUp () {
        timeout.timeout();
        driver.manage().window().maximize();
    }

    @Test
    public void homePageTest() {
        timeout.timeout();
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
