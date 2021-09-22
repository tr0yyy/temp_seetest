package com.qualityhouse.course.ait.structured_scripting.tests;

import com.qualityhouse.course.ait.structured_scripting.library.CommonLib;
import org.junit.*;
import org.openqa.selenium.WebDriver;

public class EditProfile {

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
    public void editProfileUser1() {
        // todo: Exercise no. 3.b - modify profile details of Student1

    }
}
