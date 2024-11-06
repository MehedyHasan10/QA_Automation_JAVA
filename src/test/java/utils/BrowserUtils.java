package utils;

import lombok.experimental.UtilityClass;
import org.openqa.selenium.By;

import static aquality.selenium.browser.AqualityServices.getBrowser;

@UtilityClass
public class BrowserUtils {
    public void switchToDefaultContent() {
        getBrowser().getDriver().switchTo().defaultContent();
    }

    public void switchIFrame(By iFrame) {
        getBrowser().getDriver().switchTo().frame(getBrowser().getDriver().findElement(iFrame));
    }

    public void goBackToPreviousPage() {
        getBrowser().goBack();
    }
}
