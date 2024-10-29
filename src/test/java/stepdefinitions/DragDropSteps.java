package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.DragDropPage;

public class DragDropSteps {
    private final DragDropPage dragDropPage = new DragDropPage();

    @When("I drag Column A to Column B")
    public void dragColumnAToColumnB() {
        dragDropPage.dragColumnAToColumnB();
    }

    @Then("Column A should display {string}")
    public void verifyColumnADisplays(String expectedText) {
        String actualText = dragDropPage.getColumnAText();
        Assert.assertEquals(actualText, expectedText, "Column A does not display the expected text!");
    }

    @Then("Column B should display {string}")
    public void verifyColumnBDisplays(String expectedText) {
        String actualText = dragDropPage.getColumnBText();
        Assert.assertEquals(actualText, expectedText, "Column B does not display the expected text!");
    }
}
