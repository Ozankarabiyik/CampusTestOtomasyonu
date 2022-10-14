package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Pages.Parent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class HumanResourcesAttestations_Steps extends Parent {

    LeftNav ln = new LeftNav();

    DialogContent dc = new DialogContent();

    @Given("Navigate to Attestations")
    public void navigateToAttestations() {

        ln.findAndClick("humanResources");
        ln.findAndClick("setup");
        ln.findAndClick("attestation");
    }

    @When("Create a Attestetions name")
    public void createAAttestetionsName() {

        dc.findAndClick("addButton");
        dc.findAndSend("nameInput","Yunus");
        dc.findAndClick("saveButton");

    }

    @And("Edit a Attestetions name")
    public void editAAttestetionsName() {
        dc.findAndSend("searchInput","Yunus");
        dc.findAndClick("searchButton");
        waitUntilLoading();
        dc.findAndClick("editButton");
        dc.findAndSend("nameInput","Kamil");
        dc.findAndClick("saveButton");
    }

    @And("Delete a Attestetions name")
    public void deleteAAttestetionsName() {
        dc.findAndSend("searchInput","Kamil");
        dc.findAndClick("searchButton");
        waitUntilLoading();
        dc.findAndClick("deleteButton");
        dc.findAndClick("deleteDialogBtn");
    }

}
