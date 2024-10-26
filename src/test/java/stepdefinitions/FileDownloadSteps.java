package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.FileDownloadPage;
import utils.FileUtils;
import utils.SettingsTestData;

import java.io.File;

import static io.qameta.allure.Allure.step;

public class FileDownloadSteps {
    private final FileDownloadPage fileDownloadPage = new FileDownloadPage();
    private final String fileName = SettingsTestData.getFileData().getDownloadFile();
    private final String filePath = SettingsTestData.RESOURCES_PATH + fileName;
    private final File downloadedFile = new File(filePath);
    
    @Then("the download link for the file should be displayed")
    public void theDownloadLinkForTheFileShouldBeDisplayed() {
        Assert.assertTrue(fileDownloadPage.isFileDownloadLinkDisplayed(fileName), "File is not displayed.");
        step("Verify that the file download link is displayed for the file");
    }

    @And("I click the file download link")
    public void iClickTheFileDownloadLink() {
        fileDownloadPage.clickFileDownloadLink(fileName);
        step("Click the file download link for the file");
    }

    @Then("the file should be downloaded successfully")
    public void theFileShouldBeDownloadedSuccessfully() {
        Assert.assertTrue(FileUtils.isFileExist(downloadedFile), "File is not downloaded.");
        step("Verify the file has been downloaded to the path");
    }

    @And("I delete the file if it exists")
    public void iDeleteTheFileIfItExists() {
        FileUtils.deleteFileIfExist(downloadedFile);
        step("Delete the file if it exists at the path");
    }
}
