package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class WebUniPage {

    public WebUniPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[text()='CONTACT US']")
    public WebElement contactUsButonu;

    @FindBy(xpath = "//*[text()='LOGIN PORTAL']")
    public WebElement loginPortalButonu;

    @FindBy(xpath = "//input[@id='text']")
    public WebElement usernameKutusu;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordKutusu;

    @FindBy(xpath = "//*[@id='login-button']")
    public WebElement loginButonu;
}

