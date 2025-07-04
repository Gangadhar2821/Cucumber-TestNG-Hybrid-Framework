package cogmentoCRM.Web.runners;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/Features", glue = { "cogmentoCRM.Web.stepDefinations",
		"cogmentoCRM.Web.hooks" }, plugin = { "pretty", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
				"html:target/cucumber-reports/cucumber-html-report.html" }, monochrome = true)
public class AllureTestNGRunner extends AbstractTestNGCucumberTests {

	@Override
	@DataProvider(parallel = false)
	public Object[][] scenarios() {
		return super.scenarios();
	}

}
