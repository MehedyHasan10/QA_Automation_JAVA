package stepdefinitions;

import io.cucumber.java.en.When;
import pages.ScrollViewPage;

public class ScrollViewSteps {
    private final ScrollViewPage scrollViewPage = new ScrollViewPage();
    
    @When("I scroll to the JavaScript Alert button")
    public void scrollToJavaScriptAlertButton() {
        scrollViewPage.scrollToJavaScriptAlertButton();
    }

    @When("I click the JavaScript Alert button")
    public void clickJavaScriptAlertsButton() {
        scrollViewPage.clickJavaScriptAlertsBtn();
    }
}
