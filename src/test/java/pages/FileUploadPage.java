package pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.IElementFactory;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.elements.interfaces.ITextBox;
import aquality.selenium.forms.Form;
import constants.LocatorConstants;
import org.openqa.selenium.By;

public class FileUploadPage extends Form {

    private final static String NAME = "File Upload";
    private IElementFactory elementFactory = AqualityServices.getElementFactory();
    private final By chooseFile = By.id("file-upload"); 
    private final By fileSubmit = By.id("file-submit"); 
    private final By uploadedFileName = By.id("uploaded-files"); 
    private final ITextBox fileNameInput = elementFactory.getTextBox(chooseFile, "Upload");
    private final IButton fileSubmitBtn = elementFactory.getButton(fileSubmit, "Submit file");
    private final ILabel uploadFileLbl = elementFactory.getLabel(uploadedFileName, "File Name");

    public FileUploadPage() {
        super(By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH, NAME)), NAME);
    }
    
    public String getUploadedFileName() {
        return uploadFileLbl.getText();
    }
    
    public void uploadFile(String filePath) {
        fileNameInput.clearAndType(filePath);
    }
    
    public void clickSubmitBtn() {
        fileSubmitBtn.click();
    }
}
