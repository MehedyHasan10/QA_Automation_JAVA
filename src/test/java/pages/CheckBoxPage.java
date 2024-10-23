package pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ICheckBox;
import aquality.selenium.elements.interfaces.IElementFactory;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class CheckBoxPage extends Form {
    private final IElementFactory elementFactory = AqualityServices.getElementFactory();
    private final By firstCheck = By.xpath("//form/input[1]");
    private final By secondCheck = By.xpath("//form/input[2]");
    private final By checkBoxButton = By.xpath("//a[@href='/checkboxes']");
    
    private final ICheckBox firstCheckbox = elementFactory.getCheckBox(firstCheck,"First Checkbox");
    private final ICheckBox secondCheckbox = elementFactory.getCheckBox(secondCheck,"Second Checkbox");
    private final IButton clickForCheckBoxBtn = elementFactory.getButton(checkBoxButton,"Click Check Box Button");
    
    public CheckBoxPage(){
        super(By.xpath("//body"), "Internet Herokuapp Page");
    }
    
    public void clickCheckBoxButton(){
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
