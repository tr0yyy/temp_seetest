package com.qualityhouse.course.ait.c_data_driven_testing.tests;

import com.qualityhouse.course.ait.c_data_driven_testing.pageobjects.CommonPageObjects;
import com.qualityhouse.course.ait.c_data_driven_testing.pageobjects.EditProfilePageObject;
import com.qualityhouse.course.ait.c_data_driven_testing.pageobjects.LoginPageObject;
import com.qualityhouse.course.ait.c_data_driven_testing.support.User;
import com.qualityhouse.course.ait.c_data_driven_testing.support.Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
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

    @Test(dataProvider = "valid users", dataProviderClass = com.qualityhouse.course.ait.c_data_driven_testing.testdata.EditProfileTestData.class)
    public void tcEditProfileWithValidData(User user) {
        // todo: Exercise no. 3 - create "main test script" for the valid modification of user's profile
        loginPage.open();
        loginPage.populateUsername(user.getUsername());
        loginPage.populatePassword(user.getPassword());
        loginPage.login();
        Assert.assertTrue(Utils.isPresent(driver, common.menuLogout), "User is not logged in.");
        common.openEditProfilePage();
        Assert.assertTrue(Utils.isPresent(driver, editProfilePage.buttonSubmit), "Cannot access edit page.");
        editProfilePage.populateName(user.getName());
        editProfilePage.populateAddress(user.getAddress());
        editProfilePage.populatePhone(user.getPhone());
        editProfilePage.populateEmail(user.getEmail());
        editProfilePage.submitProfileDetails();

        common.openEditProfilePage();
        Assert.assertTrue(Utils.isPresent(driver, editProfilePage.buttonSubmit), "Cannot access edit page.");
        Assert.assertEquals(user.getName(), driver.findElement(editProfilePage.txtName).getAttribute("value"), "Name not saved");
        Assert.assertEquals(user.getAddress(), driver.findElement(editProfilePage.txtAddress).getAttribute("value"), "Address not saved");
        Assert.assertEquals(user.getEmail(), driver.findElement(editProfilePage.txtEmail).getAttribute("value"), "Email not saved");
        Assert.assertEquals(user.getPhone(), driver.findElement(editProfilePage.txtPhone).getAttribute("value"), "Phone not saved");

        common.logout();

    }

    @Test
    public void tcEditProfileWithInvalidData() {
        // todo: Exercise no. 4.b - create "main test script" for the invalid modification of user's profile
        // hint: driver.switchTo().alert().dismiss()

    }

}
