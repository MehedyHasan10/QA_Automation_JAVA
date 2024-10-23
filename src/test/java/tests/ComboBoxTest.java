package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ComboBoxPage;

public class ComboBoxTest extends BaseTest {
    private final ComboBoxPage comboBoxPage = new ComboBoxPage();
    private final String optionText = "Option 2";

    @Test
    public void dropDownTest() {
        comboBoxPage.clickDripDownButton();
        comboBoxPage.selectComboBoxOptionByText(optionText);
        String selectedOption = comboBoxPage.getSelectedOptionText();
        Assert.assertEquals(selectedOption, optionText, "The selected option should not Match");
    }
}
