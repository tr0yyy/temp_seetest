package com.qualityhouse.course.ait.linear_scripting.login;

import org.junit.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginImproved {

    private WebDriver driver = new ChromeDriver();

    @Before
    public void setup() {
        driver.get("http://acme.qualityhouse.com/build3/index.php");

        driver.findElement(By.cssSelector("a[href='index.php?page=login']")).click();
    }

    @After
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

        Assert.assertTrue("User is not logged out.", driver.findElement(By.cssSelector("a[href='index.php?page=login']")).isDisplayed());
    }

    @Test
    public void tcLoginUser2 () {
        driver.findElement(By.id("username")).sendKeys("student2");

        driver.findElement(By.name("userpass")).sendKeys("stpass2");

        driver.findElement(By.name("ses_login")).click();

        driver.findElement(By.cssSelector("a[href='index.php?page=logout']")).click();

        driver.findElement(By.cssSelector("a.big-btn[href='index.php?ses_logout=1']")).click();

        Assert.assertTrue("User is not logged out.", driver.findElement(By.cssSelector("a[href='index.php?page=login']")).isDisplayed());
    }

    @Test
    public void tcLoginUser3 () {
        driver.findElement(By.id("username")).sendKeys("student3");

        driver.findElement(By.name("userpass")).sendKeys("stpass3");

        driver.findElement(By.name("ses_login")).click();

        driver.findElement(By.cssSelector("a[href='index.php?page=logout']")).click();

        driver.findElement(By.cssSelector("a.big-btn[href='index.php?ses_logout=1']")).click();

        Assert.assertTrue("User is not logged out.", driver.findElement(By.cssSelector("a[href='index.php?page=login']")).isDisplayed());
    }


    @Test
    public void tcLoginWithSeveralUsers() {
        // todo: Exercise no. 1.1 - perform login (and logout) of three users (student1, student2, student3), sequentially
        // note: use Before and After methods

    }

}
