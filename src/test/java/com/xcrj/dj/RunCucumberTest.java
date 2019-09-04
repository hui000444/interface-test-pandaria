package com.xcrj.dj;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {
        "pretty",
        "junit:test-reports/cucumber.xml",
        "json:test-reports/cucumber.json",
        "html:test-reports"},
        features = "classpath:features/",
        glue = {"com.github.jakimli.pandaria"},
        tags = "not @ignore")
public class RunCucumberTest {
}
