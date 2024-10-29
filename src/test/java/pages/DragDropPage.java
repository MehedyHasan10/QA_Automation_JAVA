package pages;

import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import constants.LocatorConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import static aquality.selenium.browser.AqualityServices.getBrowser;

public class DragDropPage extends Form {
    private static final String NAME = "Drag Drop";
    private final ILabel columnA = getElementFactory().getLabel(By.id("column-a"), "Column A");
    private final ILabel columnB = getElementFactory().getLabel(By.id("column-b"), "Column B");

    public DragDropPage() {
        super(By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH, NAME)), NAME);
    }

    public void dragColumnAToColumnB() {
        Actions actions = new Actions(getBrowser().getDriver());
        actions.clickAndHold(columnA.getElement())
                .moveToElement(columnB.getElement())
                .release()
                .build()
                .perform();
    }

    public String getColumnAText() {
        return columnA.getText();
    }

    public String getColumnBText() {
        return columnB.getText();
    }
}
