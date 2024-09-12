package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

public class FileUploadTest extends BaseTest {

    private final By FILE_UPLOAD_LINK = By.xpath(String.format(PRECISE_TEXT_XPATH, "File Upload"));
    private final By FILE_INPUT = By.id("file-upload");
    private final By UPLOAD_BUTTON = By.id("file-submit");
    private final By UPLOADED_FILE_NAME = By.id("uploaded-files");
    private final String FILE_NAME = "a1qa.jpg";
    private final String FILE_PATH = PATH + FILE_NAME;
    private final File uploadFile = new File(FILE_PATH);

    @Test
    public void fileUploadTest() {
        driver.findElement(FILE_UPLOAD_LINK).click();
        Assert.assertTrue(uploadFile.exists(), "File does not exist at the specified path: " + FILE_PATH);

        // Upload the file by sending the file path to the input element
        driver.findElement(FILE_INPUT).sendKeys(FILE_PATH);
        driver.findElement(UPLOAD_BUTTON).click();

        // Wait for the uploaded file name to be visible
        wait.until(ExpectedConditions.visibilityOfElementLocated(UPLOADED_FILE_NAME));

        // Verify that the uploaded file name is displayed correctly
        String uploadedFileName = driver.findElement(UPLOADED_FILE_NAME).getText();
        Assert.assertEquals(uploadedFileName, FILE_NAME, "Uploaded file name does not match the expected file name");
    }
}
