package pages;

import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;
import utils.BrowserUtils;

import static aquality.selenium.browser.AqualityServices.getBrowser;

public class IframesPage extends Form {
    private final ILabel mainPageHeader = getElementFactory().getLabel(By.xpath("//h1[@itemprop='headline']"), "Main Page Header");
    private final ILabel automateNowLogo = getElementFactory().getLabel(By.xpath("//img[@alt='automateNow Logo']"), "AutomateNow Logo");
    private final ILabel playwrightLogo = getElementFactory().getLabel(By.xpath("//img[@alt='Playwright logo']"), "Playwright Logo");
    private final By iFrameLocator = By.xpath("//iframe[@id='iframe-1']");
    
    public IframesPage() {
        super(By.xpath("//body"), "Iframes Page");
    }

    public boolean isMainPageHeaderDisplayed() {
        return mainPageHeader.state().isDisplayed();
    }

    public boolean isAutomateNowLogoDisplayed() {
        return automateNowLogo.state().isDisplayed();
    }

    public boolean isPlaywrightLogoDisplayed() {
        return playwrightLogo.state().isDisplayed();
    }

    public void switchToIframe() {
        BrowserUtils.switchIFrame(iFrameLocator);
    }
}
