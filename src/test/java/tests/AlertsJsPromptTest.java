package tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertsJsPromptTest extends BaseTest {
    private final By jsAlertPrompt = By.xpath(String.format(PRECISE_TEXT_XPATH, "JavaScript Alerts"));
    private final By jsPromptButton = By.xpath("//button[@onclick='jsPrompt()']");
    private final By resultHeader = By.xpath("//p[@id='result']");
    private final String textMessage = "Hello Selenium";
    private final String expectedResult = "You entered: " + textMessage;
    
    @Test
    public void testJSPrompt() {
        driver.findElement(jsAlertPrompt).click();
        driver.findElement(jsPromptButton).click();

        Alert jsPrompt = driver.switchTo().alert();
        jsPrompt.sendKeys(textMessage);
        jsPrompt.accept();

        String actualResult = driver.findElement(resultHeader).getText();
        Assert.assertEquals(actualResult, expectedResult, "The result text does not match the expected value.");
    }
}