package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormContent extends Parent{
    /*   Üstünde çalıştığımız uygulamanın form kısımlarının locator larını içeren class.
        Buradaki locator ların her biri Webelement türünde oluşturulduktan sonra
        String isimden ulaşıyoruz
     */

    //Oluşturulan WebElementlere, GWD classında oluşturulan driver metodunun ulaşması için.
    public FormContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "(//mat-select[@formcontrolname='id']/div/div)[1]")
    private WebElement academicPeriod;

    @FindBy(xpath = "(//mat-option[@role='option']/span)[1]")
    private WebElement academicPeriod1;

    @FindBy(xpath = "(//mat-select[@formcontrolname='id']/div/div)[3]")
    private WebElement gradeLevel;

    @FindBy(xpath = "(//mat-option[@role='option']/span)[1]")
    private WebElement gradeLevel2;

    @FindBy(xpath = "//mat-select[@formcontrolname='attachmentStages']")
    private WebElement stage;

    @FindBy(xpath = "(//mat-option[@role='option']/span)[1]")
    private WebElement stageSelect;

    WebElement myElement; // O an gelen String isimlerin atandığı WebElement değişkeni.

    public void findAndClick(String strElement){
        /* burda string isimden weblemente ulaşıyoruz ve o webelementi myElement ismindeki değişkene atayıp,
           o değişkeni işlemin yapılacağı metoda gönderiyoruz. */
        switch (strElement)
        {
            case "academicPeriod" : myElement =academicPeriod; break;
            case "academicPeriod1" : myElement =academicPeriod1; break;
            case "gradeLevel" : myElement =gradeLevel; break;
            case "gradeLevel2" : myElement =gradeLevel2; break;
            case "stage" : myElement=stage;break;
            case "stageSelect" : myElement=stageSelect;break;
        }
        clickFunction(myElement); // Seçilen elementin click yapılacağı metoda gönderilmesi.
    }

}

