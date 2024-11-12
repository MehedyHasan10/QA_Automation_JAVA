package pages;

import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class SearchPage extends Form {
    private final ILabel header = getElementFactory().getLabel(By.xpath("//h1[@class='header-loc']"), "City Header");

    public SearchPage() {
        super(By.xpath("//div[@class='template-root']"), "Search City Page");
    }

    @Step("Getting the city header text")
    public String forCityHeaderText() {
        return header.getText();
    }
}
