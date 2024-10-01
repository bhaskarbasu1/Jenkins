package com.testclass;

import com.sourceclass.OpeningGalvinusWebsiteTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ActionClassOfOpeningWebsiteTest {

    public static WebDriver mDriver;
    public static OpeningGalvinusWebsiteTest openingGalvinusWebsiteTest;


    @BeforeClass
    public void initializers() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        mDriver = new ChromeDriver();
        openingGalvinusWebsiteTest = new OpeningGalvinusWebsiteTest(mDriver);
        mDriver.get("https://galvinus.com/");
        mDriver.manage().window().maximize();
    }

    @Test(priority = 1, description = "ETA-T1: Verify website main page title")
    public void pageTitle() {
        String actualTitle = openingGalvinusWebsiteTest.getMainPageTitle();
        String expectedTitle = "Galvinus - Transforming Businesses with Technology Solutions";
        Assert.assertEquals(actualTitle, expectedTitle, "Page title does not match!");
    }
}
