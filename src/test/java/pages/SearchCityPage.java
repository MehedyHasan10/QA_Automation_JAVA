package pages;

import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import io.qameta.allure.Step;
import org.openqa.selenium.By;


public class SearchCityPage extends Form {
    private final ILabel header =getElementFactory().getLabel(By.xpath("//h1[@class='header-loc']"), "City Header");
    
    public SearchCityPage() {
        super(By.xpath("//h1[@class='header-loc']"), "City Header Page");
    }

    @Step("Checking if the city header is displayed")
    public boolean isCityHeaderDisplayed() {
        return header.state().waitForDisplayed();
    }
}
