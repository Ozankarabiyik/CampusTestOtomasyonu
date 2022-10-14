package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends Parent{

    /* Bu class uygulamanın button ve input gibi locator lerının oluşturulduğu bölüm.
       Buradaki locator ların her biri Webelement türünde oluşturulduktan sonra
       String isimden ulaşıyoruz.*/

    //Oluşturulan WebElementlere, GWD classında oluşturulan driver metodunun ulaşması için.
    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }
    @FindBy(id="mat-input-0")
    private WebElement username;
    @FindBy(id="mat-input-1")
    private WebElement password;
    @FindBy(css="button[aria-label='LOGIN']")
    private WebElement loginButton;
    @FindBy(xpath="(//span[contains(text(),'Dashboard')])[2]")
    private WebElement dashboard;
    @FindBy(xpath="//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement addButton;
    @FindBy(xpath="//ms-text-field[@formcontrolname='name']//input")
    private WebElement nameInput;
    @FindBy(xpath="//ms-text-field[@formcontrolname='code']//input")
    private WebElement codeInput;
    @FindBy(xpath="//ms-save-button//button")
    private WebElement saveButton;
    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement successMessage;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName']//input")
    private WebElement shortName;
    @FindBy(xpath = "//div[contains(text(),'already exists')]")
    private WebElement alreadyExist;
    @FindBy(xpath = "//button[@aria-label='Close dialog']")
    private WebElement closeDialog;
    @FindBy(xpath = "(//div[contains(@class,'mat-form-field-infix ng-tns-c74')]//input)[1]")
    private WebElement searchInput;
    @FindBy(xpath = "//ms-search-button//button")
    private WebElement searchButton;
    @FindBy(xpath = "//ms-delete-button//button")
    private WebElement deleteButton;
    @FindBy(xpath = "//span[contains(text(),'Delete')]")
    private WebElement deleteDialogBtn;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='integrationCode']//input")
    private WebElement integrationCode;
    @FindBy(xpath = "//ms-integer-field[@formcontrolname='priority']//input")
    private WebElement priorityCode;
    @FindBy(xpath = "(//button[@class='consent-give'])[1]")
    private WebElement acceptCookies;
    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'BUTTON.ADD')]//button")
    private WebElement fieldsAddBtn;
    @FindBy(xpath = "//ms-edit-button//button")
    private WebElement editButton;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='description']//input")
    private WebElement description;
    @FindBy(xpath = "//ms-text-field[contains(@placeholder,'TITLE.DESCRIPTION')]//input")
    private WebElement descriptionText;

    @FindBy(xpath = "//ms-text-field[@placeholder='GENERAL.FIELD.NAME']//input")
    private WebElement editNameInput;

    @FindBy(xpath = "//mat-select[@role='combobox']")
    private WebElement editStage;

    @FindBy(xpath = "(//mat-option[@role='option']/span)[2]")
    private WebElement stageSelect2;

    @FindBy(xpath = "//ms-integer-field[@formcontrolname='capacity']//input")
    private WebElement capacity;

    @FindBy(xpath="//ms-masked-text-field[@formcontrolname='iban']//input")
    private WebElement iban;

    @FindBy(xpath="(//mat-select[@role='combobox'])[3]")
    private WebElement currency;

    @FindBy(xpath="(//span[@class='mat-option-text'])[4]")
    private WebElement turkishlira;

    @FindBy(xpath="(//span[@class='mat-option-text'])[3]")
    private WebElement euro;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='order']//input")
    private WebElement orderInput;

    WebElement myElement;
    public void findAndSend(String strElement, String value){  // input lar için oluşturulan metod
        /* burda string isimden weblemente ulaşıyoruz ve o webelementi myElement ismindeki değişkene atayıp,
           o değişkeni işlemin yapılacağı metoda String olarak vereceğimiz value da direk metodun içinden gönderiyoruz */
        switch (strElement)
        {
            case "username" : myElement =username; break;
            case "password" : myElement =password; break;
            case "nameInput" : myElement =nameInput; break;
            case "codeInput" : myElement =codeInput; break;
            case "shortName" : myElement =shortName; break;
            case "searchInput" : myElement =searchInput; break;
            case "integrationCode" : myElement =integrationCode; break;
            case "priorityCode" : myElement =priorityCode; break;
            case "description" : myElement =description; break;
            case "descriptionText" : myElement =descriptionText; break;
            case "editNameInput" : myElement=editNameInput;break;
            case "capacity" : myElement=capacity;break;
            case "iban" : myElement=iban;break;
            case "orderInput" : myElement=orderInput;break;
        }
        sendKeysFunction(myElement, value); // seçilen elemente girilecek value nun gönderilmesi
    }

    public void findAndClick(String strElement){
        /* burda string isimden weblemente ulaşıyoruz ve o webelementi myElement ismindeki değişkene atayıp,
           o değişkeni işlemin yapılacağı metoda gönderiyoruz. */
        switch (strElement)
        {
            case "loginButton" : myElement =loginButton; break;
            case "addButton" : myElement =addButton; break;
            case "saveButton" : myElement =saveButton; break;
            case "closeDialog" : myElement =closeDialog; break;
            case "searchButton" : myElement =searchButton; break;
            case "deleteButton" : myElement =deleteButton; break;
            case "deleteDialogBtn" : myElement =deleteDialogBtn; break;
            case "acceptCookies" : myElement =acceptCookies; break;
            case "fieldsAddBtn" : myElement =fieldsAddBtn; break;
            case "editButton" : myElement =editButton; break;
            case "editStage" : myElement=editStage;break;
            case "stageSelect2" : myElement=stageSelect2;break;
            case "currency" : myElement=currency;break;
            case "turkishlira" : myElement=turkishlira;break;
            case "euro" : myElement=euro;break;

        }
        clickFunction(myElement); // Seçilen elementin click yapılacağı metoda gönderilmesi.
    }

    public void findAndContainsText(String strElement, String text){
        /* burda string isimden weblemente ulaşıyoruz ve o webelementi myElement ismindeki değişkene atayıp,
           o değişkeni işlemin yapılacağı metoda gönderiyoruz. Bu metod hem webelement hemde verify içim kullanacağımız
           text gönderiliyor*/
        switch (strElement)
        {
            case "dashboard" : myElement =dashboard; break;
            case "successMessage" : myElement =successMessage; break;
            case "alreadyExist" : myElement =alreadyExist; break;
        }
        verifyContainsText(myElement,text); /* Seçilen elementin verify yapılacağı metoda, verify olarak kullanacağımız
                                               değer ile gönderilmesi.*/
    }

    public void SearchAndDelete(String searchText){
        GWD.Bekle(1);
        findAndSend("searchInput", searchText); // aranacak kelimeyi kutucuğa gönder
        findAndClick("searchButton"); // arama butonuna bas

        waitUntilLoading();

        findAndClick("deleteButton");// silme butonua bas
        findAndClick("deleteDialogBtn");// dilogdaki silme butonuna bas
    }

    public void Edit(String strElement) throws InterruptedException {
        findAndSend("searchInput", strElement);
        findAndClick("searchButton");

        GWD.Bekle(2);
        //waitUntilLoading();
        findAndClick("editButton");
    }

    public void EditClick(String strElement){
        findAndSend("nameInput",strElement);
    }

}
