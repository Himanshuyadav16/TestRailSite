package com.example.pages;

import com.example.utils.ApplicationProperties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
    public String baseUrl = ApplicationProperties.INSTANCE.getUrl();
    @FindBy(xpath = "//*[contains(button,'Resources')]")
    private WebElement resource;

    @FindBy(xpath = "//*[contains(span,'Blog')]")
    private WebElement blog;

    @FindBy(xpath = "//*[@id='menu-102']/div/a/span")
    private WebElement formFill;

    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void homePage() {
        driver.get(baseUrl);
        Actions actions = new Actions(driver);
        actions.moveToElement(resource).perform();

    }

    public void blog() throws InterruptedException {
        Actions actions = new Actions(driver);
        actions.moveToElement(resource).perform();
        Thread.sleep(3000);
        blog.click();
    }

    public void formFill() {
        formFill.click();

    }

}
