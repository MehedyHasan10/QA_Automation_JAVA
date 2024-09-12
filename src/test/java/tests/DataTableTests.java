package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class DataTableTests extends BaseTest {

    private final By DATA_TABLES = By.xpath(String.format(PRECISE_TEXT_XPATH, "Sortable Data Tables"));
    private final By COLUMN_VALUES = By.xpath("//table[@id='table1']//tbody//tr//td[4]");
    private final Double EXPECTED_SUM = 251.0;
    private final String CURRENCY_REGEX = "[^\\d.]";

    @Test
    public void dataTableTests() {
        driver.findElement(DATA_TABLES).click();
        List<WebElement> duelist = driver.findElements(COLUMN_VALUES);
        Double actualSum = 0.0;

        // Calculate the sum of the values in the column
        for (WebElement element : duelist) {
            String elementText = element.getText().trim(); // Trim any extra spaces
            if (!elementText.isEmpty()) {
                actualSum += Double.parseDouble(elementText.replaceAll(CURRENCY_REGEX, ""));
            }
        }

        // For debugging purposes
       // System.out.println("Calculated sum: " + actualSum);

        // Assert that the actual sum matches the expected sum
        Assert.assertEquals(actualSum, EXPECTED_SUM, "Sum is not correct");
    }
}

//-----
