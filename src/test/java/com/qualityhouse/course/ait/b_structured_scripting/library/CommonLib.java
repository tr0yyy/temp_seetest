package com.qualityhouse.course.ait.b_structured_scripting.library;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonLib {

    private static final String applicationURL = "http://acme.qualityhouse.com/build3/index.php";

    private final static Logger logger = LogManager.getLogger(CommonLib.class);

    // initialize driver variable to use it in certain environment
    public static  WebDriver openBrowser() {
        logger.info("open Chrome browser");

        return new ChromeDriver();
    }

    // navigate to application's home url
    public static void navigateToApp(WebDriver driver) {
        logger.info("navigate to home url: " + applicationURL);

        driver.get(applicationURL);
    }

    // logout from the application
    public static void logoutFromApp(WebDriver driver) {
        logger.info("log out from the application");

        driver.findElement(By.cssSelector("a[href='index.php?page=logout']")).click();

        driver.findElement(By.cssSelector("a.big-btn[href='index.php?ses_logout=1']")).click();
    }

    // close driver (browser)
    public static void closeBrowser(WebDriver driver) {
        logger.info("close all open browser windows");

        driver.quit();
    }

}
