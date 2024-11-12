package stepdefinitions;

import io.cucumber.java.en.When;

import static aquality.selenium.browser.AqualityServices.getBrowser;

public class BrowserSteps {
    @When("I go back to the previous page")
    public void goToPreviousPage() {
        getBrowser().goBack();
    }
}
