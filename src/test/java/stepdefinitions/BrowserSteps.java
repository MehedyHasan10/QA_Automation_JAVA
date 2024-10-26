package stepdefinitions;

import aquality.selenium.browser.AlertActions;
import io.cucumber.java.en.Given;

import static aquality.selenium.browser.AqualityServices.getBrowser;
import static io.qameta.allure.Allure.step;

public class BrowserSteps {
    @Given("I accept the Js alert")
    public void acceptJsAlert() {
        step("Accepting the alert");
        getBrowser().handleAlert(AlertActions.ACCEPT);
    }
}
