package Tests;

import Pages.DonatePage;
import Pages.Strings;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NonResponsiveDonatePageTest extends BaseTest{

    @Test
    public void DonatePageTest() {
        ChromeDriver driver = openChromeDriver();
        try {
            DonatePage donatePage = new DonatePage(driver);
            DonatePage.clickOnDonatePageLink(Strings.DONATE_PAGE);
            assert !isCurrentURLEqualTo(driver, Strings.DONATE_PAGE_URL) : "User is NOT on expected page. " +
                    "Expected: " + Strings.DONATE_PAGE_URL + " . Actual: " + driver.getCurrentUrl();



        }finally {
            driver.quit();
        }
    }

}