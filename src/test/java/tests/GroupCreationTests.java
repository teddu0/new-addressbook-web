package tests;

import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreation() throws InterruptedException {
        goToGroupsPage();
        initGroupCreation();
        fillGroupForm(new GroupData("test 1", "test 2", "test 3"));
        submitGroupCreation();
        returnToGroupPage();
        Thread.sleep(3000);
    }


}
