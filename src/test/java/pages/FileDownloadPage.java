package pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.ILink;
import aquality.selenium.forms.Form;
import constants.LocatorConstants;
import org.openqa.selenium.By;

public class FileDownloadPage extends Form {
    private static final String NAME = "File Download";

    public FileDownloadPage() {
        super(By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH, NAME)), NAME);
    }

    public void clickFileDownloadLink(String name) {
        getFileDownloadLink(name).click();
    }

    public boolean isFileDownloadLinkDisplayed(String name) {
        return getFileDownloadLink(name).state().isDisplayed();
    }

    private ILink getFileDownloadLink(String name) {
        return AqualityServices.getElementFactory().getLink(By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH,name )),name);
    }
}