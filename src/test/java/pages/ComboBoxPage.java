package pages;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.IComboBox;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class ComboBoxPage extends Form {
    private final IButton clickForDropDownBtn = getElementFactory().getButton(By.xpath("//a[@href='/dropdown']"), "Click Drop Down Button");
    private final IComboBox clickForComboBoxBtn = getElementFactory().getComboBox(By.xpath("//select[@id='dropdown']"), "Click Combo Box");

    public ComboBoxPage() {
        super(By.xpath("//body"), "Internet Herokuapp Page");
    }

    public void clickDropDownButton() {
        clickForDropDownBtn.click();
    }

    public void selectComboBoxOptionByText(String optionText) {
        clickForComboBoxBtn.selectByText(optionText);
    }

    public String getSelectedOptionText() {
        return clickForComboBoxBtn.getSelectedText();
    }
}
