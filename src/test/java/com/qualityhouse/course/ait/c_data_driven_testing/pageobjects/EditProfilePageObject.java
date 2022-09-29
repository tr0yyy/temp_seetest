package com.qualityhouse.course.ait.c_data_driven_testing.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EditProfilePageObject {

    private WebDriver driver;

    public EditProfilePageObject (WebDriver driver) {
        this.driver = driver;
    }

    /* list of page components */
    // todo: Exercise no. 2.a - list necessary  page components

    public By txtEmail = By.name("cEmail");

    public By txtName = By.name("cName");

    public By txtPhone = By.name("cPhone");

    public By txtAddress = By.name("cAddress");

    public By buttonSubmit = By.xpath("//input[@type='submit']");


    /* list of page actions */
    // todo: Exercise no. 2.b - list necessary  page actions

    public void populateEmail(String email) {
        driver.findElement(txtEmail).clear();
        driver.findElement(txtEmail).sendKeys(email);
    }

    public void populateName(String name) {
        driver.findElement(txtName).clear();
        driver.findElement(txtName).sendKeys(name);
    }

    public void populatePhone(String phone) {
        driver.findElement(txtPhone).clear();
        driver.findElement(txtPhone).sendKeys(phone);
    }

    public void populateAddress(String address) {
        driver.findElement(txtAddress).clear();
        driver.findElement(txtAddress).sendKeys(address);
    }

    public void submitProfileDetails(){
        driver.findElement(buttonSubmit).click();
    }
}
