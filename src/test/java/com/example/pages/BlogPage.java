package com.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BlogPage extends BasePage {
    // @FindBy(xpath = "/html/body/section[2]/div/div/div[2]/a")
    @FindBy(xpath = "//*[contains(a,'Next »')]")
    //td[contains(text(),'template']"
  //  @FindBy(xpath ="//a[contains(text(),'Next »')]" )
    private WebElement nextButton;

    //@FindBy(xpath = "//*[contains(span,'Read the full blog')]")
    @FindBy(xpath ="/html/body/section[2]/div/div/div[1]/article[1]/div/div[2]/div[3]/a/span[1]")
    private WebElement readBlog;

    public BlogPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void blog() throws InterruptedException {
        Thread.sleep(3000);
     //  readBlog.click();
     //  nextButton.click();
    }

}