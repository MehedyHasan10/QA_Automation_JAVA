package tests;

import org.awaitility.Awaitility;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class FileDownloadTest extends BaseTest {

    private final By fileDownload = By.xpath(String.format(PRECISE_TEXT_XPATH, "File Download"));
    private final String fileName = "USA.png";
    private final By fileNameXpath = By.xpath(String.format(PARTICULAR_TEXT_XPATH, fileName));
    private final String filePath = new File(DOWNLOADS_PATH).getAbsolutePath();
    private final File downloadedFile = new File(filePath);

    @Test
    public void fileDownloadTest() {
        driver.findElement(fileDownload).click();
        Assert.assertTrue(driver.findElement(fileNameXpath).isDisplayed(), "File is not displayed");
        driver.findElement(fileNameXpath).click();
        
        Awaitility.await()
                .atMost(MAX_WAIT, TimeUnit.SECONDS)
                .until(() -> downloadedFile.exists());

        Assert.assertTrue(downloadedFile.exists(), "File was not downloaded successfully");
    }

    @AfterMethod
    public void deleteFile() {
        if (downloadedFile.exists()) {
            downloadedFile.delete();
        }
    }
}
