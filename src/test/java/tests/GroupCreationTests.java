package tests;

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
        fillGroupForm(faker.name().firstName(), faker.harryPotter().character(), faker.gameOfThrones().dragon());
        returnToHomePage();
        Thread.sleep(3000);
    }


}
