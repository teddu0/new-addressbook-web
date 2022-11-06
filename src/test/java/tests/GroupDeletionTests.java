package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class GroupDeletionTests extends TestBase {
    @Test
    public void testGroupDeletion() throws InterruptedException {
        goToGroupsPage();
        selectGroup();
        deleteSelectedGroups();
        returnToGroupPage();
        Thread.sleep(3000);
    }




}
