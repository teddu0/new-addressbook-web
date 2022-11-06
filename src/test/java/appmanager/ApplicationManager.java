package appmanager;

import io.github.bonigarcia.wdm.WebDriverManager;
import model.GroupData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ApplicationManager {
    public WebDriver driver;

    public void init() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://localhost/addressbook/index.php");
        login("admin", "secret");
    }

    public void stop() {
        driver.close();
        driver.quit();
    }

    public void login(String username, String password) {
        driver.findElement(By.name("user")).click();
        driver.findElement(By.name("user")).clear();
        driver.findElement(By.name("user")).sendKeys(username);
        driver.findElement(By.name("pass")).click();
        driver.findElement(By.name("pass")).clear();
        driver.findElement(By.name("pass")).sendKeys(password);
        driver.findElement(By.xpath("//input[@type = 'submit']")).click();
    }

    public void goToGroupsPage() {
        driver.findElement(By.xpath("//a[@href='group.php']")).click();
    }

    public void returnToGroupPage() {
        driver.findElement(By.xpath("//a[@href='./']")).click();
    }

    public void initGroupCreation() {
        driver.findElement(By.name("new")).click();
    }

    public void fillGroupForm(GroupData groupData) {
        driver.findElement(By.name("group_name")).click();
        driver.findElement(By.name("group_name")).clear();
        driver.findElement(By.name("group_name")).sendKeys(groupData.getName());
        driver.findElement(By.name("group_header")).click();
        driver.findElement(By.name("group_header")).clear();
        driver.findElement(By.name("group_header")).sendKeys(groupData.getHeader());
        driver.findElement(By.name("group_footer")).click();
        driver.findElement(By.name("group_footer")).clear();
        driver.findElement(By.name("group_footer")).sendKeys(groupData.getFooter());
    }

    public void submitGroupCreation() {
        driver.findElement(By.name("submit")).click();
    }

    public void selectGroup() {
        driver.findElement(By.xpath("//input[@name='selected[]']")).click();
    }

    public void deleteSelectedGroups() {
        driver.findElement(By.xpath("//input[@name='delete']")).click();
    }


}