package model;

import org.openqa.selenium.By;

public class Locators {

    public static String homePageUrl = "https://www.ebay.com/";
    public static String fbLoginPageTitle = "Log in to Facebook | Facebook";

    public static By deals = By.linkText("Deals");
    public static By customerServiceId = By.id("gh-title");
    public static String dealsText = "Deals";
    public static String customerServicesText = "Customer Service";

    public static By signIn = By.linkText("Sign in");
    //public static By fbId = By.id("signin_fb_btn");
    public static By fbXPath = By.xpath("//*[@id='signin_fb_btn']");
    public static By googleId = By.id("signin_ggl_btn");

    public static By dailyDeals = By.linkText("Daily Deals");
    public static By helpAndContact = By.linkText("Help & Contact");
    public static By sell = By.linkText("Sell");

}
