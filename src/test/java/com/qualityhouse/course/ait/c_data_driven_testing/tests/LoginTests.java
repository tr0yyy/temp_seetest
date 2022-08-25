package com.qualityhouse.course.ait.c_data_driven_testing.tests;

import com.qualityhouse.course.ait.c_data_driven_testing.pageobjects.CommonPageObjects;
import com.qualityhouse.course.ait.c_data_driven_testing.pageobjects.LoginPageObject;
import com.qualityhouse.course.ait.c_data_driven_testing.support.User;
import com.qualityhouse.course.ait.c_data_driven_testing.support.Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class LoginTests {

    private WebDriver driver = new ChromeDriver();

    private LoginPageObject loginPage = new LoginPageObject(driver);

    private CommonPageObjects common = new CommonPageObjects(driver);

    @BeforeClass
    public void setup() { common.openApplication(); }

    @AfterClass
    public void tearDown() { common.closeApplication(); }

    @Test(dataProvider = "valid users", dataProviderClass = com.qualityhouse.course.ait.c_data_driven_testing.testdata.LoginTestData.class)
    public void tcLoginWithValidCredentials(User user) {
        loginPage.open();
        loginPage.populateUsername(user.getUsername());
        loginPage.populatePassword(user.getPassword());
        loginPage.login();
        Assert.assertTrue(Utils.isPresent(driver, common.menuLogout), "User is not logged in.");
        common.logout();
    }

    @Test(dataProvider = "invalid users", dataProviderClass = com.qualityhouse.course.ait.c_data_driven_testing.testdata.LoginTestData.class)
    public void tcLoginWithInvalidCredentials(User user) {
        loginPage.open();
        loginPage.populateUsername(user.getUsername());
        loginPage.populatePassword(user.getPassword());
        loginPage.login();
        Assert.assertTrue(Utils.isPresent(driver, common.menuLogin), "Login menu is not available.");
    }

}
