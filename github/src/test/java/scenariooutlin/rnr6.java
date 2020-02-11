package scenariooutlin;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
plugin = {
		"json:src/test/java/reports/output/cucumbe.json"
		})
public class rnr6 {

}
