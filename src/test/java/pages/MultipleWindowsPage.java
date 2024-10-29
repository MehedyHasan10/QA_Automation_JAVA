package pages;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import constants.LocatorConstants;
import org.openqa.selenium.By;

public class MultipleWindowsPage extends Form {
    private static final String PAGE_NAME = "Multiple Windows";
    private final IButton clickHereLinkBtn = getElementFactory().getButton(By.xpath("//a[@href='/windows/new']"), "Click Here Link");
    private final ILabel headerLabel = getElementFactory().getLabel(By.xpath("//h3"), "Header");
    
    public MultipleWindowsPage() {
        super(By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH, PAGE_NAME)), PAGE_NAME);
    }

    public void clickClickHereLink() {
        clickHereLinkBtn.click();
    }

    public String getHeaderText() {
        return headerLabel.getText();
    }
}
