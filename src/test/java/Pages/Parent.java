package Pages;

import Utilities.GWD;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Parent {
    /*Projede diğer classlarda devamlı kullanıcalacak olan metodları bu classta oluşturdum.
    Bu metodları OOP nin inheritance yani kalıtım yöntemıyle kullanmak istediğimiz class laa extend ediyoruz.*/

    public void sendKeysFunction(WebElement element, String value) {//3.Aşama
        waitUntilVisible(element); // gözükene kadar bekle
        scrollToElement(element); // elemente scroll yap
        element.clear();   // temizle
        element.sendKeys(value); // değeri gönder
    }

    public void waitUntilVisible(WebElement element) {  // element görünene kadar bekler
        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void scrollToElement(WebElement element) { //sayfayı element görünene kadar aşağı kaydırır.
        JavascriptExecutor js = (JavascriptExecutor) GWD.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public void clickFunction(WebElement element)
    {
        waitUntilClickable(element); // tıklanabilir olana kadar bekle
        scrollToElement(element); // elemente scroll yap
        element.click(); // click yap
    }

    public void waitUntilClickable(WebElement element) { // Element tıklanabilir olana kadar bekler
        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void verifyContainsText(WebElement element, String text)
    {
        waitUntilVisible(element); // gözükene kadar bekle
        Assert.assertTrue(element.getText().toLowerCase().contains(text.toLowerCase()));
    }

    public void waitUntilLoading() { //Search butonuna bastıktan sonraki bekleme için
        WebDriverWait wait=new WebDriverWait(GWD.driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("fuse-progress-bar > *"), 0));
    }

}
