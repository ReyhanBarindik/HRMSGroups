package com.hrms.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = "@target/failed.txt"
		, glue = "com/hrms/steps"
		, monochrome = true
		
		, plugin = {
				"pretty", // prints gherkin steps in
						
				
		}
		)



public class FailedRunner {

}
