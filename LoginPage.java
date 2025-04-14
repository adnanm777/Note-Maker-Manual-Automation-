package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    // ✅ Update IDs if different on the actual site
    By emailField = By.id("email");
    By passwordField = By.id("password");
    By loginBtn = By.xpath("//div[contains(@class,'mt-6')]//strong[@class='flex items-center justify-center'][normalize-space()='Login']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void login(String email, String password) {
        driver.findElement(emailField).clear();
        driver.findElement(emailField).sendKeys(email);

        driver.findElement(passwordField).clear();
        driver.findElement(passwordField).sendKeys(password);

        driver.findElement(loginBtn).click(); // this should click!
    }
}
