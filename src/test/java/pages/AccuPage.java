package pages;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.elements.interfaces.ITextBox;
import aquality.selenium.forms.Form;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import java.util.List;

public class AccuPage extends Form {
    private final IButton policyButtonSubmit = getElementFactory().getButton(By.xpath("//div[contains(@class,'banner-button policy-accept')]"), "Submit Policy");
    private final ITextBox textNameInput = getElementFactory().getTextBox(By.xpath("//input[contains(@class,'search-input')]"), "Search Field");
    private final ILabel header =getElementFactory().getLabel(By.xpath("//h1[@class='header-loc']"), "City Header");
    private final ILabel resultList = getElementFactory().getLabel(By.xpath("//div[@class='results-container']"),"Result List");
    private final By searchResultContainer = By.xpath("//div[@class='results-container']//div");


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
    }
    
    @Step("Wait for result list display")
    public boolean waitForResultDisplayed() {
        return resultList.state().waitForDisplayed();
    }

    @Step("Retrieving the list of search results")
    private List<ITextBox> getSearchResults() {
        return getElementFactory().findElements(searchResultContainer, ITextBox.class);
    }

    @Step("Clicking on the first search result")
    public void clickFirstSearchResult() {
        getSearchResults().get(0).click();
    }

    @Step("Checking if the city header is displayed")
    public boolean isCityHeaderDisplayed() {
        return header.state().waitForDisplayed();
    }
}
