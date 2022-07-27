package com.qualityhouse.course.ait.a_linear_scripting.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginImprovedTests {

    private WebDriver driver = new ChromeDriver();

    @BeforeMethod
    public void setup() {
        driver.get("http://acme.qualityhouse.com/build3/index.php");

        driver.findElement(By.cssSelector("a[href='index.php?page=login']")).click();
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }

    @Test
    public void tcLoginUser1 () {
        driver.findElement(By.id("username")).sendKeys("student1");

        driver.findElement(By.name("userpass")).sendKeys("stpass1");

        driver.findElement(By.name("ses_login")).click();

        driver.findElement(By.cssSelector("a[href='index.php?page=logout']")).click();

        driver.findElement(By.cssSelector("a.big-btn[href='index.php?ses_logout=1']")).click();

        Assert.assertTrue(driver.findElement(By.cssSelector("a[href='index.php?page=login']")).isDisplayed(), "User is not logged out.");
    }

    @Test
    public void tcLoginUser2 () {
        driver.findElement(By.id("username")).sendKeys("student2");

        driver.findElement(By.name("userpass")).sendKeys("stpass2");

        driver.findElement(By.name("ses_login")).click();

        driver.findElement(By.cssSelector("a[href='index.php?page=logout']")).click();

        driver.findElement(By.cssSelector("a.big-btn[href='index.php?ses_logout=1']")).click();

        Assert.assertTrue(driver.findElement(By.cssSelector("a[href='index.php?page=login']")).isDisplayed(), "User is not logged out.");
    }

    @Test
    public void tcLoginUser3 () {
        driver.findElement(By.id("username")).sendKeys("student3");

        driver.findElement(By.name("userpass")).sendKeys("stpass3");

        driver.findElement(By.name("ses_login")).click();

        driver.findElement(By.cssSelector("a[href='index.php?page=logout']")).click();

        driver.findElement(By.cssSelector("a.big-btn[href='index.php?ses_logout=1']")).click();

        Assert.assertTrue(driver.findElement(By.cssSelector("a[href='index.php?page=login']")).isDisplayed(), "User is not logged out.");
    }


    @Test
    public void tcLoginWithSeveralUsers() {
        // todo: Exercise no. 1.1 - perform login (and logout) of three users (student1, student2, student3), sequentially
        // note: apply Before and After methods

    }

}
