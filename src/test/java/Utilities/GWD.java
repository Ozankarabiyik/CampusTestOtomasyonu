package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;


public class GWD {

    /*  Bu projede Singleton driver kullandım. Singleton driver bütün
    projede aynı ve tek bir driver ın kullanılmasıdır.

        Parent class'ında Driver icin GWD Class ını extends etmek yerine
    GWD class ında static method'lar kullanarak driver olusturup,
    ilgili ayarlarin yapilmasi ve en sonda driver'İn kapatilmasi
    tercih edilmistir.
    */

    public static WebDriver driver;
    public static WebDriver getDriver() { // Ilgili ayarlar yapılıp driver olusturulur
        if (driver == null) {

            // extend report; türkçe bilgisayarlarda çalışmaması sebebiyle kondu
            Locale.setDefault(new Locale("EN"));
            System.setProperty("user.language", "EN");

            Logger.getLogger("").setLevel(Level.SEVERE);
            System.setProperty(org.slf4j.impl.SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "Error");
            System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");

            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        return driver;
    }

    public static void quitDriver() { // driver ı kapatıyor
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        if (driver != null) { // driver varsa kapat.
            driver.quit();
            driver = null;
        }
    }

    public static void Bekle(int saniye) { // Mecbur kalınan yerlerde sleep yapmak için hazırda tutulan metod
        try {
            Thread.sleep(saniye * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


}
