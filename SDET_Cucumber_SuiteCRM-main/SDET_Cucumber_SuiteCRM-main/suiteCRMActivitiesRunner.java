package suiteCRMTest;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith (Cucumber.class)

@CucumberOptions(
		features = "src/test/java/suiteCRMFeatureFiles",
	    glue = {"suiteCRMStepDefn"},
	    tags = "@Scenario4",
	    plugin = { "pretty", "html:C:\\Users\\XMT5NJV\\Documents\\Harini\\Auto\\LEARNINGS\\SDET Reskill\\Cucumber\\cucumber-reports\\reports.html" },
	    monochrome = true
)

public class suiteCRMActivitiesRunner {}
