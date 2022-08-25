package com.qualityhouse.course.ait.c_data_driven_testing.testdata;

import java.util.ArrayList;
import java.util.List;
import com.qualityhouse.course.ait.c_data_driven_testing.support.User;
import org.testng.annotations.DataProvider;

public class LoginTestData {

    @DataProvider(name = "valid users")
    public static Object[][] validUsersDP() {
        return new Object[][] {
                new Object[] { new User("student1","stpass1") },
                new Object[] { new User("student2","stpass2") },
                new Object[] { new User("student3","stpass3") },
                new Object[] { new User("student4","stpass4") },
                new Object[] { new User("student5","stpass5") }
        };
    }

    @DataProvider(name = "invalid users")
    public static Object[][] invalidUsersDP() {
        return new Object[][] {
                new Object[] { new User("","some password") },
                new Object[] { new User("student2","") },
                new Object[] { new User("student3","wrong") }
        };
    }

}
