package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
   //features = { ".//FeatureFiles/Userlogin.feature" },
   //features = { ".//FeatureFiles/StatusDropDrown.feature"},
	features = { ".//FeatureFiles/AddLeadFunctionality.feature"},
   glue = "stepDefinitions",
    plugin = { "pretty", "html:reports/myreport.html", "rerun:target/rerun.txt" },
    tags = "@Test1",
    dryRun = false, // checks mapping between scenario steps and step definition methods
    publish = true,
    monochrome = true // to avoid junk characters in output
)
public class TestRunner extends AbstractTestNGCucumberTests {
    // The class can be empty
}




