package pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.IElementFactory;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class SwitchTabPage extends Form {
    private final IElementFactory elementFactory = AqualityServices.getElementFactory();
    private final By multipleWindowsButton = By.xpath("//a[@href='/windows']");
    private final By clickHereButton = By.xpath("//a[@href='/windows/new']");
    private final By header = By.xpath("//div[@class='example']");
    
    private final IButton clickMultipleWindowsBtn = elementFactory.getButton(multipleWindowsButton,"Click Multiple Windows");
    private final IButton clickHereBtn = elementFactory.getButton(clickHereButton,"Click Here Button");
    private final ILabel headerLabel = elementFactory.getLabel(header,"Header Text");
    
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
