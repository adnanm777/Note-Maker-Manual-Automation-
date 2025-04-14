package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.*;

public class DashboardPage {
    WebDriver driver;
    WebDriverWait wait;

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    By profileButton = By.xpath("//img[@title='Adnan']");
    By greetingText = By.xpath("//h1[contains(text(),'Welcome')]"); 

    public void clickProfileButton() {
        WebElement profile = wait.until(ExpectedConditions.elementToBeClickable(profileButton));
        profile.click();
        System.out.println("✅ Clicked Profile");
    }

    public boolean isGreetingVisible() {
        WebElement greeting = wait.until(ExpectedConditions.visibilityOfElementLocated(greetingText));
        return greeting.isDisplayed();
    }
}
