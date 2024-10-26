package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.JavaScriptAlertsPage;


public class JavaScriptAlertPageSteps {
    private final JavaScriptAlertsPage javaScriptAlertsPage = new JavaScriptAlertsPage();

    @Given("I generates the Js alert on the JavaScript Alerts page")
    public void generateJsAlert() {
        javaScriptAlertsPage.clickForJsAlertBtn();
    }

    @Then("I should be able to see the success message displayed on the JavaScript Alerts page")
    public void isSuccessMessageDisplayed() {
        Assert.assertTrue(javaScriptAlertsPage.isSuccessLabelDisplayed(), "Success msg is not displayed");
    }
}
