package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.LocationLabelPage;

public class LocationLabelSteps {
    private final LocationLabelPage locationLabelPage = new LocationLabelPage();

    @Given("I click on the search field")
    public void isClickSearchBox() {
        locationLabelPage.clickForSearch();
    }

    @Then("I should see the Use your current location label displayed")
    public void isCityHeaderDisplayed() {
        Assert.assertTrue(locationLabelPage.forLocationLabelDisplayed(), "Current Location Label is not displayed.");
    }
}
