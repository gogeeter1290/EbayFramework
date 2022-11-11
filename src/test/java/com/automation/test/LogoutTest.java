package com.automation.test;

import org.testng.annotations.Test;

public class LogoutTest extends BaseTest{

    @Test
    public void logOut() throws InterruptedException {
        loginPage.doLogin();
        logoutPage.doLogout();

    }
}
