package com.qualityhouse.course.ait.d_keyword_driven_testing.tests;

import com.qualityhouse.course.ait.d_keyword_driven_testing.pageobjects.BooksPageObject;
import com.qualityhouse.course.ait.d_keyword_driven_testing.pageobjects.CommonPageObjects;
import com.qualityhouse.course.ait.d_keyword_driven_testing.pageobjects.LoginPageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class FindBook {

    private WebDriver driver = new ChromeDriver();

    private LoginPageObject loginPage = new LoginPageObject(driver);

    private CommonPageObjects common = new CommonPageObjects(driver);

    private BooksPageObject bookPage = new BooksPageObject(driver);


    @BeforeClass
    public void setup() { common.openApplication(); }

    @AfterClass
    public void tearDown() {
        common.closeApplication();
    }

    @Test
    public void tcVerifyIfBookIsInSearchResult() {
        loginPage.loginWithValidCredentials();

        bookPage.openBooks();

        // todo: implement this keyword
        bookPage.searchForBook("", "", "Nature Books Ltd.", "");

        Assert.assertTrue(bookPage.isBookInList("Autumn Colors"), "Book is not in the list!");
    }

    @Test
    public void tcVerifyDetailsOfFoundBook() {
        // todo: Exercise no. 2 - search for a book with title "The miracles of the Nature" and list its details

        bookPage.openBooks();

        bookPage.searchForBook("", "The miracles of the Nature", "", "");

        Assert.assertTrue(bookPage.isBookInList("The miracles of the Nature"), "Book is not in the list!");

        bookPage.clickOnBook("The miracles of the Nature");

        Assert.assertTrue(bookPage.isDetailsBookOpened("The miracles of the Nature"), "Book Details are not opened");

    }

    @Test
    public void tcVerifyBookPrice() {
        // todo: Exercise no. 3 - develop keyword to easy verify given book price
    }
}
