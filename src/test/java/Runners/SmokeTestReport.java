package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@SmokeTest",
        features = {"src/test/java/FeatureFiles/"},
        glue = {"StepDefinitions"},
        plugin = {"html:target//cucumber-reports.html"} // Basit raporlama için
)
public class SmokeTestReport extends AbstractTestNGCucumberTests {
     /*
        @SmokeTest etiketiyle birden fazla senaryoyu çalıştırmamıza olanak sağlar.
        Tek yapmamız gereken etiket koymak ve senaryoların olduğu adresi vermek.

     */
}
