package pages;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ICheckBox;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class CheckBoxPage extends Form {
    private final ICheckBox firstCheckbox = getElementFactory().getCheckBox(By.xpath("//form/input[1]"), "First Checkbox");
    private final ICheckBox secondCheckbox = getElementFactory().getCheckBox(By.xpath("//form/input[2]"), "Second Checkbox");
    private final IButton clickForCheckBoxBtn = getElementFactory().getButton(By.xpath("//a[@href='/checkboxes']"), "Click Check Box Button");

    public CheckBoxPage() {
        super(By.xpath("//body"), "Internet Herokuapp Page");
    }

    public void clickCheckBoxButton() {
        clickForCheckBoxBtn.click();
    }

    public boolean isFirstCheckboxChecked() {
        return firstCheckbox.isChecked();
    }

    public boolean isSecondCheckboxChecked() {
        return secondCheckbox.isChecked();
    }

    public void toggleFirstCheckbox() {
        firstCheckbox.click();
    }

    public void toggleSecondCheckbox() {
        secondCheckbox.click();
    }
}
