package com.cv.library.steps;

import com.cv.library.pages.HomePage;
import com.cv.library.pages.ResultPage;
import com.cv.library.utilities.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class JobSearchSteps extends Utility {
    @Given("I am on homepage")
    public void iAmOnHomepage() {

    }


    @When("I enter {string},{string},{string}")
    public void iEnter(String jobTitle, String location, String distance) {
        new HomePage().enterJobTitle(jobTitle);
        new HomePage().enterLocation(location);
        new HomePage().selectDistance(distance);
    }

    @And("I click on more search option")
    public void iClickOnMoreSearchOption() {
        new HomePage().clickOnMoreSearchOptionLink();
    }

    @And("I enter {string},{string},{string},{string}")
    public void iEnter(String salaryMin, String salaryMax, String salaryType, String jobType) {
        new HomePage().enterMinSalary(salaryMin);
        new HomePage().enterMaxSalary(salaryMax);
        new HomePage().selectSalaryType(salaryType);
        new HomePage().selectJobType(jobType);
    }

    @And("I click on find job button")
    public void iClickOnFindJobButton() {
        new HomePage().clickOnFindJobsButton();
    }

    @Then("I should able to see the search result {string}")
    public void iShouldAbleToSeeTheSearchResult(String result) {
        Assert.assertEquals(new ResultPage().verifyTheResults(result),result,"search result validation failed");
    }
}
