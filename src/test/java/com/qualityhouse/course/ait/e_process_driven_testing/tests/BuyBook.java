package com.qualityhouse.course.ait.e_process_driven_testing.tests;

import com.qualityhouse.course.ait.e_process_driven_testing.pageobjects.BooksPageObject;
import com.qualityhouse.course.ait.e_process_driven_testing.pageobjects.CommonPageObjects;
import com.qualityhouse.course.ait.e_process_driven_testing.pageobjects.LoginPageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BuyBook {

    private WebDriver driver = new ChromeDriver();

    private LoginPageObject loginPage = new LoginPageObject(driver);

    private CommonPageObjects common = new CommonPageObjects(driver);

    private BooksPageObject bookPage = new BooksPageObject(driver);


    @BeforeMethod
    public void setup() { common.openApplication(); }

    @AfterMethod
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
