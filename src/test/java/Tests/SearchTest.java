package Tests;

import Pages.HomePage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SearchTest extends BaseTest {

    @Test
    public void searchPageTest() {
        ChromeDriver driver = openChromeDriver();
        try {
            HomePage homePage = new HomePage(driver);
            homePage.searchAndSubmit("GitHub");
        }finally {
          driver.quit();

        }
    }
}
