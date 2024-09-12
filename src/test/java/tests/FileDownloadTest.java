package tests;

import org.awaitility.Awaitility;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class FileDownloadTest extends BaseTest {

    private final By FILE_DOWNLOAD = By.xpath(String.format(PRECISE_TEXT_XPATH, "File Download"));
    private final String FILE_NAME = "USA.png";
    private final By FILE_NAME_XPATH = By.xpath(String.format(PARTICULAR_TEXT_XPATH, FILE_NAME));
    private final String FILE_PATH = getAbsoluteResourcePath() + File.separator + FILE_NAME;
    private final File downloadedFile = new File(FILE_PATH);

    @Test
    public void fileDownloadTest() {
        driver.findElement(FILE_DOWNLOAD).click();
        Assert.assertTrue(driver.findElement(FILE_NAME_XPATH).isDisplayed(), "File is not displayed");
        driver.findElement(FILE_NAME_XPATH).click();

        // Wait up to MAX_WAIT seconds for the file to be downloaded
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

//----
