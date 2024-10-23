package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SwitchTabPage;

import static aquality.selenium.browser.AqualityServices.getBrowser;

public class SwitchTabTest extends BaseTest {
    private final SwitchTabPage switchTabPage = new SwitchTabPage();
    private final  String expectedText = "New Window";

    @Test
    public void windowTest() {
        switchTabPage.clickForMultipleWindowsBtn();
        switchTabPage.clickClickHereButton();
        getBrowser().tabs().switchToLast();
        
        String newTabTitle = getBrowser().getDriver().getTitle();
        Assert.assertEquals(newTabTitle,expectedText,"Tab title does not match");
        
        String headerText = switchTabPage.getHeaderText();
        Assert.assertEquals(headerText,expectedText, "Header does not match ");
    }
}
