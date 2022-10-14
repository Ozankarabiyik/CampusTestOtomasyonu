package Pages;

import Utilities.GWD;
import freemarker.cache.WebappTemplateLoader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent{

    /* Üstünde çalıştığımız uygulamanın sol bar kısmının locator larının bulunduğu class
       Amaç projenin oluşturulması ve sonradan bakımının daha kolay yapılması
       Burada locator lar Webelement cinsinden oluşturulup String olarak çağırabilmemizi sağlıyor.*/

    //Oluşturulan WebElementlere, GWD classında oluşturulan driver metodunun ulaşması için.
    public LeftNav() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath="(//span[text()='Setup'])[1]")
    private WebElement setupOne;
    @FindBy(xpath = "//span[text()='Parameters']")
    private WebElement parameters;
    @FindBy(xpath = "//span[text()='Countries']")
    private WebElement countries;
    @FindBy(xpath = "//span[text()='Citizenships']")
    private WebElement citizenShip;
    @FindBy(xpath = "//span[text()='Nationalities']")
    private WebElement nationalities;
    @FindBy(xpath = "//span[text()='Fees']")
    private WebElement fees;
    @FindBy(xpath = "//span[text()='Human Resources']")
    private WebElement humanResources;
    @FindBy(xpath = "(//span[text()='Entrance Exams'])[1]")
    private WebElement entranceExamsOne;
    @FindBy(xpath = "(//span[text()='Setup'])[2]")
    private WebElement setupTwo;
    @FindBy(xpath = "(//span[text()='Entrance Exams'])[2]")
    private WebElement entranceExamsTwo;
    @FindBy(xpath = "//span[text()='Fields']")
    private WebElement fields;
    @FindBy(xpath = "//span[text()='Discounts']")
    private WebElement discounts;

    @FindBy(xpath = "(//span[text()='Setup'])[3]")
    private WebElement setup;

    @FindBy(xpath = "//span[text()='Positions']")
    private WebElement positions;

    @FindBy(xpath = "//span[text()='Document Types']")
    private WebElement documentType;

    @FindBy(xpath = "//span[text()='Position Categories']")
    private WebElement positionCategories;

    @FindBy(xpath = "//span[text()='Attestations']")
    private WebElement attestation;

    @FindBy(xpath = "(//div/fuse-nav-vertical-collapsable)[3]")
    private WebElement schoolSetup;


    @FindBy(xpath = "//span[text()='Locations']")
    private WebElement locations;

    @FindBy(xpath = "//span[text()='Departments']")
    private WebElement departments;

    @FindBy(xpath = "//span[text()='Bank Accounts']")
    private WebElement bankAccount;

    @FindBy(xpath = "//span[text()='Grade Levels']")
    private WebElement gradeLevels;

    @FindBy(xpath = "//span[text()='Education']")
    private WebElement education;

    @FindBy(xpath = "(//span[text()='Setup'])[4]")
    private WebElement setupThree;

    @FindBy(xpath = "(//a[@target='_self'])[52]")
    private WebElement subjectCategories;

    // Yukarıda oluşturulan Webelement türünden locartor lar aşağıdaki metodlar sayesınde daha rahat kullanılıyor.
    WebElement myElement; // O an gelen String isimlerin atandığı WebElement değişkeni.

    public void findAndClick(String strElement){
        /* burda string isimden weblemente ulaşıyoruz ve o webelementi myElement ismindeki değişkene atayıp,
           o değişkeni işlemin yapılacağı metoda gönderiyoruz. */
        switch (strElement)
        {
            case "setup": myElement = setup;break;
            case "positions": myElement = positions;break;
            case "humanResources": myElement = humanResources;break;
            case "setupOne" : myElement =setupOne; break;
            case "parameters" : myElement =parameters; break;
            case "countries" : myElement =countries; break;
            case "citizenShip" : myElement =citizenShip; break;
            case "nationalities" : myElement =nationalities; break;
            case "fees" : myElement =fees; break;
            case "entranceExamsOne" : myElement =entranceExamsOne; break;
            case "setupTwo" : myElement =setupTwo; break;
            case "entranceExamsTwo" : myElement =entranceExamsTwo; break;
            case "fields" : myElement =fields; break;
            case "discounts" : myElement =discounts; break;
            case "documentType" : myElement=documentType;break;
            case "positionCategories": myElement=positionCategories;break;
            case "attestation": myElement=attestation;break;
            case "schoolSetup": myElement=schoolSetup;break;
            case "locations": myElement=locations;break;
            case "departments": myElement=departments;break;
            case "bankAccount": myElement=bankAccount;break;
            case "gradeLevels": myElement=gradeLevels;break;
            case "education": myElement=education;break;
            case "setupThree": myElement=setupThree;break;
            case "subjectCategories": myElement=subjectCategories;break;
        }
        clickFunction(myElement); // Seçilen elementin click yapılacağı metoda gönderilmesi.
    }

}
