package com.sourceclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class OpeningGalvinusWebsiteTest {

    WebDriver mDriver;

    public OpeningGalvinusWebsiteTest(WebDriver driver){
        this.mDriver=driver;
    }

    By whatWeDoDropDown = By.xpath("//*[@id=\"menu-item-12230\"]/a");
    public By systemTestingOption = By.xpath("//*[@id=\"menu-item-12230\"]/div/div/div[1]/div/div[3]/div[2]/div[2]/div/ul/li/a/span");

    By nameField = By.id("form-field-name");
    By emailField = By.id("form-field-email");
    By companyField = By.xpath("//*[@id=\"form-field-field_d72975f\"]");
    By countryDropdown = By.xpath("//*[@id=\"form-field-field_73a7a64\"]");
    By phoneField = By.xpath("//*[@id=\"form-field-field_fb170dd\"]");
    By logo = By.xpath("//*[@id=\"Objects\"]");

    public void navigateToWhatWeDo() {
        Actions actions = new Actions(mDriver);
        WebElement element = mDriver.findElement(whatWeDoDropDown);
        actions.moveToElement(element).perform();
        element.click();
    }

    public void selectSystemTesting() {
        mDriver.findElement(systemTestingOption).click();
    }

    public String getPageTitle() {
        return mDriver.getTitle();
    }

    public void enterDetails(String name, String email, String company, String country, String phone) {
        mDriver.findElement(nameField).sendKeys(name);
        mDriver.findElement(emailField).sendKeys(email);
        mDriver.findElement(companyField).sendKeys(company);
        Select select = new Select(mDriver.findElement(countryDropdown));
        select.selectByValue(country);
        mDriver.findElement(phoneField).sendKeys(phone);
    }

    public void clickOnLogo() {
        mDriver.findElement(logo).click();
    }
}
