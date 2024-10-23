package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FindElementsPage;

public class FindElementTest extends BaseTest{
    private final FindElementsPage findElementsPage = new FindElementsPage();

    @Test
    public void testFindElements() {
        findElementsPage.acceptConsentPolicy();
        findElementsPage.searchForCity("New York");
        browser.waitForPageToLoad();
        findElementsPage.clickFirstSearchResult();
        Assert.assertTrue(findElementsPage.isCityHeaderDisplayed(), "City header is not displayed.");
    }
}
