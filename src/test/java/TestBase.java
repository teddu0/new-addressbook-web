import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {
    public WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://localhost/addressbook/index.php");
        driver.findElement(By.name("user")).sendKeys("admin");
        driver.findElement(By.name("pass")).sendKeys("secret");
        driver.findElement(By.xpath("//input[@type = 'submit']")).click();
    }

    @AfterMethod
    public void tearDown(){
        driver.close();
        driver.quit();
    }

    public void goToGroupsPage(){
        driver.findElement(By.xpath("//a[@href='group.php']")).click();
    }

    public void returnToHomePage() {
        driver.findElement(By.xpath("//a[@href='./']")).click();
    }

    public void initContactCreation() {
        driver.findElement(By.name("new")).click();
    }

    public void fillGroupForm(String name, String header, String footer) {
        driver.findElement(By.name("group_name")).sendKeys(name);
        driver.findElement(By.name("group_header")).sendKeys(header);
        driver.findElement(By.name("group_footer")).sendKeys(footer);
        driver.findElement(By.name("submit")).click();
    }
}
