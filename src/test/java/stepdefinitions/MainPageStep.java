package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.MainPage;
import pages.SearchPage;
import utils.BrowserUtils;

public class MainPageStep {
    private final MainPage mainPage = new MainPage();
    private final SearchPage searchPage = new SearchPage();

    @When("I see consent data usage")
    public void isClickAcceptConsentPolicy() {
        mainPage.acceptConsentPolicy();
    }

    @When("I click the search field")
    public void isClickSearchBox() {
        mainPage.clickForSearch();
    }

    @Then("I see the Use your current location label displayed")
    public void isCurrentLabelDisplayed() {
        Assert.assertTrue(mainPage.forLocationLabelDisplayed(), "Current Location Label is not displayed.");
    }

    @When("I search for the city {string}")
    public void forSearchCity(String cityName) {
        mainPage.searchForCity(cityName);
    }

    @Then("I should see the result list displayed")
    public void isResultListDisplayed() {
        Assert.assertTrue(mainPage.forResultDisplayed(), "Search result list is not displayed.");
    }

    @When("I select the first search result")
    public void selectFirstResult() {
        mainPage.clickFirstSearchResult();
    }

    @When("I go back to the previous page")
    public void isBackToPreviousPage() {
        searchPage.isHeaderDisplayed();
        BrowserUtils.goBackToPreviousPage();
    }

    @Then("Main is open")
    public void isMainPageOpen() {
        Assert.assertTrue(mainPage.state().isDisplayed(), "Main Page is not opened");
    }

    @When("I click first recent location")
    public void isClickedRecentLocation() {
        mainPage.clickFirstRecentLocation();
        mainPage.forRemoveAds();
    }
}
