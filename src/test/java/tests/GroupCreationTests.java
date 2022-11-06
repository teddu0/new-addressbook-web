package tests;

import model.GroupData;
import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreation() throws InterruptedException {
        app.goToGroupsPage();
        app.initGroupCreation();
        app.fillGroupForm(new GroupData("test 1", "test 2", "test 3"));
        app.submitGroupCreation();
        app.returnToGroupPage();
        Thread.sleep(3000);
    }


}
