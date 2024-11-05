package pages;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import utils.BrowserUtils;

public class RecentLocationPage extends Form {
    private final IButton recentLocation =getElementFactory().getButton(By.xpath("//div[@class='featured-locations']//a[1]"), "Click Recent Location");
    private final IButton adsCrossButton = getElementFactory().getButton(By.xpath("//div[@id='dismiss-button']"),"Click ads cross button");
    private final ILabel header =getElementFactory().getLabel(By.xpath("//h1[@class='header-loc']"), "City Header");
    private final By iFrameLocator = By.xpath("//iframe[@id='google_ads_iframe_/6581/web/gb/interstitial/news_info/country_home_0' and @title='3rd party ad content']");
    private final ILabel adIframe = getElementFactory().getLabel(iFrameLocator,"Ads Iframe");
    
    
    public RecentLocationPage(){
        super(By.xpath("//div[@class='featured-locations']//a[1]"),"AccuWeather Main Page");
    }

    @Step("Checking if the city header is displayed")
    public boolean isCityHeaderDisplayed() {
        return header.state().waitForDisplayed();
    }

    @Step("Click recent location")
    public void forRecentLocation(){
        recentLocation.click();
    }
    
    @Step("If find any iframe and ads close button")
    public void forIframeAndAdCloseButtonIfVisible() {
        if (adIframe.state().isExist()) {
            BrowserUtils.switchIFrame(iFrameLocator);
                adsCrossButton.click();
            BrowserUtils.switchToDefaultContent();
        }
    }
}
