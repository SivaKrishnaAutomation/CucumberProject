package com.test.pack;


import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features =  {"src/test/resources/FeatureFiles"},
        glue =       {"com.stepdefinition"},
        monochrome = true,
        tags = "@labcorp",
        dryRun = false
        
   
    )
public class TestRunner {

}
