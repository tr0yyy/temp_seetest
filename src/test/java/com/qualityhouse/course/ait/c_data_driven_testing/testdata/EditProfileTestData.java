package com.qualityhouse.course.ait.c_data_driven_testing.testdata;

import com.qualityhouse.course.ait.c_data_driven_testing.support.User;
import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.List;

public class EditProfileTestData {

    @DataProvider(name = "valid users")
    public static Object[][] validUsersDP() {
        return new Object[][] {
                new Object[] { new User("student1", "stpass1", "Student One", "student1@example.com", "+111", "Student Str. 1") },
                new Object[] { new User("student2", "stpass2", "Student Two", "student2@example.com", "+222", "Student Str. 2") },
                new Object[] { new User("student3", "stpass3", "Student Three", "student3@example.com", "+333", "Student Str. 3") },
                new Object[] { new User("student4", "stpass4", "Student Four", "student4@example.com", "+444", "Student Str. 4") },
                new Object[] { new User("student5", "stpass5", "Student Five", "student5@example.com", "+555", "Student Str. 5") }
        };
    }

    // todo: Exercise - define list of invalid user profile details

}
