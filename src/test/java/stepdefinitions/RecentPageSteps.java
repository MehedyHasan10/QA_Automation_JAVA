package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.MainPage;
import pages.RecentLocationPage;
import utils.SettingsTestData;

import static aquality.selenium.browser.AqualityServices.getBrowser;

public class RecentPageSteps {
    private final MainPage mainPage = new MainPage();
    private final RecentLocationPage recentLocationPage = new RecentLocationPage();
    private final String cityName = SettingsTestData.getSearchData().getRecentLocation();


    @Given("I search recent location")
    public void isSearchForCity() {
        mainPage.searchForCity(cityName);
    }

    @When("I see the result list displayed")
    public void isSeeTheResultListDisplayed(){
       mainPage.waitForResultDisplayed();
    }

    @When("I select the first result")
    public void isSelectTheFirstSearchResult() {
        mainPage.clickFirstSearchResult();
    }
    
    @Then("Back to main page")
    public void isBackToMainPage(){
        recentLocationPage.isCityHeaderDisplayed();
        getBrowser().goBack();
        Assert.assertTrue(mainPage.state().isDisplayed(), "Main Page is not opened");
    }

    @Then("I click the recent location")
    public void isClickedRecentLocation(){
        recentLocationPage.forRecentLocation();
    }

    @Then ("City weather page header contains city name from the search")
    public void isSeeCityHeaderDisplayed() {
        Assert.assertTrue(recentLocationPage.isCityHeaderDisplayed(), "Header is not displayed.");
    }
}
