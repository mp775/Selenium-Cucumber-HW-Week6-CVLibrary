package com.cv.library.pages;

import com.cv.library.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='keywords']")
    WebElement jobTitleTextField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='location']")
    WebElement locationTextField;
    @CacheLookup
    @FindBy(xpath = "//select[@id='distance']")
    WebElement distanceDropDown;
    @CacheLookup
    @FindBy(xpath = "//button[@id='toggle-hp-search']")
    WebElement moreSearchOptionsLink;
    @CacheLookup
    @FindBy(xpath = "//input[@id='salarymin']")
    WebElement salaryMin;
    @CacheLookup
    @FindBy(xpath = "//input[@id='salarymax']")
    WebElement salaryMax;
    @CacheLookup
    @FindBy(xpath = "//select[@id='salarytype']")
    WebElement salaryTypeDropDown;
    @CacheLookup
    @FindBy(xpath = "//select[@id='tempperm']")
    WebElement jobTypeDropDown;
    @CacheLookup
    @FindBy(xpath = "//input[@id='hp-search-btn']")
    WebElement findJobsBtn;

    public void enterJobTitle(String jobTitle) {
       // Reporter.log("EnterJob Title" + jobTitle + "to job title field " + jobTitleTextField.toString());
        sendTextToElement(jobTitleTextField,jobTitle);

    }

    public void enterLocation(String location) {
        log.info("Enter location" + location + "to location field " + locationTextField.toString());
        sendTextToElement(locationTextField,location);

    }

    public void selectDistance(String distance) {
        log.info("Select Distance " + distance + "from distance field " + distanceDropDown.toString());
        sendTextToElement(distanceDropDown,distance);

    }

    public void clickOnMoreSearchOptionLink() {
        log.info("Click on search option link" + moreSearchOptionsLink.toString());
        clickOnElement(moreSearchOptionsLink);

    }

    public void enterMinSalary(String minSalary) {
        log.info("Enter min salary " + minSalary + "to salary field " + salaryMin.toString());
        sendTextToElement(salaryMin,minSalary);

    }

    public void enterMaxSalary(String maxSalary) {
        log.info("Enter Max salary" + maxSalary + "to salary field " + salaryMax.toString());
        sendTextToElement(salaryMax,maxSalary);

    }

    public void selectSalaryType(String sType) {
       log.info("Select salary type" + sType + "from dropdown " + salaryTypeDropDown.toString());
        selectByVisibleTextFromDropDown(salaryTypeDropDown,sType);

    }

    public void selectJobType(String jobType) {
        log.info("Select job title " + jobType + "from dropdown " + jobTypeDropDown.toString());
        sendTextToElement(jobTypeDropDown,jobType);

    }

    public void clickOnFindJobsButton() {
       log.info("Click on find job button " + findJobsBtn.toString());
        clickOnElement(findJobsBtn);
    }


}


