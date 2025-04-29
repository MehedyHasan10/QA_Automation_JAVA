package pages;

import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class FileUploadSuccessfulPage extends Form {
    private final ILabel uploadFileLbl = getElementFactory().getLabel(By.id("uploaded-files"), "File Name");
    
    public FileUploadSuccessfulPage(){
        super(By.id("uploaded-files"),"File Upload Successful Page");
    }

    @Step("Get the name of the uploaded file")
    public String getUploadedFileName() {
        return uploadFileLbl.getText();
    }
    
}
