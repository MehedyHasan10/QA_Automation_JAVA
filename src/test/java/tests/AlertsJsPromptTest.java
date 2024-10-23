package tests;

import aquality.selenium.browser.AlertActions;
import pages.JavaScriptAlertsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.UUID;

import static aquality.selenium.browser.AqualityServices.getBrowser;

public class AlertsJsPromptTest extends BaseTest {
    private final JavaScriptAlertsPage javaScriptAlertsPage = new JavaScriptAlertsPage();
    private static final String inputText = UUID.randomUUID().toString();

    @Test
    public void alertsJsPromptTest() {
        javaScriptAlertsPage.clickJavaScriptAlertsBtn();
        javaScriptAlertsPage.clickForJsPromptBtn();
        getBrowser().getDriver().switchTo().alert().sendKeys(inputText);
        getBrowser().handleAlert(AlertActions.ACCEPT);
        String expectedResult = "You entered: " + inputText;
        Assert.assertTrue(javaScriptAlertsPage.isPromptSuccessMessageDisplayed(expectedResult),
                "The success message for the prompt is not displayed or does not contain the expected text: " + expectedResult);
    }
}
