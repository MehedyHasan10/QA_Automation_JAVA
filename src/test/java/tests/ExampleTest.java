package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ExampleTest extends BaseTest {
    private final By example = By.xpath(String.format(PRECISE_TEXT_XPATH, "Form Authentication"));
    private final By successAuth = By.xpath(String.format(PARTICULAR_TEXT_XPATH, "You logged into a secure area!"));
    private final By errorAuth = By.xpath(String.format(PARTICULAR_TEXT_XPATH,"Your username is invalid!"));
    
    @Test
    public void successfulLoginTest() {
        driver.findElement(example).click();
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Assert.assertTrue(driver.findElement(successAuth).isDisplayed(),
                "Login failed: Success message not found.");
    }
    
    @Test
    public void unsuccessfulLoginTest() {
        driver.findElement(example).click();
        driver.findElement(By.id("username")).sendKeys("invalidUser");
        driver.findElement(By.id("password")).sendKeys("invalidPassword!");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Assert.assertTrue(driver.findElement(errorAuth).isDisplayed(), "Login did not fail as expected: Error message not found.");
    }
}
