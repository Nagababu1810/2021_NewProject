package com.bdd.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "./feature//WUregistration.feature", glue="com.bdd.steps",
monochrome= true, plugin = {"pretty"})
	
	public class TestRunner {

	
	
}
