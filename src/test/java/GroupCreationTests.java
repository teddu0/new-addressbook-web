import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class GroupCreationTests extends TestBase {


    @Test
    public void testGroupCreation() throws InterruptedException {
        goToGroupsPage();
        initContactCreation();
        fillGroupForm("Test", "Test2", "Test3");
        returnToHomePage();
        Thread.sleep(3000);
    }


}
