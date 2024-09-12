package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.UUID;

public class DynamicControlsTest extends BaseTest {

    private final By DYNAMIC_CONTROL = By.xpath(String.format(PRECISE_TEXT_XPATH, "Dynamic Controls"));
    private final By ENABLE = By.xpath("//*[@id=\"input-example\"]/button");
    private final By INPUT = By.xpath("//*[@id=\"input-example\"]/input");

    // Generate a random text string using UUID for testing input
    private final String RANDOM_TEXT = UUID.randomUUID().toString();

    @Test
    public void dynamicControlsTest() {

        driver.findElement(DYNAMIC_CONTROL).click();
        driver.findElement(ENABLE).click();

        // Find the input field element
        WebElement inputField = driver.findElement(INPUT);

        // Wait until the input field is clickable, then verify it is enabled
        Assert.assertTrue(isClickable(inputField), "Element wasn't enabled");

        // Enter the random text into the input field
        inputField.sendKeys(RANDOM_TEXT);

        // Assert that the input field contains the entered text
        Assert.assertEquals(driver.findElement(INPUT).getAttribute("value"), RANDOM_TEXT,
                "Text is not displayed");
    }

    // Utility method to check if an element is clickable
    private boolean isClickable(WebElement element) {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(element));
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
//-----
