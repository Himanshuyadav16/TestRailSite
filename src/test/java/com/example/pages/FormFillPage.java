package com.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FormFillPage extends BasePage{
    @FindBy(id = "first_name")
    private WebElement firstName;

    @FindBy(id = "last_name")
    private WebElement lastName;

    @FindBy(id = "email")
    private WebElement email;

    @FindBy(id = "phone")
    private WebElement phoneNumber;

    @FindBy(id = "organization")
    private WebElement organization;

    @FindBy(name = "cm-f-sdybl")
    private WebElement country;

    @FindBy(id = "users")
    private WebElement users;

    @FindBy(id = "hostname")
    private  WebElement hostName;

    @FindBy(id = "tos")
    private  WebElement checkboxTos;

    @FindBy(id = "gdpr")
    private  WebElement checkboxGdpr;

    @FindBy(className = "btn-trial")
    private WebElement createAccount;

    public FormFillPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);
    }
    public  void formFill(){
        firstName.sendKeys("userName");
        lastName.sendKeys("lastName");
        email.sendKeys("username12@gmail.com");
        phoneNumber.sendKeys("8978897067");
        organization.sendKeys("google.com");

        Select dropDownCountry = new Select(country);
        dropDownCountry.selectByVisibleText("Bangladesh");

        Select dropDownUser= new Select(users);
        dropDownUser.selectByValue("5");
        hostName.sendKeys("https://www.quackit.com/web_hosting/domain_names.cfm");
        checkboxTos.click();
        checkboxGdpr.click();
        createAccount.click();
    }

}
