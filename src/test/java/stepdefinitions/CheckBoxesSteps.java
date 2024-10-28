package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.CheckBoxesPage;

public class CheckBoxesSteps {
    private final CheckBoxesPage checkBoxesPage = new CheckBoxesPage();
    private boolean isFirstCheckboxInitiallyChecked;
    
    @When("I toggle the first checkbox")
    public void toggleFirstCheckbox() {
        isFirstCheckboxInitiallyChecked = checkBoxesPage.isFirstCheckboxChecked();
        checkBoxesPage.toggleFirstCheckbox();
    }

    @Then("the state of the first checkbox should be changed")
    public void verifyFirstCheckboxStateChanged() {
        Assert.assertNotEquals(checkBoxesPage.isFirstCheckboxChecked(), isFirstCheckboxInitiallyChecked,
                "The state of the first checkbox should have changed.");
    }
}
