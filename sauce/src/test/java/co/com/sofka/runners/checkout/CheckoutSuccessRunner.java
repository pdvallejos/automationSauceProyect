package co.com.sofka.runners.checkout;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    snippets = CucumberOptions.SnippetType.CAMELCASE,
    publish = true,
    features = {"src/test/resources/features/checkout/checkout_success.feature"},
    glue = {"co.com.sofka.definitions.checkout"}
)
public class CheckoutSuccessRunner {
}
