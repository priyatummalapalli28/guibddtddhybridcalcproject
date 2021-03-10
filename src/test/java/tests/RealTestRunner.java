package tests;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features={"E:\\Automation\\AutomationNested\\com.bddcucumber.gui.calcapp\\src\\test\\resources\\features\\feature1.feature",
						   "E:\\Automation\\AutomationNested\\com.bddcucumber.gui.calcapp\\src\\test\\resources\\features\\feature3.feature",
						   "E:\\Automation\\AutomationNested\\com.bddcucumber.gui.calcapp\\src\\test\\resources\\features\\feature4.feature",
						   "E:\\Automation\\AutomationNested\\com.bddcucumber.gui.calcapp\\src\\test\\resources\\features\\feature5.feature",
						   "E:\\Automation\\AutomationNested\\com.bddcucumber.gui.calcapp\\src\\test\\resources\\features\\feature6.feature"},
				 monochrome=true,
				 glue={"glue"},
				 plugin={"pretty","html:target\\realtestresults","rerun:target\\realtestfailed.txt"}
				)
public class RealTestRunner extends AbstractTestNGCucumberTests
{
}
