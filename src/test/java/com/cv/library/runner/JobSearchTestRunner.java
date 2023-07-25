package com.cv.library.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/resources/featurefile/jobSearch.feature",
        glue = "com/cv/library",
        tags = "@sanity",
        plugin = {"pretty", "html:target/cucumber-report/cucumber.html",
        }
)
public class JobSearchTestRunner {

}
