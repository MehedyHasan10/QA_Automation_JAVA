package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class DataTableTests extends BaseTest {

    private final By dataTables = By.xpath(String.format(PRECISE_TEXT_XPATH, "Sortable Data Tables"));
    private final By columnValues = By.xpath("//table[@id='table1']//tbody//tr//td[4]");
    private final Double expectedSum = 251.0;
    private final String currencyRegex = "[^\\d.]";

    @Test
    public void dataTableTests() {
        driver.findElement(dataTables).click();
        List<WebElement> duelist = driver.findElements(columnValues);
        Double actualSum = 0.0;
        
        for (WebElement element : duelist) {
            String elementText = element.getText().trim();
            if (!elementText.isEmpty()) {
                actualSum += Double.parseDouble(elementText.replaceAll(currencyRegex, ""));
            }
        }
        
        Assert.assertEquals(actualSum,expectedSum, "Sum is not correct");
    }
}
