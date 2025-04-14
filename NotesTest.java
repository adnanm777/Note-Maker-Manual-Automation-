package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.LoginPage;
import Pages.NotesPage;

public class NotesTest extends BaseTest {

    @Test
    public void verifyCreateAndSaveNote() {
        // Step 1: Login
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("mohammad777adnan@gmail.com", "Adnan777");

        // Step 2: Navigate to Notes
        NotesPage notesPage = new NotesPage(driver);
        notesPage.clickProfileButton();   // Open profile
        notesPage.clickNote();            // Go to Notes
        notesPage.clickWriteNote();       // Click 'Write Notes'

        // Step 3: Enter title and matter
        String title = "Sample Note Title";
        String matter = "This is the matter of the note.";
        notesPage.typeTitleAndMatter(title, matter);

        // Step 4: Validate note saved (simple check - update as per your app behavior)
        Assert.assertTrue(driver.getPageSource().contains("Sample Note Title"), "❌ Note not found on page.");
        System.out.println("✅ Note created and saved successfully.");

        // ✅ Step 5: Logout
        notesPage.logout();
       Assert.assertTrue(driver.getCurrentUrl().contains("login"), "❌ Logout failed or not redirected.");
        System.out.println("✅ Logged out successfully.");
    }
}
