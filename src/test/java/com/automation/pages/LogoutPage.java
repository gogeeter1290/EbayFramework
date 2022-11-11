package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class LogoutPage {

    @FindBy(xpath = "//button[@id='gh-ug']")
    WebElement signOutMenu;
    @FindBy(xpath = "//a[contains(text(),'Sign out')]")
    WebElement signOutBtn;
    @FindBy(xpath = "//h1[contains(text(),\"You've signed out.\")]")
    WebElement signOutText;


    WebDriver driver;

    public LogoutPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }




    public void doLogout() throws InterruptedException {
        Actions actions = new Actions(driver);
        actions.moveToElement(signOutMenu).perform();
        Thread.sleep(3000);
        signOutBtn.click();
        Assert.assertTrue(signOutText.isDisplayed(), "SignOut text is missing");
    }




}
