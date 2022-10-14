package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Pages.Parent;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HumanResourcesPositions_Steps extends Parent {
    DialogContent dc=new DialogContent();

    LeftNav ln=new LeftNav();


    @Given("Navigate to position categories")
    public void navigateToPositionCategories() {
        ln.findAndClick("humanResources");
        ln.findAndClick("setup");
        ln.findAndClick("positionCategories");
    }

    @When("Create position categories")
    public void createPositionCategories() {
        dc.findAndClick("addButton");
        dc.findAndSend("nameInput","Sergen");
        dc.findAndClick("saveButton");

    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        dc.findAndContainsText("successMessage","success");
    }

    @When("Edit user position")
    public void editUserPosition() {
        waitUntilLoading();
        dc.findAndSend("searchInput","Sergen");
        dc.findAndClick("searchButton");
        dc.findAndClick("editButton");
        dc.findAndSend("nameInput", "Pascal");
        dc.findAndClick("saveButton");
    }

    @When("Delete user position")
    public void deleteUserPosition() {
        dc.findAndSend("searchInput","Pascal");
        dc.findAndClick("searchButton");

        GWD.Bekle(2);
        waitUntilLoading();

        dc.findAndClick("deleteButton");
        dc.findAndClick("deleteDialogBtn");
    }
}
