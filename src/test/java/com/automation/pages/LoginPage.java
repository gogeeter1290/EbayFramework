package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {


    @FindBy(xpath = "//header/div[@id='gh-top']/ul[@id='gh-topl']/li[@id='gh-eb-u']/span[@id='gh-ug']/a[1]")
    WebElement signBtnMenu;
    @FindBy(xpath = "//input[@id='userid']")
    WebElement userName;
    @FindBy(xpath = "//button[@id='signin-continue-btn']")
    WebElement continueBtn;
    @FindBy(xpath = "//input[@id='pass']")
    WebElement password;
    @FindBy(xpath = "//button[@id='sgnBt']")
    WebElement signBtn;
    @FindBy(xpath = "//b[contains(text(),'Negus')]")
    WebElement userNameSignedIn;

    WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void doLogin() throws InterruptedException {
        signBtnMenu.click();
        userName.sendKeys("gogetters1290@gmail.com");
        continueBtn.click();
        Thread.sleep(5000);
        password.sendKeys("SlimandSlam#1");
        signBtn.click();
        Assert.assertTrue(userNameSignedIn.isDisplayed(), "Username is missing");
    }




}
