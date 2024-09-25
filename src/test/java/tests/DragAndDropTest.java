package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DragAndDropTest extends BaseTest {
    private final By dragAndDropButton = By.xpath("//a[@href='/drag_and_drop']");
    private final By columnA = By.id("column-a");
    private final By columnB = By.id("column-b");
    private final String expectedText = "A";

    @Test
    public void testDragAndDrop() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].click();", driver.findElement(dragAndDropButton));

        Actions actions = new Actions(driver);
        actions.clickAndHold(driver.findElement(columnA))
                .moveToElement(driver.findElement(columnB))
                .release()
                .build()
                .perform();

        String headerOfSecondColumn = driver.findElement(columnB).getText();
        Assert.assertEquals(headerOfSecondColumn, expectedText, "Column A has not been successfully dragged to Column B!");
    }
}