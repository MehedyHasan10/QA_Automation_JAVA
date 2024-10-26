package stepdefinitions;

import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.DataTablesPage;
import utils.SettingsTestData;
import utils.StringUtils;

public class DataTableSteps {
    private final DataTablesPage dataTablesPage = new DataTablesPage();

    @Then("I should be able to see the sum of the due columns is 251.0")
    public void checkColumnSum() {
        Double actualSum = 0.0;
        for (String due : dataTablesPage.getFirstDueList()) {
            actualSum += StringUtils.getDoubleFromString(due);
        }
        Assert.assertEquals(actualSum, SettingsTestData.getDataTableData().getExpectedDueSum(), "Sum is not correct");
    }
}
