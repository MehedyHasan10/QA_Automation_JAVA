package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

public class FileUploadTest extends BaseTest {

    private final By fileUploadLink = By.xpath(String.format(PRECISE_TEXT_XPATH, "File Upload"));
    private final By fileInput= By.id("file-upload");
    private final By uploadButton = By.id("file-submit");
    private final By uploadedFileName = By.id("uploaded-files");
    private final String fileName = "a1qa.jpg";
    private final String filePath = PATH + fileName;
    private final File uploadFile = new File(filePath);

    @Test
    public void fileUploadTest() {
        driver.findElement(fileUploadLink).click();
        Assert.assertTrue(uploadFile.exists(), "File does not exist at the specified path: " + filePath);
        
        driver.findElement(fileInput).sendKeys(filePath);
        driver.findElement(uploadButton).click();
        
        wait.until(ExpectedConditions.visibilityOfElementLocated(uploadedFileName));
        
        String uploadedFile = driver.findElement(uploadedFileName).getText();
        Assert.assertEquals(uploadedFile,fileName, "Uploaded file name does not match the expected file name");
    }
}
