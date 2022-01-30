package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;


@CucumberOptions(features="src/test/java/features/DuplicateLead.feature" 
	                 , glue = "stepduplicate"
	                 , monochrome = true
	                 ,dryRun = false
	                 ,snippets = SnippetType.CAMELCASE
	                 ,publish = true)
	public class Runner3 extends AbstractTestNGCucumberTests {
	}

