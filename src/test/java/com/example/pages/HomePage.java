package com.example.pages;

import com.example.utils.ApplicationProperties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends  BasePage{
    public String baseUrl= ApplicationProperties.INSTANCE.getUrl();

    public HomePage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public void homePage(){
        driver.get(baseUrl);

    }

}
