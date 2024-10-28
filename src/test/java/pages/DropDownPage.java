package pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.IComboBox;
import aquality.selenium.elements.interfaces.IElementFactory;
import aquality.selenium.forms.Form;
import constants.LocatorConstants;
import org.openqa.selenium.By;

public class DropDownPage extends Form {
    private final static String NAME = "Dropdown";
    private final IElementFactory elementFactory = AqualityServices.getElementFactory();
    private final By comboBoxLocator = By.xpath("//select[@id='dropdown']");
    private final IComboBox comboBox = elementFactory.getComboBox(comboBoxLocator, "Combo Box");

    public DropDownPage() {
        super(By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH, NAME)), NAME);
    }
    
    public void selectComboBoxOptionByText(String optionText) {
        comboBox.selectByText(optionText);
    }

    public String getSelectedOptionText() {
        return comboBox.getSelectedText();
    }
}
