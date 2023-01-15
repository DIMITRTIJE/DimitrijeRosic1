package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.sql.SQLOutput;

public class BasePage {

    //web elementi
    @FindBy(xpath = "//a[@class = 'mw-wiki-logo']")
    WebElement MPageLocator;

    @FindBy(xpath = "//input[@id = 'searchInput']")
    WebElement searchFieldLocator;

    @FindBy(xpath = "//input[@id = 'searchButton']")
    WebElement searchButtonLocator;

    ChromeDriver driver = null;

    //konstruktor
    public BasePage(ChromeDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }





    public static void print(String s) {
        System.out.print(s);
    }

    //metode na stranicama (low level)
    public void enterTextIntoSearchField(String text) {
        print("enterTextIntoSearchField");
        searchFieldLocator.click();
        searchFieldLocator.sendKeys(text);
    }

    public void clickSearchButton() {
        print("clickSearchButton");
        searchButtonLocator.click();
    }

    // high level
    public void searchAndSubmit(String text) {
        print("searchAndSubmit");
        enterTextIntoSearchField(text);
        clickSearchButton();
    }
//metode nad webelementima

}


