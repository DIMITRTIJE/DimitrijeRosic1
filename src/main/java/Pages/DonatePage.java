package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static Pages.BasePage.print;

public class DonatePage extends BasePage{

    @FindBy(xpath = "//li[@id = 'n-sitesupport']")
    static
    WebElement DonatePageLocator;

    public DonatePage(ChromeDriver driver) {
        super(driver);
        print("DonatePage");
    }



    public static void clickOnDonatePageLink(String linkText) {
        List<WebElement> list = DonatePageLocator.findElements(By.xpath(".//li[@id = 'n-sitesupport']//a"));
    }


}