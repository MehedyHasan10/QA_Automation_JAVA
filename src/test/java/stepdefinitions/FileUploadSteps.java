package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.FileUploadPage;
import utils.SettingsTestData;

import java.io.File;

import static io.qameta.allure.Allure.step;

public class FileUploadSteps {
    private final FileUploadPage fileUploadPage = new FileUploadPage();
    private final String fileName = SettingsTestData.getFileData().getUploadFile();
    private final String filePath = SettingsTestData.RESOURCES_PATH + fileName;
    private final File file = new File(filePath);
    
    @And("I upload the file")
    public void iUploadTheFile() {
        fileUploadPage.uploadFile(file.getAbsolutePath());
        step("Upload the file");
    }

    @And("I click the submit button")
    public void iClickTheSubmitButton() {
        fileUploadPage.clickSubmitBtn();
        step("Click the submit button");
    }

    @Then("the uploaded file name should be {string}")
    public void theUploadedFileNameShouldBe(String expectedFileName) {
        Assert.assertEquals(fileUploadPage.getUploadedFileName(), expectedFileName, "File name is not correct or missed.");
        step("Verify the uploaded file name matches");
    }
}
