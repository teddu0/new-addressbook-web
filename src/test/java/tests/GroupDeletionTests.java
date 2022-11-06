package tests;

import org.testng.annotations.Test;

public class GroupDeletionTests extends TestBase {
    @Test
    public void testGroupDeletion() throws InterruptedException {
        app.goToGroupsPage();
        app.selectGroup();
        app.deleteSelectedGroups();
        app.returnToGroupPage();
        Thread.sleep(3000);
    }


}
