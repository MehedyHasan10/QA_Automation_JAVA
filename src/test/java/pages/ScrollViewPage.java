package pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.IElementFactory;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

import static aquality.selenium.browser.AqualityServices.getBrowser;

public class ScrollViewPage extends Form {
    private final IElementFactory elementFactory = AqualityServices.getElementFactory();
    private final By javaScriptAlertsButton = By.xpath("//a[@href='/javascript_alerts']");
    private final String scrollScript = "arguments[0].scrollIntoView(true);";
   

    private final IButton clickForJavaScriptAlerts = elementFactory.getButton(javaScriptAlertsButton, "Click for JS alert");
    
    public ScrollViewPage() {
        super(By.xpath("//body"), "Internet Herokuapp Page");
    }

    public void scrollToJavaScriptAlertButton() {
        getBrowser().executeScript(scrollScript,clickForJavaScriptAlerts.getElement());
    }

    public void clickJavaScriptAlertsBtn() {
        clickForJavaScriptAlerts.click();
    }
}
