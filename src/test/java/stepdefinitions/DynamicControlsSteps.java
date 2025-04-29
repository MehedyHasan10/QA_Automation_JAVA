package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.DynamicControlsPage;
import java.util.UUID;
import static io.qameta.allure.Allure.step;

public class DynamicControlsSteps {
    private final DynamicControlsPage dynamicControlsPage = new DynamicControlsPage();
    private String randomText = UUID.randomUUID().toString();
    
    @When("I click the enable button")
    public void iClickEnableButton() {
            dynamicControlsPage.clickEnableButton();
            step("Click the 'Enable' button");
    }

    @Then("the input field should be enabled")
    public void theInputFieldShouldBeEnabled() {
        Assert.assertTrue(dynamicControlsPage.isInputFieldEnabled(), "Input field is not enabled");
        step("Verify the input field is enabled");
    }

    @When("I enter random text in the input field")
    public void iEnterRandomTextInTheInputField() {
        dynamicControlsPage.enterText(randomText);
        step("Input random text into the enabled input field");
    }
    
//   @Then("the input field should contain the entered text")
//    public void theInputFieldShouldContainTheEnteredText(){
//        Assert.assertEquals(dynamicControlsPage.getInputFieldText(),randomText,"Input field text does not match the entered text");
//       step("Verify the input text matches the entered random text");
//    }
}
