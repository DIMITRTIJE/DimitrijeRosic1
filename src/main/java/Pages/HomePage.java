package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage  extends BasePage{

    //web elementi
    @FindBy(xpath = "//div[@id = 'p-logo'] ")
    static
    WebElement MainPageLocator;


    //konstruktor
    public HomePage(ChromeDriver driver) {
        super(driver);
        print("MainPage");
    }

    public static void clickOnMainPageLink(String linkText) {
        List<WebElement> list = MainPageLocator.findElements(By.xpath(".//div[@id = 'p-logo']//a"));
    }
}
