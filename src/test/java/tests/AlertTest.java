package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertTest extends BaseTest {

    private final By JS_ALERT = By.xpath(String.format(PRECISE_TEXT_XPATH, "JavaScript Alerts"));
    private final By JS_ALERT_BUTTON = By.xpath("//button[@onclick='jsAlert()']");
    private final By RESULT_TEXT = By.id("result");
    private final String expectedMessage ="You successfully clicked an alert";

    @Test
    public void alertTest() {

        driver.findElement(JS_ALERT).click();
        driver.findElement(JS_ALERT_BUTTON).click();
        driver.switchTo().alert().accept(); // Switches to the JavaScript alert and accepts it (clicks "OK")

        // Wait for the result message to be visible
        wait.until(ExpectedConditions.visibilityOfElementLocated(RESULT_TEXT));

        // Asserts that the result message displays the correct text
        String actualMessage = driver.findElement(RESULT_TEXT).getText();
        Assert.assertEquals(actualMessage, expectedMessage, "Success message is not displayed as expected");
    }
}

