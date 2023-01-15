package Tests;

import Pages.Strings;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest {

    public ChromeDriver openChromeDriver() {
        print("Open Chrome driver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments(new String[]{"--start-maximized"});
        options.addArguments(new String[]{"--ignore-certificate-errors"});
        options.addArguments(new String[]{"--disable-popup-blocking"});
        options.addArguments(new String[]{"--incognito"});
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        ChromeDriver driver = new ChromeDriver(options);
        driver.get(Strings.HOME_URL);
        return driver;
    }

    public static void print(String s) {

        System.out.println(s);
    }

    public boolean isCurrentURLEqualTo(ChromeDriver driver, String expectedUrl) {
        print("isCurrentURLEqualTo ( " + expectedUrl + " )");
        String currentUrl = driver.getCurrentUrl();
        print("User is on " + currentUrl);
        boolean b = currentUrl.equals(expectedUrl);
        return b;

    }
}
