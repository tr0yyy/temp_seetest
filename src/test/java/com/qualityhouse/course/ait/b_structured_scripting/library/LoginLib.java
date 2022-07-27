package com.qualityhouse.course.ait.b_structured_scripting.library;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginLib {

    private final static Logger logger = LogManager.getLogger(LoginLib.class);

    // open login page
    public static void navigateToLoginPage(WebDriver driver) {
        logger.info("navigate to login page");

        driver.findElement(By.cssSelector("a[href='index.php?page=login']")).click();
    }

    // login in as given user, with provided username and password
    public static void loginAsUser(WebDriver driver, String username, String password) {
        logger.info("log in as user - username = " + username + ", password = " + password);

        driver.findElement(By.id("username")).sendKeys(username);

        driver.findElement(By.name("userpass")).sendKeys(password);

        driver.findElement(By.name("ses_login")).click();
    }

}
