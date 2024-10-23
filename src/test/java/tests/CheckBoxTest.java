package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CheckBoxPage;

public class CheckBoxTest extends BaseTest{
    private final CheckBoxPage checkBoxPage = new CheckBoxPage();
    
    @Test
    public void testCheckboxesUsingICheckBox(){
        checkBoxPage.clickCheckBoxButton();
        boolean isFirstCheckboxInitiallyChecked = checkBoxPage.isFirstCheckboxChecked();
        boolean isSecondCheckboxInitiallyChecked =checkBoxPage.isSecondCheckboxChecked();
        
        checkBoxPage.toggleFirstCheckbox();
        Assert.assertNotEquals(checkBoxPage.isFirstCheckboxChecked(), isFirstCheckboxInitiallyChecked, "First checkbox state should be toggled.");
        
        checkBoxPage.toggleSecondCheckbox();
        Assert.assertNotEquals(checkBoxPage.isSecondCheckboxChecked(), isSecondCheckboxInitiallyChecked, "Second checkbox state should be toggled.");
    }
}
