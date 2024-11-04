package pages;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ITextBox;
import aquality.selenium.forms.Form;
import io.qameta.allure.Step;
import org.openqa.selenium.By;


public class LocationLabelPage extends Form {
    private final ITextBox textInputBox = getElementFactory().getTextBox(By.xpath("//input[contains(@class,'search-input')]"), "Search Field");
    private final IButton label =getElementFactory().getButton(By.xpath("//div[@class='search-results']"), "Show Location Lable");

    public LocationLabelPage() {
        super(By.xpath("//div[@class='search-results']"), "AccuWeather Main Page");
    }

    @Step("Click the Search box")
    public void clickForSearch() {
        textInputBox.click();
    }

    @Step("Show the use your current location")
    public boolean isLocationLabelDisplayed() {
        return label.state().waitForDisplayed();
    }
}
