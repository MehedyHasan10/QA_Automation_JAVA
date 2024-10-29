package pages;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import constants.LocatorConstants;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class JavaScriptAlertsPage extends Form {
    private static final String PAGE_NAME = "JavaScript Alerts";
    private final IButton clickForJsAlertBtn = getElementFactory().getButton(By.xpath("//button[@onclick='jsAlert()']"), "Click for JS alert");
    private final ILabel successLbl = getElementFactory().getLabel(By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH, "You successfully clicked an alert")), "Success");
    
    public JavaScriptAlertsPage() {
        super(By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH, PAGE_NAME)), PAGE_NAME);
    }

    @Step("Clicking javascript alert button")
    public void clickForJsAlertBtn() {
        clickForJsAlertBtn.click();
    }

    @Step("Verifying success label is displayed or not")
    public boolean isSuccessLabelDisplayed() {
        return successLbl.state().isDisplayed();
    }
}
