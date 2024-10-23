package tests;

import org.testng.annotations.Test;
import pages.ScrollViewPage;

public class ScrollViewTest extends BaseTest {
    private final ScrollViewPage scrollViewPage = new ScrollViewPage();
    
    @Test
    public void alertsJsPromptTest() {
        scrollViewPage.scrollToJavaScriptAlertButton();
        scrollViewPage.clickJavaScriptAlertsBtn();
    }
}
