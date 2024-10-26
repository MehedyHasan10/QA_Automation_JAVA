package stepdefinitions;

import io.cucumber.java.en.Given;
import pages.MainPage;

public class MainPageSteps {
    private final MainPage mainPage = new MainPage();

    @Given("I go the {string} on the main page")
    public void navigateTo(String page){
        mainPage.clickNavigationLink(page);
    }
}
