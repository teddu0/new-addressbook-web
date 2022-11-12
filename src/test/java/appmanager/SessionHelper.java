package appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SessionHelper extends BaseHelper {

    public SessionHelper(WebDriver driver) {
        super(driver);
    }

    public void login(String username, String password) {
        typeText(By.name("user"), username);
        typeText(By.name("pass"), password);
        click(By.xpath("//input[@type = 'submit']"));
    }
}
