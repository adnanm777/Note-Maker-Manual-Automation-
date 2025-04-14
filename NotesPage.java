package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NotesPage {
    WebDriver driver;
    WebDriverWait wait;

    public NotesPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Existing locators
    By profileButton = By.xpath("//img[@title='Adnan']");
    By notesButton = By.xpath("//li[normalize-space()='Notes']");
    By writeNoteButton = By.xpath("//strong[normalize-space()='Write Notes']");
    By titleField = By.xpath("//input[@placeholder='Notes Title']");
    By matterField = By.xpath("//div[@class='ql-editor ql-blank']");
    By saveButton = By.xpath("//strong[normalize-space()='Save Changes']");

    // ✅ New locator for Logout (do not change)
    By logoutButton = By.xpath("//li[normalize-space()='Logout']");

    public void clickProfileButton() {
        WebElement profile = wait.until(ExpectedConditions.elementToBeClickable(profileButton));
        profile.click();
        System.out.println("✅ Clicked Profile");
    }

    public void clickNote() {
        WebElement note = wait.until(ExpectedConditions.elementToBeClickable(notesButton));
        note.click();
        System.out.println("✅ Clicked Notes Section");
    }

    public void clickWriteNote() {
        WebElement writeNote = wait.until(ExpectedConditions.elementToBeClickable(writeNoteButton));
        writeNote.click();
        System.out.println("✅ Clicked 'Write a Note' button");
    }

    public void typeTitleAndMatter(String title, String matter) {
        WebElement titleInput = wait.until(ExpectedConditions.visibilityOfElementLocated(titleField));
        titleInput.clear();
        titleInput.sendKeys(title);

        WebElement matterInput = wait.until(ExpectedConditions.visibilityOfElementLocated(matterField));
        matterInput.clear();
        matterInput.sendKeys(matter);

        WebElement saveBtn = wait.until(ExpectedConditions.elementToBeClickable(saveButton));
        saveBtn.click();

        System.out.println("✅ Note saved");
    }


    public void logout() {
        clickProfileButton(); // reuse existing method to open profile menu
        WebElement logoutBtn = wait.until(ExpectedConditions.elementToBeClickable(logoutButton));
        logoutBtn.click();
        System.out.println("✅ Logged out successfully");
    }
}
