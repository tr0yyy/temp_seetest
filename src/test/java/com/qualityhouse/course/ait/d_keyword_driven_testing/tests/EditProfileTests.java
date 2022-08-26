package com.qualityhouse.course.ait.d_keyword_driven_testing.tests;

import com.qualityhouse.course.ait.d_keyword_driven_testing.pageobjects.CommonPageObjects;
import com.qualityhouse.course.ait.d_keyword_driven_testing.pageobjects.EditProfilePageObject;
import com.qualityhouse.course.ait.d_keyword_driven_testing.pageobjects.LoginPageObject;
import com.qualityhouse.course.ait.d_keyword_driven_testing.testdata.EditProfileTestData;
import com.qualityhouse.course.ait.d_keyword_driven_testing.testdata.LoginTestData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class EditProfileTests {

    private WebDriver driver = new ChromeDriver();

    private LoginPageObject loginPage = new LoginPageObject(driver);

    private CommonPageObjects common = new CommonPageObjects(driver);

    private EditProfilePageObject editProfilePage = new EditProfilePageObject(driver);

    @BeforeClass
    public void setup() { common.openApplication(); }

    @AfterClass
    public void tearDown() {
        common.closeApplication();
    }

    @Test
    public void tcModifyUserProfileDetailsDirect() {
        loginPage.loginAs("student3", "stpass3");

        editProfilePage.open();

        editProfilePage.modifyProfileDetails("student3@example.com", "Student Three", "+333333","Student Street 3");

        common.logout();
    }


    @Test
    public void tcModifyUserProfileDetailsIndirect() {
        loginPage.loginAs(LoginTestData.validUsers.get(1).getUsername(), LoginTestData.validUsers.get(1).getPassword());

        editProfilePage.open();

        editProfilePage.modifyProfileDetailsOf(EditProfileTestData.validUsers.get(1));

        common.logout();
    }


    @Test
    public void tcModifyUserProfileDetailsWithValidDetails() {
        loginPage.loginWithValidCredentials();

        editProfilePage.open();

        editProfilePage.modifyProfileWithValidDetails();

        common.logout();
    }

}
