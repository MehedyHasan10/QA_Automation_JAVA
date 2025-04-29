package pages;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.forms.Form;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static aquality.selenium.browser.AqualityServices.getBrowser;

public class ScrollViewPage extends Form {
    private final IButton clickForJavaScriptAlerts = getElementFactory().getButton(By.xpath("//a[@href='/javascript_alerts']"), "Click for JS alert");
    private final String scrollScript = "arguments[0].scrollIntoView(true);";

    public ScrollViewPage() {
        super(By.xpath("//body"), "Internet Herokuapp Page");
    }

    @Step("Scroll to the 'Click for JS alert' button")
    public void scrollToJavaScriptAlertButton() {
        getBrowser().executeScript(scrollScript, clickForJavaScriptAlerts.getElement());
    }

    @Step("Click on the 'Click for JS alert' button")
    public void clickJavaScriptAlertsBtn() {
        clickForJavaScriptAlerts.click();
    }
}
