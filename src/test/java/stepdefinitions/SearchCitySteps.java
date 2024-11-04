package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.MainPage;
import pages.SearchCityPage;
import utils.SettingsTestData;

public class SearchCitySteps {
    private final MainPage mainPage = new MainPage();
    private final SearchCityPage searchCityPage = new SearchCityPage();
    private final String cityName = SettingsTestData.getSearchData().getSearchCity();
    
    @When("I search City")
    public void iSearchForCity() {
        mainPage.searchForCity(cityName);
    }
    
    @When("I should see the result list displayed")
    public void isSeeTheResultListDisplayed(){
        Assert.assertTrue(mainPage.waitForResultDisplayed(),"Search results list is not displayed.");
    }

    @When("I select the first search result")
    public void iSelectTheFirstSearchResult() {
        mainPage.clickFirstSearchResult();
    }

    @Then("I should see the city header displayed")
    public void iSSeeTheCityHeaderDisplayed() {
        Assert.assertTrue(searchCityPage.isCityHeaderDisplayed(), "City header is not displayed.");
    }
}
