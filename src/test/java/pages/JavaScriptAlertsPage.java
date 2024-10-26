package pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.IElementFactory;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import constants.LocatorConstants;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class JavaScriptAlertsPage extends Form {
    private static final String PAGE_NAME = "JavaScript Alerts";
    private final IElementFactory elementFactory = AqualityServices.getElementFactory();
    private final By clickForJsAlertButton = By.xpath("//button[@onclick='jsAlert()']");
    private final By successMessage = By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH, "You successfully clicked an alert"));
    private final IButton clickForJsAlertBtn = elementFactory.getButton(clickForJsAlertButton, "Click for JS alert");
    private final ILabel successLbl = elementFactory.getLabel(successMessage, "Success");

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
