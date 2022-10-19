package StepDefinitions;

import Utilities.GWD;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Hooks {
    /* - Test senaryolarının çalışmasından sonra driver'ı kapatması için
    oluşturulan metod.
       - @After annotation' ı burada bize bunu sağlıyor. Her senaryo çalısmasını bitirdiğinde
       driver ı yani browser ı kapatır.
    */

    @After
    public void after(Scenario scenario)
    {
        System.out.println("Senaryo Bitti");
        GWD.quitDriver();
    }


}
