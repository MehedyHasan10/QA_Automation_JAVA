package pages;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class JavaScriptAlertsPage extends Form {
    private final IButton clickForJavaScriptAlerts =getElementFactory().getButton(By.xpath("//a[@href='/javascript_alerts']"), "Click for JS alert");
    private final IButton clickForJsPromptBtn = getElementFactory().getButton(By.xpath("//button[@onclick='jsPrompt()']"), "Click for JS Prompt");
    private final ILabel resultLabel = getElementFactory().getLabel(By.xpath("//p[@id='result']"), "Result");


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
