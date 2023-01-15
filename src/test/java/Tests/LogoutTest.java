package Tests;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.Strings;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LogoutTest extends BaseTest{
    @Test
    public void loginWithValidCreds() {
        ChromeDriver driver = new ChromeDriver();
        try {

            LoginPage loginPage = new LoginPage(driver);
            loginPage.enterUserName(Strings.USERNAME);
            loginPage.enterPassword(Strings.PASSWORD);
            loginPage.clickLoginButton();
            loginPage.logoutUser();
            assert isCurrentURLEqualTo(driver, Strings.HOME_URL) : "User is NOT on expected page. " +
                    "Expected: " + Strings.HOME_URL + " . Actual: " + driver.getCurrentUrl();

            }finally {
            driver.quit();
        }
     }
}
