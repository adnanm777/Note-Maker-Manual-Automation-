package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.LoginPage;
import Pages.DashboardPage;

public class DashboardTest extends BaseTest {

    @Test
    public void verifyDashboardLoadsAfterLogin() {
        // Step 1: Login
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("mohammad777adnan@gmail.com", "Adnan777");

        // Step 2: Access Dashboard
        DashboardPage dashboardPage = new DashboardPage(driver);
        dashboardPage.clickProfileButton();

        // Step 3: Validate greeting or dashboard visibility
        boolean isVisible = dashboardPage.isGreetingVisible();
        Assert.assertTrue(isVisible, "❌ Dashboard welcome message is not visible.");
        System.out.println("✅ Dashboard is visible with welcome message.");
    }
}
