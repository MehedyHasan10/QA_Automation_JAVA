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
    private final ILabel header =getElementFactory().getLabel(By.xpath("//h1[contains(@class,'header-loc')]"), "City Header");
    private final By searchResultsList = By.xpath("//p[contains(@class,'search-bar-result__name')]");
    
    
    public FindElementsPage(){
        super(By.xpath("//div[contains(@class,'banner-button policy-accept')]"), "AccuWeather Page");
    }

    public void acceptConsentPolicy() {
        if (policyButtonSubmit.state().isDisplayed()) {
            policyButtonSubmit.click();
        }
    }

    public void searchForCity(String cityName) {
        textNameInput.clearAndType(cityName);
        textNameInput.submit();
    }
    
    public List<ITextBox> getSearchResults() {
        return getElementFactory().findElements(searchResultsList, ITextBox.class);
    }

    public void clickFirstSearchResult() {
        List<ITextBox> results = getSearchResults();
        if (!results.isEmpty()) {
            results.get(0).click();
        }
    }

    public boolean isCityHeaderDisplayed() {
        return header.state().isDisplayed();
    }
}
