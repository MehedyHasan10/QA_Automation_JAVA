package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.AccuPage;
import utils.SettingsTestData;

public class AccuWeatherSteps {
    private final AccuPage accuPage =new AccuPage();
    private final String cityName = SettingsTestData.getSearchData().getSearchCity();
    
    @Given("I accept the consent policy")
    public void iAcceptTheConsentPolicy() {
        accuPage.acceptConsentPolicy();
    }
    
    @When("I search City")
    public void iSearchForCity() {
        accuPage.searchForCity(cityName);
    }
    
    @When("I should see the result list displayed")
    public void isSeeTheResultListDisplayed(){
        Assert.assertTrue(accuPage.waitForResultDisplayed(),"Search results list is not displayed.");
    }

    @When("I select the first search result")
    public void iSelectTheFirstSearchResult() {
        accuPage.clickFirstSearchResult();
    }

    @Then("I should see the city header displayed")
    public void iSSeeTheCityHeaderDisplayed() {
        Assert.assertTrue(accuPage.isCityHeaderDisplayed(), "City header is not displayed.");
    }
}
