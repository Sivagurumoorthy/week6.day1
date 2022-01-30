package runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;


@CucumberOptions(features="src/test/java/features/MergeLead.feature" 
	                 , glue = "stepmerge"
	                 , monochrome = true
	                 ,dryRun = false
	                 ,snippets = SnippetType.CAMELCASE
	                 ,publish = true)
public class Runner4 extends AbstractTestNGCucumberTests{

}
