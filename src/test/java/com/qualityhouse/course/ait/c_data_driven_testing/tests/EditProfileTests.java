package com.qualityhouse.course.ait.c_data_driven_testing.tests;

import com.qualityhouse.course.ait.c_data_driven_testing.pageobjects.CommonPageObjects;
import com.qualityhouse.course.ait.c_data_driven_testing.pageobjects.EditProfilePageObject;
import com.qualityhouse.course.ait.c_data_driven_testing.pageobjects.LoginPageObject;
import com.qualityhouse.course.ait.c_data_driven_testing.support.User;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EditProfileTests {

    private WebDriver driver = new ChromeDriver();

    private LoginPageObject loginPage = new LoginPageObject(driver);

    private CommonPageObjects common = new CommonPageObjects(driver);

    private EditProfilePageObject editProfilePage = new EditProfilePageObject(driver);

    @BeforeMethod
    public void setup() { common.openApplication(); }

    @AfterMethod
    public void tearDown() {
        common.closeApplication();
    }

    @Test(dataProvider = "valid users", dataProviderClass = com.qualityhouse.course.ait.c_data_driven_testing.testdata.EditProfileTestData.class)
    public void tcEditProfileWithValidData(User user) {
        // todo: Exercise no. 3 - create "main test script" for the valid modification of user's profile

    }

    @Test
    public void tcEditProfileWithInvalidData() {
        // todo: Exercise no. 4.b - create "main test script" for the invalid modification of user's profile
        // hint: driver.switchTo().alert().dismiss()

    }

}
