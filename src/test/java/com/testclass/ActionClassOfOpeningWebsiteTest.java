package com.testclass;

import com.sourceclass.OpeningGalvinusWebsiteTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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

    @Test(priority = 1)
    public void testWhatWeDoOption() throws InterruptedException {
       openingGalvinusWebsiteTest.navigateToWhatWeDo();
        Thread.sleep(2000);
    }

    @Test(priority = 2)
    public void testSystemTesting() throws InterruptedException {
        openingGalvinusWebsiteTest.selectSystemTesting();
    }

    @Test(priority = 3)
    public void testTitleOfThePage() throws InterruptedException {
        System.out.println(openingGalvinusWebsiteTest.getPageTitle());
    }

    @Test(priority = 4)
    public void testEnterDetails() throws InterruptedException {
        openingGalvinusWebsiteTest.enterDetails("Bhaskar", "basubhaskar14@gmail.com", "Galvinus", "India", "123456789");
        Thread.sleep(3000);
    }

    @Test(priority = 5)
    public void testClickOnLogo() {
        openingGalvinusWebsiteTest.clickOnLogo();
    }

    @AfterClass
    public void closeTheBrowser() {
        mDriver.quit();
    }
}
