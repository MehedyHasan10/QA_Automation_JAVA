package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.MultipleWindowsPage;

import static aquality.selenium.browser.AqualityServices.getBrowser;

public class MultipleWindowsSteps {
    private final MultipleWindowsPage multipleWindowsPage = new MultipleWindowsPage();
    @When("I click on the Click Here link to open a new window")
    public void iClickOnTheLinkToOpenANewWindow() {
        multipleWindowsPage.clickClickHereLink();
    }

    @Then("I should be able to switch to the new window")
    public void iShouldBeAbleToSwitchToTheNewWindow() {
        getBrowser().tabs().switchToLast();
    }

    @Then("I should see the new window's title as {string}")
    public void iShouldSeeTheNewWindowsTitleAs(String expectedTitle) {
        String actualTitle = getBrowser().getDriver().getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Tab title does not match");
    }

    @And("The header text on the new tab should be {string}")
    public void theHeaderTextOnTheNewTabShouldBe(String expectedText) {
        String headerText = multipleWindowsPage.getHeaderText();
        Assert.assertEquals(headerText, expectedText, "Header does not match");
    }
}
