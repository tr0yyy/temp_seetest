package com.qualityhouse.course.ait.b_structured_scripting.tests;

import com.qualityhouse.course.ait.b_structured_scripting.library.CommonLib;
import com.qualityhouse.course.ait.b_structured_scripting.library.LoginLib;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests {

    private WebDriver driver;

    @BeforeMethod
    public void startUp() {
        driver = CommonLib.openBrowser();

        CommonLib.navigateToApp(driver);
    }

    @AfterMethod
    public void tearDown() {
        CommonLib.closeBrowser(driver);
    }

    @Test
    public void tcLoginUser1 () {
        LoginLib.navigateToLoginPage(driver);

        LoginLib.loginAsUser(driver, "student1", "stpass1");

        CommonLib.logoutFromApp(driver);

        Assert.assertTrue(driver.findElement(By.cssSelector("a[href='index.php?page=login']")).isDisplayed(), "User is not logged out.");
    }

    @Test
    public void tcLoginUser2 () {
        LoginLib.navigateToLoginPage(driver);

        LoginLib.loginAsUser(driver, "student2", "stpass2");

        CommonLib.logoutFromApp(driver);

        Assert.assertTrue(driver.findElement(By.cssSelector("a[href='index.php?page=login']")).isDisplayed(), "User is not logged out.");
    }

    @Test
    public void tcLoginUser3 () {
        LoginLib.navigateToLoginPage(driver);

        LoginLib.loginAsUser(driver, "student3", "stpass3");

        CommonLib.logoutFromApp(driver);

        Assert.assertTrue(driver.findElement(By.cssSelector("a[href='index.php?page=login']")).isDisplayed(), "User is not logged out.");
    }

    @Test
    public void tcTooManyUnsuccessfulLogins() {
        // todo: Exercise no. 1 - login 3 times with username student1 by using wrong password; check for warning message
        for(int i = 1 ; i <= 3 ; i++) {
        LoginLib.navigateToLoginPage(driver);
            LoginLib.loginAsUser(driver, "student1", "wrong_password");
            Assert.assertTrue(driver.findElement(By.cssSelector("a[href='index.php?page=login']")).isDisplayed(), "User has logged in.");
        }
    }

    @Test
    public void tcLoginWithSeveralUsers() {
        // todo: Exercise no. 2 - perform login (and logout) of three users (student1, student2, student3), sequentially
        for(int i = 1 ; i <= 3 ; i++) {
            LoginLib.navigateToLoginPage(driver);
            LoginLib.loginAsUser(driver, "student" + i, "stpass" + i);
            CommonLib.logoutFromApp(driver);
            Assert.assertTrue(driver.findElement(By.cssSelector("a[href='index.php?page=login']")).isDisplayed(), "User has logged in.");
        }

    }

}
