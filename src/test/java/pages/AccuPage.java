package pages;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.elements.interfaces.ITextBox;
import aquality.selenium.forms.Form;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import java.util.List;

public class AccuPage extends Form {
    private final IButton policyButtonSubmit = getElementFactory().getButton(
            By.xpath("//div[contains(@class,'banner-button policy-accept')]"), "Submit Policy");
    private final ITextBox textNameInput = getElementFactory().getTextBox(
            By.xpath("//input[contains(@class,'search-input')]"), "Search Field");
    private final ILabel header = getElementFactory().getLabel(
            By.xpath("//h1[contains(@class,'header-loc')]"), "City Header");
    private final By searchResultsList = By.xpath("//div[@class='results-container']//div[contains(@class,'result-item')]");
    
    public  AccuPage() {
        super(By.xpath("//div[contains(@class,'banner-button policy-accept')]"), "AccuWeather Page");
    }

    @Step("Accepting the consent policy")
    public void acceptConsentPolicy() {
            policyButtonSubmit.click();
    }

    @Step("Searching for city: {cityName}")
    public void searchForCity(String cityName) {
        textNameInput.clearAndType(cityName);
        textNameInput.submit();
    }

    @Step("Retrieving the list of search results")
    private List<ITextBox> getSearchResults() {
        return getElementFactory().findElements(searchResultsList, ITextBox.class);
    }

    @Step("Clicking on the first search result")
    public void clickFirstSearchResult() {
        List<ITextBox> searchResults = getSearchResults();
        if (!searchResults.isEmpty()) {
            searchResults.get(0).click();
        }
    }

    @Step("Checking if the city header is displayed")
    public boolean isCityHeaderDisplayed() {
        return header.state().isDisplayed();
    }
}
