package appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends BaseHelper {

    public NavigationHelper(WebDriver driver) {
        super(driver);
    }

    public void goToGroupsPage() {
        click(By.xpath("//a[@href='group.php']"));
    }

}
