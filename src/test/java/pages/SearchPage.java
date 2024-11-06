package pages;

import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class SearchPage extends Form {
    private final ILabel header = getElementFactory().getLabel(By.xpath("//h1[@class='header-loc']"), "City Header");

    public SearchPage() {
        super(By.xpath("//h1[@class='header-loc']"), "Search City Page");
    }

    @Step("Getting the city header text")
    public String isCityHeaderText() {
        return header.getText();
    }

    @Step("The city header Displayed")
    public boolean isHeaderDisplayed() {
        return header.state().waitForDisplayed();
    }
}
