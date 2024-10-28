package tests;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.browser.Browser;
import utils.SettingsTestData;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static aquality.selenium.browser.AqualityServices.getBrowser;

public abstract class BaseTest {
    protected Browser browser;

    @BeforeMethod
    public void setup() {
        browser = getBrowser();
        browser.maximize();
        browser.goTo(SettingsTestData.getEnvData().getHost());
    }

    @AfterMethod
    public void teardown() {
        if (AqualityServices.isBrowserStarted()) {
            getBrowser().quit();
        }
    }
}
