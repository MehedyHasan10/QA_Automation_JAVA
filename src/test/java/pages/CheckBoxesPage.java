package pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.ICheckBox;
import aquality.selenium.elements.interfaces.IElementFactory;
import aquality.selenium.forms.Form;
import constants.LocatorConstants;
import org.openqa.selenium.By;

public class CheckBoxesPage extends Form {
    private final static String NAME = "Checkboxes";
    private final IElementFactory elementFactory = AqualityServices.getElementFactory();
    private final ICheckBox firstCheckbox = elementFactory.getCheckBox(By.xpath("//form/input[1]"), "First Checkbox");

    public CheckBoxesPage() {
        super(By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH, NAME)), NAME);
    }

    public boolean isFirstCheckboxChecked() {
        return firstCheckbox.isChecked();
    }
    

    public void toggleFirstCheckbox() {
        firstCheckbox.click();
    }
    
}
