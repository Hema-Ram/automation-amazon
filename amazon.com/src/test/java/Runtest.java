import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"html:output"},
                features = "src/test/Resources",
                tags={"@test"}
)

public class Runtest extends Hooks {
    }
