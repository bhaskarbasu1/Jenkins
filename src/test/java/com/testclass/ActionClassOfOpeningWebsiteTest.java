package com.testclass;

import com.sourceclass.OpeningGalvinusWebsiteTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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

    @Test(priority = 1, description = "SCRUM-T1: Verify 'What We Do' option")
    public void testWhatWeDoOption() throws InterruptedException {

        openingGalvinusWebsiteTest.navigateToWhatWeDo();

    }

    @Test(priority = 2, description = "SCRUM-T1: Select 'System Testing'")
    public void testSystemTesting() throws InterruptedException {
        openingGalvinusWebsiteTest.selectSystemTesting();

    }

    @Test(priority = 3, description = "SCRUM-T1: Verify page title")
    public void testTitleOfThePage() throws InterruptedException {
        System.out.println(openingGalvinusWebsiteTest.getPageTitle());
        Thread.sleep(3000);
    }

    @Test(priority = 4, description = "SCRUM-T1: Enter details in the form")
    public void testEnterDetails() {
        openingGalvinusWebsiteTest.enterDetails("Bhaskar", "basubhaskar14@gmail.com", "Galvinus", "India", "123456789");
    }

    @Test(priority = 5, description = "SCRUM-T1: Click on the Galvinus logo")
    public void testClickOnLogo() {

        openingGalvinusWebsiteTest.clickOnLogo();
    }

    @AfterClass
    public void closeTheBrowser() {
        mDriver.quit();
    }
}
