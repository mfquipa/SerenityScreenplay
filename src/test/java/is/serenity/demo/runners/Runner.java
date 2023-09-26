package is.serenity.demo.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/prueba.feature",
        glue = "is.serenity.demo.stepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class Runner {
}
