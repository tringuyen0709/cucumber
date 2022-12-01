package cucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		// Duong dan toi file feature
		features = "src/test/java/bankGuru/features",

		// Tim den page object
		glue = "bank.stepDefinitions", monochrome = true, plugin = { "pretty",
				"html:target/site/cucumber-report-default",
				"json:target/site/cucumber.json" }, snippets = SnippetType.CAMELCASE,
		// Tro den the muon chay trong feature
		tags = { "@register_login" })

public class BankTestRunner {

}
