package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;

public class MultipleWindowsTest extends BaseTest {
    protected static final String URL = "https://the-internet.herokuapp.com/";
    private final By multipleWindowsButton = By.xpath("//a[@href='/windows']");
    private final By clickHereButton = By.xpath("//a[@href='/windows/new']");
    private final By header = By.xpath("//div[@class='example']/h3");
    private final String expectedHeader = "New Window";

    @BeforeMethod
    public void setUp() {
        driver.get(URL);
    }

    @Test
    public void testNewWindowHeader() {
        driver.findElement(multipleWindowsButton).click();
        driver.findElement(clickHereButton).click();

        String originalWindow = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();
        for (String windowHandle : allWindows) {
            if (!windowHandle.equals(originalWindow)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }

        String headerText = driver.findElement(header).getText();
        Assert.assertEquals(headerText, expectedHeader, "Header does not match 'New Window'");
    }
}
