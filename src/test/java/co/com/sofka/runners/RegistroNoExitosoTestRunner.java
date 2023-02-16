package co.com.sofka.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        publish = true,
        features = {"src/test/resources/features/register/registroNoExitoso.feature"},
        glue = "co.com.sofka.definitions.register",
        plugin = {"pretty", "html:target/cucumber-reports"}
)
public class RegistroNoExitosoTestRunner {
}
