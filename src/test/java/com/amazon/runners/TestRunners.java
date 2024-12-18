package com.amazon.runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features",
		glue = {"com.amazon.stepDefinitions"},
		plugin = {"pretty","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"},
		monochrome = true
		)


public class TestRunners {
	
	
}
