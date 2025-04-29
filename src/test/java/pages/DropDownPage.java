package pages;

import aquality.selenium.elements.interfaces.IComboBox;
import aquality.selenium.forms.Form;
import constants.LocatorConstants;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class DropDownPage extends Form {
    private final static String NAME = "Dropdown";
    private final IComboBox comboBox = getElementFactory().getComboBox(By.xpath("//select[@id='dropdown']"), "Combo Box");

    public DropDownPage() {
        super(By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH, NAME)), NAME);
    }

    @Step("Select option '{optionText}' in the combo box")
    public void selectComboBoxOptionByText(String optionText) {
        comboBox.selectByText(optionText);
    }

    @Step("Get the currently selected option text from the combo box")
    public String getSelectedOptionText() {
        return comboBox.getSelectedText();
    }
}
