package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.IframesPage;

public class IframesTest extends BaseTest {
    private final IframesPage iframesPage = new IframesPage();

    @Test
    public void testIframeAndLogos() {
        browser.refresh();
        Assert.assertTrue(iframesPage.isMainPageHeaderDisplayed(), "Main page header is not displayed.");
        iframesPage.switchToIframe();
        Assert.assertTrue(iframesPage.isPlaywrightLogoDisplayed(), "Playwright logo is not displayed in the iframe.");
        
        iframesPage.switchToDefaultContent();
        Assert.assertTrue(iframesPage.isAutomateNowLogoDisplayed(), "AutomateNow logo is not displayed on the main page.");
    }
}
