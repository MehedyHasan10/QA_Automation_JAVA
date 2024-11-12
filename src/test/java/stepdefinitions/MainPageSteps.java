package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.MainPage;
import pages.SearchPage;

public class MainPageSteps {
    private final MainPage mainPage = new MainPage();
    private final SearchPage searchPage = new SearchPage();

    @When("I verify that the consent data usage pop-up is displayed")
    public void isClickAcceptConsentPolicy() {
        mainPage.acceptConsentPolicy();
    }

    @And("I click the search field")
    public void isClickSearchBox() {
        mainPage.clickForSearch();
    }

    @Then("I see the Use your current location label displayed")
    public void isCurrentLabelDisplayed() {
        Assert.assertTrue(mainPage.isLocationLabelDisplayed(), "Current Location Label is not displayed.");
    }

    @When("I search for the city {string}")
    public void forSearchCity(String cityName) {
        mainPage.searchForCity(cityName);
    }

    @Then("I see the result list displayed")
    public void isResultListDisplayed() {
        Assert.assertTrue(mainPage.isResultDisplayed(), "Search result list is not displayed.");
    }

    @When("I select the first search result")
    public void selectFirstResult() {
        mainPage.clickFirstSearchResult(0);
        searchPage.isCityHeaderDisplayed();
    }

    @Then("Main Page is open")
    public void isMainPageOpen() {
        Assert.assertTrue(mainPage.state().isDisplayed(), "Main Page is not opened");
    }

    @When("I click first recent location")
    public void clickRecentLocation() {
        mainPage.clickFirstRecentLocation(0);
        mainPage.forRemoveAds();
    }
}
