package runner.Ultimate_H.E.L.P_YG;




import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(plugin = {"json:target/cucumber.json" },
        features = "src/test/resources/features/H.E.L.P_YF/Ultimate_H.E.L.P_YG/HomePageYG.feature",
        glue = "stepDefinitions",
        monochrome = true,
        dryRun = true
)

public class TestYG {
}
