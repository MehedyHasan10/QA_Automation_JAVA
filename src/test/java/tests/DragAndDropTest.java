package tests;

import org.junit.Assert;
import org.testng.annotations.Test;
import pages.DragAndDropPage;

public class DragAndDropTest extends BaseTest{
    private final DragAndDropPage dragAndDropPage = new DragAndDropPage();

    @Test
    public void testDragAndDrop() {
        dragAndDropPage.navigateToDragAndDropPage();
        dragAndDropPage.dragColumnAToColumnB();
        
        String actualTextColumnA = dragAndDropPage.getColumnAText();
        String actualTextColumnB = dragAndDropPage.getColumnBText();
        
        Assert.assertEquals("B", actualTextColumnA,"Column B has not been successfully dragged to Column A!");
        Assert.assertEquals("A", actualTextColumnB,"Column A has not been successfully dragged to Column B!");
        
    }
}
