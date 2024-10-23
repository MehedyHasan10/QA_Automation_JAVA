package pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.IElementFactory;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.elements.interfaces.ITextBox;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

import java.util.List;

public class FindElementsPage extends Form {
    private final IElementFactory elementFactory = AqualityServices.getElementFactory();
    private final By consentButton = By.xpath("//div[contains(@class,'banner-button policy-accept')]");
    private final By searchField = By.xpath("//input[contains(@class,'search-input')]");
    private final By searchResultsList = By.xpath("//p[contains(@class,'search-bar-result__name')]");
    private final By cityHeader = By.xpath("//h1[contains(@class,'header-loc')]");

    private final IButton policyButtonSubmit = elementFactory.getButton(consentButton, "Submit Policy");
    private final ITextBox textNameInput = elementFactory.getTextBox(searchField, "Search Field");
    private final ILabel header = elementFactory.getLabel(cityHeader, "City Header");
    
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
        return elementFactory.findElements(searchResultsList, ITextBox.class);
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
