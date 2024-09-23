package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.UUID;

public class DynamicControlsTest extends BaseTest {

    private final By dynamicControl = By.xpath(String.format(PRECISE_TEXT_XPATH, "Dynamic Controls"));
    private final By enable = By.xpath("//*[@id=\"input-example\"]/button");
    private final By input = By.xpath("//*[@id=\"input-example\"]/input");
    private final String randomText = UUID.randomUUID().toString();

    @Test
    public void dynamicControlsTest() {
        driver.findElement(dynamicControl).click();
        driver.findElement(enable).click();
        
        WebElement inputField = driver.findElement(input);
        Assert.assertTrue(isClickable(inputField), "Element wasn't enabled");
        
        inputField.sendKeys(randomText);
        Assert.assertEquals(driver.findElement(input).getAttribute("value"),randomText,
                "Text is not displayed");
    }
    
    private boolean isClickable(WebElement element) {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(element));
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
