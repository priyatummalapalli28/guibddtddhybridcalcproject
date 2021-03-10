package tests;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= {"E:\\Automation\\AutomationNested\\com.bddcucumber.api\\src\\test\\resources\\features\\feature1.feature",
							"E:\\Automation\\AutomationNested\\com.bddcucumber.api\\src\\test\\resources\\features\\feature3.feature",
							"E:\\Automation\\AutomationNested\\com.bddcucumber.api\\src\\test\\resources\\features\\feature4.feature",
							"E:\\Automation\\AutomationNested\\com.bddcucumber.api\\src\\test\\resources\\features\\feature5.feature",
							"E:\\Automation\\AutomationNested\\com.bddcucumber.api\\src\\test\\resources\\features\\feature6.feature"},
				 tags= {"@regression"},
				 monochrome=true,
				 glue= {"glue"},
				 plugin= {"pretty","html:target\\regressiontestresults","rerun:target\\regressiontestfailed.txt"}
				)
public class RegressionTestRunner extends AbstractTestNGCucumberTests
{
}