package hooks;

import aquality.selenium.browser.AqualityServices;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.SettingsTestData;

import static aquality.selenium.browser.AqualityServices.getBrowser;
import static io.qameta.allure.Allure.step;

public class Hooks {

    @Before
    public void setup() {
        step("Opening the browser and maximizing the browser window");
        getBrowser().maximize();
        step("Visiting the website url");
        getBrowser().goTo(SettingsTestData.getEnvData().getHost());
    }

    @After
    public void teardown() {
        step("Quiting the browser");
        if (AqualityServices.isBrowserStarted()) {
            getBrowser().quit();
        }
    }
}
