package pages;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class SwitchTabPage extends Form {
    private final IButton clickMultipleWindowsBtn = getElementFactory().getButton(By.xpath("//a[@href='/windows']"), "Click Multiple Windows");
    private final IButton clickHereBtn = getElementFactory().getButton(By.xpath("//a[@href='/windows/new']"), "Click Here Button");
    private final ILabel headerLabel = getElementFactory().getLabel(By.xpath("//div[@class='example']"), "Header Text");
    
    public SwitchTabPage(){
        super(By.xpath("//body"), "Internet Herokuapp Page");
    }
    
    public void clickForMultipleWindowsBtn(){
        clickMultipleWindowsBtn.click();
    }
    
    public void clickClickHereButton(){
        clickHereBtn.click();
    }

    public String getHeaderText() {
        return headerLabel.getText();
    }
}
