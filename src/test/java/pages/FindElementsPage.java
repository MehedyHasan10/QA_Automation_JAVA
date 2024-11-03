package pages;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.elements.interfaces.ITextBox;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

import java.util.List;

public class FindElementsPage extends Form {
    private final IButton policyButtonSubmit = getElementFactory().getButton(By.xpath("//div[contains(@class,'banner-button policy-accept')]"), "Submit Policy");
    private final ITextBox textNameInput = getElementFactory().getTextBox(By.xpath("//input[contains(@class,'search-input')]"), "Search Field");
    private final ILabel header =getElementFactory().getLabel(By.xpath("//h1[@class='header-loc']"), "City Header");
    private final ILabel searchResultsList = getElementFactory().getLabel(By.xpath("//div[@class='results-container']"),"Result List");
  private final By searchResultContainer = By.xpath("//div[@class='results-container']//div");
  
  
    public FindElementsPage(){
        super(By.xpath("//div[contains(@class,'banner-button policy-accept')]"), "AccuWeather Page");
    }

    public void acceptConsentPolicy() {
        policyButtonSubmit.click();
    }

    public void searchForCity(String cityName) {
        textNameInput.clearAndType(cityName);
    }

    public boolean waitForResultDisplayed() {
        return searchResultsList.state().waitForDisplayed();
    }
    
    private List<ITextBox> getSearchResults() {
        return getElementFactory().findElements(searchResultContainer, ITextBox.class);
    }

    public void clickFirstSearchResult() {
        getSearchResults().get(0).click();

    }

    public boolean isCityHeaderDisplayed() {
        return header.state().waitForDisplayed();
    }

}






