package pages;

import aquality.selenium.elements.interfaces.*;
import aquality.selenium.forms.Form;
import constants.LocatorConstants;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class FileUploadPage extends Form {

    private final static String NAME = "File Upload";
    private final ITextBox fileNameInput = getElementFactory().getTextBox(By.id("file-upload"), "Upload");
    private final IButton fileSubmitBtn = getElementFactory().getButton(By.id("file-submit"), "Submit file");
    private final ILabel uploadFileLbl = getElementFactory().getLabel(By.id("uploaded-files"), "File Name");
    
    public FileUploadPage() {
        super(By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH, NAME)), NAME);
    }

    @Step("Upload a file with path: {filePath}")
    public void uploadFile(String filePath) {
        fileNameInput.clearAndType(filePath);
    }

    @Step("Click the submit button to upload the file")
    public void clickSubmitBtn() {
        fileSubmitBtn.click();
    }
}
