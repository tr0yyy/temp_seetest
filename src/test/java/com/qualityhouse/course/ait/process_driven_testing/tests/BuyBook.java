package com.qualityhouse.course.ait.process_driven_testing.tests;

import com.qualityhouse.course.ait.process_driven_testing.pageobjects.BooksPageObject;
import com.qualityhouse.course.ait.process_driven_testing.pageobjects.CommonPageObjects;
import com.qualityhouse.course.ait.process_driven_testing.pageobjects.LoginPageObject;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BuyBook {

    private WebDriver driver = new ChromeDriver();

    private LoginPageObject loginPage = new LoginPageObject(driver);

    private CommonPageObjects common = new CommonPageObjects(driver);

    private BooksPageObject bookPage = new BooksPageObject(driver);


    @Before
    public void setup() { common.openApplication(); }

    @After
    public void tearDown() {
        common.closeApplication();
    }

    @Test
    public void tcBuyBook() {
        /*
         todo: Exercise no. 1 - create a procedure, readable by end users, to buy a book
                loginSuccessfully();
                searchForBook();
                putTheBookInBasket();
                buyTheBook();
        */
    }

    @Test
    public void tcBuy3CopiesOfTheBook() {
        // todo: Exercise no. 2 - create a procedure, readable by end users, to buy several copies of one book

    }

}
