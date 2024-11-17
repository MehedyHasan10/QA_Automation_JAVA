package pages;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.elements.interfaces.ITextBox;
import aquality.selenium.forms.Form;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import utils.BrowserUtils;

import java.util.List;

public class MainPage extends Form {
    private final IButton policyButtonSubmit = getElementFactory().getButton(By.xpath("//div[contains(@class,'banner-button policy-accept')]"), "Submit Policy");
    private final ITextBox textInputBox = getElementFactory().getTextBox(By.xpath("//input[contains(@class,'search-input')]"), "Search Field");
    private final IButton locationLabel = getElementFactory().getButton(By.xpath("//div[@class='search-results']"), "Show Location Label");
    private final ILabel resultList = getElementFactory().getLabel(By.xpath("//div[@class='results-container']"), "Result List");
    private final IButton adCrossButton = getElementFactory().getButton(By.xpath("//div[@id='dismiss-button']"), "Ad cross button");
    private final By iFrameLocator = By.xpath("//iframe[@id='google_ads_iframe_/6581/web/gb/interstitial/news_info/country_home_0']");
    private final ILabel adIframe = getElementFactory().getLabel(iFrameLocator, "Ad Iframe");
    private final By searchResultContainer = By.xpath("//div[@class='results-container']//div");
    private final By recentResultList = By.xpath("//div[@class='featured-locations']//a");

    public MainPage() {
        super(By.xpath("//div[@class='template-root']"), "AccuWeather Main Page");
    }

    @Step("Click the Policy button")
    public void acceptConsentPolicy() {
        policyButtonSubmit.click();
    }

    @Step("Click the Search box")
    public void clickSearchBox() {
        textInputBox.click();
    }

    @Step("Show the use your current location")
    public boolean isLocationLabelDisplayed() {
        return locationLabel.state().waitForDisplayed();
    }

    @Step("Searching for city: {cityName}")
    public void inputCityInSearchBox(String cityName) {
        textInputBox.clearAndType(cityName);
    }
    
    @Step("Wait for result list display")
    public boolean isResultListDisplayed() {
        return resultList.state().waitForDisplayed();
    }

    @Step("Retrieving the list of search results")
    private List<ILabel> getSearchResults() {
        return getElementFactory().findElements(searchResultContainer, ILabel.class);
    }

    @Step("Clicking on the first search result")
    public void clickFirstSearchResult(int elementNum) {
        getSearchResults().get(elementNum).click();
    }

    @Step("Retrieving the list of recent location results")
    private List<ILabel> getRecentLocationResults() {
        return getElementFactory().findElements(recentResultList, ILabel.class);
    }

    @Step("Clicking on the first recent location result")
    public void clickFirstRecentLocation(int elementNum) {
        getRecentLocationResults().get(elementNum).click();
    }

    @Step("If find any ad")
    public void forRemoveAds() {
        if (adIframe.state().isExist()) {
            BrowserUtils.switchIFrame(iFrameLocator);
            adCrossButton.click();
            BrowserUtils.switchToDefaultContent();
        }
    }
}
