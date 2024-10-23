package pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.IElementFactory;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class JavaScriptAlertsPage extends Form {
    private final IElementFactory elementFactory = AqualityServices.getElementFactory();
    private final By javaScriptAlertsButton = By.xpath("//a[@href='/javascript_alerts']");
    private final By jsPromptButton = By.xpath("//button[@onclick='jsPrompt()']");
    private final By resultHeader = By.xpath("//p[@id='result']");

    private final IButton clickForJavaScriptAlerts = elementFactory.getButton(javaScriptAlertsButton, "Click for JS alert");
    private final IButton clickForJsPromptBtn = elementFactory.getButton(jsPromptButton, "Click for JS Prompt");
    private final ILabel resultLabel = elementFactory.getLabel(resultHeader, "Result");

    public JavaScriptAlertsPage() {
        super(By.xpath("//body"), "Internet Herokuapp Page");
    }

    public void clickJavaScriptAlertsBtn() {
        clickForJavaScriptAlerts.click();
    }
    
    public void clickForJsPromptBtn() {
        clickForJsPromptBtn.click();
    }

    public boolean isPromptSuccessMessageDisplayed(String expectedText) {
        return resultLabel.getText().equals(expectedText);
    }
}
