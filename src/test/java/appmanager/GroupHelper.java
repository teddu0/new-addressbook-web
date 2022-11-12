package appmanager;

import model.GroupData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GroupHelper extends BaseHelper {

    public GroupHelper(WebDriver driver) {
        super(driver);
    }

    public void returnToGroupPage() {
        click(By.xpath("//a[@href='./']"));
    }

    public void initGroupCreation() {
        click(By.name("new"));
    }

    public void fillGroupForm(GroupData groupData) {
        typeText(By.name("group_name"), groupData.getName());
        typeText(By.name("group_header"), groupData.getHeader());
        typeText(By.name("group_footer"), groupData.getFooter());
    }

    public void submitGroupCreation() {
        click(By.name("submit"));
    }

    public void selectGroup() {
        click(By.xpath("//input[@name='selected[]']"));
    }

    public void deleteSelectedGroups() {
        click(By.xpath("//input[@name='delete']"));
    }

    public void initGroup() {
        click(By.name("edit"));
    }

    public void submitGroupModification() {
        click(By.name("update"));
    }
}
