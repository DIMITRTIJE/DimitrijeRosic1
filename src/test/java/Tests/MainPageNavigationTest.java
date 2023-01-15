package Tests;

import Pages.HomePage;
import Pages.Strings;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MainPageNavigationTest  extends  BaseTest{

    @Test
    public void mainPageNavTest() {
        ChromeDriver driver = openChromeDriver();
        try {
            HomePage homePage = new HomePage(driver);
            HomePage.clickOnMainPageLink(Strings.MAIN_PAGE);
            assert isCurrentURLEqualTo(driver, Strings.HOME_URL) : "User is NOT on expected page. " +
                    "Expected: " + Strings.HOME_URL + " . Actual: " + driver.getCurrentUrl();


        }finally {
           driver.quit();
        }
    }

}
