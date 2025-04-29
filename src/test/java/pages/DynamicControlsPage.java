package pages;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ITextBox;
import aquality.selenium.forms.Form;
import constants.LocatorConstants;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class DynamicControlsPage extends Form {
    private static final String NAME = "Dynamic Controls";
    private final IButton enableButton = getElementFactory().getButton( By.xpath("//*[@id='input-example']/button"), "Enable Button");
    private final ITextBox inputField = getElementFactory().getTextBox( By.xpath("//*[@id='input-example']/input"),"Input Field");

    public DynamicControlsPage() {
        super(By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH, NAME)), NAME);
    }

    @Step("Click the enable button")
    public void clickEnableButton() {
        enableButton.click();
    }

    @Step("Check if the input field is enabled")
    public boolean isInputFieldEnabled() {
        return inputField.state().waitForEnabled();
    }

    @Step("Enter text '{text}' in the input field")
    public void enterText(String text) {
        inputField.clearAndType(text);
    }

    @Step("Get the current text from the input field")
    public String getInputFieldText() {
        return inputField.getValue();
    }
}
