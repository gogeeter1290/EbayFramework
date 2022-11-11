package com.automation.test;

import com.automation.pages.LoginPage;
import com.automation.pages.LogoutPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Scanner;

public class BaseTest {


    WebDriver driver;
    LoginPage loginPage;
    LogoutPage logoutPage;
    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver" , "/Users/neguscollis/Desktop/Fall 2022/GoGetters/EbayFramework/src/test/resources/driver/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();
        loginPage = new LoginPage(driver);
        logoutPage = new LogoutPage(driver);
    }

    @AfterMethod
    public void cleanUp(){
        driver.quit();
    }



}
