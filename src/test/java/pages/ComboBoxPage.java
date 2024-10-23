package pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.IComboBox;
import aquality.selenium.elements.interfaces.IElementFactory;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class ComboBoxPage extends Form {
    private final IElementFactory elementFactory = AqualityServices.getElementFactory();
    private final By dropDownButton = By.xpath("//a[@href='/dropdown']");
    private final By comboBoxButton = By.xpath("//select[@id='dropdown']");
    
    private final IButton clickForDropDownBtn = elementFactory.getButton(dropDownButton,"Click Drop Down Button");
    private final IComboBox clickForComboBoxBtn = elementFactory.getComboBox(comboBoxButton,"Click Combo Box");
    
    public ComboBoxPage(){
        super(By.xpath("//body"), "Internet Herokuapp Page");
    }
    
    public void clickDripDownButton(){
        clickForDropDownBtn.click();
    }

    public void selectComboBoxOptionByText(String optionText) {
        clickForComboBoxBtn.selectByText(optionText);
    }

    public String getSelectedOptionText() {
        return clickForComboBoxBtn.getSelectedText();
    }
}
