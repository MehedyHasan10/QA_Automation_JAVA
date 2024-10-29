package pages;

import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class FileUploadSuccessfulPage extends Form {
    private final ILabel uploadFileLbl = getElementFactory().getLabel(By.id("uploaded-files"), "File Name");
    
    public FileUploadSuccessfulPage(){
        super(By.id("uploaded-files"),"File Upload Successful Page");
    }
    
    public String getUploadedFileName() {
        return uploadFileLbl.getText();
    }
    
}
