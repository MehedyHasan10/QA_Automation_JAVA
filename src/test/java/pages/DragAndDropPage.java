package pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.IElementFactory;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

import static aquality.selenium.browser.AqualityServices.getBrowser;

public class DragAndDropPage extends Form {
    private final IElementFactory elementFactory = AqualityServices.getElementFactory();
    private final By dragAndDropLink = By.xpath("//a[@href='/drag_and_drop']");
    private final By firstColumnA = By.id("column-a");
    private final By secondColumnB = By.id("column-b");

    private final ILabel columnA = elementFactory.getLabel(firstColumnA, "Column A");
    private final ILabel columnB = elementFactory.getLabel(secondColumnB, "Column B");
    private static final String clickScript = "arguments[0].click();";

    public DragAndDropPage() {
        super(By.xpath("//body"), "Internet Herokuapp Page");
    }
    
    public void navigateToDragAndDropPage() {
        JavascriptExecutor jse = getBrowser().getDriver();
        jse.executeScript(clickScript, getBrowser().getDriver().findElement(dragAndDropLink));
        getBrowser().waitForPageToLoad();
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
