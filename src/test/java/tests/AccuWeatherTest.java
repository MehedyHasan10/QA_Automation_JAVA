package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class AccuWeatherTest extends BaseTest {
    protected static final String URL = "https://www.accuweather.com/";
    private final By consentButton = By.xpath("//div[contains(@class,'banner-button policy-accept')]");
    private final By searchField = By.xpath("//input[contains(@class,'search-input')]");
    private final By searchResultsList = By.xpath("//p[contains(@class,'search-bar-result__name')]");
    private final By cityHeader = By.xpath("//h1[contains(@class,'header-loc')]");
    private final String searchQuery = "New York";

    @BeforeMethod
    public void setUp() {
        driver.get(URL);
    }

    @Test
    public void testSearchCityWeather() {
        wait.until(ExpectedConditions.elementToBeClickable(consentButton)).click();
        driver.findElement(searchField).sendKeys(searchQuery);
        wait.until(ExpectedConditions.visibilityOfElementLocated(searchResultsList));
        List<WebElement> searchResults = driver.findElements(searchResultsList);
        Assert.assertFalse(searchResults.isEmpty(), "Search results list is not displayed.");
        searchResults.get(0).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(cityHeader));

        String actualCityName = driver.findElement(cityHeader).getText();
        Assert.assertTrue(actualCityName.toLowerCase().contains(searchQuery.toLowerCase()),
                "City weather page header does not contain the city name from the search.");
    }
}
