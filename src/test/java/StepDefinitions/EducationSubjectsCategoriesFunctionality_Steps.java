package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;

import java.util.List;


public class EducationSubjectsCategoriesFunctionality_Steps {
    DialogContent dc = new DialogContent();
    LeftNav ln=new LeftNav();

    @And("Navigate to Grade Levels")
    public void navigateToGradeLevels(DataTable elements) {
        List<String> listElement = elements.asList(String.class);

        for(int i=0;i<listElement.size();i++)
            ln.findAndClick(listElement.get(i));
    }


    @And("User sending the keys in Dialog content2")
    public void userSendingTheKeysInDialogContent2(DataTable elements) {
        List<List<String>> listElement = elements.asLists(String.class);

        for(int i=0;i<listElement.size();i++)
            dc.findAndSend(listElement.get(i).get(0), listElement.get(i).get(1));
    }

    @And("Click edit grade level")
    public void clickEditGradeLevel(DataTable elements) {
        GWD.Bekle(1);
        List<String> listElement = elements.asList(String.class);

        for(int i=0;i<listElement.size();i++)
            dc.findAndClick(listElement.get(i));
    }

    @And("Edit Grade Level")
    public void editGradeLevel(DataTable elements) {
        List<List<String>> listElement = elements.asLists(String.class);
        for(int i=0;i<listElement.size();i++)
            dc.findAndSend(listElement.get(i).get(0), listElement.get(i).get(1));
        GWD.Bekle(1);
    }
}
