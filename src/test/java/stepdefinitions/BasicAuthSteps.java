package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.BasicAuthPage;
import utils.SettingsTestData;

import static aquality.selenium.browser.AqualityServices.getBrowser;
import static io.qameta.allure.Allure.step;

public class BasicAuthSteps {
    private final BasicAuthPage basicAuthPage = new BasicAuthPage();
    
    @When("I provide valid credentials")
    public void iProvideValidCredentials() {
        getBrowser().network().addBasicAuthentication(
                SettingsTestData.getEnvData().getHost(),
                SettingsTestData.getUserData().getUsername(), 
                SettingsTestData.getUserData().getPassword());
        step("Provide valid credentials for Basic Authentication");
    }

    @Then("I should see a success message")
    public void iShouldSeeASuccessMessage() {
        Assert.assertTrue(basicAuthPage.isSuccessMsgDisplayed(), "Success message was not displayed");
        step("Verify the success message is displayed");
    }
}
