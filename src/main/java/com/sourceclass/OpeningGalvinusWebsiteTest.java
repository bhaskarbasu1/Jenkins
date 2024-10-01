package com.sourceclass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OpeningGalvinusWebsiteTest {

    WebDriver mDriver;

    public OpeningGalvinusWebsiteTest(WebDriver driver) {

        this.mDriver = driver;
    }

    public By whatWeDoDropDown = By.xpath("//*[@id=\"menu-item-12230\"]/a");
    public By systemTestingOption = By.xpath("//*[@id=\"menu-item-12230\"]/div/div/div[1]/div/div[3]/div[2]/div[2]/div/ul/li/a/span");

    By nameField = By.id("form-field-name");
    By emailField = By.id("form-field-email");
    By companyField = By.xpath("//*[@id=\"form-field-field_d72975f\"]");
    By countryDropdown = By.xpath("//*[@id=\"form-field-field_73a7a64\"]");
    By phoneField = By.xpath("//*[@id=\"form-field-field_fb170dd\"]");
    By logo = By.xpath("//*[@id=\"Objects\"]");

    public String getMainPageTitle() {
        return mDriver.getTitle();

    }
}
