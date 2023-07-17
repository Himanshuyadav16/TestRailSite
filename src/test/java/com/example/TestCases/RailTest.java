package com.example.TestCases;

import com.example.BaseClass;
import com.example.pages.BlogPage;
import com.example.pages.FormFillPage;
import com.example.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class RailTest extends BaseClass {
    @Test
    public void homePageTest() {
        WebDriver driver=getDriver();
        HomePage homePage=new HomePage(driver);
        homePage.homePage();
    }
    @Test
    public void blogTest() throws InterruptedException {
        WebDriver driver=getDriver();
        HomePage homePage=new HomePage(driver);
        homePage.homePage();
        homePage.blog();
        BlogPage blogPage=new BlogPage(driver);
        blogPage.blog();
    }
    @Test
    public void formPageTest() {
        WebDriver driver=getDriver();
        HomePage homePage=new HomePage(driver);
        homePage.homePage();
        homePage.formFill();
        FormFillPage formFillPage=new FormFillPage(driver);
        formFillPage.formFill();
    }

}
