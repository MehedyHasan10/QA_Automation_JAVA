package pages;

import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.elements.interfaces.ITextBox;
import aquality.selenium.forms.Form;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import java.util.List;

public class MainPage extends Form {
    private final ITextBox textNameInput = getElementFactory().getTextBox(By.xpath("//input[contains(@class,'search-input')]"), "Search Field");
    private final ILabel resultList = getElementFactory().getLabel(By.xpath("//div[@class='results-container']"),"Result List");
    private final By searchResultContainer = By.xpath("//div[@class='results-container']//div");
    
    public MainPage() {
        super(By.xpath("//body"), "AccuWeather Main Page");
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
}
