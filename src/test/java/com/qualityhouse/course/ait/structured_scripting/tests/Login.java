package com.qualityhouse.course.ait.structured_scripting.tests;

import com.qualityhouse.course.ait.structured_scripting.library.CommonLib;
import com.qualityhouse.course.ait.structured_scripting.library.LoginLib;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {

    private WebDriver driver;

    @Before
    public void startUp() {
        driver = CommonLib.openBrowser();

        CommonLib.navigateToApp(driver);
    }

    @After
    public void tearDown() {
        CommonLib.closeBrowser(driver);
    }

    @Test
    public void tcLoginUser1 () {
        LoginLib.navigateToLoginPage(driver);

        LoginLib.loginAsUser(driver, "student1", "stpass1");

        CommonLib.logoutFromApp(driver);

        Assert.assertEquals("User is not logged out.", true, driver.findElement(By.cssSelector("a[href='index.php?page=login']")).isDisplayed());
    }

    @Test
    public void tcLoginUser2 () {
        LoginLib.navigateToLoginPage(driver);

        LoginLib.loginAsUser(driver, "student2", "stpass2");

        CommonLib.logoutFromApp(driver);

        Assert.assertEquals("User is not logged out.", true, driver.findElement(By.cssSelector("a[href='index.php?page=login']")).isDisplayed());
    }

    @Test
    public void tcLoginUser3 () {
        LoginLib.navigateToLoginPage(driver);

        LoginLib.loginAsUser(driver, "student3", "stpass3");

        CommonLib.logoutFromApp(driver);

        Assert.assertEquals("User is not logged out.", true, driver.findElement(By.cssSelector("a[href='index.php?page=login']")).isDisplayed());
    }

    @Test
    public void tcTooManyUnsuccessfulLogins() {
        // todo: Exercise no. 1 - login 3 times with username student1 by using wrong password; check for warning message

   }

    @Test
    public void tcLoginWithSeveralUsers() {
        // todo: Exercise no. 2 - perform login (and logout) of three users (student1, student2, student3), sequentially

    }

}
