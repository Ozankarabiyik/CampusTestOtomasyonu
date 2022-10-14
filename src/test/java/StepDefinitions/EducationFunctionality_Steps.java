package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;

import java.util.List;


public class EducationFunctionality_Steps {
    DialogContent dc = new DialogContent();
    LeftNav ln=new LeftNav();

    @And("Click on the element in the Dialog1")
    public void clickOnTheElementInTheDialog1(DataTable elements) {
        List<String> listElement = elements.asList(String.class);

        for(int i=0;i<listElement.size();i++) {
            ln.findAndClick(listElement.get(i));
        }
    }

    @And("User sending the keys in Dialog content1")
    public void userSendingTheKeysInDialogContent1(DataTable elements) {
        List<List<String>> listElement = elements.asLists(String.class);

        for(int i=0;i<listElement.size();i++)
            dc.findAndSend(listElement.get(i).get(0), listElement.get(i).get(1));


    }


    @And("Use Search to delete Account")
    public void useSearchToDeleteAccount(DataTable elements) throws InterruptedException{
        List<String> listElement = elements.asList(String.class);

        for(int i=0;i<listElement.size();i++) {
            dc.SearchAndDelete(listElement.get(i));
        }
    }
}
