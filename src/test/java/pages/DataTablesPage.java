package pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.ElementType;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import constants.LocatorConstants;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;

public class DataTablesPage extends Form {
    private static final String NAME = "Data Tables";
    private final By due = By.xpath("//*[@id='table1']//td[4]");

    public DataTablesPage() {
        super(By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH, NAME)), NAME);
    }

    public List<String> getFirstDueList() {
        List<String> dueList = new ArrayList<>();

        for (ILabel label : getFirstDueLblList()) {
            dueList.add(label.getText());
        }
        return dueList;
    }

    private List<ILabel> getFirstDueLblList() {
        return AqualityServices.getElementFactory().findElements(due, "due", ElementType.LABEL);
    }
}
