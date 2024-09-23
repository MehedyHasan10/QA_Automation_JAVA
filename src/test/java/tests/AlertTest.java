package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertTest extends BaseTest {
    private final By jsAlert = By.xpath(String.format(PRECISE_TEXT_XPATH, "JavaScript Alerts"));
    private final By jsAlertButton = By.xpath("//button[@onclick='jsAlert()']");
    private final By resultText = By.id("result");
    private final String expectedMessage ="You successfully clicked an alert";

    @Test
    public void alertTest() {

        driver.findElement(jsAlert).click();
        driver.findElement(jsAlertButton).click();
        driver.switchTo().alert().accept();
        
        wait.until(ExpectedConditions.visibilityOfElementLocated(resultText));
        
        String actualMessage = driver.findElement(resultText).getText();
        Assert.assertEquals(actualMessage, expectedMessage, "Success message is not displayed as expected");
    }
}
