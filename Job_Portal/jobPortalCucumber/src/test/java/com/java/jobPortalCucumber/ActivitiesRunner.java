package com.java.jobPortalCucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features", glue = { "com.java.jobPortalCucumber" }, plugin = { "pretty", "html:target/cucumber-reports" },strict = true)

public class ActivitiesRunner {
	// empty
}
