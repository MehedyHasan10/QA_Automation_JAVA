package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class IframesTest extends BaseTest {
    protected static final String URL = "https://practice-automation.com/iframes/";
    private final By automateNowLogo = By.xpath("//img[@alt='automateNow Logo']");
    private final By playwrightLogo = By.xpath("//img[@alt='Playwright logo']");
    private final By mainPageHeader = By.xpath("//h1[@itemprop='headline']");

    @BeforeMethod
    public void setUp() {
        driver.get(URL);
    }

    @Test
    public void testIframeAndLogos() {
        driver.navigate().refresh();
        wait.until(ExpectedConditions.visibilityOfElementLocated(mainPageHeader));
        Assert.assertTrue(driver.findElement(mainPageHeader).isDisplayed(), "Main page is not displayed.");

        driver.switchTo().frame(0);
        Assert.assertTrue(driver.findElement(playwrightLogo).isDisplayed(), "Playwright logo is not displayed.");

        driver.switchTo().defaultContent();
        Assert.assertTrue(driver.findElement(automateNowLogo).isDisplayed(), "automateNow logo is not displayed.");
    }
}
