package appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BaseHelper {

    private WebDriver driver;

    public BaseHelper(WebDriver driver) {
        this.driver = driver;
    }

    public void typeText(By locator, String text) {
        driver.findElement(locator).click();
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }

}
