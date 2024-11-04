package pages;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class RecentLocationPage extends Form {
    private final IButton recentLocation =getElementFactory().getButton(By.xpath("//div[@class='featured-locations']//a[1]"), "Click Recent Location");
    private final ILabel header =getElementFactory().getLabel(By.xpath("//h1[@class='header-loc']"), "City Header");
    
    public RecentLocationPage(){
        super(By.xpath("//div[@class='featured-locations']//a[1]"),"AccuWeather Main Page");
    }

    @Step("Checking if the city header is displayed")
    public boolean isCityHeaderDisplayed() {
        return header.state().waitForDisplayed();
    }

    @Step("Checking if the city header is displayed")
    public void forRecentLocation(){
        recentLocation.click();
    }
}
