package pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.IElementFactory;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import constants.LocatorConstants;
import org.openqa.selenium.By;

public class MultipleWindowsPage extends Form {
    private static final String PAGE_NAME = "Multiple Windows";
    private final IElementFactory elementFactory = AqualityServices.getElementFactory();
    private final By clickHereLink = By.xpath("//a[@href='/windows/new']");
    private final By header = By.xpath("//h3");
    private final IButton clickHereLinkBtn = elementFactory.getButton(clickHereLink, "Click Here Link");
    private final ILabel headerLabel = elementFactory.getLabel(header, "Header");

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
