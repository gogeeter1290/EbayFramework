package com.automation.test;

import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

    @Test
    public void login() throws InterruptedException {
        loginPage.doLogin();
    }



}
