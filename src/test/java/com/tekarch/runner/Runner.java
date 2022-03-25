package com.tekarch.runner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty",
		"html:target/cucumber-reports/cucumber.html",
		"json:target/cucumber-reports/cucumber.json"},

features="/Users/anu/eclipse-workspace/Cucumber/resources/SalesforceGeneric.feature",
glue= {"com.tekarch.steps"})

public class Runner {

	
}


