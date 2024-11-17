package stepdefinitions;

import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.SearchPage;

public class SearchPageSteps {
    private final SearchPage searchPage = new SearchPage();

    @When("I see header contains city name {string} from the search")
    public void getCityHeaderText(String cityName) {
        Assert.assertTrue(searchPage.getCityHeaderText().toLowerCase().contains(cityName.toLowerCase()), "City weather page header does not contain the city name from the search.");
    }
}
