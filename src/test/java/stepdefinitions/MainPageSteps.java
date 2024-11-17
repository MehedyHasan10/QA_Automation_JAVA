package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.MainPage;

public class MainPageSteps {
    private final MainPage mainPage = new MainPage();

    @When("I click on the consent data usage button")
    public void acceptConsentPolicy() {
        mainPage.acceptConsentPolicy();
    }

    @When("I click the search field")
    public void clickOnSearchBox() {
        mainPage.clickSearchBox();
    }
    
    @Then("I see the Use your current location label displayed")
    public void isCurrentLabelDisplayed() {
        Assert.assertTrue(mainPage.isLocationLabelDisplayed(), "Current Location Label is not displayed.");
    }

    @When("I search for the city {string}")
    public void searchForCity(String cityName) {
        mainPage.inputSearchCity(cityName);
        mainPage.isResultListDisplayed();
    }

    @Then("I see the result list displayed")
    public void isResultListDisplayed() {
        Assert.assertTrue(mainPage.isResultListDisplayed(), "Search result list is not displayed.");
    }

    @When("I select the first search result")
    public void clickOnFirstSearchResult() {
        mainPage.clickFirstSearchResult(0);
        mainPage.state().waitForNotDisplayed();
    }

    @Then("Main Page is open")
    public void isMainPageOpen() {
        Assert. assertTrue(mainPage.state().isDisplayed(), "Main Page is not opened");
    }

    @When("I click first recent location")
    public void clickOnFirstRecentLocation() {
        mainPage.clickFirstRecentLocation(0);
        mainPage.forRemoveAds();
    }
}
