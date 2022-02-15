import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/main/resources"},
        plugin= { "pretty","html:target/site/cucumber-pretty","json:target/cucumber-reports/Cucumber.json"},
        glue = {"SteDefinations"}
)

public class TestRunner {
}