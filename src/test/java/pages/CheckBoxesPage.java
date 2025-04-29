package pages;

import aquality.selenium.elements.interfaces.ICheckBox;
import aquality.selenium.forms.Form;
import constants.LocatorConstants;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class CheckBoxesPage extends Form {
    private final static String NAME = "Checkboxes";
    private final ICheckBox firstCheckbox = getElementFactory().getCheckBox(By.xpath("//form/input[1]"), "First Checkbox");

    public CheckBoxesPage() {
        super(By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH, NAME)), NAME);
    }
    @Step("Check if the first checkbox is checked")
    public boolean isFirstCheckboxChecked() {
        return firstCheckbox.isChecked();
    }
    @Step("Toggle the first checkbox")
    public void toggleFirstCheckbox() {
        firstCheckbox.click();
    }
}
