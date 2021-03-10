package tests;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features={"@target\\realtestfailed.txt"},
				 monochrome=true,
				 glue={"glue"},
				 plugin={"pretty","html:target\\retestresults","rerun:target\\retestfailed.txt"}
				)
public class ReTestRunner extends AbstractTestNGCucumberTests
{
}
