package pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.IElementFactory;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

import static aquality.selenium.browser.AqualityServices.getBrowser;

public class IframesPage extends Form {
    private final IElementFactory elementFactory = AqualityServices.getElementFactory();
    private final ILabel mainPageHeader = elementFactory.getLabel(By.xpath("//h1[@itemprop='headline']"), "Main Page Header");
    private final ILabel automateNowLogo = elementFactory.getLabel(By.xpath("//img[@alt='automateNow Logo']"), "AutomateNow Logo");
    private final ILabel playwrightLogo = elementFactory.getLabel(By.xpath("//img[@alt='Playwright logo']"), "Playwright Logo");
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
        getBrowser().getDriver().switchTo().frame(getBrowser().getDriver().findElement(iFrameLocator));
    }

    public void switchToDefaultContent() {
        getBrowser().getDriver().switchTo().defaultContent();
    }
}
