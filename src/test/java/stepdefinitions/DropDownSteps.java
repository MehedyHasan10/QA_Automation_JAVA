package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.DropDownPage;

public class DropDownSteps {
    private final DropDownPage dropDownPage = new DropDownPage();
    
    @When("I select {string} from the dropdown")
    public void selectOptionFromDropdown(String optionText) {
        dropDownPage.selectComboBoxOptionByText(optionText);
    }

    @Then("the selected option should be {string}")
    public void verifySelectedOption(String expectedOption) {
        String actualSelectedOption = dropDownPage.getSelectedOptionText();
        Assert.assertEquals(actualSelectedOption, expectedOption,
                "The selected option does not match the expected value.");
    }
}
