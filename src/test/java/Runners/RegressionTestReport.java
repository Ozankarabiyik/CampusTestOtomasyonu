package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@RegressionTest",
        features = {"src/test/java/FeatureFiles/"},
        glue = {"StepDefinitions"},
        plugin = {"html:target//cucumber-reports.html"} // Basit raporlama için
)
public class RegressionTestReport extends AbstractTestNGCucumberTests {
    /*
        @RegressionTest etiketiyle birden fazla senaryoyu çalıştırmamıza olanak sağlar.
        Tek yapmamız gereken etiket koymak ve senaryoların olduğu adresi vermek.

     */
}
