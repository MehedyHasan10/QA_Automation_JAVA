package pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.ILink;
import aquality.selenium.forms.Form;
import constants.LocatorConstants;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class FileDownloadPage extends Form {
    private static final String NAME = "File Download";

    public FileDownloadPage() {
        super(By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH, NAME)), NAME);
    }

    @Step("Click on the file download link for file '{name}'")
    public void clickFileDownloadLink(String name) {
        getFileDownloadLink(name).click();
    }

    @Step("Check if the file download link for file '{name}' is displayed")
    public boolean isFileDownloadLinkDisplayed(String name) {
        return getFileDownloadLink(name).state().isDisplayed();
    }

    private ILink getFileDownloadLink(String name) {
        return AqualityServices.getElementFactory().getLink(By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH,name )),name);
    }
}