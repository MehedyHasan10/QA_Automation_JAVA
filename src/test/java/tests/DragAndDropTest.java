package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DragAndDropTest extends BaseTest {
    private final By dragAndDropButton = By.xpath(String.format(PRECISE_TEXT_XPATH, "Drag and Drop"));
    private final By columnA = By.id("column-a");
    private final By columnB = By.id("column-b");
    private final String expectedText ="A";
    
    @Test
    public void testDragAndDrop() {
        driver.findElement(dragAndDropButton).click();

        String script = """
            function createEvent(typeOfEvent) {
                var event = document.createEvent("CustomEvent");
                event.initCustomEvent(typeOfEvent, true, true, null);
                event.dataTransfer = {
                    data: {},
                    setData: function(key, value) {
                        this.data[key] = value;
                    },
                    getData: function(key) {
                        return this.data[key];
                    }
                };
                return event;
            }

            function dispatchEvent(element, event, transferData) {
                if (transferData !== undefined) {
                    event.dataTransfer = transferData;
                }
                if (element.dispatchEvent) {
                    element.dispatchEvent(event);
                } else if (element.fireEvent) {
                    element.fireEvent("on" + event.type, event);
                }
            }

            function simulateHTML5DragAndDrop(element, target) {
                var dragStartEvent = createEvent('dragstart');
                dispatchEvent(element, dragStartEvent);
                var dropEvent = createEvent('drop');
                dispatchEvent(target, dropEvent, dragStartEvent.dataTransfer);
                var dragEndEvent = createEvent('dragend');
                dispatchEvent(element, dragEndEvent);
            }

            var source = arguments[0];
            var target = arguments[1];
            simulateHTML5DragAndDrop(source, target);
        """;

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript(script, driver.findElement(columnA), driver.findElement(columnB));

        String headerOfSecondColumn = driver.findElement(columnB).getText();
        Assert.assertEquals(headerOfSecondColumn,expectedText, "Column A is not in the second position!");
    }
}
